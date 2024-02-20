package com.example.worldskillsbank.presentation.fragments_auth_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import com.example.worldskillsbank.R
import com.example.worldskillsbank.databinding.FragmentLoginPasswordBinding
import com.example.worldskillsbank.presentation.activities.AuthorizationActivity

class LoginPasswordFragment : Fragment() {

    private lateinit var viewBinding:FragmentLoginPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentLoginPasswordBinding.inflate(layoutInflater)

        var onClickListener = object : OnClickListener {
            override fun onClick(v: View?) {
                when(v?.id)
                {
                    viewBinding.authButton.id -> {
                        // TODO: проверить, что логин и пароль найдены
                        (this@LoginPasswordFragment.activity as AuthorizationActivity).goToMainAppActivity()
                    }
                    viewBinding.registration.id -> (this@LoginPasswordFragment.activity as AuthorizationActivity).changeFragment("registrationFragment")
                    viewBinding.bankomats.id -> (this@LoginPasswordFragment.activity as AuthorizationActivity).goToMapActivity()
                }
            }
        }

        viewBinding.registration.setOnClickListener(onClickListener)
        viewBinding.authButton.setOnClickListener(onClickListener)
        viewBinding.bankomats.setOnClickListener(onClickListener)

        return viewBinding.root
    }
}