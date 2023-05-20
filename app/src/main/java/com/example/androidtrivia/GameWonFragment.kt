package com.example.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.androidtrivia.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameWonBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_game_won, container, false)
        binding.nextMatchBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(GameWonFragmentDirections.actionGameWonFragmentToGameFragment3())
        }
        val args = GameWonFragmentArgs.fromBundle(requireArguments())
        Toast.makeText(context,"NumCorrect: ${args.numCorrect}, NumQuestion: ${args.numQuestions}",Toast.LENGTH_LONG).show()
        return binding.root
    }
}