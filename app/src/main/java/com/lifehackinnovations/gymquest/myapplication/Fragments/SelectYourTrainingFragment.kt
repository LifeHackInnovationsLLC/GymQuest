package com.lifehackinnovations.gymquest.myapplication.Fragments


import android.content.Context
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.firebase.ui.auth.AuthUI
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.firebase.auth.FirebaseAuth
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

        var binding: FragmentSelectYourTrainingBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_select_your_training, container, false)
        var myView: View = binding.root

        myView.class_selection_buttons_view.setOnClickListener { view ->
            val classDescriptionFragment = ClassDescriptionFragment()
            Log.d("test", "test");
            (activity as MainActivity).replaceFragment(classDescriptionFragment, R.id.fragment_container)
        }

        myView.inventoryId.setOnClickListener { view ->
            val inventoryFragment = InventoryFragment()
            (activity as MainActivity).replaceFragment(inventoryFragment, R.id.fragment_container)
        }

        myView.theShopId.setOnClickListener { view ->
            val theShopFragment = TheShopFragment()
            (activity as MainActivity).replaceFragment(theShopFragment, R.id.fragment_container)
        }

        myView.statisticsId.setOnClickListener { view ->
            val statisticsFragment = StatisticsFragment()
            (activity as MainActivity).replaceFragment(statisticsFragment, R.id.fragment_container)
        }

        myView.settingId.setOnClickListener { view ->
            val settingFragment = SettingFragment()
            (activity as MainActivity).replaceFragment(settingFragment, R.id.fragment_container)
        }

        myView.log_out.setOnClickListener {
            val context: Context = context!!
            FirebaseAuth.getInstance().signOut()
            AuthUI.getInstance().signOut(context)
            (activity as MainActivity).logOut()

        }

        return myView
    }

}
// Required empty public constructor
