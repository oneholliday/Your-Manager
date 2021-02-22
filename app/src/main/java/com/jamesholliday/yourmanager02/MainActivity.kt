package com.jamesholliday.yourmanager02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.jamesholliday.yourmanager02.activities.NotesActivity
import com.jamesholliday.yourmanager02.databinding.ActivityMainBinding
import com.jamesholliday.yourmanager02.fragments.main_fragments.FinanceFragment
import com.jamesholliday.yourmanager02.fragments.main_fragments.MainFragment
import com.jamesholliday.yourmanager02.fragments.main_fragments.TasksFragment
import com.jamesholliday.yourmanager02.objects.AppDrawer

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        logingCH(this, "Create")
        initFields()
    }

    override fun onStart() {
        super.onStart()
        initFunc()
    }

    private fun initFunc() {
        setSupportActionBar(mToolbar)
        replaceFragment(MainFragment())
        mAppDrawer.createMain()
    }


    private fun initFields() {
        mToolbar = mBinding.notesToolbar
        mAppDrawer = AppDrawer(this, mToolbar)
    }

    fun tasksOnClickMainFragment(view: View) {
        replaceFragment(TasksFragment())
    }

    fun financeOnClickMainFragment(view: View) {
        replaceFragment(FinanceFragment())
    }

    fun notesOnClickMainFragment(view: View) {
        replaceActivity(NotesActivity())
    }
}