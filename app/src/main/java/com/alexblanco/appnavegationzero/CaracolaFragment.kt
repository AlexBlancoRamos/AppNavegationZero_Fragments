package com.alexblanco.appnavegationzero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alexblanco.appnavegationzero.databinding.FragmentCaracolaBinding

class CaracolaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentCaracolaBinding.inflate(inflater)

        binding.buttgoal2?.setOnClickListener{
            findNavController().navigate(R.id.action_caracolaFragment2_to_goalFragment2, null)
        }

        return binding.root
    }
}