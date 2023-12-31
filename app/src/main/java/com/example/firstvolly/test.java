package com.example.firstvolly;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class test {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://newsapi.org/v2/top-headlines?country=us&apiKey=YOUR_API_KEY");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = connection.getInputStream();
            // ...
        } else {
            System.out.println("Error: " + responseCode);
        }
    }
}