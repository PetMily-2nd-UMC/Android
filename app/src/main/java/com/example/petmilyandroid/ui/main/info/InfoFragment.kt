package com.example.petmilyandroid.ui.main.info

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.petmilyandroid.LogGridRVAdapter
import com.example.petmilyandroid.databinding.FragmentInfoBinding
import com.example.petmilyandroid.ui.writing.WritingActivity

class InfoFragment : Fragment() {
    lateinit var binding: FragmentInfoBinding
    private var list = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(inflater, container, false)

        binding.fabInfo.setOnClickListener {
            startActivity(Intent(activity, WritingActivity::class.java))
        }

        list.add("고양이")
        list.add("강아지")
        list.add("멈멈")
        list.add("인절미")
        list.add("백구")
        list.add("거부기")
        list.add("고양이")
        list.add("강아지")
        list.add("멈멈")
        list.add("인절미")
        list.add("백구")
        list.add("거부기")
        list.add("고양이")
        list.add("강아지")
        list.add("멈멈")
        list.add("인절미")
        list.add("백구")
        list.add("거부기")
        list.add("고양이")
        list.add("강아지")
        list.add("멈멈")
        list.add("인절미")
        list.add("백구")
        list.add("거부기")

        val infoAdapter = InfoListRVAdapter(list)
        binding.infoLogRv.adapter = infoAdapter
        binding.infoLogRv.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.VERTICAL, false)
        return binding.root
    }
}