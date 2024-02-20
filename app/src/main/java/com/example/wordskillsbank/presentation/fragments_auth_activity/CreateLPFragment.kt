package com.example.worldskillsbank.presentation.fragments_auth_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import com.example.worldskillsbank.R
import com.example.worldskillsbank.databinding.FragmentCreateLPBinding
import com.example.worldskillsbank.presentation.activities.AuthorizationActivity


class CreateLPFragment : Fragment() {

    private lateinit var viewBinding:FragmentCreateLPBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentCreateLPBinding.inflate(layoutInflater)

        viewBinding.createLP.setOnClickListener(object : OnClickListener{
            override fun onClick(v: View?) {
                when(v?.id)
                {
                    viewBinding.createLP.id -> (this@CreateLPFragment.activity as AuthorizationActivity)
                        .changeFragment("RegistrationConfirmFragment")
                }
            }
        })

        return viewBinding.root
    }


}