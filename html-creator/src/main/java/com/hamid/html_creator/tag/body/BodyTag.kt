package com.hamid.html_creator.tag.body

import com.hamid.html_creator.tag.TagWithText


abstract class BodyTag(name: String) : TagWithText(name) {

    fun b(init: B.() -> Unit) = initTag(B(), init)
    fun p(init: P.() -> Unit) = initTag(P(), init)
    fun h1(init: H1.() -> Unit) = initTag(H1(), init)

    fun a(href: String, init: A.() -> Unit) {
        val a = initTag(A(), init)
        a.href = href
    }
}