package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.library.dialog.SYDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Error loading build artifacts from
    fun show(view: View) {
        when(view.id){
            R.id.textView->{
                //
                SYDialog.Builder(this)
                    .setTitle("111")
                    .setContent("2222")
                    .show()
            }
            R.id.button->{
                startActivity(Intent(this,TestActivity::class.java))
            }

        }

    }
}