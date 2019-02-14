package com.example.kson.eventbusdemo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //注册当前对象给eventbus
//        EventBus.getDefault().register(this);
    }

//    /**
//     *
//     * @param msg
//     */
//    @Subscribe
//    public void receiveMsg(String msg){
//
//        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Subscribe
//    public void receiveUser(User user){
//        Toast.makeText(this,user.name,Toast.LENGTH_SHORT).show();
//    }

    public void to2(View view) {

        //粘性事件
        EventBus.getDefault().postSticky("我是1");

        startActivity(new Intent(this,Main2Activity.class));

    }


}
