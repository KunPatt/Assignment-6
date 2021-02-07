package com.example.gpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val not = Toast.makeText(applicationContext, "กรุณากรอกให้ครบ!!", Toast.LENGTH_LONG)
        val not4 = Toast.makeText(applicationContext, "หน่วยกิตมีแค่ 1 ถึง 3 หน่วยกิตเท่านั้น!!", Toast.LENGTH_LONG)


        ok.setOnClickListener {
            if (txt1.text.toString() == "" && txt2.text.toString() == "" && txt3.text.toString() == "" && txt4.text.toString() == "" && txt5.text.toString() == ""
                    && n1.text.toString() == "" && n2.text.toString() == "" && n3.text.toString() == "" && n4.text.toString() == "" && n5.text.toString() == ""
                    && pt1.text.toString() == "" && pt2.text.toString() == "" && pt3.text.toString() == "" && pt4.text.toString() == "" && pt5.text.toString() == "") {
                not.show()
            } else if (n1.text.toString() == "" && n2.text.toString() == "" && n3.text.toString() == "" && n4.text.toString() == "" && n5.text.toString() == "") {
                not.show()

            } else if (pt1.text.toString() == "" && pt2.text.toString() == "" && pt3.text.toString() == "" && pt4.text.toString() == "" && pt5.text.toString() == "") {
                not.show()
            } else {
                if (txt1.text.toString() != "" && txt2.text.toString() != "" && txt3.text.toString() != "" && txt4.text.toString() != "" && txt5.text.toString() != ""
                        && n1.text.toString() != "" && n2.text.toString() != "" && n3.text.toString() != "" && n4.text.toString() != "" && n5.text.toString() != ""
                        && pt1.text.toString() != "" && pt2.text.toString() != "" && pt3.text.toString() != "" && pt4.text.toString() != "" && pt5.text.toString() != "") {
                    var nn1 = n1.text.toString().toInt()
                    var nn2 = n2.text.toString().toInt()
                    var nn3 = n3.text.toString().toInt()
                    var nn4 = n4.text.toString().toInt()
                    var nn5 = n5.text.toString().toInt()
                    var p1: Double = pt1.text.toString().toDouble()
                    var p2: Double = pt2.text.toString().toDouble()
                    var p3: Double = pt3.text.toString().toDouble()
                    var p4: Double = pt4.text.toString().toDouble()
                    var p5: Double = pt5.text.toString().toDouble()
                    if (nn1 <= 3 && nn1 >= 1 && nn2 <= 3 && nn2 >= 1 && nn3 <= 3 && nn3 >= 1 && nn4 <= 3 && nn4 >= 1 && nn5 <= 3 && nn5 >= 1
                            && p1 >= 1 && p1 <= 4 && p2 >= 1 && p2 <= 4 && p3 >= 1 && p3 <= 4 && p4 >= 1 && p4 <= 4 && p5 >= 1 && p5 <= 4) {
                        var total: Int = nn1 + nn2 + nn3 + nn4 + nn5
                        tot1.setText("$total")
                        var c1: Double = n1.text.toString().toDouble()
                        var c2: Double = n2.text.toString().toDouble()
                        var c3: Double = n3.text.toString().toDouble()
                        var c4: Double = n4.text.toString().toDouble()
                        var c5: Double = n5.text.toString().toDouble()
                        var gpa1 = (c1 * p1) + (c2 * p2) + (c3 * p2) + (c4 * p4) + (c5 * p5)
                        var gpa = gpa1/ total
                        val totalgpa = String.format("%.2f", gpa);
                        gpa2.setText("$totalgpa")

                    } else if (nn1 >= 4 && nn2 >= 4 && nn3 >= 4 && nn4 >= 4 && nn5 >= 4) {
                        not4.show()
                    } else {
                        not.show()
                    }



                    clear.setOnClickListener {
                        gpa2.setText("")
                        tot1.setText("")
                        txt1.setText("")
                        txt2.setText("")
                        txt3.setText("")
                        txt4.setText("")
                        txt5.setText("")
                        n1.setText("")
                        n2.setText("")
                        n3.setText("")
                        n4.setText("")
                        n5.setText("")
                        pt1.setText("")
                        pt2.setText("")
                        pt3.setText("")
                        pt4.setText("")
                        pt5.setText("")
                    }
                }
            }
        }
    }
}