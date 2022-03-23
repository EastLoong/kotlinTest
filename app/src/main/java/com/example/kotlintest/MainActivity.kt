package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a= 2
        var y = when(a){
            1->"fff"
            3->"yy"

            else -> "44"
        }
         "ffff".count()
    }
}