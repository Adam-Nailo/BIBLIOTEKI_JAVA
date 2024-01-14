package org.projekt_z_maven;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import okhttp3.OkHttpClient;


/**
 * Hello world!
 *
 */
@AllArgsConstructor
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new Gson();
        OkHttpClient client = new OkHttpClient();
    }
}
