/*
 * Copyright (C) 2026 AyakaUI
 * SPDX-License-Identifier: Apache-2.0
 */

package com.custom.settings;

import android.content.Context;

import com.android.settings.R;
import com.android.settings.core.BasePreferenceController;

public class TopLevelCustomSettingsPreferenceController extends BasePreferenceController {

    public TopLevelCustomSettingsPreferenceController(Context context,
            String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }
}
