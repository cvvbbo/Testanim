package com.t.transitiondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(this,Mainactivity2.class);
//        startActivity(intent);
//        overridePendingTransition(R.anim.anmi_in_right_left, R.anim.anmi_out_right_left);

    }


    public  void haha(View view){
        Intent intent = new Intent(this,Mainactivity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anmi_in_right_left, R.anim.anmi_out_right_left);

    }
}
