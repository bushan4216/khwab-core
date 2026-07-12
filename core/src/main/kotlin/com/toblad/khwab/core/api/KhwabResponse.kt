package com.toblad.khwab.core.api

/**
 * Public response returned by the Khwab SDK.
 *
 * Platform applications should depend on this model
 * instead of internal engine classes.
 */
data class KhwabResponse(

    /**
     * Whether the request was processed successfully.
     */
    val success: Boolean,

    /**
     * Human-readable response.
     */
    val responseText: String,

    /**
     * Engine confidence.
     */
    val confidence: Float = 1.0f,

    /**
     * Whether user confirmation is required.
     */
    val needsConfirmation: Boolean = false
)
