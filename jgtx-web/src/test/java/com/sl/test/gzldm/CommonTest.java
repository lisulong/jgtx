package com.sl.test.gzldm;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by lisulong on 2016/10/25.
 */
public class CommonTest implements Runnable{
    public static volatile AtomicBoolean flag = new AtomicBoolean(false);

    @Test
    public void test(){
        System.out.println("test");
    }
    @Test
    public void test1() {
//        ThreadGroup threadGroup = new ThreadGroup("My Group");
//        threadGroup.
        Thread[] t = new Thread[20];
        for (int j = 0; j < 20; j++) {
            t[j] = new Thread(new CommonTest());
        }
        int i=0;
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();
        t[i++].start();

    }
    public void run() {
        if (flag.compareAndSet(false,true)) {
//            flag.set(true);
            System.out.println("我成功了！");
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag.set(false);
        }
    }
}
