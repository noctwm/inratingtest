package com.example.inratingtest;

import android.util.Log;

import com.example.inratingtest.api.NetworkService;
import com.example.inratingtest.api.model.post.Post;
import com.example.inratingtest.api.model.user.Request;
import com.example.inratingtest.api.model.user.Response;

import java.util.concurrent.atomic.AtomicBoolean;

import retrofit2.Call;
import retrofit2.Callback;

public class MainPresenter implements MainContract.Presenter {

    private String token;
    private int postId;

    private MainContract.View view;
    private AtomicBoolean isErrorVisible = new AtomicBoolean(false);

    MainPresenter() {
        token = "Bearer " + BuildConfig.TOKEN;
        postId = BuildConfig.POST_ID;
    }

    @Override
    public void attachView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void viewIsReady() {
        loadData();
    }

    @Override
    public void onRefresh() {
        if (isErrorVisible.get()) {
            isErrorVisible.set(false);
            view.hideError();
        }

        loadData();
    }

    @Override
    public void onSnackbarAction() {
        view.hideError();
        isErrorVisible.set(false);
        loadData();
    }

    private void loadData() {
        loadLikers();
        loadCommentators();
        loadReposters();
        loadMentions();
        loadPost();
    }

    private void loadPost() {
        NetworkService.getInstance()
                .getApi()
                .getPost(new Request(postId), token)
                .enqueue(new Callback<Post>() {
                    @Override
                    public void onResponse(Call<Post> call, retrofit2.Response<Post> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            view.showBookmarksCount(response.body().getBookmarksCount());
                        } else {
                            showError();
                        }
                    }

                    @Override
                    public void onFailure(Call<Post> call, Throwable t) {
                        showError();
                    }
                });
    }

    private void loadLikers() {
        NetworkService.getInstance()
                .getApi()
                .getLikers(new Request(postId), token)
                .enqueue(new Callback<Response>() {
                    @Override
                    public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                        if (response.isSuccessful() && response.body() != null) {

                            view.showLikers(response.body().getData());
                            view.showLikesCount(response.body().getMeta().getTotal());
                        } else {
                            showError();
                        }

                    }

                    @Override
                    public void onFailure(Call<Response> call, Throwable t) {
                        showError();
                    }
                });
    }

    private void loadCommentators() {
        NetworkService.getInstance()
                .getApi()
                .getCommentators(new Request(postId), token)
                .enqueue(new Callback<Response>() {
                    @Override
                    public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            view.showCommentators(response.body().getData());
                            view.showCommentatorsCount(response.body().getMeta().getTotal());
                        } else {
                            showError();
                        }
                    }

                    @Override
                    public void onFailure(Call<Response> call, Throwable t) {
                        showError();
                    }
                });
    }

    private void loadReposters() {
        NetworkService.getInstance()
                .getApi()
                .getReposters(new Request(postId), token)
                .enqueue(new Callback<Response>() {
                    @Override
                    public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            view.showReposters(response.body().getData());
                            view.showRepostersCount(response.body().getMeta().getTotal());
                        } else {
                            showError();
                        }
                    }

                    @Override
                    public void onFailure(Call<Response> call, Throwable t) {
                        showError();
                    }
                });
    }

    private void loadMentions() {
        NetworkService.getInstance()
                .getApi()
                .getMentions(new Request(postId), token)
                .enqueue(new Callback<Response>() {
                    @Override
                    public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            view.showMentions(response.body().getData());
                            view.showMentionsCount(response.body().getMeta().getTotal());
                        } else {
                            showError();
                        }
                    }

                    @Override
                    public void onFailure(Call<Response> call, Throwable t) {
                        showError();
                    }
                });
    }

    private void showError() {
        if (!isErrorVisible.get()) {
            view.showError();
            isErrorVisible.set(true);
        }
    }

    @Override
    public void detachView() {
        view = null;
    }
}
