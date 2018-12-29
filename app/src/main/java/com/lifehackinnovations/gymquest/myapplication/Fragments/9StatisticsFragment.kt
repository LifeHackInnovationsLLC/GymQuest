package com.lifehackinnovations.gymquest.myapplication.Fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.MainActivity
import com.lifehackinnovations.gymquest.myapplication.MainActivity.Companion.replaceFragment
import com.lifehackinnovations.gymquest.myapplication.R
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentStatisticsBinding
import kotlinx.android.synthetic.main.fragment_statistics.view.*

class `9StatisticsFragment` : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentStatisticsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_statistics, container, false)
        val myView: View = binding.root

        myView.selectClassButtonId.setOnClickListener { view ->
            val selectYourTrainingFragment = `3SelectYourTrainingFragment`();
            (activity as MainActivity).replaceFragment(selectYourTrainingFragment, R.id.fragment_container)
        }

        myView.achievementButtonId.setOnClickListener { view ->
            val achievementsFragment = `12AchievementsFragment`();
            (activity as MainActivity).replaceFragment(achievementsFragment, R.id.fragment_container)
        }

        return myView
    }
}