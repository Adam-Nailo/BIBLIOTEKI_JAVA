package org.projekt_z_gradle;

import lombok.extern.java.Log;
import okhttp3.*;

/**
 * Created by Adam Seweryn
 */
@Log
public class Main {
    public static void main(String[] args) throws Exception {
        OkHttpClient client = new OkHttpClient();

        RequestBody body = new FormBody.Builder()
                .add("id", "1")
                .add("title", "foo")
                .add("body", "bar")
                .add("userId", "1")
                .build();

        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/1")
                .headers(new Headers.Builder().add("Content-type", "application/json; charset=UTF-8").build())
                .method("PUT", body)
                .build();

        Response response =client.newCall(request).execute();
        log.info(response.body().string());
        log.info("koniec bloku");
    }
}