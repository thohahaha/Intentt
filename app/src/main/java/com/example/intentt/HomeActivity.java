package com.example.intentt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnHewan = findViewById(R.id.btn_hewan);
        Button btnTumbuhan = findViewById(R.id.btn_tumbuhan);


        Animation animClick = AnimationUtils.loadAnimation(this, R.anim.button_click);

        btnHewan.setOnClickListener(v -> {
            v.startAnimation(animClick); // Tambahkan animasi klik
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        });

        btnTumbuhan.setOnClickListener(v -> {
            v.startAnimation(animClick); // Tambahkan animasi klik
            Intent intent = new Intent(HomeActivity.this, TumbuhanActivity.class);
            startActivity(intent);
        });
    }
}
