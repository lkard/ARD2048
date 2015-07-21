package com.ard1392.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.lkard.ard2048.R;

public class SplashActivity extends Activity {
    private Animation animStart;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        animStart = AnimationUtils.loadAnimation(this, R.anim.scale);
        textView = (TextView) findViewById(R.id.textView);
        doSomeThing();

        startActivity(new Intent(SplashActivity.this,
                MenuActivity.class));
        SplashActivity.this.finish();
    }

    private void doSomeThing() {
        textView.startAnimation(animStart);
    }
}
