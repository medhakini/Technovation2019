package com.example.technovation2019;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.widget.TextView;

public class MainActivity extends Activity {

    // initialized for qr code / barcode scanning
    public static TextView resultTextView;
    // refers to button that will start the scanning
    Button scan_btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resultTextView = findViewById(R.id.result_text);
        scan_btn = findViewById(R.id.scan);

        try {
            scan_btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), ScanCodeActivity.class));
                }
            });
        } catch (NullPointerException ignored) {

        }
    }

    public void buttonOnClick(View v){
        Button button = (Button) v;
        ((Button) v).setText("Clicked");
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
    }
}


