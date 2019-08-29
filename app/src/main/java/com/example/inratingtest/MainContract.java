package com.example.inratingtest;

import com.example.inratingtest.api.model.user.User;

import java.util.List;

public interface MainContract {

    interface View {

        void showLikers(List<User> users);

        void showLikesCount(int count);

        void showCommentators(List<User> users);

        void showCommentatorsCount(int count);

        void showReposters(List<User> users);

        void showRepostersCount(int count);

        void showMentions(List<User> users);

        void showMentionsCount(int count);

        void showBookmarksCount(int count);

        void showError();

        void hideError();

    }

    interface Presenter {

        void attachView(View view);

        void viewIsReady();

        void detachView();

        void onSnackbarAction();

        void onRefresh();
    }

}
