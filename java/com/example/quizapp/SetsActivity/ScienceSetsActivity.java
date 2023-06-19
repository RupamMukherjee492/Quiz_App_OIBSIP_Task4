package com.example.quizapp.SetsActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.quizapp.Adapter.SetAdapter;
import com.example.quizapp.MainActivity;
import com.example.quizapp.Model.SetsModel;
import com.example.quizapp.R;
import com.example.quizapp.databinding.ActivityMathSetsBinding;
import com.example.quizapp.databinding.ActivityScienceSetsBinding;

import java.util.ArrayList;

public class ScienceSetsActivity extends AppCompatActivity {

    ImageView back;
    ActivityScienceSetsBinding binding;
    ArrayList<SetsModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityScienceSetsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        back=findViewById(R.id.backToolbar);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ScienceSetsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        list=new ArrayList<>();

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.setsRecycler.setLayoutManager(linearLayoutManager);

        list.add(new SetsModel("SET-S1"));
        list.add(new SetsModel("SET-S2"));
        list.add(new SetsModel("SET-S3"));
        list.add(new SetsModel("SET-S4"));
        list.add(new SetsModel("SET-S5"));
        list.add(new SetsModel("SET-S6"));
        list.add(new SetsModel("SET-S7"));
        list.add(new SetsModel("SET-S8"));
        list.add(new SetsModel("SET-S9"));
        list.add(new SetsModel("SET-S10"));




        SetAdapter adapter=new SetAdapter(this,list);
        binding.setsRecycler.setAdapter(adapter);

    }
}

