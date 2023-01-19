package com.example.homework

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class BlankFragment(string: Editable) : Fragment() {
    val age = string
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,

    ): View? {
        var rootView : View = inflater.inflate(R.layout.fragment_blank, container, false)
        var a : TextView = rootView.findViewById(R.id.textView2)
        a.setText("Oh... You are $age years old!")

        return rootView

    }




}