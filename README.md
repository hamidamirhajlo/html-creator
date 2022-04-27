[![Official JetBrains Project](https://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)


# html-creator

a android project for write HTML & CSS in kotlin code, you can show page in webView or extract code for other useage.
 
# Get started

see example of code

```kotlin
// create your own style for any part of HTML

val bodyStyle = Style.Builder()
            .custom("border: 1px")
            .color("#00ddf1")
            .margin("5px")
            .opacity("1.0")
            .build()
            
fun webApp(args: String) = Index.html {
            
            head {
                <title> +args </title>
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

            webView.loadDataWithBaseURL("", this.toString(), "text/html", "UTF-8", "")
        }
