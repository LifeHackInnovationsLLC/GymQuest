package com.lifehackinnovations.gymquest.myapplication.Fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.MainActivity
import com.lifehackinnovations.gymquest.myapplication.MainActivity.Companion.replaceFragment
import com.lifehackinnovations.gymquest.myapplication.R
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentStatisticsBinding
import kotlinx.android.synthetic.main.fragment_class_description.view.*
import kotlinx.android.synthetic.main.fragment_welcome_back.view.*

class StatisticsFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentStatisticsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_statistics, container, false)
        val myView: View = binding.root

        myView.select_class_button.setOnClickListener { view ->
            val selectYourTrainingFragment = SelectYourTrainingFragment();
            (activity as MainActivity).replaceFragment(selectYourTrainingFragment, R.id.fragment_container)
        }

        return myView
    }
}