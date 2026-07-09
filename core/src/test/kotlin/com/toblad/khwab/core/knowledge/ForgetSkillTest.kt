package com.toblad.khwab.core.knowledge

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ForgetSkillTest {

    @Test
    fun removesKnowledge() {

        val store = KnowledgeStore()

        RememberSkill(store).remember(
            key = "favorite_app",
            value = "Spotify"
        )

        val removed = ForgetSkill(store)
            .forget("favorite_app")

        assertTrue(removed)
    }

    @Test
    fun returnsFalseForUnknownKey() {

        val store = KnowledgeStore()

        val removed = ForgetSkill(store)
            .forget("unknown")

        assertFalse(removed)
    }
}
