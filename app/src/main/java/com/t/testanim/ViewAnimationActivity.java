package com.t.testanim;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


/**
 * Author: xiong
 * Time: 2020/7/5 18:07
 *
 *   view动画的代码表达
 */

public class ViewAnimationActivity extends AppCompatActivity {

    private Button bt;
    private ImageView imageView;
    private RotateAnimation rotateAnimation;
    private ScaleAnimation scaleAnimation;
    private AlphaAnimation alphaAnimation;
    private TranslateAnimation translateAnimation;
    private AnimationSet animationSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.view_anim_activity);

        imageView = findViewById(R.id.im);
        bt = findViewById(R.id.bt);


        //  splash = (RelativeLayout) findViewById(R.id.splash);
        //旋转动画
        rotateAnimation = new RotateAnimation(0, 360,
                Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(2000);
        rotateAnimation.setFillAfter(true);

        ////缩放动画
        scaleAnimation = new ScaleAnimation(0, 1, 0, 1,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(2000);
        scaleAnimation.setFillAfter(true);
        ////渐变动画
        alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimation.setDuration(2000);
        alphaAnimation.setFillAfter(true);
        ////平移动画
        translateAnimation = new TranslateAnimation(0, 0, 100, 100);
        translateAnimation.setDuration(2000);
        translateAnimation.setFillAfter(true);


        ////动画集合
        animationSet = new AnimationSet(true);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        //启动动画


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(animationSet);
            }
        });

    }


}
