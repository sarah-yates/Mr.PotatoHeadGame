package com.example.mrpotato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onCheckboxClicked(view: View){
        var checked = view as CheckBox
        if(hatCheckBox == checked) {
            hatPic.visibility = View.VISIBLE
        }
        if(eyesCheckBox == checked) {
            eyePic.visibility = View.VISIBLE
        }
        if(eyebrowsCheckBox == checked) {
            eyebrowPic.visibility = View.VISIBLE
        }
        if(glassesCheckBox == checked) {
            glassesPic.visibility = View.VISIBLE
        }
        if(noseCheckBox == checked) {
            nosePic.visibility = View.VISIBLE
        }
        if(mouthCheckBox == checked) {
            mouthPic.visibility = View.VISIBLE
        }
        if(mustacheCheckBox == checked) {
            mustachePic.visibility = View.VISIBLE
        }
        if(earsCheckBox == checked) {
            earPic.visibility = View.VISIBLE
        }
        if(armsCheckBox == checked) {
            armPic.visibility = View.VISIBLE
        }
        if(shoesCheckBoxes == checked) {
            shoePic.visibility = View.VISIBLE
        }
        }
    }

