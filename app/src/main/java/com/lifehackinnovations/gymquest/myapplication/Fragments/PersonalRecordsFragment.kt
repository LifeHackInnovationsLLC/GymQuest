package com.lifehackinnovations.gymquest.myapplication.Fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.R
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentPersonalRecordsBinding
import kotlinx.android.synthetic.main.fragment_personal_records.view.*

class PersonalRecordsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentPersonalRecordsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_personal_records, container, false)
        val myView: View = binding.root

        myView.personalRecordBackId.setOnClickListener {
            activity!!.onBackPressed()
        }

        return myView
    }
}