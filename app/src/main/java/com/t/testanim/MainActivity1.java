package com.t.testanim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.t.testanim.R;

public class MainActivity1 extends AppCompatActivity {

    private ImageView im;

    /**
     *  通过xml的方式开启的 view 动画
     *
     * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        im = findViewById(R.id.im);
    }

    public void rotation(View view){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.view_anim_rotate);
        im.startAnimation(animation);
        animation.start();
    }

    public void translation(View view){

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.view_anim_translate);
        im.startAnimation(animation);
        animation.start();

    }

    public void alpa(View view){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.view_anim_alpha);
        im.startAnimation(animation);
        animation.start();

    }

    public void scale(View view){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.view_anim_scale);
        im.startAnimation(animation);
        animation.start();

    }
}
