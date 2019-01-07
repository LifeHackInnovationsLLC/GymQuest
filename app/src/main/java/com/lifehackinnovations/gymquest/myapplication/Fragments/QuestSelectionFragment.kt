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
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentQuestSelectionBinding
import kotlinx.android.synthetic.main.fragment_quest_selection.view.*

// TODO: Rename parameter arguments, choose names that match


/**
 * A simple [Fragment] subclass.
 *
 */
class QuestSelectionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var binding: FragmentQuestSelectionBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_quest_selection, container, false)
        var myView: View = binding.root

        myView.imagePointId.setOnClickListener { view ->
            val questGeneratorFragment = QuestGeneratorFragment()
            (activity as MainActivity).replaceFragment(questGeneratorFragment, R.id.fragment_container)
        }
//
//        myView.log_out.setOnClickListener { view ->
//            (activity as MainActivity).logOut()
//        }
//
//        myView.black_button.setOnClickListener { view ->
//            (activity as MainActivity).goBackOneFragment()
//        }

        return myView
    }


}
