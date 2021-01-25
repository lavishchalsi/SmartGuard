package com.example.smartguard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.smartguard.databinding.ActivityGridlayoutactivityBinding

class gridlayoutactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

   val gridlayoutactivityBinding=DataBindingUtil.setContentView<ActivityGridlayoutactivityBinding>(this,R.layout.activity_gridlayoutactivity)

    gridlayoutactivityBinding.setVariable(BR.label9,"ADD THIS")
    /* val actiobar2=supportActionBar
        actiobar2!!.title="ADD A SENSOR"
        actiobar2!!.setDisplayHomeAsUpEnabled(true)
        actiobar2!!.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()

        return true*/


    }
}