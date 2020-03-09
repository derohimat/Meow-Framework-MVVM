/*
 * Copyright (C) 2020 Hamidreza Etebarian & Ali Modares.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package meow.utils

import android.content.Context
import android.content.res.Resources
import androidx.core.content.ContextCompat
import meow.controller

/**
 * The Extensions of [Resources] class.
 *
 * @author  Hamidreza Etebarian
 * @version 1.0.0
 * @since   2020-03-07
 */

fun Resources?.getStringCompat(resId: Int) = this?.getString(resId) ?: ""
fun Resources?.getDimensionToPx(resId: Int) = this?.getDimension(resId)?.toInt() ?: 0

fun Context?.getStringCompat(resId: Int) = this?.resources.getStringCompat(resId)
fun Context?.getDimensionToPx(resId: Int) = this?.resources.getDimensionToPx(resId)
fun Context?.getColorCompat(resId: Int) =
    if (this == null) 0 else controller.onColorGet(this!!, ContextCompat.getColor(this, resId))
