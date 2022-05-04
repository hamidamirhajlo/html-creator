package com.hamid.html_creator.tag.head

class Meta : HeadTag("meta") {
    var content: String
        get() = attributes[" content"]!!
        set(value) {
            attributes[" content"] = value
        }
    var name: String
        get() = attributes[" name"]!!
        set(value) {
            attributes[" name"] = value
        }


    var charset: String
        get() = attributes[" charset"]!!
        set(value) {
            attributes[" charset"] = value
        }


    var httpEquiv: String
        get() = attributes[" http-equiv"]!!
        set(value) {
            attributes[" http-equiv"] = value
        }
}