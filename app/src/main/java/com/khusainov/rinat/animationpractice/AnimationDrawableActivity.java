package com.khusainov.rinat.animationpractice;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AnimationDrawableActivity extends AppCompatActivity {

    private AnimationDrawable mDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_drawable);
        ImageView horseImageView = findViewById(R.id.horse_image_view);
        mDrawable = (AnimationDrawable) horseImageView.getDrawable();
        horseImageView.post(() -> mDrawable.start());
    }

    @Override
    protected void onStart() {
        super.onStart();
        mDrawable.start();
    }

    @Override
    protected void onStop() {
        mDrawable.stop();
        super.onStop();
    }
}
