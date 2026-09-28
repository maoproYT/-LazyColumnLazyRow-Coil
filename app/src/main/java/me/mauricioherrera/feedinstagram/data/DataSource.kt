package me.mauricioherrera.feedinstagram.data

import me.mauricioherrera.feedinstagram.model.Story

fun getStories(): List<Story> = listOf(

    Story(
        1,
        "Tu historia",
        "",
        hasSeen = false
    ),

    Story(
        2,
        "android_dev",
        "https://picsum.photos/seed/s2/200/200"
    ),

    Story(
        3,
        "kotlin_fan",
        "https://picsum.photos/seed/s3/200/200"
    ),

    Story(
        4,
        "google_io",
        "https://picsum.photos/seed/s4/200/200",
        hasSeen = true
    ),

    Story(
        5,
        "compose_dev",
        "https://picsum.photos/seed/s5/200/200"
    ),

    Story(
        6,
        "android_pro",
        "https://picsum.photos/seed/s6/200/200",
        hasSeen = true
    ),

    Story(
        7,
        "kotlin_master",
        "https://picsum.photos/seed/s7/200/200"
    ),

    Story(
        8,
        "developer_08",
        "https://picsum.photos/seed/s8/200/200"
    ),

    Story(
        9,
        "coding_world",
        "https://picsum.photos/seed/s9/200/200"
    ),

    Story(
        10,
        "mobile_dev",
        "https://picsum.photos/seed/s10/200/200",
        hasSeen = true
    )
)