package com.samueljbeck.scrollviewtextinputscreen

import android.app.Activity
import android.graphics.Point
import android.os.Bundle
import android.view.Window
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.text_input_activity.*

/*
 * Created by samueljbeck on 3/12/19.
 */

class TextInputActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.text_input_activity)

        val p = Point()
        windowManager.getDefaultDisplay().getSize(p)

        val layoutParams = scroll_holder.layoutParams

        layoutParams.height = p.y

        scroll_holder.layoutParams = layoutParams


    }


}