package com.toblad.khwab.core.brain

import com.toblad.khwab.core.parser.IntentParser
import com.toblad.khwab.core.validator.Validator
import com.toblad.khwab.core.planner.Planner
import com.toblad.khwab.core.planner.RuleEngine
import com.toblad.khwab.core.response.ResponseGenerator
import com.toblad.khwab.core.extractor.AppNameExtractor

class Brain {

    private val validator = Validator()
    private val planner = Planner()
    private val rules = RuleEngine()
    private val responses = ResponseGenerator()

    fun process(command: String): BrainResult {

        val intent = IntentParser.parse(command)

        val valid = validator.isValid(intent)
        val supported = rules.isSupported(intent)
        val plan = planner.createPlan(intent)

        val target = AppNameExtractor.extract(command)

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
