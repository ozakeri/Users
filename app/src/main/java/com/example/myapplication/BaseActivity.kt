package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    fun showProgress(progress: ProgressBar) {
        progress.visibility = View.VISIBLE
    }

    fun hideProgress(progress: ProgressBar) {
        progress.visibility = View.VISIBLE
    }

    fun shoeToast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }
}