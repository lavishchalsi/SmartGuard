package com.example.smartguard

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class edit_sensor_with_enable_back_and_delete : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_sensor_with_enable_back_and_delete)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater =menuInflater
        inflater.inflate(R.menu.delete_menu,menu)
        return true
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home){

            finish()
        }

        return true
    }


}