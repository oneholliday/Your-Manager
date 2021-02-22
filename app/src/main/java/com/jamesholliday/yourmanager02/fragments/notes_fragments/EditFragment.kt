package com.jamesholliday.yourmanager02.fragments.notes_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jamesholliday.yourmanager02.R
import com.jamesholliday.yourmanager02.activities.NotesActivity
import com.jamesholliday.yourmanager02.fragments.BaseFragment
import com.jamesholliday.yourmanager02.fragments.bottom_navigation_fragments.NotesSmFragment
import com.jamesholliday.yourmanager02.logingCH
import com.jamesholliday.yourmanager02.replaceFragment
import kotlinx.android.synthetic.main.fragment_edit.*

class EditFragment : BaseFragment(R.layout.fragment_edit) {
    override fun onResume() {
        super.onResume()

        buttonSave.setOnClickListener {
            EditFragment().logingCH(EditFragment(), "Pressed button SAVE")
            (activity as NotesActivity).replaceFragment(NotesSmFragment())
        }

    }
}