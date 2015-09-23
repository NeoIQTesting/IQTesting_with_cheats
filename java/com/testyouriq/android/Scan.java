package com.testyouriq.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Scan extends AppCompatActivity {
    private ImageView Scanner = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        Scanner = (ImageButton) super.findViewById(R.id.Scanner);
        Scanner.setOnLongClickListener(new ScanFingerprint());
    }

    private class ScanFingerprint implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View v) {
            startActivity(new Intent("com.testyouriq.android.Result"));
            return true;
        }
    }

}
