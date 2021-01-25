package com.example.smartguard

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity



class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        val actiobar1=supportActionBar
        actiobar1!!.title="EDITING 'HOME'"
        actiobar1!!.setDisplayHomeAsUpEnabled(true)
        actiobar1!!.setDisplayHomeAsUpEnabled(true)



    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()

        return true

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater =menuInflater
        inflater.inflate(R.menu.chk,menu)
        return true
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home){

            finish()
        }

        return true
    }

}