package com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.synrgychapter3.R
import com.example.synrgychapter3.databinding.FragmentThirdNavigationBinding

class FragmentThirdNavigation : Fragment(), TopicAdapterListener {

    private lateinit var binding: FragmentThirdNavigationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdNavigationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title = arguments?.getString("title")
        val topics = retrieveTopics(title)
        val gridAdapter = TopicGridAdapter(topics, this)

        binding.gridView.apply {
            adapter = gridAdapter
            layoutManager = GridLayoutManager(requireContext(), 2)
        }
    }


    override fun onClickBiologiTopic(topic: BiologiTopic) {}
    override fun onClickKimiaTopic(topic: KimiaTopic) {}
    override fun onClickFisikaTopic(topic: FisikaTopic) {}
    override fun onClickMatematikaTopic(topic: MatematikaTopic) {}
    override fun onClickGeografiTopic(topic: GeografiTopic) {}
    override fun onClickSosiologiTopic(topic: SosiologiTopic) {}
    override fun onClickEkonomiTopic(topic: EkonomiTopic) {}
    override fun onClickSejarahTopic(topic: SejarahTopic) {}
    override fun onClickBahasaIndonesiaTopic(topic: BahasaIndonesiaTopic) {}
    override fun onClickBahasaInggrisTopic(topic: BahasaInggrisTopic) {}

    override fun onClickGoogleSearch(title: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.google.com/search?q=$title")
        requireActivity().startActivity(intent)
    }

    private fun retrieveTopics(title: String?): List<Any> {
        val topics = mutableListOf<Any>()
        return when (title) {
            "Biologi" -> listOf(
                BiologiTopic(R.drawable.biologi, "Pertumbuhan"),
                BiologiTopic(R.drawable.biologi, "Perkembang biakan"),
                BiologiTopic(R.drawable.biologi, "Evolusi"),
                BiologiTopic(R.drawable.biologi, "Peredaran Darah"),
                BiologiTopic(R.drawable.biologi, "Pernafasan")
            )
            "Kimia" -> listOf(
                KimiaTopic(R.drawable.kimia, "Asam Basa"),
                KimiaTopic(R.drawable.kimia, "Reaksi Kimia"),
                KimiaTopic(R.drawable.kimia, "Tabel Periodik")
            )
            "Fisika" -> listOf(
                FisikaTopic(R.drawable.fisika, "Massa Jenis"),
                FisikaTopic(R.drawable.fisika, "Perpindahan Benda"),
                FisikaTopic(R.drawable.fisika, "GLB"),
                FisikaTopic(R.drawable.fisika, "GLBB")
            )
            "Matematika" -> listOf(
                MatematikaTopic(R.drawable.matematika, "Aljabar"),
                MatematikaTopic(R.drawable.matematika, "bidang tiga dimensi"),
                MatematikaTopic(R.drawable.matematika, "Trigonometri"),
                MatematikaTopic(R.drawable.matematika, "kalkulus"),
            )
            "Geografi" -> listOf(
                GeografiTopic(R.drawable.geografi, "Topografi"),
                GeografiTopic(R.drawable.geografi, "Iklim"),
                GeografiTopic(R.drawable.geografi, "Astronomi"),
                GeografiTopic(R.drawable.matematika, "Atmosfer"),
            )
            "Sosiologi" -> listOf(
                SosiologiTopic(R.drawable.sosiologi, "Interaksi Sosial"),
                SosiologiTopic(R.drawable.sosiologi, "Penyimpangan Sosial"),
                SosiologiTopic(R.drawable.sosiologi, "Kelompok Masyarakat"),
                SosiologiTopic(R.drawable.sosiologi, "Objek Sosial"),
            )
            "Ekonomi" -> listOf(
                EkonomiTopic(R.drawable.ekonomi, "Ekonomi Makro"),
                EkonomiTopic(R.drawable.ekonomi, "Ekonomi Mikro"),
                EkonomiTopic(R.drawable.ekonomi, "Sistem Ekonomi"),
                EkonomiTopic(R.drawable.ekonomi, "Management Ekonomi"),
            )
            "Sejarah" -> listOf(
                SejarahTopic(R.drawable.sejarah, "Sejarah Indonesia"),
                SejarahTopic(R.drawable.sejarah, "Hindia Belanda"),
                SejarahTopic(R.drawable.sejarah, "Hindu Budha"),
                SejarahTopic(R.drawable.sejarah, "Kemerdekaan"),
            )
            "BahasaIndonesia" -> listOf(
                BahasaIndonesiaTopic(R.drawable.bahasa, "Pantun"),
                BahasaIndonesiaTopic(R.drawable.bahasa, "Puisi"),
                BahasaIndonesiaTopic(R.drawable.bahasa, "Sajak"),
                BahasaIndonesiaTopic(R.drawable.bahasa, "Kalimat"),
            )
            "BahasaInggris" -> listOf(
                BahasaInggrisTopic(R.drawable.bahasa, "Descriptive Text"),
                BahasaInggrisTopic(R.drawable.bahasa, "Recount Text"),
                BahasaInggrisTopic(R.drawable.bahasa, "Narrative Text"),
            )
            else -> emptyList()
        }
    }
}
