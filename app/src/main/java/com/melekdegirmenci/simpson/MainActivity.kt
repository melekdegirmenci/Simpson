package com.melekdegirmenci.simpson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var name=""
    fun makeSimpson(view: View) {
        name=nameText.text.toString()
        var age=ageText.text.toString().toIntOrNull()
        if (age==null){
            age=0
        }
        val job=jobText.text.toString()

        textView.text="ad:${name},yas:${age},is:${job}"


    }
    fun ScopeExample(view:View){
        println(name)

    }

}