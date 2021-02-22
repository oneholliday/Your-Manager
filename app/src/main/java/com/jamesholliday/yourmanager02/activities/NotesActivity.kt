package com.jamesholliday.yourmanager02.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.jamesholliday.yourmanager02.R
import com.jamesholliday.yourmanager02.databinding.ActivityNotesBinding
import com.jamesholliday.yourmanager02.fragments.notes_fragments.EditFragment
import com.jamesholliday.yourmanager02.logingCH
import com.jamesholliday.yourmanager02.objects.AppBottomNavigation
import com.jamesholliday.yourmanager02.objects.AppDrawer
import com.jamesholliday.yourmanager02.replaceFragment
import kotlinx.android.synthetic.main.activity_notes.*

class NotesActivity : AppCompatActivity() {
    private lateinit var mNotesBinding: ActivityNotesBinding
    private lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolbar: Toolbar
    private lateinit var mBottomNavigation: AppBottomNavigation



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mNotesBinding = ActivityNotesBinding.inflate(layoutInflater)
        setContentView(mNotesBinding.root)
        logingCH(this, "Create")
        initFields()
    }

    override fun onResume() {
        super.onResume()
        initFunc()
    }

    private fun initFunc() {
        setSupportActionBar(mToolbar)
        mAppDrawer.createNotes()
        mBottomNavigation.listenerNotes(bottomNavMenu)
    }


    private fun initFields() {
        mToolbar = mNotesBinding.notesToolbar
        mAppDrawer = AppDrawer(this, mToolbar)
        mBottomNavigation = AppBottomNavigation(this)
    }

    fun addNotesOnclick(view: View) {
        logingCH(this, "Pressed button ADD")
        this.replaceFragment(EditFragment())
    }
}