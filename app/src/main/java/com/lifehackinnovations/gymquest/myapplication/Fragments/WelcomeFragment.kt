package com.lifehackinnovations.gymquest.myapplication.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.MainActivity
import com.lifehackinnovations.gymquest.myapplication.MainActivity.Companion.replaceFragment
import com.lifehackinnovations.gymquest.myapplication.R
import kotlinx.android.synthetic.main.fragment_welcome.view.*


/**
 * A simple [Fragment] subclass.
 */
class WelcomeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view: View = inflater!!.inflate(R.layout.fragment_welcome, container, false)



        view.login_button.setOnClickListener { view ->
            val welcomeBackFragment = WelcomeBackFragment();
            Log.d("test","test");
            (activity as MainActivity).replaceFragment(welcomeBackFragment, R.id.fragment_container)
        }

        return view
    }

}// Required empty public constructor
