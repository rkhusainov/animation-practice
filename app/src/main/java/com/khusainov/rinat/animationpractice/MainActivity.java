package com.khusainov.rinat.animationpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handleClick(R.id.animation_drawable, AnimationDrawableActivity.class);
        handleClick(R.id.view_animations, ViewAnimationsActivity.class);
        handleClick(R.id.value_animations, ValueAnimationsActivity.class);
        handleClick(R.id.object_animations, ObjectAnimationsActivity.class);
        handleClick(R.id.custom_view_animations, CustomViewAnimationsActivity.class);
    }

    private void handleClick(@IdRes int viewId, final Class<? extends Activity> activityClass) {
        findViewById(viewId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, activityClass));
            }
        });
    }
}
