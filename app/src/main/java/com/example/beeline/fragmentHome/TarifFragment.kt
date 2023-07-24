package com.example.beeline.fragmentHome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.beeline.R
import com.example.beeline.databinding.FragmentTarifBinding

class TarifFragment : Fragment() {
    private  val binding by lazy{FragmentTarifBinding.inflate(layoutInflater)}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.yanaTarif1.setOnClickListener{
            findNavController().navigate(R.id.TarifToTarifYana2)
        }
        binding.osonTarif.setOnClickListener{
            findNavController().navigate(R.id.TarifToTarifOson)
        }

        binding.hammasiZor.setOnClickListener{
            findNavController().navigate(R.id.TarifToTarifHammasiZor)
        }
        binding.status.setOnClickListener{
            findNavController().navigate(R.id.TarifToTaridStatus)
        }

        return binding.root
    }
}