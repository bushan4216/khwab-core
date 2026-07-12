package com.toblad.khwab.core.api

import com.toblad.khwab.core.brain.CognitiveCoordinator
import com.toblad.khwab.core.mapper.CognitiveResponseMapper

/**
 * Public SDK entry point.
 *
 * Platform applications should interact with the
 * Khwab cognitive engine exclusively through this class.
 */
class KhwabEngine(
    private val coordinator: CognitiveCoordinator = CognitiveCoordinator(),
    private val mapper: CognitiveResponseMapper = CognitiveResponseMapper(),
    private val config: KhwabConfig = KhwabConfig()
) {

    /**
     * Process a request using the Khwab cognitive engine.
     */
    fun process(request: KhwabRequest): KhwabResponse {

        val result = coordinator.process(request.text)

        return mapper.map(result)
    }
}
