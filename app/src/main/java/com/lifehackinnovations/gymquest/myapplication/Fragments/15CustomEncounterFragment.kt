package com.lifehackinnovations.gymquest.myapplication.Fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.R
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentCustomEncouterBinding
import kotlinx.android.synthetic.main.fragment_custom_encouter.view.*

class `15CustomEncounterFragment` : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentCustomEncouterBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_custom_encouter, container, false)
        val myView: View = binding.root

        myView.customEncounterBackId.setOnClickListener {
            activity!!.onBackPressed()
        }

        return myView
    }
}