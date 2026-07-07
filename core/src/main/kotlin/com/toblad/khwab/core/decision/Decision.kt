package com.toblad.khwab.core.decision

import com.toblad.khwab.core.model.IntentType

data class Decision(
    val intent: IntentType,
    val action: Action,
    val confidence: Float = 1.0f
)
