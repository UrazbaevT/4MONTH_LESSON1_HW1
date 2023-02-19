package com.example.a4monthlesson1

import android.graphics.Color

interface CounterView {
    fun showNewCount(count: Int)
    fun showToast(message: String)
    fun showColor(color: Int)
}