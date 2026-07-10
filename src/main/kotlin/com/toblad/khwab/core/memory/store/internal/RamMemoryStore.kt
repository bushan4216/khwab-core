package com.toblad.khwab.core.memory.store.internal

import com.toblad.khwab.core.memory.model.Memory
import com.toblad.khwab.core.memory.model.MemoryId

class RamMemoryStore {

    private val memories = mutableMapOf<MemoryId, Memory>()

    fun save(memory: Memory) {
        memories[memory.id] = memory
    }

    fun find(id: MemoryId): Memory? {
        return memories[id]
    }

    fun remove(id: MemoryId) {
        memories.remove(id)
    }

    fun all(): List<Memory> {
        return memories.values.toList()
    }

    fun contains(id: MemoryId): Boolean {
        return memories.containsKey(id)
    }

    fun clear() {
        memories.clear()
    }
}
