package com.example.html

import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.hamid.html_creator.HtmlCreator
import com.hamid.html_creator.style.StyleBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var wv: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wv = findViewById(R.id.webView)

        val bodyStyle = StyleBuilder.Builder()
            .custom("border: 1px")
            .color("#00ddf1")
            .margin("5px")
            .opacity("1.0")
            .build()

        fun webApp(args: String) = HtmlCreator.create {
            
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
                    +"** first paragraph **"
                }
                p { +"** second paragraph **" }

            }

            wv.loadDataWithBaseURL("", this.toString(), "text/html", "UTF-8", "")
        }


        findViewById<TextView>(R.id.textv).text = webApp("").toString()

    }
}
