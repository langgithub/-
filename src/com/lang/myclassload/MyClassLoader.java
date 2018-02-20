package com.lang.myclassload;

import java.io.*;

/**
 * Created by lang on 2018/2/20.
 */
public class MyClassLoader extends ClassLoader {

    private String rootPath;

    public MyClassLoader(String rootPath){
        this.rootPath=rootPath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        Class<?> c=findLoadedClass(name);
        if(c!=null){
            return c;
        }else {
            try{
                ClassLoader loader=this.getParent();
                c=loader.loadClass(name);
            }catch (Exception e){
            }
            if (c!=null){
                return c;
            }else {
                byte[] b= new byte[0];
                try {
                    b = readByte(name);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                c=defineClass("com.lang.myclassload.Demo",b,0,b.length);
            }
        }
        return c;
    }

    private byte[] readByte(String name) throws IOException {
        String path=rootPath+"\\"+name+".class";
        System.out.print(path);
        FileInputStream fis=new FileInputStream(new File(path));
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        int len=0;
        byte[] buffer=new byte[1024];
        while((len=fis.read(buffer))!=-1){
            baos.write(buffer,0,len);
        }
        fis.close();
        return  baos.toByteArray();
    }

}
