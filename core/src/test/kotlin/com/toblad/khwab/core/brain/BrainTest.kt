package com.toblad.khwab.core.brain

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

import com.toblad.khwab.core.model.ActionType
import com.toblad.khwab.core.model.IntentType

class BrainTest {

    @Test
    fun brainCanProcessCommand() {

        val brain = Brain()

        val result = brain.process("Open WhatsApp")

        assertNotNull(result)

        assertEquals(
            IntentType.OPEN_APP,
            result.intent.intent
        )

        assertTrue(result.supported)

        assertEquals(
            ActionType.OPEN_APP,
            result.plan.steps.first().action
        )

        assertTrue(result.response.isNotBlank())
    }
}
