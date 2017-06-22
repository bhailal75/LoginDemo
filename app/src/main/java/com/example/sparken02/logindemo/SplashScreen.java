package com.example.sparken02.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {
    private boolean flag = false;
    private int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();
        startAnimation();

        Thread th = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    if (!flag) {
                        Intent intent = new Intent(SplashScreen.this, LoginPage.class);
                        startActivity(intent);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }
        };
        th.start();
    }

    private void startAnimation() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        LinearLayout l=(LinearLayout) findViewById(R.id.lin_lay);
        l.clearAnimation();
        l.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.anim);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.image);
        iv.clearAnimation();
        iv.startAnimation(anim);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            flag = true;
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}
