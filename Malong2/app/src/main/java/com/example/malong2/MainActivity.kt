package com.example.malong2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numm2 = Toast.makeText(applicationContext, "กรอกค่า Num2", Toast.LENGTH_LONG)
        val numm3 = Toast.makeText(applicationContext, "ค่า Num2 ห้ามใส่ 0", Toast.LENGTH_LONG)
        val not = Toast.makeText(applicationContext, "กรอกให้ครบทุกช่อง!!", Toast.LENGTH_LONG)

        var nm1 = 0
        var nm2 = 0

        plus.setOnClickListener {
            if (no1.text.toString() != "" && no2.text.toString() != "") {
                cal.setText("+")
                nm1 = no1.text.toString().toInt()
                nm2 = no2.text.toString().toInt()
                var total = nm1 + nm2
                tot.setText("$total")
            } else if (no1.text.toString() == "" && no2.text.toString() == "") {
                not.show()
            } else if (no2.text.toString() == "") {
                not.show()
        } else {
                not.show()
            }
            }

        minus.setOnClickListener {
            if (no1.text.toString() != "" && no2.text.toString() != "") {
                cal.setText("-")
                nm1 = no1.text.toString().toInt()
                nm2 = no2.text.toString().toInt()
                var total = nm1 - nm2
                tot.setText("$total")
            } else if (no1.text.toString() == "" && no2.text.toString() == "") {
                not.show()
            } else if (no2.text.toString() == "") {
                not.show()
            } else {
                not.show()
            }
        }


        multiply.setOnClickListener {
            if (no1.text.toString() != "" && no2.text.toString() != "") {
                cal.setText("*")
                nm1 = no1.text.toString().toInt()
                nm2 = no2.text.toString().toInt()
                var total = nm1 * nm2
                tot.setText("$total")
            } else if (no1.text.toString() == "" && no2.text.toString() == "") {
                not.show()
            } else if (no2.text.toString() == "") {
                not.show()
            } else {
                not.show()
            }
        }

        divider.setOnClickListener {
            if (no2.text.toString() == "") {
                numm2.show()
            } else if (no2.text.toString() == "0") {
            numm3.show()
            } else if (no1.text.toString() != "" && no2.text.toString() != "") {
                cal.setText("/")
                var nm3:Double = no1.text.toString().toDouble()
                var nm4:Double = no2.text.toString().toDouble()
                var total:Double = nm3 / nm4
                tot.setText("$total")
            } else if (no1.text.toString() == "") {
                not.show()
            } else {
                not.show()
            }
        }

        modulo.setOnClickListener {
            if (no2.text.toString() == "") {
                numm2.show()
            } else if (no2.text.toString() == "0") {
                numm3.show()
            } else if (no1.text.toString() != "" && no2.text.toString() != "") {
                cal.setText("%")
                var nm3:Double = no1.text.toString().toDouble()
                var nm4:Double = no2.text.toString().toDouble()
                var total:Double = nm3 % nm4
                tot.setText("$total")
            } else if (no1.text.toString() == "") {
                not.show()
            } else {
                not.show()
            }
        }

        clear.setOnClickListener {
            cal.setText(" ")
            no1.setText(" ")
            no2.setText(" ")
            tot.setText(" ")
        }
    }
}