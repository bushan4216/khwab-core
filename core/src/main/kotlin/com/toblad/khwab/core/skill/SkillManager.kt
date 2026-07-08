package com.toblad.khwab.core.skill

import com.toblad.khwab.core.model.IntentData

class SkillManager(
    private val registry: SkillRegistry = SkillRegistry()
) {

    fun findSkill(intent: IntentData): Skill? {
        return registry.skills.firstOrNull { it.supports(intent) }
    }
}
