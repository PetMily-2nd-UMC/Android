package com.example.petmilyandroid.ui.main.communication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.petmilyandroid.databinding.FragmentCommunicationBinding

class CommunicationFragment : Fragment() {
    lateinit var binding: FragmentCommunicationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommunicationBinding.inflate(inflater, container, false)

        return binding.root
    }
}