package com.example.simplecalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    var btnNumber0: Button? = null
    var btnNumber1: Button? = null
    var btnNumber2: Button? = null
    var btnNumber3: Button? = null
    var btnNumber4: Button? = null
    var btnNumber5: Button? = null
    var btnNumber6: Button? = null
    var btnNumber7: Button? = null
    var btnNumber8: Button? = null
    var btnNumber9: Button? = null

    var txtResult: TextView? = null

    var edtInput: EditText? = null

    var btnCE: Button? = null
    var btnC: Button? = null
    var btnDelete: Button? = null

    var btnAdd: Button? = null
    var btnSub: Button? = null
    var btnMul: Button? = null
    var btnDiv: Button? = null

    var btnDot: Button? = null
    var btnResult: Button? = null

    var val1 = Double.NaN
    var val2 = 0.0
    var ACTION: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNumber0 = findViewById<View>(R.id.btnNumber0) as Button
        btnNumber1 = findViewById<View>(R.id.btnNumber1) as Button
        btnNumber2 = findViewById<View>(R.id.btnNumber2) as Button
        btnNumber3 = findViewById<View>(R.id.btnNumber3) as Button
        btnNumber4 = findViewById<View>(R.id.btnNumber4) as Button
        btnNumber5 = findViewById<View>(R.id.btnNumber5) as Button
        btnNumber6 = findViewById<View>(R.id.btnNumber6) as Button
        btnNumber7 = findViewById<View>(R.id.btnNumber7) as Button
        btnNumber8 = findViewById<View>(R.id.btnNumber8) as Button
        btnNumber9 = findViewById<View>(R.id.btnNumber9) as Button

        txtResult = findViewById<View>(R.id.txtResult) as TextView

        edtInput = findViewById<View>(R.id.edtInput) as EditText

        btnCE = findViewById<View>(R.id.btnCE) as Button
        btnC = findViewById<View>(R.id.btnC) as Button
        btnDelete = findViewById<View>(R.id.btnBackSpace) as Button

        btnAdd = findViewById<View>(R.id.btnNumberAdd) as Button
        btnSub = findViewById<View>(R.id.btnNumberSub) as Button
        btnMul = findViewById<View>(R.id.btnNumberMul) as Button
        btnDiv = findViewById<View>(R.id.btnNumberDiv) as Button

        btnDot = findViewById<View>(R.id.btnDot) as Button
        btnResult = findViewById<View>(R.id.btnResult) as Button

        btnCE!!.setOnClickListener { edtInput!!.text = null }

        btnC!!.setOnClickListener {
            val1 = Double.NaN
            txtResult!!.text = null
            edtInput!!.setText(null)
        }

        btnDelete!!.setOnClickListener {
            var number = edtInput!!.text.toString()
            if (number != null && number.length > 0) {
                number = number.substring(0, number.length - 1)
            }
            edtInput!!.setText(number)
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnAdd!!.setOnClickListener {
            ACTION = "+"
            if (!java.lang.Double.isNaN(val1)) {
                val2 = edtInput!!.text.toString().toDouble()
                val1 = val1 + val2
            } else {
                val1 = edtInput!!.text.toString().toDouble()
            }
            txtResult!!.text = "$val1 + "
            edtInput!!.setText(null)
        }

        btnSub!!.setOnClickListener {
            ACTION = "-"
            if (!java.lang.Double.isNaN(val1)) {
                val2 = edtInput!!.text.toString().toDouble()
                val1 = val1 - val2
            } else {
                val1 = edtInput!!.text.toString().toDouble()
            }
            txtResult!!.text = "$val1 - "
            edtInput!!.setText(null)
        }

        btnMul!!.setOnClickListener {
            ACTION = "*"
            if (!java.lang.Double.isNaN(val1)) {
                val2 = edtInput!!.text.toString().toDouble()
                val1 = val1 * val2
            } else {
                val1 = edtInput!!.text.toString().toDouble()
            }
            txtResult!!.text = "$val1 * "
            edtInput!!.setText(null)
        }

        btnDiv!!.setOnClickListener {
            ACTION = "/"
            if (!java.lang.Double.isNaN(val1)) {
                val2 = edtInput!!.text.toString().toDouble()
                val1 = val1 / val2
            } else {
                val1 = edtInput!!.text.toString().toDouble()
            }
            txtResult!!.text = "$val1 / "
            edtInput!!.setText(null)
        }

        btnResult!!.setOnClickListener {
            if (ACTION != null && ACTION == "+") {
                val result = val1 + edtInput!!.text.toString().toDouble()
                txtResult!!.text = null
                edtInput!!.setText(result.toString())
            } else if (ACTION != null && ACTION == "-") {
                val result = val1 - edtInput!!.text.toString().toDouble()
                txtResult!!.text = null
                edtInput!!.setText(result.toString())
            } else if (ACTION != null && ACTION == "*") {
                val result = val1 * edtInput!!.text.toString().toDouble()
                txtResult!!.text = null
                edtInput!!.setText(result.toString())
            } else if (ACTION != null && ACTION == "/") {
                val result = val1 / edtInput!!.text.toString().toDouble()
                txtResult!!.text = null
                edtInput!!.setText(result.toString())
            }
            ACTION = null
            val1 = Double.NaN
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnNumber0!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + "0")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnNumber1!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + "1")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnNumber2!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + "2")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnNumber3!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + "3")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnNumber4!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + "4")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnNumber5!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + "5")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnNumber6!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + "6")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnNumber7!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + "7")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnNumber8!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + "8")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnNumber9!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + "9")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

        btnDot!!.setOnClickListener {
            edtInput!!.setText(edtInput!!.text.toString() + ".")
            edtInput!!.setSelection(edtInput!!.text.length)
        }

    }
}