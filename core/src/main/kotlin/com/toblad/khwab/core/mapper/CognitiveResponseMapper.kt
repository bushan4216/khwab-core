package com.toblad.khwab.core.mapper

import com.toblad.khwab.core.api.KhwabResponse
import com.toblad.khwab.core.brain.CognitiveResult

/**
 * Converts internal cognitive results into
 * the public SDK response model.
 */
class CognitiveResponseMapper {

    fun map(result: CognitiveResult): KhwabResponse {

        return KhwabResponse(
            success = true,
            responseText = "Request processed successfully.",
            actions = emptyList(),
            confidence = 1.0f,
            needsConfirmation = false
        )
    }
}
