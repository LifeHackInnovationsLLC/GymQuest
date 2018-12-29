package com.lifehackinnovations.gymquest.myapplication.Fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.R
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentTheShopBinding
import kotlinx.android.synthetic.main.fragment_the_shop.view.*

class `11TheShopFragment` : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: FragmentTheShopBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_the_shop, container, false)
        val myView: View = binding.root

        myView.theShopBackId.setOnClickListener {
            activity!!.onBackPressed()
        }

        return myView
    }
}