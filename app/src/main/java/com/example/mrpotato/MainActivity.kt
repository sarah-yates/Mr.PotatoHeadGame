package com.example.mrpotato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onCheckboxClicked(view: View) {
        view as CheckBox
        if (hatCheckBox == view) {
            if (view.isChecked) {
                hatPic.visibility = View.VISIBLE
            } else {
                hatPic.visibility = View.INVISIBLE
            }
        }
        if (eyesCheckBox == view) {
            if (view.isChecked) {
                eyePic.visibility = View.VISIBLE
            } else {
                eyePic.visibility = View.INVISIBLE
            }
        }
        if (eyebrowsCheckBox == view) {
            if (view.isChecked) {
                eyebrowPic.visibility = View.VISIBLE
            } else {
                eyebrowPic.visibility = View.INVISIBLE
            }
        }
        if (mustacheCheckBox == view) {
            if (view.isChecked) {
                mustachePic.visibility = View.VISIBLE
            } else {
                mustachePic.visibility = View.INVISIBLE
            }
        }
        if (mouthCheckBox == view) {
            if (view.isChecked) {
                mouthPic.visibility = View.VISIBLE
            } else {
                mouthPic.visibility = View.INVISIBLE
            }
        }
        if (shoesCheckBoxes == view) {
            if (view.isChecked) {
                shoePic.visibility = View.VISIBLE
            } else {
                shoePic.visibility = View.INVISIBLE
            }
        }
        if (hatCheckBox == view) {
            if (view.isChecked) {
                hatPic.visibility = View.VISIBLE
            } else {
                hatPic.visibility = View.INVISIBLE
            }
        }
        if (earsCheckBox == view) {
            if (view.isChecked) {
                earPic.visibility = View.VISIBLE
            } else {
                earPic.visibility = View.INVISIBLE
            }
        }
        if (noseCheckBox == view) {
            if (view.isChecked) {
                nosePic.visibility = View.VISIBLE
            } else {
                nosePic.visibility = View.INVISIBLE
            }
        }
        if (glassesCheckBox == view) {
            if (view.isChecked) {
                glassesPic.visibility = View.VISIBLE
            } else {
                glassesPic.visibility = View.INVISIBLE
            }
        }
        if (armsCheckBox == view) {
            if (view.isChecked) {
                armPic.visibility = View.VISIBLE
            } else {
                armPic.visibility = View.INVISIBLE
            }
        }
    }
    }

