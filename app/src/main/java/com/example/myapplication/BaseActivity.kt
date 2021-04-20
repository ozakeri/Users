package com.example.myapplication

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    fun showProgress(progress : ProgressBar){
        progress.visibility = View.VISIBLE
    }

    fun hideProgress(progress : ProgressBar){
        progress.visibility = View.VISIBLE
    }
}