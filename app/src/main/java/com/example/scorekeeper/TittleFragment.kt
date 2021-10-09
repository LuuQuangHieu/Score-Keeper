package com.example.scorekeeper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.scorekeeper.databinding.FragmentTittleBinding


class TittleFragment : Fragment() {
    private lateinit var binding: FragmentTittleBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tittle, container, false)

        binding = FragmentTittleBinding.inflate(inflater)

        //Set click listener
        binding.titleFragmentBtStart.setOnClickListener{nextFragment()}
        return binding.root

    }

    //Move to the next fragment passing the appropriate data along
    private fun nextFragment(){
        val team1 = binding.titleFragmentEtTeam1Name.text.toString()
        val team2 = binding.titleFragmentEtTeam2Name.text.toString()

        findNavController().navigate(TittleFragmentDirections.actionTittleFragmentToGameFragment(team1, team2))

    }
}