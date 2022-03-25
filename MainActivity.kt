package com.example.ex2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var tv :TextView
    lateinit var rg :RadioGroup
    lateinit var b1 :Button
    lateinit var iv :ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv=findViewById(R.id.tv)
        rg=findViewById(R.id.rg)
        b1=findViewById(R.id.b1)
        var b2=findViewById<Button>(R.id.b2)
        iv=findViewById(R.id.iv)
        var c1 :Switch= findViewById(R.id.sw)
        c1.setOnCheckedChangeListener { bv, b ->
            if(b)
            {
                tv.visibility=android.view.View.VISIBLE
                rg.visibility=android.view.View.VISIBLE
                b1.visibility=android.view.View.VISIBLE
                b2.visibility=android.view.View.VISIBLE
            }
            else
            {
                tv.visibility=android.view.View.INVISIBLE
                rg.visibility=android.view.View.INVISIBLE
                b1.visibility=android.view.View.INVISIBLE
                b2.visibility=android.view.View.INVISIBLE
                iv.visibility=android.view.View.GONE
            }
        }
        rg.setOnCheckedChangeListener { group, checkedId ->
            iv.visibility=android.view.View.VISIBLE
            when(rg.checkedRadioButtonId)
            {
                R.id.dog->iv.setImageResource(R.drawable.dog)
                R.id.cat->iv.setImageResource(R.drawable.cat)
                R.id.rabbit->iv.setImageResource(R.drawable.rabbit)
            }
        }
        b1.setOnClickListener {
            finish()
        }
        b2.setOnClickListener {
            c1.setChecked(false)
            rg.clearCheck()
            iv.visibility=android.view.View.GONE
        }

    }

}