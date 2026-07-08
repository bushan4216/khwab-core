package com.toblad.khwab.core.brain

import com.toblad.khwab.core.conversation.ContextResolver
import com.toblad.khwab.core.conversation.ContextType
import com.toblad.khwab.core.conversation.ConversationContext
import com.toblad.khwab.core.conversation.ConversationMemory
import com.toblad.khwab.core.extractor.AppNameExtractor
import com.toblad.khwab.core.parser.IntentParser
import com.toblad.khwab.core.planner.Planner
import com.toblad.khwab.core.planner.RuleEngine
import com.toblad.khwab.core.response.ResponseGenerator
import com.toblad.khwab.core.validator.Validator

class Brain {

    private val validator = Validator()
    private val planner = Planner()
    private val rules = RuleEngine()
    private val responses = ResponseGenerator()
    private val memory = ConversationMemory()
    private val contextResolver = ContextResolver(memory)

    fun process(command: String): BrainResult {

        val resolvedCommand = contextResolver.resolve(command)

        val intent = IntentParser.parse(resolvedCommand)

        val valid = validator.isValid(intent)
        val supported = rules.isSupported(intent)
        val plan = planner.createPlan(intent)

        val target = AppNameExtractor.extract(resolvedCommand)

        if (valid && supported && target.isNotBlank()) {
            memory.remember(
                ConversationContext(
                    type = ContextType.APP,
                    value = target
                )
            )
        }

        val response =
            if (valid && supported)
                responses.generate(intent.intent, target)
            else
                "Sorry, I couldn't understand that command."

        return BrainResult(
            intent = intent,
            plan = plan,
            supported = supported,
            response = response
        )
    }
}
