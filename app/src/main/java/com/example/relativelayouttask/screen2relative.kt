package com.example.relativelayouttask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class screen2relative : AppCompatActivity() {
    var btn:Button?=null
    var buttonn:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen2relative)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn=findViewById(R.id.buttonn)
        btn?.setOnClickListener {
            Toast.makeText(this, "next", Toast.LENGTH_SHORT).show()
            var intent = Intent(this,screen3relative::class.java)
            startActivity(intent)
        }
        btn=findViewById(R.id.btsign)
        btn?.setOnClickListener {
            Toast.makeText(this, "next", Toast.LENGTH_SHORT).show()
            var intent = Intent(this,screen4relative::class.java)
            startActivity(intent)
        }
    }
}