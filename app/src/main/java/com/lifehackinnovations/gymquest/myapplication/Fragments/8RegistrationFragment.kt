package com.lifehackinnovations.gymquest.myapplication.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.R

/**
 * A simple [Fragment] subclass.
 */
class `8RegistrationFragment` : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view: View = inflater!!.inflate(R.layout.fragment_registration, container, false)



        return view
    }

}// Required empty public constructor