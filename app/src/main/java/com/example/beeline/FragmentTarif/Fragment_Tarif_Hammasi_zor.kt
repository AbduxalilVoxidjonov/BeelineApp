package com.example.beeline.FragmentTarif

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.beeline.R
import com.example.beeline.databinding.FragmentTarifHammasiZorBinding

class Fragment_Tarif_Hammasi_zor : Fragment() {
    private  val binding by lazy{FragmentTarifHammasiZorBinding.inflate(layoutInflater)}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return binding.root
    }

}