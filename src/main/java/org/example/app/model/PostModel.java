package org.example.app.model;

import org.example.app.entity.Post;
import org.example.app.network.ApiClient;
import org.example.app.network.ApiService;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class PostModel {

    public Optional<Response<List<Post>>> fetchPosts() {

        ApiClient client = new ApiClient();
        ApiService service = client.getApiService();

        Call<List<Post>> call = service.getPosts();
        Optional<Response<List<Post>>> optional;

        try {
            optional = Optional.of(call.execute());
        } catch (IOException ex) {
            optional = Optional.empty();
        }

        return optional;
    }

    public Optional<Response<Post>> fetchPostById(int id) {

        ApiClient client = new ApiClient();
        ApiService service = client.getApiService();

        Call<Post> call = service.getPostById(id);
        Optional<Response<Post>> optional;

        try {
            optional = Optional.of(call.execute());
        } catch (Exception ex) {
            optional = Optional.empty();
        }

        return optional;
    }
}
