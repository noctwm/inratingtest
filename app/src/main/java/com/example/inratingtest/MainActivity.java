package com.example.inratingtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.inratingtest.api.NetworkService;
import com.example.inratingtest.api.model.post.Post;
import com.example.inratingtest.api.model.user.Request;
import com.example.inratingtest.api.model.user.Response;
import com.example.inratingtest.api.model.user.User;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private RecyclerViewAdapter adapterLikers;
    private RecyclerViewAdapter adapterCommentators;
    private TextView tvLikesCount;
    private TextView tvCommentatorsCount;
    private TextView tvRepostersCount;
    private RecyclerViewAdapter adapterReposters;
    private RecyclerViewAdapter adapterMentions;
    private TextView tvMentionsCount;
    private TextView tvBookmarksCount;

    private MainPresenter presenter;
    private Snackbar errorSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLikesCount = findViewById(R.id.tv_likes_count);
        tvCommentatorsCount = findViewById(R.id.tv_commentators_count);
        tvRepostersCount = findViewById(R.id.tv_reposters_count);
        tvMentionsCount = findViewById(R.id.tv_mentions_count);
        tvBookmarksCount = findViewById(R.id.tv_bookmarks_count);

        RecyclerView rvLikers = findViewById(R.id.rv_likers);
        adapterLikers = new RecyclerViewAdapter();
        rvLikers.setAdapter(adapterLikers);

        RecyclerView rvCommentators = findViewById(R.id.rv_commentators);
        adapterCommentators = new RecyclerViewAdapter();
        rvCommentators.setAdapter(adapterCommentators);

        RecyclerView rvReposters = findViewById(R.id.rv_reposters);
        adapterReposters = new RecyclerViewAdapter();
        rvReposters.setAdapter(adapterReposters);

        RecyclerView rvMentions = findViewById(R.id.rv_mentions);
        adapterMentions = new RecyclerViewAdapter();
        rvMentions.setAdapter(adapterMentions);

        presenter = new MainPresenter();
        presenter.attachView(this);
        presenter.viewIsReady();
    }


    @Override
    public void showLikers(List<User> users) {
        adapterLikers.setUsers(users);
        adapterLikers.notifyDataSetChanged();
    }

    @Override
    public void showLikesCount(int count) {
        tvLikesCount.setText(String.valueOf(count));
    }

    @Override
    public void showCommentators(List<User> users) {
        adapterCommentators.setUsers(users);
        adapterCommentators.notifyDataSetChanged();
    }

    @Override
    public void showCommentatorsCount(int count) {
        tvCommentatorsCount.setText(String.valueOf(count));
    }

    @Override
    public void showReposters(List<User> users) {
        adapterReposters.setUsers(users);
        adapterReposters.notifyDataSetChanged();
    }

    @Override
    public void showRepostersCount(int count) {
        tvRepostersCount.setText(String.valueOf(count));
    }

    @Override
    public void showMentions(List<User> users) {
        adapterMentions.setUsers(users);
        adapterMentions.notifyDataSetChanged();
    }

    @Override
    public void showMentionsCount(int count) {
        tvMentionsCount.setText(String.valueOf(count));
    }

    @Override
    public void showBookmarksCount(int count) {
        tvBookmarksCount.setText(String.valueOf(count));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_item_refresh) {
            presenter.onRefresh();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showError() {
        errorSnackbar = Snackbar.make(findViewById(android.R.id.content), R.string.error_text, Snackbar.LENGTH_INDEFINITE );
        errorSnackbar.setAction(R.string.retry, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onSnackbarAction();
            }
        });
        errorSnackbar.show();
    }

    @Override
    public void hideError() {
        if (errorSnackbar != null) {
            errorSnackbar.dismiss();
        }
    }

    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }
}
