package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quizapp.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {

    ActivityScoreBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        int correctAnswers = getIntent().getIntExtra("correct", 0);
        int totalQuestions = getIntent().getIntExtra("total", 0);


        binding.score.setText(String.format("%d/%d", correctAnswers, totalQuestions));


        binding.restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScoreActivity.this, MainActivity.class));
                finishAffinity();
            }
        });


        binding.shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"I got "+correctAnswers+" out of "+totalQuestions+" \uD83E\uDD73 \uD83E\uDD73 "+"\n\nLet's Try Your Luck \uD83E\uDD73 \uD83E\uDD73  !!!\n\n\nDownload This Fantastic App and Explore Your General Knowledge By Playing Some Amazing Quiz ✌️ ✌️ .\n\n"+getPackageName());
                startActivity(Intent.createChooser(intent,"Choose one"));

            }
        });
    }
}