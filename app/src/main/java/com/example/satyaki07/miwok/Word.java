package com.example.satyaki07.miwok;

/**
 * Created by satyaki07 on 24/7/17.
 */

//{@link Word} represents a vocabulary wordthat the user wants to learn.
    //It contains a default and a miwok translation of the word.

public class Word {

    //default translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //Get the default translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get the Miwok translation
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
}
