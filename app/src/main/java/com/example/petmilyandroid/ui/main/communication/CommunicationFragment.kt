package com.example.petmilyandroid.ui.main.communication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flo.LogGridRVAdapter
import com.example.petmilyandroid.databinding.FragmentCommunicationBinding

class CommunicationFragment : Fragment() {
    lateinit var binding: FragmentCommunicationBinding
    private var list = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommunicationBinding.inflate(inflater, container, false)


        list.add("고양이")
        list.add("강아지")
        list.add("멈멈")
        list.add("인절미")
        list.add("백구")
        list.add("거부기")
        val logGridRVAdapter = LogGridRVAdapter(list)
        binding.communicationLogRv.adapter = logGridRVAdapter
        binding.communicationLogRv.layoutManager = GridLayoutManager(context, 2)

        return binding.root
    }
}