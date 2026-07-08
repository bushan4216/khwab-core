package com.toblad.khwab.core.brain

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class BrainTest {

    @Test
    fun brainCanProcessCommand() {

        val brain = Brain()

        val result = brain.process("Open WhatsApp")

        assertNotNull(result)
        assertTrue(result.supported)
        assertTrue(result.response.isNotBlank())
    }
}
