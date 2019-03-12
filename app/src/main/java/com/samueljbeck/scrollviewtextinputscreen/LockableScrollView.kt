package com.samueljbeck.scrollviewtextinputscreen

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.ScrollView

/**
 * Created by miguele on 4/19/16.
 */
class LockableScrollView : ScrollView {

    // true if we can scroll (not locked)
    // false if we cannot scroll (locked)
    var isScrollable = true
        private set

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context) : super(context) {}

    fun setScrollingEnabled(enabled: Boolean) {
        isScrollable = enabled
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(ev: MotionEvent): Boolean {
        return when (ev.action) {
            MotionEvent.ACTION_DOWN -> {
                // if we can scroll pass the event to the superclass
                if (isScrollable) super.onTouchEvent(ev) else isScrollable
                // only continue to handle the touch event if scrolling enabled
                // mScrollable is always false at this point
            }
            else -> super.onTouchEvent(ev)
        }
    }


    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        return when (ev.action) {
            MotionEvent.ACTION_DOWN -> {
                // if we can scroll pass the event to the superclass
                if (isScrollable) super.onInterceptTouchEvent(ev) else isScrollable
                // only continue to handle the touch event if scrolling enabled
                // mScrollable is always false at this point
            }
            else -> super.onInterceptTouchEvent(ev)
        }
    }

}