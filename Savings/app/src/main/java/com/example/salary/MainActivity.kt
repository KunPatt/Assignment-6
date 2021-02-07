package com.example.salary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val y1 = 3
        val y2 = 5
        val y3 = 7


        ok.setOnClickListener {
            if (sr1.text.toString() != "") {
                var sr = sr1.text.toString().toDouble()
                var in1:Double = sr * y1 / 100
                var to1:Double = in1 + sr
                var in2 = to1 * y1 / 100
                var to2:Double = in2 + to1
                var in3 = to2 * y1 / 100
                var to3:Double = in3 + to2
                var in4 = to3 * y2 / 100
                var to4:Double = in4 + to3
                var in5 = to4 * y2 / 100
                var to5:Double = in5 + to4
                var in6 = to5 * y2 / 100
                var to6:Double = in6 + to5
                var in7 = to6 * y2 / 100
                var to7:Double = in7 + to6
                var in8 = to7 * y3 / 100
                var to8:Double = in8 + to7
                var in9 = to8 * y3 / 100
                var to9:Double = in9 + to8
                var in10 = to9 * y3 / 100
                var to10:Double = in10 + to9


                var inter = in1 + in2 + in3 + in4 + in5 + in6 + in7 + in8 +in9 +in10
                intt1.setText("$inter")
                tot2.setText("$to10")
            }

            }
    }
}