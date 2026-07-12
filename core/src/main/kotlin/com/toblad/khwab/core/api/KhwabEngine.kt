package com.toblad.khwab.core.api

import com.toblad.khwab.core.brain.CognitiveCoordinator

/**
 * Public SDK entry point.
 *
 * Platform applications should interact with Khwab
 * exclusively through this class.
 */
class KhwabEngine(
    private val coordinator: CognitiveCoordinator = CognitiveCoordinator(),
    private val config: KhwabConfig = KhwabConfig()
) {

    /**
     * Process a request using the Khwab cognitive engine.
     */
    fun process(request: KhwabRequest): KhwabResponse {

        val result = coordinator.process(request.text)

        return KhwabResponse(
            success = true,
            responseText = "Request processed successfully.",
            confidence = 1.0f,
            needsConfirmation = false
        )
    }
}
