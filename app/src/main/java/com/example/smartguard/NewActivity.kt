package com.example.smartguard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.smartguard.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newActivityDataBinding=DataBindingUtil.setContentView<ActivityNewBinding>(this,R.layout.activity_new)
        newActivityDataBinding.buttonEditActivity.setOnClickListener {
       startActivity(Intent(this,gridlayoutactivity::class.java))
        }
   newActivityDataBinding.buttonGrid.setOnClickListener {
       startActivity(Intent(this,EditActivity::class.java))
   }
        newActivityDataBinding.buttonHubHomeMain.setOnClickListener {
            startActivity(Intent(this,hub_home_page_::class.java))
        }

        newActivityDataBinding.buttonHubHomePage2.setOnClickListener {
            startActivity(Intent(this,hub_home_page_2::class.java))
        }
        newActivityDataBinding.buttonHubHomePage3.setOnClickListener {
            startActivity(Intent(this,hub_home_page_3::class.java))
        }


        newActivityDataBinding.buttonMainAddSensor.setOnClickListener {
            startActivity(Intent(this,AddSensorActivity::class.java))
        }
        newActivityDataBinding.buttonMainConfirmToFormat.setOnClickListener {
            startActivity(Intent(this,ConfirmtoformatActivity::class.java))
        }

        newActivityDataBinding.buttonMaximumUser.setOnClickListener {
            startActivity(Intent(this,MaximumUserActivity::class.java))
        }

        newActivityDataBinding.buttonMainVerificationFailed.setOnClickListener {
            startActivity(Intent(this,FailedActivity::class.java))
        }
    }
}