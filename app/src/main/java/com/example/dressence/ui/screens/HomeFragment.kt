package com.example.dressence.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.dressence.R
import com.example.dressence.data.entity.CategoryItem
import com.example.dressence.data.entity.Product
import com.example.dressence.databinding.FragmentHomeBinding
import com.example.dressence.ui.adapter.CategoryItemAdapter
import com.example.dressence.ui.adapter.ProductItemAdapter


class HomeFragment : Fragment() {

    private var _binding:FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)


        binding.categoryRV.layoutManager =StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)


        binding.productRV.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}