package com.jamesholliday.yourmanager02.objects

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.jamesholliday.yourmanager02.MainActivity
import com.jamesholliday.yourmanager02.R
import com.jamesholliday.yourmanager02.activities.NotesActivity
import com.jamesholliday.yourmanager02.fragments.main_fragments.FinanceFragment
import com.jamesholliday.yourmanager02.fragments.main_fragments.MainFragment
import com.jamesholliday.yourmanager02.fragments.main_fragments.SettingsFragment
import com.jamesholliday.yourmanager02.fragments.main_fragments.TasksFragment
import com.jamesholliday.yourmanager02.replaceActivity
import com.jamesholliday.yourmanager02.replaceFragment
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem

class AppDrawer(val mActivity: AppCompatActivity, val toolbar: Toolbar) {
    private lateinit var mDrawer: Drawer
    private lateinit var mHeader: AccountHeader

    fun createMain(){
        createHeader()
        createDrawerMain()
    }

    fun createNotes(){
        createHeader()
        createDrawerNotes()
    }

    private fun createDrawerMain() {
        mDrawer = DrawerBuilder()
            .withActivity(mActivity)
            .withToolbar(toolbar)
            .withActionBarDrawerToggle(true)
            .withSelectedItem(-1)
            .withAccountHeader(mHeader)
            .addDrawerItems(
                PrimaryDrawerItem().withIdentifier(100)
                    .withIconTintingEnabled(true)
                    .withName("Main")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_main),
                PrimaryDrawerItem().withIdentifier(101)
                    .withIconTintingEnabled(true)
                    .withName("Tasks")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_task_image),
                PrimaryDrawerItem().withIdentifier(102)
                    .withIconTintingEnabled(true)
                    .withName("Finance")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_money_image),
                PrimaryDrawerItem().withIdentifier(103)
                    .withIconTintingEnabled(true)
                    .withName("Notes")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_note_image),
                DividerDrawerItem(),
                PrimaryDrawerItem().withIdentifier(104)
                    .withIconTintingEnabled(true)
                    .withName("Settings")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_menu_settings)
            ).withOnDrawerItemClickListener(object: Drawer.OnDrawerItemClickListener{
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    when(position){
                        1 -> mActivity.replaceFragment(MainFragment())
                        2 -> mActivity.replaceFragment(TasksFragment())
                        3 -> mActivity.replaceFragment(FinanceFragment())
                        4 -> mActivity.replaceActivity(NotesActivity())
                        6 -> mActivity.replaceFragment(SettingsFragment())
                    }
                    return false
                }
            }).build()
    }

    private fun createDrawerNotes() {
        mDrawer = DrawerBuilder()
            .withActivity(mActivity)
            .withToolbar(toolbar)
            .withActionBarDrawerToggle(true)
            .withSelectedItem(-1)
            .withAccountHeader(mHeader)
            .addDrawerItems(
                PrimaryDrawerItem().withIdentifier(100)
                    .withIconTintingEnabled(true)
                    .withName("Main")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_main),
                PrimaryDrawerItem().withIdentifier(101)
                    .withIconTintingEnabled(true)
                    .withName("Tasks")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_task_image),
                PrimaryDrawerItem().withIdentifier(102)
                    .withIconTintingEnabled(true)
                    .withName("Finance")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_money_image),
                PrimaryDrawerItem().withIdentifier(103)
                    .withIconTintingEnabled(true)
                    .withName("Notes")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_note_image),
                DividerDrawerItem(),
                PrimaryDrawerItem().withIdentifier(104)
                    .withIconTintingEnabled(true)
                    .withName("Settings")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_menu_settings)
            ).withOnDrawerItemClickListener(object: Drawer.OnDrawerItemClickListener{
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    when(position){
                        1 -> mActivity.replaceActivity(MainActivity())
                        2 -> mActivity.replaceFragment(TasksFragment())
                        3 -> mActivity.replaceFragment(FinanceFragment())
                        4 -> mActivity.replaceActivity(NotesActivity())
                        6 -> mActivity.replaceFragment(SettingsFragment())
                    }
                    return false
                }
            }).build()
    }

    private fun createHeader(){
        mHeader = AccountHeaderBuilder()
            .withActivity(mActivity)
            .withHeaderBackground(R.drawable.header)
            .addProfiles(
                ProfileDrawerItem().withName(mActivity.getString(R.string.james_holliday))
                    .withEmail("iholliday.note@gmail.com")
            ).build()
    }
}