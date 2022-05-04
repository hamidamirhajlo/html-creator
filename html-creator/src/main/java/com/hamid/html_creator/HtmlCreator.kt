package com.hamid.html_creator

import com.hamid.html_creator.tag.HTML

object HtmlCreator {

    fun create(init: HTML.() -> Unit): HTML {
        val html = HTML()
        html.init()
        return html

    }

}