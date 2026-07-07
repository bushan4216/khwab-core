package com.toblad.khwab.core.response

import com.toblad.khwab.core.model.IntentType

class ResponseGenerator {

    fun generate(intent: IntentType, target: String): String {

        return when(intent) {

            IntentType.OPEN_APP ->
                "Opening $target..."

            IntentType.CALL_CONTACT ->
                "Calling $target..."

            IntentType.PLAY_MEDIA ->
                "Playing $target..."

            IntentType.CLOSE_APP ->
                "Closing $target..."

            else ->
                "Sorry, I don't understand that command yet."

        }

    }

}
