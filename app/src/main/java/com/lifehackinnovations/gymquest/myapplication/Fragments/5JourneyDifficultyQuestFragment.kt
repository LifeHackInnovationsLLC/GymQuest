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
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentQuestJourneyDifficultyBinding
import kotlinx.android.synthetic.main.fragment_quest_journey_difficulty.view.*

class JourneyDifficultyQuestFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var binding: FragmentQuestJourneyDifficultyBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_quest_journey_difficulty,
                container,
                false)
        var myView: View = binding.root
        myView.layoutXpPointId.setOnClickListener { view ->
            val questSelectionFragment = `6QuestSelectionFragment`();
            (activity as MainActivity).replaceFragment(questSelectionFragment, R.id.fragment_container)
        }

        myView.questButtonId.setOnClickListener { view ->
            (activity as MainActivity).onBackPressed()
        }

        return myView
    }


}
