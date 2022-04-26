package com.example.html.element

interface Element {
    fun render(builder: StringBuilder, indent: String)
}