package com.geektech.banana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.geektech.banana.databinding.FragmentBBinding


class B : Fragment() {
   lateinit var binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val string = arguments?.getString("A")
        binding.bEt.hint = string
        binding.bBtn.setOnClickListener {
            findNavController().navigate(R.id.a, bundleOf(
                "B" to binding.bEt.text.toString()
            )
            )}
    }


}