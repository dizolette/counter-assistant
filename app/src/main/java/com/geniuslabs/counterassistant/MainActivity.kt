package com.geniuslabs.counterassistant

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btn_simpan di menu utama
        btn_simpan.setOnClickListener {
            val intent =Intent(this, CounterActivity::class.java)
            intent.putExtra("tim1", til_team1.editText!!.text.toString())
            intent.putExtra("tim2", til_team2.editText!!.text.toString())
            startActivity(intent)
        }
    }
}
