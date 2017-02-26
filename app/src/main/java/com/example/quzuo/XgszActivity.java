package com.example.quzuo;



import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import static com.example.quzuo.R.id.hong;


public class XgszActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_xgsz);
        final Button  button = (Button) findViewById(R.id.txb);

        button.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //先判断当前触摸的是不是button4，再判断是否是ACTION_DOWN，都满足条件才跳转到闹钟界面
                if (v == button && event.getAction() == MotionEvent.ACTION_DOWN) {
                    Intent alarmas = new Intent(AlarmClock.ACTION_SET_ALARM);// 这行你写错了的，应该是AlarmClock.ACTION_SET_ALARM
                    startActivity(alarmas);
                    return true;// 你已经处理过的事件就要return true
                }
                return false;
            }
        });
   }}
