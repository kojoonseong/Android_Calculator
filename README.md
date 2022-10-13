# Android_Calculator
( Android / Kotlin ) Android Calculator

## 실행화면
![image](https://user-images.githubusercontent.com/93521155/195515193-4eb91281-b026-46ac-bb91-b53aadfd261a.png)

첫번째 숫자와 두번쨰 숫자를 입력 후 연산버튼을 누르면 계산 후 결과에 숫자가 나온다.
#### 덧셈
![image](https://user-images.githubusercontent.com/93521155/195515511-294f0e65-349a-40b8-984e-1f7a2bc34e5c.png)

#### 뺄셈
![image](https://user-images.githubusercontent.com/93521155/195515609-bbf0c99c-1361-4b07-b4de-e4ab48af9428.png)

#### 곱셈
![image](https://user-images.githubusercontent.com/93521155/195515653-ade2203a-89d7-4fd3-ad67-f4b7242fc9cd.png)

#### 나눗셈
![image](https://user-images.githubusercontent.com/93521155/195515697-fd4f1c79-1138-452f-9117-603677c50082.png)

#### 나머지
![image](https://user-images.githubusercontent.com/93521155/195515728-d6cb2c8a-c68d-4405-b307-6f0e8fa7f1bf.png)

만약 예외사항이 벌어졌을 경우 메세지가 뜨며 계산처리를 하지 않는다.
![image](https://user-images.githubusercontent.com/93521155/195515982-1caa280d-e13d-41bd-a72f-f43ea7aa66b9.png)


## 코드
```kotlin
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
```
