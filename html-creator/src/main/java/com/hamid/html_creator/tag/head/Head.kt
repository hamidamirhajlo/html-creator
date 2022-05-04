package com.hamid.html_creator.tag.head

import com.hamid.html_creator.tag.TagWithText

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