package com.example.ch3_hw1_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn_signup=findViewById<Button>(R.id.btn_signup2)
        val edit_name=findViewById<EditText>(R.id.et_name)
        val edit_id=findViewById<EditText>(R.id.et_id)
        val edit_psd=findViewById<EditText>(R.id.et_pwd)
        btn_signup.setOnClickListener {
            val strData_name=edit_name.text.toString()
            val strData_id=edit_id.text.toString()
            val strData_pwd=edit_psd.text.toString()
            if(strData_name.isNotEmpty() && strData_id.isNotEmpty() && strData_pwd.isNotEmpty()){
                finish()
            }
            else{
                val toast_fail=Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT)
                toast_fail.show()
            }
//            val intent=Intent(this, SignInActivity::class.java)
//            intent.putExtra("id",strData_id)
//            intent.putExtra("pwd", strData_pwd)
//            startActivity(intent)
        }
    }
}