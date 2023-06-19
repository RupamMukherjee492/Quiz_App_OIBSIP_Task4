package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.quizapp.SetsActivity.GeographySetsActivity;
import com.example.quizapp.SetsActivity.MathSetsActivity;
import com.example.quizapp.SetsActivity.ScienceSetsActivity;
import com.example.quizapp.SetsActivity.SetsActivity;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    CardView history,math,science,geography;
    Button share,quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        history=findViewById(R.id.historyCV);
        math=findViewById(R.id.MathCV);
        science=findViewById(R.id.ScienceCV);
        geography=findViewById(R.id.GeographyCV);
        share=findViewById(R.id.shrbtn);
        quit=findViewById(R.id.quitbtn);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, SetsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, MathSetsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, ScienceSetsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, GeographySetsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"I got 5 out of 5\uD83E\uDD73 \uD83E\uDD73\n\nLet's Try Your Luck \uD83E\uDD73 \uD83E\uDD73  !!!\n\n\nDownload This Fantastic App and Explore Your General Knowledge By Playing Some Amazing Quiz ✌️ ✌️ .\n\n"+getPackageName());
                startActivity(Intent.createChooser(intent,"Choose one"));
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this,R.style.dialoge);
                dialog.setContentView(R.layout.dialog_layout);
                Button no,yes;
                yes = dialog.findViewById(R.id.yesbnt);
                no = dialog.findViewById(R.id.nobnt);
                yes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       finish();
                    }
                });
                no.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

    }
}