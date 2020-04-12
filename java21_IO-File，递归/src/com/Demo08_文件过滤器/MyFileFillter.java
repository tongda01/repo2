package com.Demo08_文件过滤器;

import java.io.File;
import java.io.FileFilter;

public class MyFileFillter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.getName().endsWith(".PNG")){
            return true ;
        }else return false;
    }

}
