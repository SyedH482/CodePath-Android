package com.example.syedsflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView answerTextOne = findViewById(R.id.flashcard_answer_textview_One);
        TextView answerTextTwo = findViewById(R.id.flashcard_answer_textview_Two);
        TextView answerTextThree = findViewById(R.id.flashcard_answer_textview_Three);


        answerTextOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer_textview_One).setBackgroundColor(getResources().getColor(R.color.green, null));
            }
        });
        answerTextTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer_textview_Two).setBackgroundColor(getResources().getColor(R.color.red, null));
                findViewById(R.id.flashcard_answer_textview_One).setBackgroundColor(getResources().getColor(R.color.green, null));
            }

        });

        answerTextThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer_textview_Three).setBackgroundColor(getResources().getColor(R.color.red, null));
                findViewById(R.id.flashcard_answer_textview_One).setBackgroundColor(getResources().getColor(R.color.green, null));
            }
        });



    }

}