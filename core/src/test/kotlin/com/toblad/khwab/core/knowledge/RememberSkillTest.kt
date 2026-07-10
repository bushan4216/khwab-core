package com.toblad.khwab.core.knowledge

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class RememberSkillTest {

    @Test
    fun remembersPreference() {

        val store = KnowledgeStore()

        val skill = RememberSkill(store)

        skill.remember(
            key = "favorite_app",
            value = "Spotify"
        )

        val record = store.find("favorite_app")

        assertNotNull(record)
        assertEquals("Spotify", record.value)
        assertEquals(KnowledgeType.USER_PREFERENCE, record.type)
    }
}
