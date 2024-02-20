package com.example.wordskillsbank.presentation.fragments_main_activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.wordskillsbank.R
import com.example.wordskillsbank.adapters.Valute
import com.example.wordskillsbank.databinding.FragmentMainAppBinding


class MainAppFragment : Fragment() {

    private lateinit var viewBinding:FragmentMainAppBinding
    private lateinit var valute:ArrayList<Valute>
    private lateinit var listView:ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentMainAppBinding.inflate(layoutInflater)

        // TODO:  Инициализируем данные - запрос на сервер
        valute = ArrayList<Valute>()
        valute.add(Valute("asd", "asfalirbfa", "34", "45"))
        valute.add(Valute("vasv", "qv;q''vq;;bev", "34", "45"))
        valute.add(Valute("ev", "asfaqevqelirbfa", "34", "45"))
        valute.add(Valute("g r", "wvqevasv", "231", "45"))
        valute.add(Valute("qee", "qenubo; uq", "121", "123"))
        //----------

        listView = viewBinding.listContainer


/*      var valuteAdapter = ArrayAdapter<Valute>

        listView.adapter = adapter*/

        return inflater.inflate(R.layout.fragment_main_app, container, false)
    }

}