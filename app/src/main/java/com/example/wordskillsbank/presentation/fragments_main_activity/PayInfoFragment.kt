package com.example.wordskillsbank.presentation.fragments_main_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wordskillsbank.databinding.FragmentPayInfoBinding

class PayInfoFragment : Fragment() {

    private lateinit var viewBinding: FragmentPayInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentPayInfoBinding.inflate(layoutInflater)

        return viewBinding.root
    }
}