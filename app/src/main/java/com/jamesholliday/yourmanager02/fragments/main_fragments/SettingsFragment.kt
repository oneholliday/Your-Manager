package com.jamesholliday.yourmanager02.fragments.main_fragments

import android.view.Menu
import android.view.MenuInflater
import com.jamesholliday.yourmanager02.R
import com.jamesholliday.yourmanager02.fragments.BaseFragment

class SettingsFragment : BaseFragment(R.layout.fragment_settings) {

    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.settings_action_menu,menu)
    }
}