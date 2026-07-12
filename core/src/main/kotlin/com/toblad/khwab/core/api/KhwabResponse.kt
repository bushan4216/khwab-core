package com.toblad.khwab.core.api

/**
 * Public response returned by the Khwab SDK.
 */
data class KhwabResponse(

    /**
     * Whether processing succeeded.
     */
    val success: Boolean,

    /**
     * Human-readable message.
     */
    val responseText: String,

    /**
     * Platform-independent actions to execute.
     */
    val actions: List<KhwabAction> = emptyList(),

    /**
     * Engine confidence.
     */
    val confidence: Float = 1.0f,

    /**
     * Whether user confirmation is required.
     */
    val needsConfirmation: Boolean = false
)
