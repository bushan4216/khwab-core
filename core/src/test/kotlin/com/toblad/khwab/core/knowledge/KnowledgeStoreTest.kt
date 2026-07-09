package com.toblad.khwab.core.knowledge

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class KnowledgeStoreTest {

    @Test
    fun savesAndFindsRecord() {

        val store = KnowledgeStore()

        val record = KnowledgeRecord(
            key = "favorite_app",
            value = "Spotify",
            type = KnowledgeType.USER_PREFERENCE
        )

        store.save(record)

        val found = store.find("favorite_app")

        assertNotNull(found)
        assertEquals("Spotify", found.value)
    }

    @Test
    fun removesRecord() {

        val store = KnowledgeStore()

        store.save(
            KnowledgeRecord(
                key = "favorite_food",
                value = "Paneer Tikka"
            )
        )

        store.remove("favorite_food")

        assertNull(store.find("favorite_food"))
    }
}
