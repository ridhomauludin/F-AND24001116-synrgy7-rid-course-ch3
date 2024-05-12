package com.example.synrgychapter3.MainActivity.activity.navigationcomponent.fragment

sealed class Topic {
    abstract val image: Int
    abstract val title: String
}

data class BiologiTopic(
    override val image: Int,
    override val title: String
) : Topic()

data class KimiaTopic(
    override val image: Int,
    override val title: String
) : Topic()

data class FisikaTopic(
    override val image: Int,
    override val title: String
) : Topic()

data class MatematikaTopic(
    override val image: Int,
    override val title: String
) : Topic()

data class GeografiTopic(
    override val image: Int,
    override val title: String
) : Topic()

data class SosiologiTopic(
    override val image: Int,
    override val title: String
) : Topic()

data class EkonomiTopic(
    override val image: Int,
    override val title: String
) : Topic()

data class SejarahTopic(
    override val image: Int,
    override val title: String
) : Topic()

data class BahasaInggrisTopic(
    override val image: Int,
    override val title: String
) : Topic()

data class BahasaIndonesiaTopic(
    override val image: Int,
    override val title: String
) : Topic()

