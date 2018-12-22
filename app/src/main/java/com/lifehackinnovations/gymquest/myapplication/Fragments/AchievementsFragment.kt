package com.lifehackinnovations.gymquest.myapplication.Fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.R
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentAchievementsBinding
import kotlinx.android.synthetic.main.fragment_achievements.view.*

class AchievementsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentAchievementsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_achievements, container, false)
        val myView: View = binding.root

        myView.achievementBackButtonId.setOnClickListener {
            activity!!.onBackPressed()
        }

        return myView
    }
}