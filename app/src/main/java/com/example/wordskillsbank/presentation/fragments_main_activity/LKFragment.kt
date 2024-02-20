package com.example.wordskillsbank.presentation.fragments_main_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import com.example.wordskillsbank.databinding.FragmentLKBinding
import com.example.wordskillsbank.presentation.activities.MainAppActivity

class LKFragment : Fragment() {

    private lateinit var viewBinding:FragmentLKBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewBinding = FragmentLKBinding.inflate(layoutInflater)

        var onClickListener = object:View.OnClickListener{
            override fun onClick(v: View?) {
                when(v?.id)
                {
                    viewBinding.changePassword.id -> (this@LKFragment.activity as MainAppActivity)
                        .changeFragment("change_password_fragment", null)
                    viewBinding.changeLogin.id -> (this@LKFragment.activity as MainAppActivity)
                        .changeFragment("change_login_fragment", null)
                }
            }
        }

        viewBinding.changeLogin.setOnClickListener(onClickListener)
        viewBinding.changePassword.setOnClickListener(onClickListener)

        return viewBinding.root
    }
}