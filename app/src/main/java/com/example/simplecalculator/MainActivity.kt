package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get num one from edit text
        var num1 =findViewById<EditText>(R.id.txtnum1)
        var num2 =findViewById<EditText>(R.id.txtnum2)

        var btnAdd= findViewById<Button>(R.id.btnaddd)

        var textView= findViewById<TextView>(R.id.txtnum3)




        btnAdd.setOnClickListener {
            if (!num1.text.isEmpty()&& !num2.text.isEmpty()){
                var x=num1.text.toString().toInt()
                var y=num2.text.toString().toInt()
                var sum:Int=x + y
                textView.setText(sum.toString())
            }else{
               Toast.makeText(this,"Input num 1 and num 2",Toast.LENGTH_LONG).show()
                num1.error="input value"
                num2.error="input value"
            }

        }
        




    }
}
