package com.toblad.khwab.core.conversation

import com.toblad.khwab.core.context.ContextEngine
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ConversationEngineTest {

    @Test
    fun resolvesContactReference() {

        val context = ContextEngine()

        context.setActiveContact("John")

        val engine = ConversationEngine(context)

        val result = engine.process(
            ConversationRequest("him")
        )

        assertTrue(result.resolved)
    }

    @Test
    fun unresolvedReferenceReturnsFalse() {

        val engine = ConversationEngine(
            ContextEngine()
        )

        val result = engine.process(
            ConversationRequest("him")
        )

        assertFalse(result.resolved)
    }
}
