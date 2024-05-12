package com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.synrgychapter3.databinding.ItemCourseBinding
//untuk generate list
class CourseAdapter(
    private val courseAdapterListener: CourseAdapterListener
) : ListAdapter<Course, CourseViewHolder>(CourseDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCourseBinding.inflate(inflater, parent, false)
        return CourseViewHolder(binding, courseAdapterListener)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = getItem(position)
        holder.bind(course)
    }
}
