package com.khusainov.rinat.animationpractice;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ViewAnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animations);

        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_and_scale);
        final View imageVIew = findViewById(R.id.imageView);
//        imageVIew.startAnimation(animation);
        imageVIew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageVIew.clearAnimation();
                imageVIew.startAnimation(animation);
            }
        });
    }
}
