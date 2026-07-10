package com.toblad.khwab.core.memory.audit.internal

import com.toblad.khwab.core.memory.model.MemoryAudit
import com.toblad.khwab.core.memory.model.MemoryId

class RamMemoryAudit {

    private val audits = mutableMapOf<MemoryId, MutableList<MemoryAudit>>()

    fun record(id: MemoryId, audit: MemoryAudit) {
        audits.getOrPut(id) { mutableListOf() }.add(audit)
    }

    fun history(id: MemoryId): List<MemoryAudit> {
        return audits[id]?.toList() ?: emptyList()
    }

    fun clear(id: MemoryId) {
        audits.remove(id)
    }
}
