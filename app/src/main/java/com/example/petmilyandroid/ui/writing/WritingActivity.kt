package com.example.petmilyandroid.ui.writing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.petmilyandroid.databinding.ActivityWritingBinding

class WritingActivity : AppCompatActivity(){
    lateinit var binding: ActivityWritingBinding

    override fun onCreate(savedInstanceState: Bundle?) { // Activity가 실행될 때 처음 실행되는 함수
        super.onCreate(savedInstanceState)
        binding = ActivityWritingBinding.inflate(layoutInflater) // xml의 레이아웃들을 메모리에 객체화시킴
        setContentView(binding.root) // binding.root의 모든 뷰들을 사용한다


    }
}