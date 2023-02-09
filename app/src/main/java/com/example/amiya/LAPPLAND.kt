package com.example.amiya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class LAPPLAND : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lappland)
    }
    fun basicAlert(view: View) {
        val builder = AlertDialog.Builder(this)
        //set title for alert dialog
        builder.setTitle("alert")
        //set message for alert dialog
        builder.setMessage("worng")
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        //performing positive action
        builder.setPositiveButton("Yes"){dialogInterface, which ->
            Toast.makeText(applicationContext,"clicked yes", Toast.LENGTH_LONG).show()
            val intent = Intent(this@LAPPLAND, EYJAFJALLA::class.java)
            startActivity(intent)

        }

        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(false)
        alertDialog.show()
    }

    fun kal(view: View) {
        val intent = Intent(this@LAPPLAND, EYJAFJALLA::class.java)
        startActivity(intent)
        MainActivity.num++
    }
}