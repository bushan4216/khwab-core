package com.toblad.khwab.core.model

data class PlanStep(

    val action: ActionType,

    val target: String = "",

    val completed: Boolean = false

)
