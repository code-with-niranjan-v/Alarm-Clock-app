package com.example.alarmclock

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.alarmclock.databinding.FragmentAlarmBinding


class AlarmFragment : Fragment() {


    private lateinit var alarmBinding: FragmentAlarmBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        alarmBinding = FragmentAlarmBinding.inflate(layoutInflater,container,false)
        return alarmBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        alarmBinding.floatingBtn.setOnClickListener {
            findNavController().navigate(R.id.action_alarmFragment_to_alarmAddFragment)
        }
    }


}