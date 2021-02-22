package com.jamesholliday.yourmanager02.fragments

import androidx.fragment.app.Fragment

open class BaseFragment(layout: Int): Fragment(layout) {

    //Общие элементы для фрагментов запускаются здесь
    override fun onStart() {
        super.onStart()

    }
}