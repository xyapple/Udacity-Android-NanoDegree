/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.yd.udacitytoyapp;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;

/**
 * ColorUtils is a class with one method, used to color the ViewHolders in
 * the RecyclerView. I put in a separate class in an attempt to keep the
 * code organized.
 *
 * We aren't going to go into detail about how this method works, but feel
 * free to explore!
 */
public class ColorUtils {

    /**
     * This method returns the appropriate shade of green to form the gradient
     * seen in the list, based off of the order in which the
     *
     * instance was created.
     *
     * This method is used to show how ViewHolders are recycled in a RecyclerView.
     * At first, the colors will form a nice, consistent gradient. As the
     * RecyclerView is scrolled, the
     * s will be
     * recycled and the list will no longer appear as a consistent gradient.
     *
     * @param context     Context for getting colors
     * @param instanceNum Order in which the calling ViewHolder was created
     *
     * @return A shade of green based off of when the calling ViewHolder
     * was created.
     */
    public static int getViewHolderBackgroundColorFromInstance(Context context, int instanceNum) {
        switch (instanceNum) {
            case 0:
                return ContextCompat.getColor(context, R.color.material_blue_grey_800);
            case 1:
                return ContextCompat.getColor(context, R.color.material_blue_grey_950);
            case 2:
                return ContextCompat.getColor(context, R.color.material_blue_grey_900);
            case 3:
                return ContextCompat.getColor(context, R.color.material_blue_grey_950);
            case 4:
                return ContextCompat.getColor(context, R.color.material_deep_teal_200);
            case 5:
                return ContextCompat.getColor(context, R.color.material_deep_teal_500);
            case 6:
                return ContextCompat.getColor(context, R.color.material_grey_100);
            case 7:
                return ContextCompat.getColor(context, R.color.material_grey_300);
            case 8:
                return ContextCompat.getColor(context, R.color.material_grey_50);
            case 9:
                return ContextCompat.getColor(context, R.color.material_grey_600);
            case 10:
                return ContextCompat.getColor(context, R.color.material_grey_900);
            case 11:
                return ContextCompat.getColor(context, R.color.material_grey_600);
            case 12:
                return ContextCompat.getColor(context, R.color.material_grey_800);
            case 13:
                return ContextCompat.getColor(context, R.color.material_grey_50);
            case 14:
                return ContextCompat.getColor(context, R.color.material_deep_teal_200);
            case 15:
                return ContextCompat.getColor(context, R.color.material_deep_teal_500);
            case 16:
                return ContextCompat.getColor(context, R.color.material_grey_800);
            case 17:
                return ContextCompat.getColor(context, R.color.material_grey_600);

            default:
                return Color.WHITE;
        }
    }
}
