package com.example.gaesangi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val a: EditText by lazy {
        findViewById(R.id.a)
    }
    private val b: EditText by lazy {
        findViewById(R.id.b)
    }
    private val btn_plus: Button by lazy {
        findViewById(R.id.btn_plus)
    }
    private val btn_minus: Button by lazy {
        findViewById(R.id.btn_minus)
    }
    private val btn_multi: Button by lazy {
        findViewById(R.id.btn_multi)
    }
    private val btn_div: Button by lazy {
        findViewById(R.id.btn_div)
    }
    private val btn_rest: Button by lazy {
        findViewById(R.id.btn_rest)
    }
    private val btn_reset: Button by lazy {
        findViewById(R.id.btn_reset)
    }
    private val tv_result: TextView by lazy {
        findViewById(R.id.tv_result)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_plus.setOnClickListener() {
            setResultView(1)
        }
        btn_minus.setOnClickListener() {
            setResultView(2)
        }
        btn_multi.setOnClickListener() {
            setResultView(3)
        }
        btn_div.setOnClickListener() {
            setResultView(4)
        }
        btn_rest.setOnClickListener() {
            setResultView(5)
        }
        btn_reset.setOnClickListener() {
            a.setText("")
            b.setText("")
            tv_result.text = ""
        }
    }

    private fun setResultView(i: Int) {
        try {
            val num1: Int = a.text.toString().toInt()
            val num2: Int = b.text.toString().toInt()
            var numResult: Int = -1
            when(i){
                1 -> numResult = num1 + num2
                2 -> numResult = num1 - num2
                3 -> numResult = num1 * num2
                4 -> numResult = num1 / num2
                5 -> numResult = num1 % num2
            }
            tv_result.text = numResult.toString()
        } catch (e: Exception) {
            Toast.makeText(this, "잘못된 값을 입력하셨습니다.", Toast.LENGTH_SHORT).show()
        }

    }
}