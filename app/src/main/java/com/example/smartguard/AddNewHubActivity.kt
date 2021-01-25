package com.example.smartguard

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class AddNewHubActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_new_hub)
        /*button_add_hub_new.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.verifying_hub, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            Handler().postDelayed(Runnable {
                val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_complete_verification, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()
                mDialogView.textView_3_verefication_complete.setOnClickListener {
                    val intent=Intent(this,EditHubActivity::class.java)
                    startActivity(intent)
                }


            },2500)

        }*/

    }
}