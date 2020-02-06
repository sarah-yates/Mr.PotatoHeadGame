package com.example.mrpotato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onCheckboxClicked(view: View) {
        view as CheckBox
        if (hatCheckBox == view) {
            toggleVisibility(hatCheckBox, hatPic)
        }
        if (eyesCheckBox == view) {
            toggleVisibility(eyesCheckBox,eyePic)
        }
        if (eyebrowsCheckBox == view) {
            toggleVisibility(eyebrowsCheckBox,eyebrowPic)
        }
        if (mustacheCheckBox == view) {
            toggleVisibility(mustacheCheckBox, mustachePic)
        }
        if (mouthCheckBox == view) {
            toggleVisibility(mouthCheckBox,mouthPic)
        }
        if (shoesCheckBoxes == view) {
            toggleVisibility(shoesCheckBoxes,shoePic)
        }
        if (hatCheckBox == view) {
            toggleVisibility(hatCheckBox,hatPic)
        }
        if (earsCheckBox == view) {
            toggleVisibility(earsCheckBox,earPic)
        }
        if (noseCheckBox == view) {
            toggleVisibility(noseCheckBox,nosePic)
        }
        if (glassesCheckBox == view) {
            toggleVisibility(glassesCheckBox,glassesPic)
        }
        if (armsCheckBox == view) {
            toggleVisibility(armsCheckBox,armPic)
        }
    }
    private fun toggleVisibility(box: View, img: ImageView){
        box as CheckBox
        if(box.isChecked) {
            img.visibility = View.VISIBLE
        }else{
            img.visibility = View.INVISIBLE
        }
    }
    }

