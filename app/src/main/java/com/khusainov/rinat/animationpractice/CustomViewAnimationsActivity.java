package com.khusainov.rinat.animationpractice;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CustomViewAnimationsActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_custom_view_animations);


        FinanceProgressView imageView = findViewById(R.id.finance_progress_view);

        ObjectAnimator scaleXAnimator = ObjectAnimator.ofInt(imageView, "scaleX", 5, 55);

        configure(scaleXAnimator).start();
    }

    private Animator configure(ObjectAnimator animator) {
        animator.setDuration(1000);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.setRepeatCount(ObjectAnimator.INFINITE);
        return animator;
    }
}

