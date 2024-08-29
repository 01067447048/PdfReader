package com.jaehyeon.basic.pdfreader

import android.graphics.RectF

data class SearchResults(
    val page: Int,
    val results: List<RectF>
)
