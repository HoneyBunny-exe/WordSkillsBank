package com.example.wordskillsbank.presentation.fragments_main_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wordskillsbank.databinding.FragmentChangeLoginBinding
import com.example.wordskillsbank.presentation.activities.MainAppActivity

class ChangeLoginFragment : Fragment() {

    private lateinit var viewBinding:FragmentChangeLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentChangeLoginBinding.inflate(layoutInflater)

        viewBinding.changeLoginButton.setOnClickListener{
            if(it?.id == viewBinding.changeLoginButton.id)
            {
                (this.activity as MainAppActivity).changeFragment("confirm_fragment", null)
            }
        }

        return viewBinding.root
    }
}