package com.example.laba2ispravl;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button customButton = findViewById(R.id.custom_button);
        GradientDrawable border = new GradientDrawable();
        border.setCornerRadius(24);
        border.setStroke(1, 0xFF505050);
        border.setColor(0xFFFFFFFF);
        customButton.setBackground(border);

        customButton.setOnClickListener(v -> {
            border.setColor(0xFF90EE90);
        });
    }
}
