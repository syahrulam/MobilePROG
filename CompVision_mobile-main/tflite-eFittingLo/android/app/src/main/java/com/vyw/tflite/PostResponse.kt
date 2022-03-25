package com.vyw.tflite

import android.icu.text.CaseMap
import com.google.gson.annotations.SerializedName

data class PostResponse(
    val id: Int,
    val title: String?,
    @SerializedName("body")
    val text: String?
)