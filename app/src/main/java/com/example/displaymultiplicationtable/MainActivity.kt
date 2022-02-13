package com.example.displaymultiplicationtable

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_click = findViewById<Button>(R.id.btn_click)
        val et_input = findViewById<EditText>(R.id.et_input)
        val tv_table = findViewById<TextView>(R.id.tv_table)

        btn_click.setOnClickListener {
            Toast.makeText(this, "You clicked the button", Toast.LENGTH_SHORT).show()

  if (TextUtils.isEmpty(number)) {
                // тут информируем пользователя
                et_input.error = "Please enter your height"
                et_input.requestFocus()
                return@setOnClickListener
            }
            val num = number.toInt()

            var result = " "
            for (i in 1..10) {

                result += "$num * $i = ${num * i}  \n\n"

            }

            tv_table.setText(result)
        }

    }


}
