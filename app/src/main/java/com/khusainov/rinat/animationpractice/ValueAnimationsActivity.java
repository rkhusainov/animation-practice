package com.khusainov.rinat.animationpractice;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ValueAnimationsActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_value_animations);

        final ImageView imageView = findViewById(R.id.imageView);

        // alpha
        final ValueAnimator alphaAnimator = ValueAnimator.ofFloat(0f, 1f);
        configureAnimation(alphaAnimator);
        alphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                imageView.setAlpha((Float) valueAnimator.getAnimatedValue());
                alphaAnimator.start();
            }
        });

        // translation y
        float length = (-1f) * getResources().getDimension(R.dimen.y_length);
        final ValueAnimator translationYAnimator = ValueAnimator.ofFloat(0f, length);
        translationYAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                imageView.setTranslationY((Float) valueAnimator.getAnimatedValue());
                translationYAnimator.start();
            }
        });


    }

    private void configureAnimation(ValueAnimator animator) {
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.setRepeatCount(10);
        animator.setDuration(100);
    }
}
