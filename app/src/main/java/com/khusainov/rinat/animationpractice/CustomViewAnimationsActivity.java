package com.khusainov.rinat.animationpractice;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CustomViewAnimationsActivity extends AppCompatActivity {

    private ObjectAnimator mObjectAnimator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_animations);

        FinanceProgressView financeProgressView = findViewById(R.id.finance_progress_view);

        mObjectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.custom_view_animator);
        mObjectAnimator.setTarget(financeProgressView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mObjectAnimator.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mObjectAnimator.end();
    }
}

