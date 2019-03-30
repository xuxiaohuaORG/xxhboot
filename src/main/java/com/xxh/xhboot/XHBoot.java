package com.xxh.xhboot;

/**
 * 一切的起始源头
 */
public class XHBoot {
    public static void main(String[] args){
        // 启动
        try{
            XHRoot.getInstance().start();
        }catch(Exception e){
            System.exit(1);
        }
        // 等待退出
        try{
            XHRoot.getInstance().waitEnd();
        }catch(InterruptedException e){

        }
    }
}
