package br.com.empresa.layoutcomplexo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToHome = findViewById<Button>(R.id.btn_entrar)

        goToHome.setOnClickListener {
            val i = Intent(this, PageHome::class.java)
            startActivity(i)
        }
    }
}