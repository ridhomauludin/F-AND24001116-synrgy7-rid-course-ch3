package com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment

interface TopicAdapterListener {
    fun onClickBiologiTopic(topic: BiologiTopic)
    fun onClickKimiaTopic(topic: KimiaTopic)
    fun onClickFisikaTopic(topic: FisikaTopic)
    fun onClickMatematikaTopic(topic: MatematikaTopic)
    fun onClickGeografiTopic(topic: GeografiTopic)
    fun onClickSosiologiTopic(topic: SosiologiTopic)
    fun onClickEkonomiTopic(topic: EkonomiTopic)
    fun onClickSejarahTopic(topic: SejarahTopic)
    fun onClickBahasaIndonesiaTopic(topic: BahasaIndonesiaTopic)
    fun onClickBahasaInggrisTopic(topic: BahasaInggrisTopic)

    fun onClickGoogleSearch(title: String)
}
