package com.toblad.khwab.core.api

/**
 * Platform-independent action returned by the Khwab SDK.
 */
data class KhwabAction(

    /**
     * Type of action.
     */
    val type: ActionType,

    /**
     * Primary target.
     * Example:
     * WhatsApp
     * Kajal
     * Wi-Fi
     */
    val target: String? = null,

    /**
     * Additional action parameters.
     */
    val parameters: Map<String, String> = emptyMap()
)
