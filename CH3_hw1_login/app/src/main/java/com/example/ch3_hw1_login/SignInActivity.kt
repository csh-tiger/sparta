package com.example.ch3_hw1_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        //로그인 버튼 이벤트
        val btn_login=findViewById<Button>(R.id.btn_login)
        val edit_id=findViewById<EditText>(R.id.input_id)
        val edit_pwd=findViewById<EditText>(R.id.input_pwd)
        btn_login.setOnClickListener {
            val login_id=edit_id.text.toString()
            val login_pwd=edit_pwd.text.toString()
            if(login_id.isNotEmpty() && login_pwd.isNotEmpty()){
                val toast_success=Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT)
                toast_success.show()
                val intent_home=Intent(this, HomeActivity::class.java)
                intent_home.putExtra("id", login_id)
                startActivity(intent_home)
            }
            else{
                val toast_fail=Toast.makeText(this, "아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT)
                toast_fail.show()
            }
        }

        //회원가입 버튼 이벤트
        val btn_signup=findViewById<Button>(R.id.btn_signup)
        btn_signup.setOnClickListener {
            val intent_signup= Intent(this, SignUpActivity::class.java)
            startActivity(intent_signup)
        }


        val pwd=findViewById<EditText>(R.id.input_pwd)
        val id=findViewById<EditText>(R.id.input_id)
        val strData_id=intent.getStringExtra("id")
        val strData_pwd=intent.getStringExtra(("pwd"))
        id.setText(strData_id)
        pwd.setText(strData_pwd)
        
    }
}