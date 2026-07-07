package com.toblad.khwab.core.decision

import com.toblad.khwab.core.model.IntentData
import com.toblad.khwab.core.model.IntentType

class DecisionEngine {

    fun decide(intent: IntentData): Decision {

        val target = intent.entities.firstOrNull()?.value ?: intent.originalText

        val action = when (intent.intent) {

            IntentType.OPEN_APP ->
                Action(ActionType.LAUNCH_APP, target)

            IntentType.CALL_CONTACT ->
                Action(ActionType.CALL_CONTACT, target)

            IntentType.PLAY_MEDIA ->
                Action(ActionType.PLAY_MEDIA, target)

            IntentType.SEARCH_WEB ->
                Action(ActionType.SEARCH_WEB, target)

            IntentType.SEND_MESSAGE ->
                Action(ActionType.SEND_MESSAGE, target)

            IntentType.CHANGE_SETTING ->
                Action(ActionType.CHANGE_SETTING, target)

            else ->
                Action(ActionType.UNKNOWN, target)
        }

        return Decision(
            intent = intent.intent,
            action = action,
            confidence = 1.0f
        )
    }
}
