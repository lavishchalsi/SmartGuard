package com.example.smartguard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.smartguard.databinding.ActivityFailedBinding
import com.example.smartguard.databinding.ActivityVerificationfailedBinding

class FailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val failedActivityBinding= DataBindingUtil.setContentView<ActivityFailedBinding>(this,R.layout.activity_failed)
        failedActivityBinding.setVariable(BR.label8,911555555555)
    }
}