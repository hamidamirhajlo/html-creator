[![](https://jitpack.io/v/hamidamirhajlo/html-creator.svg)](https://jitpack.io/#hamidamirhajlo/html-creator)



# html-creator

a android project for write HTML & CSS in kotlin code, you can show page in webView or extract code for other useage.


# How to use

Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 
 ```
 
Step 2. Add the dependency

```
	dependencies {
	        implementation 'com.github.hamidamirhajlo:html-creator:v1.0.0'
	}
```
 
# Get started

see example of code

```kotlin
// create your own style for any part of HTML

 val bodyStyle = StyleBuilder.Builder()
            .custom("border: 1px")
            .color("#00ddf1")
            .margin("5px")
            .opacity("1.0")
            .build()

        fun webApp(args: String) = HtmlCreator.create {
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
                    +"** first paragraph **"
                }
                p { +"** second paragraph **" }

            }

            wv.loadDataWithBaseURL("", this.toString(), "text/html", "UTF-8", "")
        }


        findViewById<TextView>(R.id.textv).text = webApp("").toString()

    }
