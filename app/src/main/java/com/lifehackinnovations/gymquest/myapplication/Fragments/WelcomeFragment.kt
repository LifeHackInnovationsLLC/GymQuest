package com.lifehackinnovations.gymquest.myapplication.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
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
            (activity as MainActivity).replaceFragment(welcomeBackFragment, R.id.fragment_container)

        }

        view.register_facebook_button.setOnClickListener { view ->
            val registrationFragment = RegistrationFragment();
            (activity as MainActivity).replaceFragment(registrationFragment, R.id.fragment_container)

        }

        view.register_twitter_button.setOnClickListener { view ->
            val registrationFragment = RegistrationFragment();
            (activity as MainActivity).replaceFragment(registrationFragment, R.id.fragment_container)

        }

        view.register_google_button.setOnClickListener { view ->
            val registrationFragment = RegistrationFragment();
            (activity as MainActivity).replaceFragment(registrationFragment, R.id.fragment_container)

        }

        return view
    }

}// Required empty public constructor
