package com.geniuslabs.counterassistant

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_counter.*

class CounterActivity : AppCompatActivity() {
    var scoreA = 0;
    var scoreB = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        var tim1 = intent.getStringExtra("tim1")
        var tim2 = intent.getStringExtra("tim2")

        nama_tim_1.text = tim1
        nama_tim_2.text = tim2

        btn_reset.setOnClickListener {
            score_tim_1.text = "0"
            score_tim_2.text = "0"
            scoreA = 0
            scoreB = 0
        }

        btnA1.setOnClickListener {
            scoreA = ++scoreA
            score_tim_1.text = scoreA.toString()
        }

        btnA2.setOnClickListener {
            scoreA += 2
            score_tim_1.text = scoreA.toString()
        }

        btnA3.setOnClickListener {
            scoreA += 3
            score_tim_1.text = scoreA.toString()
        }

        btnB1.setOnClickListener {
            scoreB = ++scoreB
            score_tim_2.text = scoreB.toString()
        }

        btnB2.setOnClickListener {
            scoreB += 2
            score_tim_2.text = scoreB.toString()
        }

        btnB3.setOnClickListener {
            scoreB += 3
            score_tim_2.text = scoreB.toString()
        }
    }
}
