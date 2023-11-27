package com.alexblanco.appnavegationzero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.alexblanco.appnavegationzero.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentHomeBinding.inflate(inflater)

        binding.buttHome?.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_holaFragment, null)
        }

        return binding.root
    }
}