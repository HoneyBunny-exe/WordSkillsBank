package com.example.wordskillsbank.presentation.fragments_main_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wordskillsbank.databinding.FragmentTransactionsYouselfBinding
import com.example.wordskillsbank.presentation.activities.MainAppActivity

class TransactionsYouselfFragment : Fragment() {

    private lateinit var viewBinding: FragmentTransactionsYouselfBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewBinding = FragmentTransactionsYouselfBinding.inflate(layoutInflater)

        viewBinding.toYouselfTransactionButton.setOnClickListener {
            if(it?.id == viewBinding.toYouselfTransactionButton.id)
            {
                var bundle:Bundle = Bundle()
                bundle.putString("from", "transaction_youself_fragment")

            }
        }

        return viewBinding.root
    }

}