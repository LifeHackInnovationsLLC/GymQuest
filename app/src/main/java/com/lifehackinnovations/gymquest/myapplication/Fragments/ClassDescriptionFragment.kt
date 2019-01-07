package com.lifehackinnovations.gymquest.myapplication.Fragments


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.MainActivity
import com.lifehackinnovations.gymquest.myapplication.MainActivity.Companion.goBackOneFragment
import com.lifehackinnovations.gymquest.myapplication.MainActivity.Companion.logOut
import com.lifehackinnovations.gymquest.myapplication.MainActivity.Companion.replaceFragment
import com.lifehackinnovations.gymquest.myapplication.R
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentClassDescriptionBinding
import kotlinx.android.synthetic.main.fragment_class_description.view.*


/**
 * A simple [Fragment] subclass.
 *
 */
class ClassDescriptionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var binding: FragmentClassDescriptionBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_class_description, container, false)
        var myView: View = binding.root

        myView.select_class_button.setOnClickListener { view ->
            val journeyDifficultyQuestFragment = JourneyDifficultyQuestFragment();
            Log.d("test", "test");
            (activity as MainActivity).replaceFragment(journeyDifficultyQuestFragment, R.id.fragment_container)
        }

        myView.log_out.setOnClickListener { view ->
            (activity as MainActivity).logOut()
        }

        myView.black_button.setOnClickListener { view ->
            (activity as MainActivity).goBackOneFragment()
        }

        return myView
    }


}
