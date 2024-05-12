package com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment

import androidx.recyclerview.widget.DiffUtil

class CourseDiffUtil : DiffUtil.ItemCallback <Course>(){
    override fun areItemsTheSame(oldItem: Course, newItem: Course): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: Course, newItem: Course): Boolean {
        return oldItem.title == newItem.title
    }

}