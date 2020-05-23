/*
 * The MIT License (MIT)
 *
 * Copyright 2020 Yaroslav Berezanskyi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.venom

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

internal class VenomPreferenceManager(context: Context) {

    private val preference: SharedPreferences =
        context.getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE)

    fun setActive(active: Boolean) {
        preference.edit().putBoolean(ACTIVE_KEY, active).apply()
    }

    fun isActive(): Boolean {
        return preference.getBoolean(ACTIVE_KEY, false)
    }

    companion object {
        private const val PREFERENCE_NAME = "venom"
        private const val ACTIVE_KEY = "active_key"
    }
}
