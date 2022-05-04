package com.hamid.html_creator.element

interface Element {
    fun render(builder: StringBuilder, indent: String)
}