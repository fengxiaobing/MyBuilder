package com.example.mybuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mybuilder.single.Singleton;

/***
 * 以Person为例来说明Builder设计模式
 * 我们通过该Person类来构建一大批人，这个Person类里有很多 属性，
 * 最常见的比如name，age，weight，height等等，并且我们允许这些值不被设置，也就是允许为null，
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //正常创建
        PersonCommon p2=new PersonCommon("张三");
        PersonCommon p3=new PersonCommon("李四",18);
        PersonCommon p4=new PersonCommon("王五",21,180);
        PersonCommon p5=new PersonCommon("赵六",17,170,65.4);

        //Builder创建方式
        PersonBuilder person = new PersonBuilder.Builder()
                .age(12)
                .height(13)
                .Build();
        Log.e("aa","");

    }
}
