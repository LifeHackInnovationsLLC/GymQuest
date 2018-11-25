package com.lifehackinnovations.gymquest.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.lifehackinnovations.gymquest.myapplication.Fragments.WelcomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(toolbar)
//
//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }

//        val welcomeFragment = WelcomeFragment();
//        addFragment(welcomeFragment, R.id.fragment_container)
        val welcomeFragment = WelcomeFragment();
        addFragment(welcomeFragment, R.id.fragment_container)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    //Fragment Management Functions for Kotlin from
    //https://medium.com/thoughts-overflow/how-to-add-a-fragment-in-kotlin-way-73203c5a450b
    companion object {
        fun AppCompatActivity.addFragment(fragment: Fragment, frameId: Int){
            supportFragmentManager.inTransaction { add(frameId, fragment) }
        }

        fun AppCompatActivity.replaceFragment(fragment: Fragment, frameId: Int) {
            supportFragmentManager.inTransaction{replace(frameId, fragment)}
        }

        fun AppCompatActivity.goBackOneFragment() {
            supportFragmentManager.popBackStack();
        }

        fun AppCompatActivity.logOut() {
            supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            val welcomeFragment = WelcomeFragment();
            addFragment(welcomeFragment, R.id.fragment_container)
        }

        inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
            val fragmentTransaction = beginTransaction()
            fragmentTransaction.func()
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }


}
