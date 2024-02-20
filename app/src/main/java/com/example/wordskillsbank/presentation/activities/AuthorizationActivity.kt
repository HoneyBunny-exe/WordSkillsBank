package com.example.wordskillsbank.presentation.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import java.util.UUID


class AuthorizationActivity : AppCompatActivity() {

    private var id:UUID = UUID.randomUUID()
    private lateinit var viewBinding: AuthorizationActivityBinding
    private lateinit var intent: Intent
    private lateinit var createLPFragment: CreateLPFragment
    private lateinit var loginPasswordFragment: LoginPasswordFragment
    private lateinit var registrationConfirmFragment: RegistrationConfirmFragment
    private lateinit var registrationFragment: RegistrationFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MyTest", "onCreate")
        Log.i("MyTest", id.toString())

        viewBinding = AuthorizationActivityBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        createLPFragment = CreateLPFragment()
        loginPasswordFragment = LoginPasswordFragment()
        registrationConfirmFragment = RegistrationConfirmFragment()
        registrationFragment = RegistrationFragment()

        supportFragmentManager.beginTransaction()
            .replace(viewBinding.authorizationActivityRoot.id, loginPasswordFragment)
            .commit()

        intent = Intent(this, MainAppActivity::class.java)
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MyTest", "onRestart")
    }

    override fun onStart() {
        Log.i("MyTest", "onStart")
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTest", "onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTest", "onPause")
    }

    override fun onResume() {
        super.onResume()

        Log.i("MyTest", "onResume")
/*
        supportFragmentManager.beginTransaction()
            .replace(viewBinding.authorizationActivityRoot.id, LoginPasswordFragment.newInstance())
            .commit()*/
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTest", "onDestroy")
    }

    fun changeFragment(string:String) {
        var manager:FragmentManager = supportFragmentManager
        when(string) {
            "createLPFragment" -> manager.beginTransaction()
                .replace(viewBinding.authorizationActivityRoot.id, createLPFragment).commit()

            "loginPasswordFragment" -> manager.beginTransaction()
                .replace(viewBinding.authorizationActivityRoot.id, loginPasswordFragment).commit()

            "registrationConfirmFragment" -> manager.beginTransaction()
                .replace(viewBinding.authorizationActivityRoot.id, registrationConfirmFragment).commit()

            "registrationFragment" -> manager.beginTransaction()
                .replace(viewBinding.authorizationActivityRoot.id, registrationFragment).commit()
        }
    }

    public fun goToMainAppActivity()
    {
        intent = Intent(this, MainAppActivity::class.java)
        startActivity(intent)
    }

    fun goToMapActivity()
    {
        intent = Intent(this, MapActivity::class.java)
        startActivity(intent)
    }
}