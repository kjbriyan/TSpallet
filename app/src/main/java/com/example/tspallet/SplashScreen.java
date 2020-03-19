package com.example.tspallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.Delayed;

public class SplashScreen extends AppCompatActivity {
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.splash_screen_layout);


    final Handler handler = new Handler();
    handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        }
    },1000L);
}


}
