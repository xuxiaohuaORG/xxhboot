package com.xxh.xhboot;

import java.util.concurrent.CountDownLatch;

/**
 * 面向对象的开始，一切服务的根
 */
public class XHRoot {

    private CountDownLatch latch;
    private static XHRoot instance;

    public static XHRoot getInstance(){
        if (instance == null){
            instance = new XHRoot();
        }
        return instance;
    }

    private XHRoot(){
        latch = new CountDownLatch(1);
    }

    public void start() throws Exception{

    }

    public void stop(){
        try{

        } catch (Exception e){

        } finally {
            latch.countDown();
        }

    }

    public void waitEnd() throws InterruptedException {
        latch.await();
    }
}
