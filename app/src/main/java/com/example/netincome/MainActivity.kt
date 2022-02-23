package com.example.netincome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlin.math.round
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_cal.setOnClickListener {
            var ketqua:Double =0.00
            if (input.text.toString() == "") Toast.makeText(this,"Gross income không được rỗng!",
                Toast.LENGTH_SHORT).show()
            else if (radlow.isChecked ) ketqua = (input.text.toString().toDouble())*(1-0.1)
            else if (radmed.isChecked) ketqua = (input.text.toString().toDouble())*(1-0.15)
            else if (radhigh.isChecked) ketqua = (input.text.toString().toDouble())*(1-0.2)
            else Toast.makeText(this,"Bạn chưa chọn tax!", Toast.LENGTH_SHORT).show()
            if (switch1.isChecked) ketqua = round(ketqua)
            txtShow.text = "$"+ ketqua.toString()
        }
    }
}