package com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.synrgychapter3.databinding.GridItemTopicBinding

class TopicGridAdapter(
    private val topics: List<Any>,
    private val topicAdapterListener: TopicAdapterListener
) : RecyclerView.Adapter<TopicGridAdapter.TopicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = GridItemTopicBinding.inflate(inflater, parent, false)
        return TopicViewHolder(binding, topicAdapterListener)
    }

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        val topic = topics[position]
        holder.bind(topic)
    }

    override fun getItemCount(): Int = topics.size

    inner class TopicViewHolder(
        private val binding: GridItemTopicBinding,
        private val topicAdapterListener: TopicAdapterListener
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(topic: Any) {
            when (topic) {
                is BiologiTopic -> bindBiologiTopic(topic)
                is KimiaTopic -> bindKimiaTopic(topic)
                is FisikaTopic -> bindFisikaTopic(topic)
                is MatematikaTopic -> bindMatematikaTopic(topic)
                is GeografiTopic -> bindGeografiTopic(topic)
                is SosiologiTopic -> bindSosiologiTopic(topic)
                is EkonomiTopic -> bindEkonomiTopic(topic)
                is SejarahTopic -> bindSejarahTopic(topic)
                is BahasaIndonesiaTopic -> bindBahasaIndonesiaTopic(topic)
                is BahasaInggrisTopic -> bindBahasaInggris(topic)
            }
        }

        private fun bindBiologiTopic(topic: BiologiTopic) {
            binding.imagePoster.setImageResource(topic.image)
            binding.textTitle.text = topic.title
            binding.root.setOnClickListener { topicAdapterListener.onClickBiologiTopic(topic) }
            binding.buttonGoogle.setOnClickListener { topicAdapterListener.onClickGoogleSearch(topic.title) }
        }

        private fun bindKimiaTopic(topic: KimiaTopic) {
            binding.imagePoster.setImageResource(topic.image)
            binding.textTitle.text = topic.title
            binding.root.setOnClickListener { topicAdapterListener.onClickKimiaTopic(topic) }
            binding.buttonGoogle.setOnClickListener { topicAdapterListener.onClickGoogleSearch(topic.title) }
        }

        private fun bindFisikaTopic(topic: FisikaTopic) {
            binding.imagePoster.setImageResource(topic.image)
            binding.textTitle.text = topic.title
            binding.root.setOnClickListener { topicAdapterListener.onClickFisikaTopic(topic) }
            binding.buttonGoogle.setOnClickListener { topicAdapterListener.onClickGoogleSearch(topic.title) }
        }
        private fun bindMatematikaTopic(topic: MatematikaTopic) {
            binding.imagePoster.setImageResource(topic.image)
            binding.textTitle.text = topic.title
            binding.root.setOnClickListener { topicAdapterListener.onClickMatematikaTopic(topic) }
            binding.buttonGoogle.setOnClickListener { topicAdapterListener.onClickGoogleSearch(topic.title) }
        }
        private fun bindGeografiTopic(topic: GeografiTopic) {
            binding.imagePoster.setImageResource(topic.image)
            binding.textTitle.text = topic.title
            binding.root.setOnClickListener { topicAdapterListener.onClickGeografiTopic(topic) }
            binding.buttonGoogle.setOnClickListener { topicAdapterListener.onClickGoogleSearch(topic.title) }
        }
        private fun bindSosiologiTopic(topic: SosiologiTopic) {
            binding.imagePoster.setImageResource(topic.image)
            binding.textTitle.text = topic.title
            binding.root.setOnClickListener { topicAdapterListener.onClickSosiologiTopic(topic) }
            binding.buttonGoogle.setOnClickListener { topicAdapterListener.onClickGoogleSearch(topic.title) }
        }
        private fun bindEkonomiTopic(topic: EkonomiTopic) {
            binding.imagePoster.setImageResource(topic.image)
            binding.textTitle.text = topic.title
            binding.root.setOnClickListener { topicAdapterListener.onClickEkonomiTopic(topic) }
            binding.buttonGoogle.setOnClickListener { topicAdapterListener.onClickGoogleSearch(topic.title) }
        }
        private fun bindSejarahTopic(topic: SejarahTopic) {
            binding.imagePoster.setImageResource(topic.image)
            binding.textTitle.text = topic.title
            binding.root.setOnClickListener { topicAdapterListener.onClickSejarahTopic(topic) }
            binding.buttonGoogle.setOnClickListener { topicAdapterListener.onClickGoogleSearch(topic.title) }
        }
        private fun bindBahasaIndonesiaTopic(topic: BahasaIndonesiaTopic) {
            binding.imagePoster.setImageResource(topic.image)
            binding.textTitle.text = topic.title
            binding.root.setOnClickListener { topicAdapterListener.onClickBahasaIndonesiaTopic(topic) }
            binding.buttonGoogle.setOnClickListener { topicAdapterListener.onClickGoogleSearch(topic.title) }
        }
        private fun bindBahasaInggris(topic: BahasaInggrisTopic) {
            binding.imagePoster.setImageResource(topic.image)
            binding.textTitle.text = topic.title
            binding.root.setOnClickListener { topicAdapterListener.onClickBahasaInggrisTopic(topic) }
            binding.buttonGoogle.setOnClickListener { topicAdapterListener.onClickGoogleSearch(topic.title) }
        }
    }
}
