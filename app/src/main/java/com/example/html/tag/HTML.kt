package com.example.html.tag

import com.example.html.tag.body.Body
import com.example.html.tag.head.Head
import com.example.html.tag.head.Link
import com.example.html.tag.head.Meta

class HTML : TagWithText("html") {

    var lang: String = "en"

    fun head(init: Head.() -> Unit) = initTag(Head(), init)

    fun body(init: Body.() -> Unit) = initTag(Body(), init)

//    fun link(init: Link.() -> Unit) = initTag(Link(), init)
//    fun meta(init: Meta.() -> Unit) = initTag(Meta(), init)


}