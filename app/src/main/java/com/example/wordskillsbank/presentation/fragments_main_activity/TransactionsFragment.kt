package com.example.wordskillsbank.presentation.fragments_main_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wordskillsbank.databinding.FragmentTransactionsBinding
import com.example.wordskillsbank.presentation.activities.MainAppActivity

class TransactionsFragment : Fragment() {

    private lateinit var viewBinding:FragmentTransactionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentTransactionsBinding.inflate(layoutInflater)

        var onClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                when(v?.id)
                {
                   viewBinding.apb.id -> (this@TransactionsFragment.activity as MainAppActivity)
                        .changeFragment("transactions_another_fragment", null)
                    viewBinding.toYourselfTransferButton.id -> (this@TransactionsFragment.activity as MainAppActivity)
                        .changeFragment("to_youself_transaction_fragment", null)
                }
            }
        }

        viewBinding.apb.setOnClickListener(onClickListener)
        viewBinding.toYourselfTransferButton.setOnClickListener(onClickListener)

        return viewBinding.root
    }
}