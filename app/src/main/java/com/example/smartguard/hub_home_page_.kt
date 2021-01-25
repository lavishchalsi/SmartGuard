package com.example.smartguard

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.smartguard.databinding.HubHomePageBinding

class hub_home_page_: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hub_home_page)
val HubHomePageBinding=DataBindingUtil.setContentView<HubHomePageBinding>(this,R.layout.hub_home_page)
HubHomePageBinding.setVariable(BR.label1," Manage Sensors")

      HubHomePageBinding.setVariable(BR.label2,"5 Active Sensors")
        HubHomePageBinding.setVariable(BR.label3,"Manual Siren Control")
        HubHomePageBinding.setVariable(BR.label4,"Device Arming")
        HubHomePageBinding.buttonRing.setOnClickListener {
            Toast.makeText(this,"ring",Toast.LENGTH_SHORT).show()
        }
HubHomePageBinding.buttonArm.setOnClickListener {
    Toast.makeText(this,"arm",Toast.LENGTH_SHORT).show()
}
        HubHomePageBinding.buttonSilence.setOnClickListener {
            Toast.makeText(this,"Silence",Toast.LENGTH_SHORT).show()
}
        HubHomePageBinding.buttonDisarm.setOnClickListener {
            Toast.makeText(this,"disarm",Toast.LENGTH_SHORT).show()
        }}}
   /* override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater =menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home){

            finish()
        }


        return true
    }*/


