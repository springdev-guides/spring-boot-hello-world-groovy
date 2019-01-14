package org.springdev.guides.helloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/hello")
    String hello() {
        "Hello, World!"
    }
}
