package com.gibbs.aviationmxhub;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.content.Intent;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//import android.widget.ImageView;
//
//public class SplashActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
//
//        // Load fade-in animation
//        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
//
//        // Set animation listener
//        fadeIn.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//                // Animation started
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                // Animation ended, start next activity
//                startActivity(new Intent(SplashActivity.this, MainActivity.class));
//                finish(); // Close splash screen activity
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//                // Animation repeated
//            }
//        });
//
//        // Apply animation to logo
//        ImageView logo = findViewById(R.id.logo);
//        logo.startAnimation(fadeIn);
//        logo.setVisibility(android.view.View.VISIBLE);
//    }
//}

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 3000);

    }

}
