package com.toblad.khwab.core.planner

import com.toblad.khwab.core.model.IntentType
import com.toblad.khwab.core.understanding.UnderstandingResult

/**
 * Converts understanding into high-level goals.
 */
class GoalPlanner {

    fun createGoal(result: UnderstandingResult): GoalResult {

        val intent = result.compoundIntent.intents.firstOrNull()?.intent

        val goalType = when (intent) {
            IntentType.OPEN_APP -> GoalType.OPEN_APP
            IntentType.SEND_MESSAGE -> GoalType.SEND_MESSAGE
            IntentType.CALL_CONTACT -> GoalType.MAKE_CALL
            IntentType.SEARCH -> GoalType.SEARCH
            IntentType.REMEMBER -> GoalType.REMEMBER
            else -> GoalType.UNKNOWN
        }

        return GoalResult(
            goal = Goal(
                type = goalType,
                description = result.normalizedText
            )
        )
    }
}
