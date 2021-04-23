package com.arish1999.photoed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.arish1999.photoed.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {
    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.resImage.setImageURI(getIntent().getData());
        Uri img = getIntent().getData();
        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(ResultActivity.this,MainActivity.class));
            }
        });
        binding.homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this,SplashScreenActivity.class));
            }
        });

    }
}