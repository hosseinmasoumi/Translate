package com.example.translate.screens

import android.content.Intent
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

    @Deprecated("Deprecated in Java")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.bottom_navigation_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    @Deprecated("Deprecated in Java")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_1 -> {
                val intent = Intent(requireContext(), screenchat::class.java)
                startActivity(intent)
                return true
            }
            R.id.item_2 -> {
                val intent = Intent(requireContext(), screenfavourite::class.java)
                startActivity(intent)
                return true
            }
            else -> return false
        }

    }
}
