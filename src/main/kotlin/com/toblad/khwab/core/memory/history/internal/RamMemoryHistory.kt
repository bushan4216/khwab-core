package com.toblad.khwab.core.memory.history.internal

import com.toblad.khwab.core.memory.model.MemoryId
import com.toblad.khwab.core.memory.model.MemoryVersion

class RamMemoryHistory {

    private val history = mutableMapOf<MemoryId, MutableList<MemoryVersion>>()

    fun add(id: MemoryId, version: MemoryVersion) {
        history.getOrPut(id) { mutableListOf() }.add(version)
    }

    fun get(id: MemoryId): List<MemoryVersion> {
        return history[id]?.toList() ?: emptyList()
    }

    fun latest(id: MemoryId): MemoryVersion? {
        return history[id]?.lastOrNull()
    }

    fun clear(id: MemoryId) {
        history.remove(id)
    }
}
