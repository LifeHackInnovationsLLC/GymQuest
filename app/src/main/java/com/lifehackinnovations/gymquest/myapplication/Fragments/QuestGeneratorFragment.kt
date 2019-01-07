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
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentQuestGeneratorBinding
import kotlinx.android.synthetic.main.fragment_quest_generator.view.*

class QuestGeneratorFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var binding: FragmentQuestGeneratorBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_quest_generator,
                container,
                false)
        var myView: View = binding.root

        myView.beginGymQuestButtonId.setOnClickListener { view ->
            val startGymQuestFragment = StartGymQuestFragment()
            (activity as MainActivity).replaceFragment(startGymQuestFragment, R.id.fragment_container)

        }

        return myView
    }


}
