import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.BahasaIndonesiaTopic
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.BahasaInggrisTopic
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.BiologiTopic
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.CourseAdapterListener
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.EkonomiTopic
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.FisikaTopic
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.GeografiTopic
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.KimiaTopic
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.MatematikaTopic
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.SejarahTopic
import com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment.SosiologiTopic
import com.example.synrgychapter3.databinding.GridItemTopicBinding

class TopicViewHolder(
    private val binding: GridItemTopicBinding,
    private val courseAdapterListener: CourseAdapterListener,
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
            is BahasaInggrisTopic -> bindBahasaInggrisTopic(topic)
            else -> {
            }
        }
    }

    private fun bindBiologiTopic(topic: BiologiTopic) {
        binding.imagePoster.setImageResource(topic.image)
        binding.textTitle.text = topic.title
    }

    private fun bindKimiaTopic(topic: KimiaTopic) {
        binding.imagePoster.setImageResource(topic.image)
        binding.textTitle.text = topic.title
    }

    private fun bindFisikaTopic(topic: FisikaTopic) {
        binding.imagePoster.setImageResource(topic.image)
        binding.textTitle.text = topic.title
    }

    private fun bindMatematikaTopic(topic: MatematikaTopic) {
        binding.imagePoster.setImageResource(topic.image)
        binding.textTitle.text = topic.title
    }

    private fun bindGeografiTopic(topic: GeografiTopic) {
        binding.imagePoster.setImageResource(topic.image)
        binding.textTitle.text = topic.title
    }

    private fun bindSosiologiTopic(topic: SosiologiTopic) {
        binding.imagePoster.setImageResource(topic.image)
        binding.textTitle.text = topic.title
    }

    private fun bindEkonomiTopic(topic: EkonomiTopic) {
        binding.imagePoster.setImageResource(topic.image)
        binding.textTitle.text = topic.title
    }

    private fun bindSejarahTopic(topic: SejarahTopic) {
        binding.imagePoster.setImageResource(topic.image)
        binding.textTitle.text = topic.title
    }

    private fun bindBahasaInggrisTopic(topic: BahasaInggrisTopic) {
        binding.imagePoster.setImageResource(topic.image)
        binding.textTitle.text = topic.title
    }

    private fun bindBahasaIndonesiaTopic(topic: BahasaIndonesiaTopic) {
        binding.imagePoster.setImageResource(topic.image)
        binding.textTitle.text = topic.title
    }

}
