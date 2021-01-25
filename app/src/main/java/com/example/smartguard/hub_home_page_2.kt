package com.example.smartguard

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.smartguard.databinding.HubHomePage2Binding

class hub_home_page_2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hub_home_page_2)
        val HubHomePage2Binding=DataBindingUtil.setContentView<HubHomePage2Binding>(this,R.layout.hub_home_page_2)
HubHomePage2Binding.button4.setOnClickListener {
    Toast.makeText(this,"sos",Toast.LENGTH_SHORT).show()
}
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater =menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home){

            finish()
        }


        return true
    }



}