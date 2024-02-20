package com.example.wordskillsbank.presentation.fragments_main_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wordskillsbank.R
import com.example.wordskillsbank.databinding.FragmentTransactionsAnotherBinding


class TransactionsAnotherFragment : Fragment() {

    private lateinit var viewBinding: FragmentTransactionsAnotherBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentTransactionsAnotherBinding.inflate(layoutInflater)



        return inflater.inflate(R.layout.fragment_transactions_another, container, false)
    }
}