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
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentNextEncounterBinding
import kotlinx.android.synthetic.main.fragment_next_encounter.view.*

class NextEncounterFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentNextEncounterBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_next_encounter,
                container,
                false)
        val myView: View = binding.root

        myView.recordImageId.setOnClickListener { myView ->
            val personalRecordsFragment = PersonalRecordsFragment()
            (activity as MainActivity).replaceFragment(personalRecordsFragment, R.id.fragment_container)
        }

        myView.startGymQuestId.setOnClickListener { myView ->
            val gymQuestCompleteFragment = GymQuestCompleteFragment();
            (activity as MainActivity).replaceFragment(gymQuestCompleteFragment, R.id.fragment_container)
        }

        return myView
    }


}
