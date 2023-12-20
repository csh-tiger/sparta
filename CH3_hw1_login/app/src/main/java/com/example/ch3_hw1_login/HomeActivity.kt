package com.example.ch3_hw1_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //선택과제. 랜덤프로필
        val pic=findViewById<ImageView>(R.id.iv_home)
        val random= Random()
        val num=random.nextInt(9)
        when(num){
            0->pic.setImageResource(R.drawable.profile_00)
            1->pic.setImageResource(R.drawable.profile_01)
            2->pic.setImageResource(R.drawable.profile_02)
            3->pic.setImageResource(R.drawable.profile_03)
            4->pic.setImageResource(R.drawable.profile_04)
            5->pic.setImageResource(R.drawable.profile_05)
            6->pic.setImageResource(R.drawable.profile_06)
            7->pic.setImageResource(R.drawable.profile_07)
            8->pic.setImageResource(R.drawable.profile_08)
        }


        //아이디 출력
        val id=findViewById<TextView>(R.id.tv_homeid)
        val strData_id=intent.getStringExtra("id")
        id.setText("아이디 : "+strData_id)

        //종료버튼 이벤트
        val btn_exit=findViewById<Button>(R.id.btn_home_exit)
        btn_exit.setOnClickListener {
            finish()
        }


    }
}