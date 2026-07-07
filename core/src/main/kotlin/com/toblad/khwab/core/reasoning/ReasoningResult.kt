package com.toblad.khwab.core.reasoning

import com.toblad.khwab.core.decision.Decision

data class ReasoningResult(
    val decision: Decision,
    val confidence: Float,
    val reason: String
)
