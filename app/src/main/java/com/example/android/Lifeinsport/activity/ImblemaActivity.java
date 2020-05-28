package com.example.android.Lifeinsport.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.myndapplication.R;

public class ImblemaActivity extends AppCompatActivity {

    private  final int SPLASH_DISPLET_LEHGT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imblema);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(ImblemaActivity.this, MainActivity.class );
                ImblemaActivity.this.startActivity(mainIntent);
                ImblemaActivity.this.finish();
            }
        },SPLASH_DISPLET_LEHGT);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}
