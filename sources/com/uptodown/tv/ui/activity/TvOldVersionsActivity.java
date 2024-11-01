package com.uptodown.tv.ui.activity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import c5.r;
import com.uptodown.R;
import com.uptodown.tv.ui.fragment.TvOldVersionsFragment;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import m5.b;

/* loaded from: classes5.dex */
public final class TvOldVersionsActivity extends b {

    /* loaded from: classes5.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f31038a;

        /* renamed from: b, reason: collision with root package name */
        private final r f31039b;

        public a(int i8, r rVar) {
            this.f31038a = i8;
            this.f31039b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvOldVersionsActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3292y.h(fragments, "getFragments(...)");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                if (fragment instanceof TvOldVersionsFragment) {
                    ((TvOldVersionsFragment) fragment).G(this.f31038a);
                }
            }
        }
    }

    @Override // m5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_old_versions);
    }
}
