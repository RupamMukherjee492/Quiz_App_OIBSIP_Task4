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
import com.example.quizapp.databinding.ActivitySetsBinding;

import java.util.ArrayList;

public class MathSetsActivity extends AppCompatActivity {
    ImageView back;
    ActivityMathSetsBinding binding;
    ArrayList<SetsModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMathSetsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        back=findViewById(R.id.backToolbar);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MathSetsActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        list=new ArrayList<>();

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.setsRecycler.setLayoutManager(linearLayoutManager);

        list.add(new SetsModel("SET-A"));
        list.add(new SetsModel("SET-B"));
        list.add(new SetsModel("SET-C"));
        list.add(new SetsModel("SET-D"));
        list.add(new SetsModel("SET-E"));
        list.add(new SetsModel("SET-F"));
        list.add(new SetsModel("SET-G"));
        list.add(new SetsModel("SET-H"));
        list.add(new SetsModel("SET-I"));
        list.add(new SetsModel("SET-J"));




        SetAdapter adapter=new SetAdapter(this,list);
        binding.setsRecycler.setAdapter(adapter);

    }
}