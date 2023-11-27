package com.alexblanco.appnavegationzero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alexblanco.appnavegationzero.databinding.FragmentHolaBinding

class HolaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentHolaBinding.inflate(inflater)

        binding.buttcaracola?.setOnClickListener{
            findNavController().navigate(R.id.action_holaFragment_to_caracolaFragment2, null)
        }

        binding.buttgoal?.setOnClickListener{
            findNavController().navigate(R.id.action_holaFragment_to_goalFragment2, null)
        }

        return binding.root
    }
}