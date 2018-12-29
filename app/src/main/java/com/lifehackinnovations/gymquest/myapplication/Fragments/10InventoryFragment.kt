package com.lifehackinnovations.gymquest.myapplication.Fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.R
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentInventoryBinding
import kotlinx.android.synthetic.main.fragment_inventory.view.*

class `10InventoryFragment` : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: FragmentInventoryBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_inventory, container, false)
        val myView: View = binding.root

        myView.gymBackId.setOnClickListener {
            activity!!.onBackPressed()
        }
        return myView
    }

}