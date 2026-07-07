package com.toblad.khwab.core.model

data class PlanStep(
    val action: String,
    val target: String = "",
    val completed: Boolean = false
)
