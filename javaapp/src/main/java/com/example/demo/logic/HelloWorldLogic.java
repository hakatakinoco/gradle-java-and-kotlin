package com.example.demo.logic;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HelloWorldLogic {

    /**
     * HelloWorldを取得
     * @return Hello World
     */
    public String getHelloWorld() {
        int datas[] = getDatas();

        // 合計を計算
        int sum = 0;
        for (int x : datas) {
            sum += x;
        }

        return "Hello World x " + sum;
    }

    /**
     * 特に意味のない１〜１００の入った配列を作ります
     * @return 特に意味のない１〜１００の入った配列
     */
    private int[] getDatas() {
        int datas[] = new int[100];
        for (int i = 1; i <= 100; i++) {
            datas[i - 1] = i;
        }

        return datas;
    }
}
