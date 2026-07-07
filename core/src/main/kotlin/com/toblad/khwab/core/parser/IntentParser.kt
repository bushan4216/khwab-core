package com.toblad.khwab.core.parser

import com.toblad.khwab.core.model.IntentData
import com.toblad.khwab.core.model.IntentType

object IntentParser {

    fun parse(text: String): IntentData {

        for ((intent, words) in KeywordDictionary.keywords) {
            if (words.any { text.contains(it, ignoreCase = true) }) {
                return IntentData(
                    intent = intent,
                    originalText = text,
                    confidence = 0.9f
                )
            }
        }

        return IntentData(
            intent = IntentType.UNKNOWN,
            originalText = text,
            confidence = 0f
        )
    }
}
