package com.toblad.khwab.core.memory.history.internal

import com.toblad.khwab.core.memory.history.VersionHistory
import com.toblad.khwab.core.memory.model.MemoryId
import com.toblad.khwab.core.memory.model.MemoryVersion

class RamVersionHistory : VersionHistory {

    private val versions = mutableMapOf<MemoryId, MutableList<MemoryVersion>>()

    override fun add(memoryId: MemoryId, version: MemoryVersion) {
        versions.getOrPut(memoryId) { mutableListOf() }.add(version)
    }

    override fun versions(memoryId: MemoryId): List<MemoryVersion> {
        return versions[memoryId]?.toList() ?: emptyList()
    }

    override fun latest(memoryId: MemoryId): MemoryVersion? {
        return versions[memoryId]?.lastOrNull()
    }
}
