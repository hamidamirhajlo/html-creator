package com.hamid.html_creator.tag

import com.hamid.html_creator.tag.body.Body
import com.hamid.html_creator.tag.head.Head

class HTML : TagWithText("html") {

    var lang: String = "en"

    fun head(init: Head.() -> Unit) = initTag(Head(), init)

    fun body(init: Body.() -> Unit) = initTag(Body(), init)

//    fun link(init: Link.() -> Unit) = initTag(Link(), init)
//    fun meta(init: Meta.() -> Unit) = initTag(Meta(), init)


}