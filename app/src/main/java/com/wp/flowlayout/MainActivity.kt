package com.wp.flowlayout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        repeat(50) {
            flDemo.addView(TextView(this).apply {
                text = "测试$it"
            })
        }
        testAction.setOnClickListener {
            if (flDemo.maxLines == Int.MAX_VALUE) {
                flDemo.maxLines = 5
                testAction.text = "展开"
            } else {
                flDemo.maxLines = Int.MAX_VALUE
                testAction.text = "收起"
            }
        }
    }
}