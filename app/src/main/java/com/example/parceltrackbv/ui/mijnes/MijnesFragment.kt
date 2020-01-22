package com.example.parceltrackbv.ui.mijnes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.parceltrackbv.R

class MijnesFragment : Fragment() {

    private lateinit var mijnesViewModel: MijnesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mijnesViewModel =
            ViewModelProviders.of(this).get(MijnesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_mijnes, container, false)
        val textView: TextView = root.findViewById(R.id.text_mijnes)
        mijnesViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}