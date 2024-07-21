package com.example.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var btnAdd: Button
    private lateinit var btnSub: Button
    private lateinit var btnMultiply: Button
    private lateinit var btnDivision: Button
    private lateinit var editTextA: EditText
    private lateinit var editTextB: EditText
    private lateinit var resultTextView: TextView
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize views
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivision = findViewById(R.id.btnDivision)
        editTextA = findViewById(R.id.editTextA)
        editTextB = findViewById(R.id.editTextB)
        resultTextView = findViewById(R.id.resultTextView)
        clearButton = findViewById(R.id.clearButton)

        // Set onClickListeners for arithmetic buttons
        btnAdd.setOnClickListener {
            val inputA: Double? = editTextA.text.toString().toDoubleOrNull()
            val inputB: Double? = editTextB.text.toString().toDoubleOrNull()

            if (inputA != null && inputB != null) {
                val result: Double = inputA + inputB
                resultTextView.text = "Result is $result"
            } else {
                resultTextView.text = "Invalid input"
            }
        }

        btnSub.setOnClickListener {
            val inputA: Double? = editTextA.text.toString().toDoubleOrNull()
            val inputB: Double? = editTextB.text.toString().toDoubleOrNull()

            if (inputA != null && inputB != null) {
                val result: Double = inputA - inputB
                resultTextView.text = "Result is $result"
            } else {
                resultTextView.text = "Invalid input"
            }
        }

        btnMultiply.setOnClickListener {
            val inputA: Double? = editTextA.text.toString().toDoubleOrNull()
            val inputB: Double? = editTextB.text.toString().toDoubleOrNull()

            if (inputA != null && inputB != null) {
                val result: Double = inputA * inputB
                resultTextView.text = "Result is $result"
            } else {
                resultTextView.text = "Invalid input"
            }
        }

        btnDivision.setOnClickListener {
            val inputA: Double? = editTextA.text.toString().toDoubleOrNull()
            val inputB: Double? = editTextB.text.toString().toDoubleOrNull()

            if (inputA != null && inputB != null) {
                if (inputB != 0.0) {
                    val result: Double = inputA / inputB
                    resultTextView.text = "Result is $result"
                } else {
                    resultTextView.text = "Cannot divide by zero"
                }
            } else {
                resultTextView.text = "Invalid input"
            }
        }

        // Set onClickListener for clear button
        clearButton.setOnClickListener {
            editTextA.text.clear()
            editTextB.text.clear()
            resultTextView.text = ""
        }

    }
}
