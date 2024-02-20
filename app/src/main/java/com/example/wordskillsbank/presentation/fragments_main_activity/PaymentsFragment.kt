package com.example.wordskillsbank.presentation.fragments_main_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import com.example.wordskillsbank.R
import com.example.wordskillsbank.databinding.FragmentPaymentsBinding

class PaymentsFragment : Fragment() {

    private lateinit var viewBinding: FragmentPaymentsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentPaymentsBinding.inflate(layoutInflater)

        var onClickListener = object : OnClickListener{
            override fun onClick(v: View?) {
                when(v?.id)
                {
                    //viewBinding.continuePayment.id -> // TODO: переход на фрагмент с подтверждением
                }
            }
        }

        return inflater.inflate(R.layout.fragment_payments, container, false)
    }

}