package com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.synrgychapter3.R
import com.example.synrgychapter3.databinding.FragmentSecondNavigationBinding

class SecondFragmentNavigation : Fragment(), CourseAdapterListener {

    private lateinit var binding: FragmentSecondNavigationBinding//Fragmentsecondnavigation dari nama file xml
    private val courseAdapter = CourseAdapter(this)


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentSecondNavigationBinding.inflate(layoutInflater,container,false).also{
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.adapter = courseAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(
            view.context,
            RecyclerView.VERTICAL,
            false
        )
        binding.recyclerView.itemAnimator = DefaultItemAnimator()

        courseAdapter.submitList(retrieveCourseData())

    }

        private fun retrieveCourseData():List<Course>{
            return listOf(
                Course(
                    image = R.drawable.biologi,
                    title = "Biologi",
                ),
                Course(
                    image = R.drawable.kimia,
                    title = "Kimia",
                ),
                Course(
                    image = R.drawable.fisika,
                    title = "Fisika",
                ),
                Course(
                    image = R.drawable.matematika,
                    title = "Matematika",
                ),
                Course(
                    image = R.drawable.geografi,
                    title = "Geografi",
                ),
                Course(
                    image = R.drawable.sosiologi,
                    title = "Sosiologi",
                ),
                Course(
                    image = R.drawable.ekonomi,
                    title = "Ekonomi",
                ),
                Course(
                    image = R.drawable.sejarah,
                    title = "Sejarah",
                ),
                Course(
                    image = R.drawable.bahasa,
                    title = "BahasaIndonesia",
                ),
                Course(
                    image = R.drawable.bahasa,
                    title = "BahasaInggris",
                ),
            )
        }
    private fun goToThirdFragment(data:Course){
        val actionToThirdFragment = SecondFragmentNavigationDirections.actionSecondFragmentNavigationToThirdFragmentNavigation()
        actionToThirdFragment.title = data.title
        actionToThirdFragment.image = data.image.toString()
        findNavController().navigate(actionToThirdFragment)
    }

    override fun onClickCourse(data: Course) {
        goToThirdFragment(data)
    }
    }
