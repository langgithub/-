package com.lang.myclassload;

/**
 * Created by lang on 2018/2/20.
 */
public class Demo {

    public Demo(){
        System.out.println(""+this.getClass().getClassLoader());
    }
}
