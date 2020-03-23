package com.khusainov.rinat.animationpractice;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;

import androidx.appcompat.app.AppCompatActivity;

public class CustomViewAnimationsActivity extends AppCompatActivity {

    private ObjectAnimator mAnimator;

    // if true - animateViaXml, if false - animateProgrammatically
    private boolean mViaXml = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_animations);
        FinanceProgressView financeProgressView = findViewById(R.id.finance_progress_view);
        if(mViaXml) {
            mAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.custom_view_animator);
        } else {
            mAnimator = ObjectAnimator.ofInt(financeProgressView, "progress", 10, 75);
            mAnimator.setDuration(2500);
            mAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
            mAnimator.setRepeatCount(ObjectAnimator.INFINITE);
            mAnimator.setRepeatMode(ObjectAnimator.REVERSE);
        }
        mAnimator.setTarget(financeProgressView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAnimator.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        // mAnimator.end();
    }
}

