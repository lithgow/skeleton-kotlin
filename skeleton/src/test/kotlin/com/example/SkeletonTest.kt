package com.example

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class SkeletonTest : FreeSpec({

    "A skeleton" - {
        "should greet with the message 'Hello World!'" - {
            Skeleton().message shouldBe("Hello World!")
        }
    }
})