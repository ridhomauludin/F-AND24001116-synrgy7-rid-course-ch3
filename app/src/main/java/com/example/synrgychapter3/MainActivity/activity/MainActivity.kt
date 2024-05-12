package com.example.synrgychapter3.MainActivity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.synrgychapter3.R
import com.example.synrgychapter3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val activityMainBinding: ActivityMainBinding by lazy {ActivityMainBinding.inflate(layoutInflater)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)

        setupNavigationComponentWithAppBar()

        Log.d("Main Activity", "Lifecycle state : onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main Activity", "Lifecycle state : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main Activity", "Lifecycle state : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main Activity", "Lifecycle state : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main Activity", "Lifecycle state : onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main Activity", "Lifecycle state : onDestroy")
    }



    private fun setupNavigationComponentWithAppBar(){
        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment? ?: return
        setupActionBarWithNavController(host.navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        return host.navController.navigateUp() || super.onSupportNavigateUp()
    }
}