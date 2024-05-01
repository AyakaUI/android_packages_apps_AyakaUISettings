/*
 * Copyright (C) 2026 AyakaUI
 * SPDX-License-Identifier: Apache-2.0
 */

package com.custom.settings;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;
import com.android.settings.R;
import com.android.settings.dashboard.DashboardFragment;
import com.android.settings.search.BaseSearchIndexProvider;
import com.android.settingslib.search.SearchIndexable;

@SearchIndexable
public class AyakaUISettings extends DashboardFragment {

    private static final String TAG = "AyakaUISettings";

    @Override
    protected int getPreferenceScreenResId() {
        return R.xml.custom_settings;
    }

    @Override
    public int getMetricsCategory() {
        return MetricsEvent.CUSTOM ;
    }

    @Override
    protected String getLogTag() {
        return TAG;
    }

    public static final BaseSearchIndexProvider SEARCH_INDEX_DATA_PROVIDER =
            new BaseSearchIndexProvider(R.xml.custom_settings);
}
