/*
 * Copyright (C) 2012 The Android Open Source Project
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

package info.fastpace.android.view;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;

/**
 * Jellybean MR1 - specific View API access.
 */
@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
public class ViewCompatJellybeanMr1 {

    public static int getLabelFor(View view) {
        return view.getLabelFor();
    }

    public static void setLabelFor(View view, int id) {
        view.setLabelFor(id);
    }
}
