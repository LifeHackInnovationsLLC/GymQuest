package com.lifehackinnovations.gymquest.myapplication.Fragments


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.*
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.lifehackinnovations.gymquest.myapplication.MainActivity
import com.lifehackinnovations.gymquest.myapplication.MainActivity.Companion.replaceFragment
import com.lifehackinnovations.gymquest.myapplication.R
import kotlinx.android.synthetic.main.fragment_welcome.view.*


/**
 * A simple [Fragment] subclass.
 */
class WelcomeFragment : Fragment() {

    val RC_SIGN_IN: Int = 1
    lateinit var mGoogleSignInClient: GoogleSignInClient
    lateinit var mGoogleSignInOptions: GoogleSignInOptions

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firebaseAuth = FirebaseAuth.getInstance()
        val context: Context = context!!
        configureGoogleSignIn(context)
        firebaseAuth = FirebaseAuth.getInstance()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view: View = inflater!!.inflate(R.layout.fragment_welcome, container, false)


        view.login_button.setOnClickListener { view ->
            val welcomeBackFragment = WelcomeBackFragment();
            (activity as MainActivity).replaceFragment(welcomeBackFragment, R.id.fragment_container)

        }

        view.register_facebook_button.setOnClickListener { view ->
            val registrationFragment = RegistrationFragment();
            (activity as MainActivity).replaceFragment(registrationFragment, R.id.fragment_container)

        }

        view.register_twitter_button.setOnClickListener { view ->
            val registrationFragment = RegistrationFragment();
            (activity as MainActivity).replaceFragment(registrationFragment, R.id.fragment_container)

        }

//        view.register_google_button.setOnClickListener { view ->
//            val registrationFragment = RegistrationFragment();
//            (activity as MainActivity).replaceFragment(registrationFragment, R.id.fragment_container)
//
//        }

//        view.register_google_button.setOnClickListener(View.OnClickListener {
//            signIn()
//        })
        view.register_google_button.setOnClickListener { signIn() }

        return view
    }

    override fun onStart() {
        super.onStart()
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
//            startActivity(HomeActivity.getLaunchIntent(this))
//            finish()
        }
    }

    private fun configureGoogleSignIn(context: Context) {
        mGoogleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build()
        mGoogleSignInClient = GoogleSignIn.getClient(context, mGoogleSignInOptions)
    }

    private fun signIn() {
        val signInIntent: Intent = mGoogleSignInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_SIGN_IN) {
            val task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)
                firebaseAuthWithGoogle(account)
            } catch (e: ApiException) {
//                Toast.makeText(this, "Google sign in failed:(", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun firebaseAuthWithGoogle(acct: GoogleSignInAccount) {
        val credential = GoogleAuthProvider.getCredential(acct.idToken, null)
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener {
            if (it.isSuccessful) {
                Log.d("WelcomeFragmentLog", "Success");
                val welcomeBackFragment = WelcomeBackFragment();
                (activity as MainActivity).replaceFragment(welcomeBackFragment, R.id.fragment_container)

//                startActivity(HomeActivity.getLaunchIntent(this))
            } else {
//                Toast.makeText(this, "Google sign in failed:(", Toast.LENGTH_LONG).show()
                Log.d("WelcomeFragmentLog", "UnSuccess");
            }
        }
    }


}// Required empty public constructor
