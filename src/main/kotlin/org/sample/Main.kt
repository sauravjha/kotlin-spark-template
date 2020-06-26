package org.sample

import spark.Spark.get

fun main() {
    Main().start()
}

class Main() {
    fun start() {
        get("/hello") { _, _ ->
            """
               {
                "message", "Hello! YOU GO IT WORKING"
               }
           """.trimIndent()
        }
    }
}