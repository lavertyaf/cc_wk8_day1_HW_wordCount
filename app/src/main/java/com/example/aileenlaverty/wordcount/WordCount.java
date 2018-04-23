package com.example.aileenlaverty.wordcount;


public class WordCount {

    public int getCount(String paragraphToCount){
        String[] arrayToCount = paragraphToCount.split(" ");
        return arrayToCount.length;
    }
}
