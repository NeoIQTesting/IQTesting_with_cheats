package com.testyouriq.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatResult extends AppCompatActivity {
    private Button Cheat_mode = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat_result);
        Cheat_mode = (Button) super.findViewById(R.id.button);
        Cheat_mode.setOnLongClickListener(new Cheat());

        double Raw = Math.random();
        int IQ = (int)((Raw*20)+190);
        TextView IQValue = (TextView) findViewById(R.id.IQ);
        IQValue.setText(String.valueOf(IQ));
    }

    private class Cheat implements View.OnLongClickListener {
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
