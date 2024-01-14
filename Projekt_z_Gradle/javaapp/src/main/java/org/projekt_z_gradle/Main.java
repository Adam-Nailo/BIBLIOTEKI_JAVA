package org.projekt_z_gradle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.java.Log;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Adam Seweryn
 */
@Log
public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.json-generator.com/templates/Lf9a60uCmqV4/data?access_token=cb6kj5xh2uj8qelvek8vyk9v1ssg78yeraasakd0")
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                log.info(e.toString());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String json = response.body().string();
                Type type = new TypeToken<List<Cloth>>(){}.getType();
                List<Cloth> cloths = new Gson().fromJson(json,type);
                log.info(cloths.get(0).toString());
            }
        });
       log.info("koniec bloku");
    }
}