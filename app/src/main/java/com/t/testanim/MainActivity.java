package com.t.testanim;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;


    /**
     *  属性动画
     *
     *
     * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.im);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

    }

    // 缩放 和 淡入 弹出 是0和1之前。
    public void scale(View view){
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "scaleX", 1f, 0.3f, 1f);
        animator.setDuration(1000);
        animator.start();

    }

    public void rotation(View view){
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "rotation", 1f, 30f, 1f);
        animator.setDuration(1000);
        animator.start();
    }


    public void alpa(View view){
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "alpha", 1f, 0.3f, 1f);
        animator.setDuration(1000);
        animator.start();
    }

    public void translation(View view){
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "translationX", 0, 200f, 0);
        animator.setDuration(1000);
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(imageView, "translationY", 0, 200, 0);
        animator1.setDuration(1000);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator,animator1);
        animatorSet.start();
    }

    public void property(View view){
        // src 会挡住 backgroud有遮挡作用。



        imageView.setBackgroundColor(Color.parseColor("#6495ED"));
        PropertyValuesHolder translationX = PropertyValuesHolder.ofFloat("translationX", 0, 200f, 100f, 400f);
        PropertyValuesHolder colorHolder = PropertyValuesHolder.ofInt("BackgroundColor", 0xffff00ff, 0xffffff00, 0xffff00ff);
        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(imageView, translationX, colorHolder);
        animator.setDuration(3000);
        animator.start();
    }
}

