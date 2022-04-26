package com.example.html

import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.html.style.Style

class MainActivity : AppCompatActivity() {
    private lateinit var wv: WebView
    var title = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wv = findViewById(R.id.webView)

        val bodyStyle = Style.Builder()
            .custom("border: 1px")
            .color("#00ddf1")
            .margin("5px")
            .opacity("1.0")
            .build()

        fun webApp(args: String) = Index.html {
            lang = "fa"
            head {

                link {
                    rel = "stylesheet"
                    href = "w3c.com/css"
                }

                meta {
                    charset = "UTF-8"
                }

                meta {
                    name = "viewport"
                    content = "width=device-width, initial-scale=1.0"
                }
            }
            body {
                style = bodyStyle
                h1 { +"title of h1: $args" }
                p {
                    +"this is first paragraph."
                }
                p { +"this is first paragraph." }

            }

            wv.loadDataWithBaseURL("", this.toString(), "text/html", "UTF-8", "")
        }


        findViewById<TextView>(R.id.textv).text = webApp("").toString()

    }
}