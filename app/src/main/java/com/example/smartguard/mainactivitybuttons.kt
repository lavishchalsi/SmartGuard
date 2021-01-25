package com.example.smartguard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil


class MainActivitybuttons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main_buttons)
        //val MainActivitybuttonsBinding=DataBindingUtil.setContentView<MainActivityButtonsBinding>(this,R.layout.activity_main_buttons)
       /* button_main_verification_complete.setOnClickListener {
            val mDialogView =
                LayoutInflater.from(this).inflate(R.layout.activity_complete_verification, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.textView_3_verefication_complete.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
        button_main_verification_failed.setOnClickListener {
            val mDialogView =
                LayoutInflater.from(this).inflate(R.layout.activity_verificationfailed, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.textView14.setOnClickListener {
                mAlertDialog.dismiss()
            }
            mDialogView.textView15_editing_home.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
        button_main_scanning_for_sensor.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_scan, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.textView_4_scanning_for_sensor.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
        button_main_format.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_confirm_to_format, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.textView_4_confirm_to_format.setOnClickListener {
                mAlertDialog.dismiss()
            }
            mDialogView.textView_5_confirm_to_format.setOnClickListener {
                mAlertDialog.dismiss()
            }

        }
        button_maximum_user.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_maxusers, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()

            mDialogView.textView_5_maximum_user.setOnClickListener {

                mAlertDialog.dismiss()
            }
            mDialogView.textView_6_maximum_user.setOnClickListener {


                mAlertDialog.dismiss()
            }
        }

            button_main_done.setOnClickListener {
                val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_done, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()
                mDialogView.imageView_1_done.setOnClickListener {
                    mAlertDialog.dismiss()
                }
            }
            button_main_confirm_to_format.setOnClickListener {
                val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_confirm_format, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()
                mDialogView.textView_5_confirm_user_format.setOnClickListener {
                    mAlertDialog.dismiss()
                }
                mDialogView.textView_6_confirm_user_format.setOnClickListener {

                    mAlertDialog.dismiss()
                }
            }
            button__main_confirm_to_remove.setOnClickListener {
                val mDialogView =
                    LayoutInflater.from(this).inflate(R.layout.activity_confirm_to_remove_user, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()
                mDialogView.textView_4_confirm_remove_user.setOnClickListener {
                    mAlertDialog.dismiss()
                }
                mDialogView.textView_5_confirm_remove_user.setOnClickListener {

                    mAlertDialog.dismiss()
                }

            }
            button_main_unregiste_user.setOnClickListener {
                val mDialogView =
                    LayoutInflater.from(this).inflate(R.layout.activity_unregister_user, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()

                mDialogView.button_1_unregister_user.setOnClickListener {

                    mAlertDialog.dismiss()
                }

            }
            button_main_add_user.setOnClickListener {
                val mDialogView =
                    LayoutInflater.from(this).inflate(R.layout.activity_addinguser, null)
                val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
                val mAlertDialog = mBuilder.show()

                mDialogView.button_1_add_user.setOnClickListener {


                    mAlertDialog.dismiss()
                }
            }
        button_main_splash.setOnClickListener {
          val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            }
        button_add_hub_new_main.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.add_new_hub, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.button_add_hub_new.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
        button_verefying_hub_main.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.verifying_hub, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.progressBar_verifying_hub.setOnClickListener {
                mAlertDialog.dismiss()
            }
            mDialogView.textView_4_verifying_hub.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
        button_sensor_added_main.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.sensor_added, null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("")
            val mAlertDialog = mBuilder.show()
            mDialogView.textView3_sensor_added.setOnClickListener {
                mAlertDialog.dismiss()
            }
            mDialogView.textView4_sensor_added.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
        button_main_intro.setOnClickListener {
            val intent=Intent(this,IntroductionActivity::class.java)
            startActivity(intent)
        }
        button_hub_home_main.setOnClickListener {
            val intent=Intent(this,hub_home_page_::class.java)
            startActivity(intent)
        }
        button_hub_home_page_2.setOnClickListener {
            val intent=Intent(this,hub_home_page_2::class.java)
            startActivity(intent)
        }
        button_hub_home_page_3.setOnClickListener {
            val intent=Intent(this,hub_home_page_3::class.java)
            startActivity(intent)
        }
        button_edit_sensor_with_back.setOnClickListener {
            val intent=Intent(this,edit_sensor_with_enable_back_and_delete::class.java)
            startActivity(intent)
        }
        button_add_user_with_back.setOnClickListener {
            val intent=Intent(this,user_adde_with_enable_back_and_delete::class.java)
            startActivity(intent)
        }
        button_remove_user_with_back.setOnClickListener {
            val intent=Intent(this,remove_a_user_with_enable_back_and_delete::class.java)
            startActivity(intent)
        }
        button_main_add_sensor.setOnClickListener {
            val intent=Intent(this,AddSensorActivity::class.java)
            startActivity(intent)
        }
        button_main_edit_activity.setOnClickListener {
            val intent=Intent(this,EditActivity::class.java)
            startActivity(intent)
        }*/

    }
}