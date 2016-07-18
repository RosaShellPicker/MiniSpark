package com.example.rosaluo.minispark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class LauncherActivity extends AppCompatActivity {

    @InjectView(R.id.textView1)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        ButterKnife.inject(this);
        textView.setText("ButterKnife changed this text");
    }
}
