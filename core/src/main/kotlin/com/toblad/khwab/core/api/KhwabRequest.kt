package com.toblad.khwab.core.api

/**
 * Public request model for all Khwab SDK clients.
 *
 * Android, Windows, Linux, Web and future platforms
 * should communicate with the engine using this model.
 */
data class KhwabRequest(

    /**
     * User input.
     */
    val text: String,

    /**
     * Source of the request.
     */
    val source: RequestSource = RequestSource.TEXT
)
