package com.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCounterTest {
    String words;
    WordCounter counter;

    @Before
    public void before(){
     words = new String("Lorem Ipsum is simply dummy " +
                "text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard ");
        counter = new WordCounter(words);
    }

    @Test
    public void testCountWords() {

        assertEquals(19, counter.countWords());
    }
}