package com.example.lab2;

public class CountingClass {

    public int CountWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }

    public int CountChar(String input) {
        int result = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != ' ')
                result++;
        }
        return result;
    }
}
