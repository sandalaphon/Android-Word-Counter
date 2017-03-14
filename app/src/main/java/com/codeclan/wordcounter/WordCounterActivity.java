package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCounterActivity extends AppCompatActivity {

    EditText wordsToCount;
    Button countWordsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        Log.d(getClass().toString(), "onCreate called");

        wordsToCount = (EditText)findViewById(R.id.words_text);
        countWordsButton = (Button)findViewById(R.id.count_button);
    }
    public void onCountButtonClicked(View button){
        Log.d(getClass().toString(), "Button was clicked");
        String sentence = wordsToCount.getText().toString();
        Log.d("Sentence entered was:", sentence);

        Intent intent = new Intent(this, SentenceActivity.class);
        intent.putExtra("sentence", sentence);
        startActivity(intent);
    }

}
