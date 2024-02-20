package com.example.worldskillsbank.presentation.fragments_auth_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import com.example.worldskillsbank.R
import com.example.worldskillsbank.databinding.FragmentRegistrationBinding
import com.example.worldskillsbank.presentation.activities.AuthorizationActivity


class RegistrationFragment : Fragment() {

    private lateinit var viewBinding: FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentRegistrationBinding.inflate(layoutInflater)

        var onClickListener = object : OnClickListener {

            override fun onClick(v: View?) {
                when(v?.id){
                    viewBinding.onMain.id -> (this@RegistrationFragment.activity as AuthorizationActivity).changeFragment("loginPasswordFragment")
                    viewBinding.regButton.id -> (this@RegistrationFragment.activity as AuthorizationActivity).changeFragment("registrationConfirmFragment")
                }
            }
        }

        viewBinding.regButton.setOnClickListener(onClickListener)
        viewBinding.onMain.setOnClickListener(onClickListener)

        return viewBinding.root
    }
}