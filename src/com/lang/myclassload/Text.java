package com.lang.myclassload;

/**
 * Created by lang on 2018/2/20.
 */
public class Text {

    public static void main(String[] args){

        MyClassLoader myClassLoader=
                new MyClassLoader("D:\\WordFile\\java\\workspace\\applicationCollection\\src\\com\\lang\\myclassload");
        try {
            Class c=myClassLoader.loadClass("Demo");
           // Class c=myClassLoader.loadClass("com.lang.myclassload.Demo");
            c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
