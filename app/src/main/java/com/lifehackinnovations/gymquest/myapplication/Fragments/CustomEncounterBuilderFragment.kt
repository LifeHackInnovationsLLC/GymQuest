package com.lifehackinnovations.gymquest.myapplication.Fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.R
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentCustomEncounterBuilderBinding
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentStartGymQuestBinding

class CustomEncounterBuilderFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var binding: FragmentCustomEncounterBuilderBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_custom_encounter_builder, container, false)
        var myView: View = binding.root


        return myView
    }


}
