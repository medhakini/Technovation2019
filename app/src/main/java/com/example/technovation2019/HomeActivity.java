package com.example.technovation2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends MainActivity {

    public static TextView result;
    private Button scan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intentMessage = getIntent();
        String message = intentMessage.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.welcome);
        if (message != null) {
            textView.setText("Welcome, " + message + "!");
        } else {
            textView.setText("Welcome!");
        }

        result = findViewById(R.id.result);
        scan_btn = findViewById(R.id.btnScanCode);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ScanCodeActivity.class);
                startActivity(intent);
            }
        });
    }
}