package com.jamesholliday.yourmanager02.objects

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jamesholliday.yourmanager02.R
import com.jamesholliday.yourmanager02.fragments.bottom_navigation_fragments.DiaryFragment
import com.jamesholliday.yourmanager02.fragments.bottom_navigation_fragments.LettersFragment
import com.jamesholliday.yourmanager02.fragments.bottom_navigation_fragments.NotesSmFragment
import com.jamesholliday.yourmanager02.fragments.bottom_navigation_fragments.ThoughtsFragment
import com.jamesholliday.yourmanager02.logingCH
import com.jamesholliday.yourmanager02.replaceFragment
import com.jamesholliday.yourmanager02.showToast

open class AppBottomNavigation (private val mActivity: AppCompatActivity) {

    fun listenerNotes(bottomNavigationView: BottomNavigationView){
        mActivity.logingCH(mActivity, "Я прослушал нажатие ${bottomNavigationView.selectedItemId}")
        mActivity.replaceFragment(NotesSmFragment())
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_navigation_notes -> mActivity.replaceFragment(NotesSmFragment())
                R.id.bottom_navigation_diary -> mActivity.replaceFragment(DiaryFragment())
                R.id.bottom_navigation_thoughts -> mActivity.replaceFragment(ThoughtsFragment())
                R.id.bottom_navigation_letters -> mActivity.replaceFragment(LettersFragment())
                else -> mActivity.showToast("Error")
            }
            true
        }
    }

}