package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SentenceActivity extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String sentence = extras.getString("sentence");

        WordCounter counter = new WordCounter(sentence);
        int numberOfWords = counter.countWords();
        resultText = (TextView)findViewById(R.id.result_text);
        resultText.setText("The number of words in the inputted sentence: "+numberOfWords);
    }
}
