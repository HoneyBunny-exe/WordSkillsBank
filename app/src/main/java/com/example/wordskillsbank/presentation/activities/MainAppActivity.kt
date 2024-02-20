package com.example.wordskillsbank.presentation.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import androidx.fragment.app.FragmentManager
import com.example.wordskillsbank.R
import com.example.wordskillsbank.databinding.ActivityMainAppBinding
import com.example.wordskillsbank.presentation.fragments_main_activity.AddFragment
import com.example.wordskillsbank.presentation.fragments_main_activity.ChangeLoginFragment
import com.example.wordskillsbank.presentation.fragments_main_activity.ConfirmFragment
import com.example.wordskillsbank.presentation.fragments_main_activity.LKFragment
import com.example.wordskillsbank.presentation.fragments_main_activity.MainAppFragment
import com.example.wordskillsbank.presentation.fragments_main_activity.PayInfoFragment
import com.example.wordskillsbank.presentation.fragments_main_activity.PaymentsFragment
import com.example.wordskillsbank.presentation.fragments_main_activity.TransactionsAnotherFragment
import com.example.wordskillsbank.presentation.fragments_main_activity.TransactionsFragment
import com.example.wordskillsbank.presentation.fragments_main_activity.TransactionsYouselfFragment
import com.example.wordskillsbank.presentation.fragments_main_activity.ValuteFragment
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener

class MainAppActivity : AppCompatActivity(), OnItemSelectedListener{

    private lateinit var viewBinding:ActivityMainAppBinding
    private lateinit var onClickListener: OnClickListener

    private lateinit var mainAppFragment: MainAppFragment
    private lateinit var lkFragment: LKFragment
    private lateinit var paymentsFragment: PaymentsFragment
    private lateinit var addFragment: AddFragment
    private lateinit var transactionsFragment: TransactionsFragment
    private lateinit var valuteFragment: ValuteFragment
/*  private lateinit var transactionsAnotherFragment: TransactionsAnotherFragment
    private lateinit var transactionsYouselfFragment: TransactionsYouselfFragment
    private lateinit var payInfoFragment: PayInfoFragment
    private lateinit var changeLoginFragment: ChangeLoginFragment
    private lateinit var confirmFragment: ConfirmFragment*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainAppBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.bottomNavigationMenu.z = 1.0f
        viewBinding.bottomNavigationMenu.selectedItemId = R.id.bottom_home
        viewBinding.bottomNavigationMenu.setOnItemSelectedListener(this)


        // инициализация фрагментов
        mainAppFragment = MainAppFragment()
        lkFragment = LKFragment()
        addFragment = AddFragment()
        paymentsFragment = PaymentsFragment()
        transactionsFragment = TransactionsFragment()
        valuteFragment = ValuteFragment()
/*        transactionsAnotherFragment = TransactionsAnotherFragment()
        transactionsYouselfFragment = TransactionsYouselfFragment()
        payInfoFragment = PayInfoFragment()
        changeLoginFragment = ChangeLoginFragment()
        confirmFragment = ConfirmFragment()*/
        //-----------


        supportFragmentManager.beginTransaction()
            .replace(R.id.mainAppContainer, mainAppFragment)
            .commit()


        // Код для кнопок в верхней части экрана
        onClickListener = object : OnClickListener{
            override fun onClick(v: View?) {
                when(v?.id)
                {
                    viewBinding.logout.id -> goToAuthorizationActivity()
                    viewBinding.LK.id -> changeFragment("lkFragment", null)
                }
            }
        }
        viewBinding.LK.setOnClickListener(onClickListener)
        viewBinding.logout.setOnClickListener(onClickListener)
    }

    fun changeFragment(string:String, bundle:Bundle?) {
        var manager:FragmentManager = supportFragmentManager
        when(string)
        {
            "lkFragment" -> manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, lkFragment).commit()

            "bottom_home" -> manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, mainAppFragment).commit()

            "bottom_payment" -> manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, paymentsFragment).commit()

            "bottom_add" -> manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, addFragment).commit()

            "bottom_transaction" -> manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, transactionsFragment).commit()

            "bottom_valute" -> manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, valuteFragment).commit()

            "transactions_another_fragment" -> manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, TransactionsAnotherFragment()).commit()

            "to_youself_transaction_fragment" -> manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, TransactionsYouselfFragment()).commit()

            "pay_info_fragment" -> manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, PayInfoFragment()).commit()

            "change_login_fragment" -> manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, ChangeLoginFragment()).commit()

            "confirm_fragment" -> {
                var confirmFragment = ConfirmFragment()
                confirmFragment.arguments = bundle
                manager.beginTransaction()
                .replace(viewBinding.mainAppContainer.id, confirmFragment).commit()}


            else -> throw RuntimeException("unknowing fragment")
        }
    }

    fun goToAuthorizationActivity()
    {
        var intent = Intent(this, AuthorizationActivity::class.java)
        startActivity(intent)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.bottom_home -> changeFragment("bottom_home", null)
            R.id.bottom_payment -> changeFragment("bottom_payment", null)
            R.id.bottom_add -> changeFragment("bottom_add", null)
            R.id.bottom_transaction -> changeFragment("bottom_transaction", null)
            R.id.bottom_valute -> changeFragment("bottom_valute", null)
            else -> throw RuntimeException("Unknown menu button")
        }
        return true
    }
}
