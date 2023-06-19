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
import com.example.quizapp.databinding.ActivitySetsBinding;

import java.util.ArrayList;

public class SetsActivity extends AppCompatActivity {

    ImageView back;
    ActivitySetsBinding binding;
    ArrayList<SetsModel>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySetsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        back=findViewById(R.id.backToolbar);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SetsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        list=new ArrayList<>();

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.setsRecycler.setLayoutManager(linearLayoutManager);

        list.add(new SetsModel("SET-1"));
        list.add(new SetsModel("SET-2"));
        list.add(new SetsModel("SET-3"));
        list.add(new SetsModel("SET-4"));
        list.add(new SetsModel("SET-5"));
        list.add(new SetsModel("SET-6"));
        list.add(new SetsModel("SET-7"));
        list.add(new SetsModel("SET-8"));
        list.add(new SetsModel("SET-9"));
        list.add(new SetsModel("SET-10"));




        SetAdapter adapter=new SetAdapter(this,list);
        binding.setsRecycler.setAdapter(adapter);

    }
}