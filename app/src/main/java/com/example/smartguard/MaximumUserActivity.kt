package com.example.smartguard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.smartguard.databinding.ActivityMaximumUserBinding

class MaximumUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maximum_user)
        val maximumUserActivityDataBinding=DataBindingUtil.setContentView<ActivityMaximumUserBinding>(this,R.layout.activity_maximum_user)
        maximumUserActivityDataBinding.setVariable(BR.label15,"A Very Lengthy Name Goes Here")
    maximumUserActivityDataBinding.textView5MaximumUser.setOnClickListener {
        Toast.makeText(this,"Max users limit reached",Toast.LENGTH_SHORT).show()
    }
        maximumUserActivityDataBinding.textView6MaximumUser.setOnClickListener {
            Toast.makeText(this,"done adding users",Toast.LENGTH_SHORT).show()
        }
    }
}