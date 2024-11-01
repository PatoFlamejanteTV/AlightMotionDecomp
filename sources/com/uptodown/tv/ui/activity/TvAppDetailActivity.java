package com.uptodown.tv.ui.activity;

import Q5.I;
import Q5.t;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import c5.r;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.M;

/* loaded from: classes5.dex */
public final class TvAppDetailActivity extends m5.b {

    /* loaded from: classes5.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvAppDetailActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3292y.h(fragments, "getFragments(...)");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                if (fragment instanceof TvAppDetailFragment) {
                    ((TvAppDetailFragment) fragment).a0();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f31022a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31023b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TvAppDetailActivity f31024c;

        public b(TvAppDetailActivity tvAppDetailActivity, String packagename, int i8) {
            AbstractC3292y.i(packagename, "packagename");
            this.f31024c = tvAppDetailActivity;
            this.f31022a = packagename;
            this.f31023b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = this.f31024c.getSupportFragmentManager().getFragments();
            AbstractC3292y.h(fragments, "getFragments(...)");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                if (fragment instanceof TvAppDetailFragment) {
                    ((TvAppDetailFragment) fragment).L0(this.f31023b, this.f31022a);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f31025a;

        /* renamed from: b, reason: collision with root package name */
        private final r f31026b;

        public c(int i8, r rVar) {
            this.f31025a = i8;
            this.f31026b = rVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Fragment fragment, c cVar) {
            ((TvAppDetailFragment) fragment).N0(cVar.f31025a, cVar.f31026b);
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = TvAppDetailActivity.this.getSupportFragmentManager().getFragments();
            AbstractC3292y.h(fragments, "getFragments(...)");
            if (fragments.size() > 0) {
                final Fragment fragment = fragments.get(0);
                if (fragment instanceof TvAppDetailFragment) {
                    TvAppDetailActivity.this.runOnUiThread(new Runnable() { // from class: m5.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            TvAppDetailActivity.c.b(Fragment.this, this);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31028a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31030c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, U5.d dVar) {
            super(2, dVar);
            this.f31030c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f31030c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f31028a == 0) {
                t.b(obj);
                List<Fragment> fragments = TvAppDetailActivity.this.getSupportFragmentManager().getFragments();
                AbstractC3292y.h(fragments, "getFragments(...)");
                if (fragments.size() > 0) {
                    Fragment fragment = fragments.get(0);
                    if (fragment instanceof TvAppDetailFragment) {
                        ((TvAppDetailFragment) fragment).M0(this.f31030c);
                    }
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public final Object m(String str, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c(), new d(str, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    @Override // m5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_app_detail_activity);
    }
}
