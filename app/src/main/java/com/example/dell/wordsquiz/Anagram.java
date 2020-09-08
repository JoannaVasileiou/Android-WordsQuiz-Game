package com.example.dell.wordsquiz;

import java.util.Random;

/**
 * Created by DELL on 17/2/2018.
 */

public class Anagram {


    public static final Random RANDOM = new Random();
    public static final String[] WORDSBEG = {
            "dog",
            "keep",
            "cell",
            "check",
            "warm",
            "worm",
            "ring",
            "bard",
            "blug",
            "door",
            "glass",
            "bird",
            "bear",
            "jacket",
            "book",
            "hair"

    };

    public static final String[] WORDSMEDIUM = {
            "animal",
            "chair",
            "number",
            "pizza",
            "quick",
            "jumbo",
            "jocks",
            "puzzle",
            "sunglasses",
            "pyjama",
            "accept",
            "around",
            "anyway",
            "author",
            "budget",
            "circle"
    };

    public static final String[] WORDHARD={
            "adittion",
            "activity",
            "accident",
            "analysis",
            "argument",
            "anywhere",
            "artistic",
            "athletic",
            "calendat",
            "building",
            "champion",
            "colorful",
            "clothing",
            "colapse"
    };


    public static String randsbeginner() {
        return WORDSBEG[RANDOM.nextInt(WORDSBEG.length)];
    }

    public static String randsmedium(){
        return WORDSMEDIUM[RANDOM.nextInt(WORDSBEG.length)];
    }

    public static String randshard(){
        return WORDHARD[RANDOM.nextInt(WORDHARD.length)];
    }

    public static String shuffleword(String word) {
        if (word != null && !"".equals(word))
        {
            char a[] = word.toCharArray();
            for (int i = 0; i < a.length; i++)
            {
                int j = RANDOM.nextInt(a.length);
                char tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            return new String(a);
        }
        return word;
    }
}
