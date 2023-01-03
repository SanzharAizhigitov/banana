package com.geektech.banana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.geektech.banana.databinding.FragmentABinding


class A : Fragment() {
    lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val string = arguments?.getString("A")
        binding.aEt.hint = string
        binding.aBtn.setOnClickListener {
            findNavController().navigate(R.id.b, bundleOf(
                "A" to binding.aEt.text.toString()
            ))}

    }

}