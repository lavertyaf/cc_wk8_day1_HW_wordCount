package com.example.aileenlaverty.wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WordCountTest {

    WordCount wordCount;

    @Before
    public void before(){
        wordCount = new WordCount();
    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void canGetCount(){
        assertEquals(3, wordCount.getCount("How you doin"));
    }
}