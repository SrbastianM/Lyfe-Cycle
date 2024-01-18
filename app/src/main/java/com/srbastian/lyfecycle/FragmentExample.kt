package com.srbastian.lyfecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentExample : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_new, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment", "onDetach")
    }
}