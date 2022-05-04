package com.hamid.html_creator.style

class StyleBuilder private constructor(
    private var custom: String?,
    private var width: String?,
    private var height: String?,
    private val color: String?,
    private val margin: String?,
    private val opacity: String?,
    private val border: String?,
    private val borderStyle: String?,
    private val borderRadius: String?,
    private var boxShadow: String?,
    private var background: String?,
    private var padding: String?,
    private val attrs: HashMap<String, String>,
) {


    override fun toString(): String {
        val styleString = StringBuilder()
        if (custom?.isNotEmpty() == true) {
            if (!custom!!.lastIndex.equals(';')) {
                custom = custom.plus("; ")
            }
            styleString.append(custom)
        }
        attrs.forEach {
            styleString.append("${it.key}: ${it.value}; ")
        }
        return styleString.toString()

    }

    data class Builder(
        private var custom: String? = null,
        private var width: String? = null,
        private var height: String? = null,
        private var color: String? = null,
        private var margin: String? = null,
        private var opacity: String? = null,
        private var border: String? = null,
        private var borderStyle: String? = null,
        private var borderRadius: String? = null,
        private var boxShadow: String? = null,
        private var background: String? = null,
        private var padding: String? = null
    ) {

        private val attrs = hashMapOf<String, String>()

        fun color(color: String) = apply {
            this.color = color
            attrs["color"] = color
        }

        fun width(width: String) = apply {
            this.width = width
            attrs["width"] = width
        }

        fun height(height: String) = apply {
            this.height = height
            attrs["height"] = height
        }

        fun margin(margin: String) = apply {
            this.margin = margin
            attrs["margin"] = margin

        }

        fun custom(custom: String) = apply {
            this.custom = custom
        }

        fun opacity(opacity: String) = apply {
            this.opacity = opacity
            attrs["opacity"] = opacity.toString()
        }

        fun border(border: String) = apply {
            this.border = border
            attrs["border"] = border

        }

        fun borderStyle(borderStyle: String) = apply {
            this.borderStyle = borderStyle
            attrs["border-style"] = borderStyle

        }

        fun borderRadius(borderRadius: String) = apply {
            this.borderRadius = borderRadius
            attrs["border-radius"] = borderRadius

        }

        fun boxShadow(boxShadow: String) = apply {
            this.boxShadow = boxShadow
            attrs["box-shadow"] = boxShadow

        }

        fun background(background: String) = apply {
            this.background = background
            attrs["background"] = background

        }

        fun padding(padding: String) = apply {
            this.padding = padding
            attrs["padding"] = padding

        }


        fun build(): String = StyleBuilder(
            custom,
            width,
            height,
            color,
            margin,
            opacity,
            border,
            borderStyle,
            borderRadius,
            boxShadow,
            background,
            padding,
            attrs
        ).toString()

    }

}