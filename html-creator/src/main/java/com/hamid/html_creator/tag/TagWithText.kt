package com.hamid.html_creator.tag

import com.hamid.html_creator.element.TextElement


abstract class TagWithText(name: String) : Tag(name) {

//    fun style():Style{
//
//    }

    var style: String
        get() = attributes[" style"]!!
        set(value) {
            attributes[" style"] = value
        }

    open var href: String
        get() = attributes[" href"]!!
        set(value) {
            attributes[" href"] = value
        }



    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}