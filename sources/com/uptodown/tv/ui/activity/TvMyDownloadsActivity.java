package com.uptodown.tv.ui.activity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import c5.r;
import com.uptodown.R;
import com.uptodown.tv.ui.fragment.TvMyDownloadsFragment;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import m5.b;

/* loaded from: classes5.dex */
public final class TvMyDownloadsActivity extends b {

    /* loaded from: classes5.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f31035a;

        /* renamed from: b, reason: collision with root package name */
        private final r f31036b;

        public a(int i8, r rVar) {
            this.f31035a = i8;
            this.f31036b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvMyDownloadsActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3292y.h(fragments, "getFragments(...)");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                if (fragment instanceof TvMyDownloadsFragment) {
                    ((TvMyDownloadsFragment) fragment).u(this.f31035a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_my_downloads_activity);
    }
}
