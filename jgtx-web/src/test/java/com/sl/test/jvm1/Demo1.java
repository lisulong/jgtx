package com.sl.test.jvm1;

import org.junit.Test;

/**
 * Created by lisulong on 2016/10/31.
 */
public class Demo1 {

    @Test
    public void test1(){
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3.intern();

        System.out.println(s3 == s4);
    }
}
