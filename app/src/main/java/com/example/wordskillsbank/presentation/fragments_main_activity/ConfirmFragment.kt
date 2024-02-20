package com.example.wordskillsbank.presentation.fragments_main_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wordskillsbank.databinding.FragmentConfirmBinding
import com.example.wordskillsbank.presentation.activities.MainAppActivity

//Ему нужно передавать информацию о том, кто его вызвал, так как от этого зависит, какой фрагмент будет следующим
class ConfirmFragment : Fragment() {

    private lateinit var from_fragment:String
    private lateinit var viewBinding: FragmentConfirmBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var bundle:Bundle? = arguments
        if(bundle != null)
        {
            from_fragment = bundle.getString("from")!!;
        }

        viewBinding = FragmentConfirmBinding.inflate(layoutInflater)

        viewBinding.confirmButton.setOnClickListener{
            if(it?.id == viewBinding.confirmButton.id)
            {
                (this.activity as MainAppActivity).changeFragment("confirm_fragment", null)
            }
        }

        return viewBinding.root
    }
}