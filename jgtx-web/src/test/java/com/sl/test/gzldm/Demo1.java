package com.sl.test.gzldm;

import org.junit.Test;

/**
 * Created by lisulong on 2016/10/25.
 * 编写高质量代码 改善Java程序的151个建议
 */
public class Demo1 {

    @Test
    public void suggest3() {
        /*三元操作符的类型务必一致*/
        int i = 80;
        String s1 = String.valueOf(i < 90 ? 80 : 100);
        String s2 = String.valueOf(i < 90 ? 80 : 100.0);
        System.out.println(s1.equals(s2));
    }

    @Test
    public void suggest4() {
        /*避免具有变长参数的方法重载*/
        cp(1, 2);
    }

    private void cp(int i, int j) {
        System.out.println("简单折扣" + (i + j));
    }

    private void cp(int i, int... j) {
        int r = i;
        for (int temp : j) {
            r += temp;
        }
        System.out.println("复杂折扣" + r);
    }

    @Test
    public void suggest5() {
        /*别让null值及空值影响到变长方法*/
        methodA("china", 0);
        methodA("china", "english");

        //methodA("china");
        //对methodA的引用不明确, 方法 methodA(java.lang.String,int...)和方法 methodA(java.lang.String,java.lang.String...)都匹配

        //methodA("china",null);
        String[] strArr = null;
        methodA("china", strArr);
    }

    private void methodA(String s, int... i) {

    }

    private void methodA(String s, String... str) {

    }
}
