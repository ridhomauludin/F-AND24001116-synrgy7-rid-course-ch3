package com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.synrgychapter3.databinding.ItemCourseBinding
//nyambung ke view list dengan list item
class CourseViewHolder(
    private val binding: ItemCourseBinding,
    private val courseAdapterListener: CourseAdapterListener
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(course: Course) {
        binding.textTitle.text = course.title
        binding.imagePoster.load(course.image)

        binding.root.setOnClickListener {
            courseAdapterListener.onClickCourse(course)
        }
    }
}
