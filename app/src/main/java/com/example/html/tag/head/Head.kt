package com.example.html.tag.head

import com.example.html.tag.TagWithText

class Head : TagWithText("head"){
    fun title(init: Title.() -> Unit) = initTag(Title(), init)

    fun link(rel: String? = "stylesheet", init: Link.() -> Unit) =
        initTag(Link(), init)

    fun meta(
        name: String? = "",
        charset: String? = "",
        content: String? = "",
        httpEquiv: String? = "",
        init: Meta.() -> Unit
    ) =
        initTag(Meta(), init)
}