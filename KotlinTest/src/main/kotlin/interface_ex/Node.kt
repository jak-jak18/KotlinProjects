package interface_ex

import TestFace

class Node : TestFace {
    override fun foo(text: String) {
        println(text)
    }

    override fun bar(text: String) {
        TODO("Not yet implemented")
    }
}