package com.example.projektmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chk = findViewById<CheckBox>(R.id.checkBox)
        val chk2 = findViewById<CheckBox>(R.id.checkBox2)
        val chk3 = findViewById<CheckBox>(R.id.checkBox3)
        val chk4 = findViewById<CheckBox>(R.id.checkBox4)
        val chk5 = findViewById<CheckBox>(R.id.checkBox5)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener(View.OnClickListener {
            if (chk.isChecked) {
                Toast.makeText(this, "Durum Klasik", Toast.LENGTH_SHORT).show()
            }
            if (chk2.isChecked) {
                Toast.makeText(this, "Durum BIG!!!", Toast.LENGTH_SHORT).show()
            }
            if (chk3.isChecked) {
                Toast.makeText(this, "Durum Mięsny", Toast.LENGTH_SHORT).show()
            }
            if (chk4.isChecked) {
                Toast.makeText(this, "Durum EXTRA!!!", Toast.LENGTH_SHORT).show()
            }
            if (chk5.isChecked) {
                Toast.makeText(this, "Durum Czosnkowy Potwór", Toast.LENGTH_SHORT).show()
            }
        })
        chk.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, isChecked.toString(), Toast.LENGTH_SHORT).show()
        }
        chk2.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, isChecked.toString(), Toast.LENGTH_SHORT).show()
        }


    }
}