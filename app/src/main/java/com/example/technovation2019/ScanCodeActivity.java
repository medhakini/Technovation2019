package com.example.technovation2019;

import android.os.Bundle;
import com.google.zxing.Result;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScanCodeActivity extends MainActivity implements ZXingScannerView.ResultHandler {

    private ZXingScannerView ScannerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScannerView = new ZXingScannerView(this);
        setContentView(ScannerView);
        System.out.println("Scan initiated");
    }

    @Override
    public void handleResult(Result result) {
        HomeActivity.result.setText(result.getText());
        onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ScannerView.stopCamera();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }
}