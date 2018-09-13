package com.hanifkf.submission1

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.select_dialog_item_material.view.*
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {

    lateinit var namatim: TextView
    lateinit var gambartim:ImageView
    lateinit var deskripsi: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout{
            gambartim = imageView(){

            }.
                    lparams(width = dip(80) , height = dip(80)){
                        padding = dip(10)
                        topMargin = dip(15)
                        bottomMargin = dip(10)
                        horizontalGravity = Gravity.CENTER_HORIZONTAL
                    }
            namatim = textView(){
                textSize = 18f
                textColor = Color.BLACK
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }.lparams(width= wrapContent){
                        padding = dip(10)
            }
            deskripsi = textView(){
                textColor = Color.BLACK
            }.lparams(width = matchParent){
                        leftPadding = dip(15)
                        rightPadding= dip(15)
                        topMargin = dip(20)
            }

        }
        val intent = intent
        val nama = intent.getStringExtra("name")
        val deskripsitim = intent.getStringExtra("desc")
        val gambar = intent.getIntExtra("img", R.drawable.img_barca)
        gambartim.setImageResource(gambar)
        namatim.text = nama
        deskripsi.text = deskripsitim
    }

}
