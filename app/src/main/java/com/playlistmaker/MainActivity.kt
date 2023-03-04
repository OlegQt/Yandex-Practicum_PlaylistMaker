package com.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var btnSettings:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView(R.layout.activity_settings)

        val btnMedia = findViewById<Button>(R.id.media)
        val btnSearch = findViewById<Button>(R.id.search)
        btnSettings = findViewById(R.id.settings) // Попробовал объявить переменную кнопки в поле класса без later-int


        val searchBtnListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(
                    this@MainActivity,
                    "Поиск (через анонимный класс)",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        btnSearch.setOnClickListener(searchBtnListener)
        btnSettings?.setOnClickListener{
            val toast = Toast.makeText(this@MainActivity, "Настройки", Toast.LENGTH_SHORT)
            toast.show()
        }
        btnMedia.setOnClickListener { v ->
            val toast =
                Toast.makeText(this@MainActivity, "Media ${v.width.toString()}", Toast.LENGTH_SHORT)
            toast.show()
        }




    }
}