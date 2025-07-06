package com.example.translate.screens

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.translate.R

class Mainpage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_mainpage, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.bottom_navigation_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_1 -> {
                // عکس‌برداری
                return true
            }
            R.id.item_2 -> {
                // تاریخچه
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
