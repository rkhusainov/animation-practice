package com.khusainov.rinat.animationpractice;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ViewAnimationsActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
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
