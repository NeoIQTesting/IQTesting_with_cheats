package com.testyouriq.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Button;

public class Notice extends AppCompatActivity {
    private Button Cheat_mode = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        Cheat_mode = (Button) super.findViewById(R.id.button);
        Cheat_mode.setOnLongClickListener(new Cheat());
    }

    private class Cheat implements OnLongClickListener {
        @Override
        public boolean onLongClick(View v) {
            startActivity(new Intent("com.testyouriq.android.Cheat"));
            return true;
        }
    }
    public void Scan(View v) {
        startActivity(new Intent("com.testyouriq.android.Scan"));
    }
}
