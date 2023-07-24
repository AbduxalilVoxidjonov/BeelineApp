package com.example.beeline

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.beeline.databinding.FragmentHomeBeelineBinding

class Home_beeline : Fragment() {
    private  val binding by lazy { FragmentHomeBeelineBinding.inflate(layoutInflater) }

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.cardTarif.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.HomeBeelineToTarifFragment)
        }

        return binding.root
    }


}