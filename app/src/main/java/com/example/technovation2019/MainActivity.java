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
    Button scan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resultTextView = (TextView) findViewById(R.id.result_text);
        // refers to button that will start the scanning
        scan_btn = (Button) findViewById(R.id.btn_scan_me);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ScanCodeActivity.class));
            }
        });
    }

    public void buttonOnClick(View v){
        Button button = (Button) v;
        ((Button) v).setText("Clicked");
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
    }
}


