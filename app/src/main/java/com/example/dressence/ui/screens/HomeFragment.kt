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
import com.example.dressence.databinding.FragmentHomeBinding
import com.example.dressence.ui.adapter.CategoryItemAdapter


class HomeFragment : Fragment() {

    private var _binding:FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)


        val categorNa = ArrayList<CategoryItem>()
        val k1 = CategoryItem(1,"All")
        val k2 = CategoryItem(2,"Tshirts")
        val k3 = CategoryItem(3,"Jeans")
        val k4 = CategoryItem(4,"Shoes")
        val k5 = CategoryItem(5,"Hoodie")

        categorNa.add(k1)
        categorNa.add(k2)
        categorNa.add(k3)
        categorNa.add(k4)
        categorNa.add(k5)

        val adapter = CategoryItemAdapter(requireContext(),categorNa)
        binding.categoryRV.adapter =adapter

        binding.categoryRV.layoutManager =StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)


        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}