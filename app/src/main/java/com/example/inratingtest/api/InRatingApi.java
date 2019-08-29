package com.example.inratingtest.api;

import com.example.inratingtest.api.model.post.Post;
import com.example.inratingtest.api.model.user.Request;
import com.example.inratingtest.api.model.user.Response;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface InRatingApi {

    @POST("get")
    Call<Post> getPost(@Body Request request, @Header("Authorization") String token);

    @POST("likers/all")
    Call<Response> getLikers(@Body Request request, @Header("Authorization") String token);

    @POST("reposters/all")
    Call<Response> getReposters(@Body Request request, @Header("Authorization") String token);

    @POST("commentators/all")
    Call<Response> getCommentators(@Body Request request, @Header("Authorization") String token);

    @POST("mentions/all")
    Call<Response> getMentions(@Body Request request, @Header("Authorization") String token);

}
