package com.uptodown.tv.ui.activity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.uptodown.R;
import com.uptodown.tv.ui.fragment.TvMyAppsFragment;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import m5.b;

/* loaded from: classes5.dex */
public final class TvMyAppsActivity extends b {

    /* loaded from: classes5.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvMyAppsActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3292y.h(fragments, "getFragments(...)");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                if (fragment instanceof TvMyAppsFragment) {
                    ((TvMyAppsFragment) fragment).T();
                }
            }
        }
    }

    @Override // m5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_my_apps_activity);
    }
}
