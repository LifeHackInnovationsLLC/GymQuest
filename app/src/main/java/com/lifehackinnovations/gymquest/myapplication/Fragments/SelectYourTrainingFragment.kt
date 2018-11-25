package com.lifehackinnovations.gymquest.myapplication.Fragments


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lifehackinnovations.gymquest.myapplication.MainActivity
import com.lifehackinnovations.gymquest.myapplication.MainActivity.Companion.logOut
import com.lifehackinnovations.gymquest.myapplication.MainActivity.Companion.replaceFragment
import com.lifehackinnovations.gymquest.myapplication.R
import com.lifehackinnovations.gymquest.myapplication.databinding.FragmentSelectYourTrainingBinding
import kotlinx.android.synthetic.main.fragment_select_your_training.view.*


/**
 * A simple [Fragment] subclass.
 */
class SelectYourTrainingFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        //DataBindingUtil.inflate: View rootView = DataBindingUtil.inflate(inflater, R.layout.fragment_select_your_training, container, false).getRoot()
//        val listItemBinding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_select_your_training, viewGroup, false)

        var binding : FragmentSelectYourTrainingBinding = DataBindingUtil.inflate(inflater , R.layout.fragment_select_your_training,container , false)
        var myView : View  = binding.root

        myView.class_selection_buttons_view.setOnClickListener { view ->
            val classDescriptionFragment = ClassDescriptionFragment();
            Log.d("test","test");
            (activity as MainActivity).replaceFragment(classDescriptionFragment, R.id.fragment_container)
        }

        myView.log_out.setOnClickListener { view ->
            (activity as MainActivity).logOut()
        }

        return myView
    }

}// Required empty public constructor
