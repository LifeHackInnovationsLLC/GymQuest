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
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentStartGymQuestBinding
import kotlinx.android.synthetic.main.fragment_start_gym_quest.view.*

class StartGymQuestFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var binding: FragmentStartGymQuestBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_start_gym_quest, container, false)
        var myView: View = binding.root

        myView.backImageId.setOnClickListener { myView ->
            (activity as MainActivity).onBackPressed()
        }

        myView.setTimeImageId.setOnClickListener { myView ->
            val timerSettingFragment = TimerSettingFragment()
            (activity as MainActivity).replaceFragment(timerSettingFragment, R.id.fragment_container)
        }

        myView.startGymQuestId.setOnClickListener { myView ->
            val nextEncounterFragment = `14CurrentEncounterFragment`()
            (activity as MainActivity).replaceFragment(nextEncounterFragment, R.id.fragment_container)
        }

        return myView
    }


}
