package com.example.mybuilder.single;

/**
 * Created by Administrator on 2017/12/9.
 */

public class Singleton {
    private static Singleton singleton = new Singleton();
    public  static Singleton getSingleton(){
        return singleton;
    }


}
