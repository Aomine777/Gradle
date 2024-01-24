package org.example;


import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        GUser me = new GUser("Alex","Rezun");
        Gson gson = new Gson();
        System.out.println(gson.toJson(me));
    }
}