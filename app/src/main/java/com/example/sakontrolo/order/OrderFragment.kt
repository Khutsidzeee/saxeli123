package com.example.sakontrolo.order

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sakontrolo.R


class OrderFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_order, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = OrderFragment()
    }
}