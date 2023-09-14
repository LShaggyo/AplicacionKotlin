package com.example.primertrabajo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AccountDetailActivity : AppCompatActivity() {

    private lateinit var tvTotalBalance: TextView
    private lateinit var etAmount: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_detail)

        val tvAccountHolder = findViewById<TextView>(R.id.tvAccountHolder)
        val tvAccountNumber = findViewById<TextView>(R.id.tvAccountNumber)
        tvTotalBalance = findViewById(R.id.tvTotalBalance)
        etAmount = findViewById(R.id.etAmount)

        val btnAddMoney = findViewById<Button>(R.id.btnAddMoney)
        val btnWithdrawMoney = findViewById<Button>(R.id.btnWithdrawMoney)

        tvAccountHolder.text = "Titular: [nombre_usuario]"
        tvAccountNumber.text = "Número de cuenta: [numero_cuenta]"
        tvTotalBalance.text = "Saldo total: $[cantidad]"

        btnAddMoney.setOnClickListener {
            val amountToAdd = etAmount.text.toString().toDoubleOrNull()
            amountToAdd?.let {
                updateBalance(it)
                tvTotalBalance.text = "Saldo total: $[nuevo_saldo]"
            }
        }

        btnWithdrawMoney.setOnClickListener {
            val amountToWithdraw = etAmount.text.toString().toDoubleOrNull()
            amountToWithdraw?.let {
                updateBalance(-it)
                tvTotalBalance.text = "Saldo total: $[nuevo_saldo]"
            }
        }
    }

    private fun updateBalance(amount: Double) {

    }
}
