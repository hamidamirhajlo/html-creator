package com.example.html

import com.example.html.tag.HTML

object Index {

    fun html(init: HTML.() -> Unit): HTML {
        val html = HTML()
        html.init()
        return html

    }

}