package com.example.worldskillsbank.presentation.fragments_auth_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.View.OnClickListener
import com.example.worldskillsbank.R
import com.example.worldskillsbank.databinding.FragmentRegistrationConfirmBinding
import com.example.worldskillsbank.presentation.activities.AuthorizationActivity


class RegistrationConfirmFragment : Fragment() {

    private lateinit var viewBinding: FragmentRegistrationConfirmBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentRegistrationConfirmBinding.inflate(layoutInflater)

        var onClickListener = object : OnClickListener{

            override fun onClick(v: View?) {
                when(v?.id)
                {
                    viewBinding.onMainConfirm.id -> (this@RegistrationConfirmFragment.activity as AuthorizationActivity)
                        .changeFragment("loginPasswordFragment")
                    viewBinding.confirmButton.id -> ((this@RegistrationConfirmFragment.activity as AuthorizationActivity)
                        .goToMainAppActivity())
                }
            }
        }

        viewBinding.onMainConfirm.setOnClickListener(onClickListener)
        viewBinding.confirmButton.setOnClickListener(onClickListener)

        return viewBinding.root
    }
}