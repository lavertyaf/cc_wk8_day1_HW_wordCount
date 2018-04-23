package com.example.aileenlaverty.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    private EditText paragraphEditText;
    private TextView answerTextView;
    private Button countButton;
    private WordCount wordCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreated called");
        paragraphEditText = findViewById(R.id.paragraphEditText);
        answerTextView = findViewById(R.id.answerTextView);
        countButton = findViewById(R.id.countButton);
        answerTextView.setText("The answer will go here");
        wordCount = new WordCount();
    }

    public void onCountButtonClicked(View countButton){
        String paragraph = paragraphEditText.getText().toString();
        answerTextView.setText(wordCount.getCount(paragraph));
        Log.d(getClass().toString(), "text has been given");
    }
}






















