package com.example.html.tag.body

class A : BodyTag("a") {
    override var href: String
        get() = attributes["href"]!!
        set(value) {
            attributes["href"] = value
        }
}