package com.example.demo.logic

import org.springframework.stereotype.Component

@Component
class HelloWorldLogic {
    /**
     * HelloWorldを取得
     * @return Hello World
     */
    fun getHelloWorld(): String {
        val datas = getDatas()

        // 合計を計算
        val sum = datas.sum()

        return "Welcome to Kotlin x $sum"
    }

    /**
     * 特に意味のない１〜１００の入った配列を作ります
     * @return 特に意味のない１〜１００の入った配列
     */
    private fun getDatas(): List<Int> {
        return (1..100).toList()
    }
}