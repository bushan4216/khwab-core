package com.toblad.khwab.core.conversation

import com.toblad.khwab.core.context.ContextResult
import com.toblad.khwab.core.context.ContextService

/**
 * Coordinates conversation processing.
 */
class ConversationEngine(

    private val contextService: ContextService

) {

    /**
     * Process a conversation request.
     *
     * For now this simply attempts to resolve the
     * entire request as a conversational reference.
     * Brain integration comes in the next phase.
     */
    fun process(
        request: ConversationRequest
    ): ContextResult {

        return contextService.resolve(
            request.text
        )

    }
}
