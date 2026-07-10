package com.toblad.khwab.core.knowledge

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class RecallSkillTest {

    @Test
    fun recallsExistingKnowledge() {

        val store = KnowledgeStore()

        RememberSkill(store).remember(
            key = "favorite_app",
            value = "Spotify"
        )

        val result = RecallSkill(store)
            .recall("favorite_app")

        assertNotNull(result)
        assertEquals("Spotify", result.value)
    }

    @Test
    fun returnsNullForUnknownKey() {

        val store = KnowledgeStore()

        val result = RecallSkill(store)
            .recall("unknown_key")

        assertNull(result)
    }
}
