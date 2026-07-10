package com.toblad.khwab.core.knowledge

/**
 * Central API for knowledge operations.
 */
class KnowledgeEngine(

    private val store: KnowledgeStore = KnowledgeStore()

) {

    private val rememberSkill = RememberSkill(store)
    private val recallSkill = RecallSkill(store)
    private val forgetSkill = ForgetSkill(store)

    fun remember(
        key: String,
        value: String,
        type: KnowledgeType = KnowledgeType.USER_PREFERENCE
    ): KnowledgeRecord {

        return rememberSkill.remember(
            key = key,
            value = value,
            type = type
        )
    }

    fun recall(
        key: String
    ): KnowledgeRecord? {

        return recallSkill.recall(key)
    }

    fun forget(
        key: String
    ): Boolean {

        return forgetSkill.forget(key)
    }

    fun records(): List<KnowledgeRecord> {

        return store.all()
    }
}
