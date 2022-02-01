package org.geeksforgeeks.underlinetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTextView = findViewById<TextView>(R.id.text_view_1)

        val mString = "Hello Geek!"
        val mSpannableString = SpannableString(mString)
        mSpannableString.setSpan(UnderlineSpan(), 0, mSpannableString.length, 0)

        mTextView.text = mSpannableString
    }
}