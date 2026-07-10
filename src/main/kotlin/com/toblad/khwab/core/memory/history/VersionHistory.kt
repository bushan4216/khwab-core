package com.toblad.khwab.core.memory.history

import com.toblad.khwab.core.memory.model.MemoryId
import com.toblad.khwab.core.memory.model.MemoryVersion

interface VersionHistory {

    fun add(memoryId: MemoryId, version: MemoryVersion)

    fun versions(memoryId: MemoryId): List<MemoryVersion>

    fun latest(memoryId: MemoryId): MemoryVersion?
}
