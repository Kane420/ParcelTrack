package com.example.parceltrackbv.ui.profiel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.parceltrackbv.R

class ProfielFragment : Fragment() {

    private lateinit var profielViewModel: ProfielViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profielViewModel =
            ViewModelProviders.of(this).get(ProfielViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_profiel, container, false)
        val textView: TextView = root.findViewById(R.id.text_profiel)
        profielViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}