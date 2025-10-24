package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView contentView = findViewById(R.id.content_view);
        Button backButton = findViewById(R.id.button_back);

        // Retrieve the clicked city name from intent
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("city_name");

        // Display the city name
        contentView.setText(cityName);

        // Go back to MainActivity
        backButton.setOnClickListener(v -> finish());
    }
}
