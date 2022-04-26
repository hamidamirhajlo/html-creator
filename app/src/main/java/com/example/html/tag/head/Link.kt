package com.example.html.tag.head

class Link:HeadTag("link") {

    override var href: String
        get() = attributes[" href"]!!
        set(value) {
            attributes[" href"] = value
        }
    var rel: String
        get() = attributes[" rel"]!!
        set(value) {
            attributes[" rel"] = value
        }
}

