package com.dya5276.kotlinbasic01_lsh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {

            //주석 ctrl+/: 커서에 있는 줄을 주석처리
//                이{}안에 있는 코드만, 버튼이 눌렸을 때 실행됨

            Log.d("메인화면로그", "클릭용 버튼이 눌림")
            //디버그목적
            Log.e("메인화면로그", "에러 관련 로그")
            //에러목적

        }

    }

}