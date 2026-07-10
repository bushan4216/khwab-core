package com.toblad.khwab.core.memory.api

import com.toblad.khwab.core.memory.model.Memory
import com.toblad.khwab.core.memory.model.MemoryId

interface MemoryService {

    fun create(memory: Memory)

    fun read(id: MemoryId): Memory?

    fun update(memory: Memory)

    fun delete(id: MemoryId)

    fun restore(id: MemoryId)

    fun list(): List<Memory>
}
