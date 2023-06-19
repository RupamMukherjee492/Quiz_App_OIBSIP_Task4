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
import com.example.quizapp.databinding.ActivityGeographySetsBinding;
import com.example.quizapp.databinding.ActivitySetsBinding;

import java.util.ArrayList;

public class GeographySetsActivity extends AppCompatActivity {
    ImageView back;
    ActivityGeographySetsBinding binding;
    ArrayList<SetsModel>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityGeographySetsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        back=findViewById(R.id.backToolbar);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(GeographySetsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        list=new ArrayList<>();

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.setsRecycler.setLayoutManager(linearLayoutManager);

        list.add(new SetsModel("SET-G1"));
        list.add(new SetsModel("SET-G2"));
        list.add(new SetsModel("SET-G3"));
        list.add(new SetsModel("SET-G4"));
        list.add(new SetsModel("SET-G5"));
        list.add(new SetsModel("SET-G6"));
        list.add(new SetsModel("SET-G7"));
        list.add(new SetsModel("SET-G8"));
        list.add(new SetsModel("SET-G9"));
        list.add(new SetsModel("SET-G10"));




        SetAdapter adapter=new SetAdapter(this,list);
        binding.setsRecycler.setAdapter(adapter);

    }
}