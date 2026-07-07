package com.toblad.khwab.core.reasoning

import com.toblad.khwab.core.decision.Decision
import com.toblad.khwab.core.model.IntentData

class ReasoningEngine {

    fun evaluate(
        intent: IntentData,
        decision: Decision
    ): ReasoningResult {

        val confidence =
            if (intent.confidence > 0.7f)
                intent.confidence
            else
                0.5f

        val reason =
            when {
                intent.confidence >= 0.9f ->
                    "High confidence intent"

                intent.confidence >= 0.7f ->
                    "Intent matched known patterns"

                else ->
                    "Low confidence, fallback decision"
            }

        return ReasoningResult(
            decision = decision,
            confidence = confidence,
            reason = reason
        )
    }
}
