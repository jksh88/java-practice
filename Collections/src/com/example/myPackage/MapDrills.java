package com.example.myPackage;

import java.util.HashMap;
import java.util.Map;

public class MapDrills {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "learning for job");
            System.out.println("Java added now");
        }
        languages.put("Python", "learning for data science");
        languages.put("Javascript", "proficient");
        languages.put("Sql", "proficient");
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "I need to be able to read Java code");
        }
        languages.replace("Java", "learning for day job");
        languages.put("vue", "framework used at work");
        languages.remove("vue");
        System.out.println("==============================================================");
        for (String key: languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
