package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: View = findViewById(R.id.button)
        var editText: EditText = findViewById(R.id.editTextNumber)
        button.setOnClickListener{
            if (editText.text.length == 0){
                println(editText.text)
                val toast = Toast.makeText(applicationContext, "Введите свой возраст", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                supportFragmentManager.beginTransaction().replace(R.id.fl, BlankFragment(editText.text)).commit()
            }
        }

    }
}