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
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentSettingBinding
import kotlinx.android.synthetic.main.fragment_setting.view.*

class SettingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentSettingBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_setting, container, false)
        val myView: View = binding.root

        myView.settingBackId.setOnClickListener {
            activity!!.onBackPressed()
        }

        myView.managePersonalId.setOnClickListener {
            val personalRecordsFragment = PersonalRecordsFragment();
            (activity as MainActivity).replaceFragment(personalRecordsFragment, R.id.fragment_container)
        }

        myView.defaultNumberId.setOnClickListener {
            val timerSettingFragment = TimerSettingFragment();
            (activity as MainActivity).replaceFragment(timerSettingFragment, R.id.fragment_container)
        }

        myView.mangeCustomId.setOnClickListener {
            val customEncounterFragment = CustomEncounterFragment();
            (activity as MainActivity).replaceFragment(customEncounterFragment, R.id.fragment_container)
        }

        return myView
    }
}