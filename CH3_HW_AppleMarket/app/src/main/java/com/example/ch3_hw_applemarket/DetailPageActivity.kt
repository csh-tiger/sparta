package com.example.ch3_hw_applemarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ch3_hw_applemarket.databinding.ActivityDetailPageBinding

class DetailPageActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetailPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<MyItem>("dataFromMain")
        Log.d("dataFromMain", "data=$data")

        val img = binding.ivDetailItem
        val title=binding.tvDetailTitle
        val nickname=binding.tvDetailNickname
        val address=binding.tvDetailAddress
        val introduce=binding.tvDetailIntroduce
        val price=binding.tvDetailPrice

        val num= data?.aPrice?.toInt()
        val unitPrice=String.format("%,d", num)

        img.setImageResource(data!!.aItem)
        title.text=data?.aTitle
        nickname.text=data?.aNickname
        address.text=data?.aAddress
        introduce.text=data?.aIntroduce
        price.text=unitPrice


        binding.ivDetailBackIcon.setOnClickListener { finish() }


    }
}