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
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentGymQuestCompleteBinding
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentGymQuestCompleteSummaryBinding
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentStartGymQuestBinding
import kotlinx.android.synthetic.main.fragment_start_gym_quest.view.*

class GymQuestCompleteSummaryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGymQuestCompleteSummaryBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_gym_quest_complete_summary, container, false)
        val myView: View = binding.root


        return myView
    }


}
