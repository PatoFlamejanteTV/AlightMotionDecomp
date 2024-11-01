package com.uptodown.tv.ui.fragment;

import Q5.I;
import Q5.t;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.BackgroundManager;
import androidx.leanback.app.DetailsSupportFragment;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ClassPresenterSelector;
import androidx.leanback.widget.DetailsOverviewRow;
import androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter;
import androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnActionClickedListener;
import androidx.leanback.widget.SparseArrayObjectAdapter;
import androidx.lifecycle.LifecycleOwnerKt;
import c5.C2043h;
import c5.C2047l;
import c5.C2052q;
import c5.N;
import c5.Q;
import c5.r;
import c6.InterfaceC2072n;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MoreInfo;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import com.uptodown.tv.ui.activity.TvOldVersionsActivity;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import l5.C3328a;
import l5.C3329b;
import l5.C3330c;
import l6.n;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;

/* loaded from: classes5.dex */
public final class TvAppDetailFragment extends DetailsSupportFragment {

    /* renamed from: r, reason: collision with root package name */
    public static final a f31042r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C2043h f31043a;

    /* renamed from: d, reason: collision with root package name */
    private ArrayObjectAdapter f31046d;

    /* renamed from: e, reason: collision with root package name */
    private BackgroundManager f31047e;

    /* renamed from: f, reason: collision with root package name */
    private AlertDialog f31048f;

    /* renamed from: g, reason: collision with root package name */
    private AlertDialog f31049g;

    /* renamed from: h, reason: collision with root package name */
    private DetailsOverviewRow f31050h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f31051i;

    /* renamed from: j, reason: collision with root package name */
    private Q f31052j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f31053k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f31054l;

    /* renamed from: m, reason: collision with root package name */
    private C3329b f31055m;

    /* renamed from: p, reason: collision with root package name */
    private boolean f31058p;

    /* renamed from: q, reason: collision with root package name */
    private final ActivityResultLauncher f31059q;

    /* renamed from: b, reason: collision with root package name */
    private long f31044b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f31045c = -1;

    /* renamed from: n, reason: collision with root package name */
    private boolean f31056n = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f31057o = true;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31060a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2043h f31062c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31063a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f31064b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f31065c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, T t8, U5.d dVar) {
                super(2, dVar);
                this.f31064b = tvAppDetailFragment;
                this.f31065c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31064b, this.f31065c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31063a == 0) {
                    t.b(obj);
                    this.f31064b.m0((r) this.f31065c.f34573a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2043h c2043h, U5.d dVar) {
            super(2, dVar);
            this.f31062c = c2043h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f31062c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00fa, code lost:            if (r6.exists() == false) goto L35;     */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 470
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements b5.r {

        /* loaded from: classes5.dex */
        static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31067a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f31068b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, U5.d dVar) {
                super(2, dVar);
                this.f31068b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31068b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f31067a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailFragment tvAppDetailFragment = this.f31068b;
                    this.f31067a = 1;
                    if (tvAppDetailFragment.b0(this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        c() {
        }

        @Override // b5.r
        public void b(int i8) {
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            TvAppDetailFragment.this.f31043a = appInfo;
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(TvAppDetailFragment.this), null, null, new a(TvAppDetailFragment.this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31069a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31071a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f31072b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, U5.d dVar) {
                super(2, dVar);
                this.f31072b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31072b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31071a == 0) {
                    t.b(obj);
                    if (this.f31072b.getContext() != null) {
                        C3329b c3329b = this.f31072b.f31055m;
                        AbstractC3292y.f(c3329b);
                        Context requireContext = this.f31072b.requireContext();
                        AbstractC3292y.h(requireContext, "requireContext(...)");
                        c3329b.a(requireContext, this.f31072b.f31043a);
                    }
                    this.f31072b.J0();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        d(U5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int k(N n8, N n9) {
            return n8.b() - n9.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int p(InterfaceC2072n interfaceC2072n, Object obj, Object obj2) {
            return ((Number) interfaceC2072n.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00f9 A[Catch: Exception -> 0x0066, TryCatch #0 {Exception -> 0x0066, blocks: (B:12:0x001b, B:14:0x0023, B:16:0x003b, B:19:0x004f, B:22:0x00ea, B:24:0x00f9, B:26:0x0110, B:28:0x0116, B:32:0x0128, B:34:0x013a, B:36:0x0142, B:38:0x014d, B:40:0x0157, B:42:0x016a, B:44:0x0182, B:45:0x0172, B:48:0x0185, B:51:0x019f, B:53:0x01a5, B:55:0x01ad, B:56:0x0069, B:58:0x0080, B:60:0x0086, B:62:0x0093, B:64:0x00a5, B:66:0x00ad, B:68:0x00b3, B:71:0x00c9, B:73:0x00db, B:75:0x00de), top: B:11:0x001b }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 474
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements b5.r {
        e() {
        }

        @Override // b5.r
        public void b(int i8) {
            if (i8 == 404) {
                TvAppDetailFragment.this.f31058p = true;
            }
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            TvAppDetailFragment.this.f31043a = appInfo;
            TvAppDetailFragment.this.f0();
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31074a;

        f(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31074a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvAppDetailFragment tvAppDetailFragment = TvAppDetailFragment.this;
                this.f31074a = 1;
                if (tvAppDetailFragment.q0(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31076a;

        g(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            V5.b.e();
            if (this.f31076a == 0) {
                t.b(obj);
                try {
                    C2043h c2043h = TvAppDetailFragment.this.f31043a;
                    if (c2043h != null) {
                        str = c2043h.c0();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        BackgroundManager backgroundManager = TvAppDetailFragment.this.f31047e;
                        if (backgroundManager == null) {
                            return null;
                        }
                        s h8 = s.h();
                        C2043h c2043h2 = TvAppDetailFragment.this.f31043a;
                        AbstractC3292y.f(c2043h2);
                        backgroundManager.setBitmap(h8.l(c2043h2.c0()).g());
                        return I.f8786a;
                    }
                    Drawable drawable = ContextCompat.getDrawable(TvAppDetailFragment.this.requireContext(), R.drawable.feature_tv);
                    BackgroundManager backgroundManager2 = TvAppDetailFragment.this.f31047e;
                    if (backgroundManager2 == null) {
                        return null;
                    }
                    backgroundManager2.setDrawable(drawable);
                    return I.f8786a;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return I.f8786a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31078a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DetailsOverviewRow f31080c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31081a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f31082b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, U5.d dVar) {
                super(2, dVar);
                this.f31082b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31082b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31081a == 0) {
                    t.b(obj);
                    this.f31082b.startEntranceTransition();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(DetailsOverviewRow detailsOverviewRow, U5.d dVar) {
            super(2, dVar);
            this.f31080c = detailsOverviewRow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f31080c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = V5.b.e();
            int i8 = this.f31078a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    if (TvAppDetailFragment.this.getContext() != null) {
                        C2043h c2043h = TvAppDetailFragment.this.f31043a;
                        if (c2043h != null) {
                            str = c2043h.j0();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            DetailsOverviewRow detailsOverviewRow = this.f31080c;
                            Context context = TvAppDetailFragment.this.getContext();
                            s h8 = s.h();
                            C2043h c2043h2 = TvAppDetailFragment.this.f31043a;
                            AbstractC3292y.f(c2043h2);
                            detailsOverviewRow.setImageBitmap(context, h8.l(c2043h2.j0()).l(R.drawable.shape_bg_placeholder).g());
                        }
                    }
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C3445b0.c();
                a aVar = new a(TvAppDetailFragment.this, null);
                this.f31078a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class i implements m2.b {

        /* loaded from: classes5.dex */
        static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31084a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f31085b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, U5.d dVar) {
                super(2, dVar);
                this.f31085b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31085b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f31084a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailFragment tvAppDetailFragment = this.f31085b;
                    this.f31084a = 1;
                    if (tvAppDetailFragment.q0(this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        i() {
        }

        @Override // m2.b
        public void a(Exception e8) {
            AbstractC3292y.i(e8, "e");
        }

        @Override // m2.b
        public void b() {
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(TvAppDetailFragment.this), null, null, new a(TvAppDetailFragment.this, null), 3, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class j implements m2.b {

        /* loaded from: classes5.dex */
        static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31087a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppDetailFragment f31088b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppDetailFragment tvAppDetailFragment, U5.d dVar) {
                super(2, dVar);
                this.f31088b = tvAppDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31088b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f31087a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailFragment tvAppDetailFragment = this.f31088b;
                    DetailsOverviewRow detailsOverviewRow = tvAppDetailFragment.f31050h;
                    AbstractC3292y.f(detailsOverviewRow);
                    this.f31087a = 1;
                    if (tvAppDetailFragment.r0(detailsOverviewRow, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        j() {
        }

        @Override // m2.b
        public void a(Exception e8) {
            AbstractC3292y.i(e8, "e");
        }

        @Override // m2.b
        public void b() {
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(TvAppDetailFragment.this), null, null, new a(TvAppDetailFragment.this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31089a;

        k(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31089a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvAppDetailFragment tvAppDetailFragment = TvAppDetailFragment.this;
                C2043h c2043h = tvAppDetailFragment.f31043a;
                this.f31089a = 1;
                if (tvAppDetailFragment.M(c2043h, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public TvAppDetailFragment() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: n5.f
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                TvAppDetailFragment.j0(TvAppDetailFragment.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f31059q = registerForActivityResult;
    }

    private final void A0() {
        if (getActivity() != null && this.f31045c != 11) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.app_detail_not_compatible)));
            DetailsOverviewRow detailsOverviewRow = this.f31050h;
            AbstractC3292y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f31045c = 11;
        }
    }

    private final void B0() {
        if (getActivity() != null && this.f31045c != 0) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
            if (getActivity() != null && this.f31043a != null) {
                String packageName = requireActivity().getPackageName();
                C2043h c2043h = this.f31043a;
                AbstractC3292y.f(c2043h);
                if (!n.s(packageName, c2043h.v0(), true)) {
                    sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.open)));
                    sparseArrayObjectAdapter.set(2, new Action(2L, getString(R.string.dialogo_app_selected_uninstall)));
                    sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                }
            }
            sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
            sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
            DetailsOverviewRow detailsOverviewRow = this.f31050h;
            AbstractC3292y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f31045c = 0;
        }
    }

    private final void C0() {
        if (getActivity() != null) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.updates_button_resume)));
            if (getActivity() != null && this.f31043a != null) {
                String packageName = requireActivity().getPackageName();
                C2043h c2043h = this.f31043a;
                AbstractC3292y.f(c2043h);
                if (!n.s(packageName, c2043h.v0(), true)) {
                    sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                }
            }
            sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
            sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
            DetailsOverviewRow detailsOverviewRow = this.f31050h;
            AbstractC3292y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f31045c = 4;
        }
    }

    private final void D0() {
        y0();
        this.f31045c = 6;
    }

    private final void E0() {
        C0();
        this.f31045c = 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:9:0x0015, B:11:0x0020, B:12:0x003a, B:14:0x006c, B:15:0x0090, B:20:0x0035), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F0() {
        /*
            r8 = this;
            r0 = 5
            androidx.fragment.app.FragmentActivity r1 = r8.getActivity()     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto Lbf
            c5.h r1 = r8.f31043a     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto Lbf
            androidx.leanback.widget.SparseArrayObjectAdapter r1 = new androidx.leanback.widget.SparseArrayObjectAdapter     // Catch: java.lang.Exception -> L31
            l5.a r2 = new l5.a     // Catch: java.lang.Exception -> L31
            r2.<init>()     // Catch: java.lang.Exception -> L31
            r1.<init>(r2)     // Catch: java.lang.Exception -> L31
            c5.h r2 = r8.f31043a     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            kotlin.jvm.internal.AbstractC3292y.f(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            java.lang.String r2 = r2.P0()     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            if (r2 == 0) goto L38
            c5.h r2 = r8.f31043a     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            kotlin.jvm.internal.AbstractC3292y.f(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            java.lang.String r2 = r2.P0()     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            kotlin.jvm.internal.AbstractC3292y.f(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> L31 java.lang.NumberFormatException -> L34
            goto L3a
        L31:
            r1 = move-exception
            goto Lbc
        L34:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Exception -> L31
        L38:
            r2 = 0
        L3a:
            androidx.leanback.widget.Action r4 = new androidx.leanback.widget.Action     // Catch: java.lang.Exception -> L31
            r5 = 2132018571(0x7f14058b, float:1.9675452E38)
            java.lang.String r5 = r8.getString(r5)     // Catch: java.lang.Exception -> L31
            S4.g r6 = new S4.g     // Catch: java.lang.Exception -> L31
            r6.<init>()     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = r6.c(r2)     // Catch: java.lang.Exception -> L31
            r6 = 1
            r4.<init>(r6, r5, r2)     // Catch: java.lang.Exception -> L31
            r2 = 1
            r1.set(r2, r4)     // Catch: java.lang.Exception -> L31
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L31
            c5.h r4 = r8.f31043a     // Catch: java.lang.Exception -> L31
            kotlin.jvm.internal.AbstractC3292y.f(r4)     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = r4.v0()     // Catch: java.lang.Exception -> L31
            boolean r2 = l6.n.s(r3, r4, r2)     // Catch: java.lang.Exception -> L31
            if (r2 != 0) goto L90
            androidx.leanback.widget.Action r2 = new androidx.leanback.widget.Action     // Catch: java.lang.Exception -> L31
            r3 = 2132017458(0x7f140132, float:1.9673195E38)
            java.lang.String r3 = r8.getString(r3)     // Catch: java.lang.Exception -> L31
            r4 = 2
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L31
            r3 = 2
            r1.set(r3, r2)     // Catch: java.lang.Exception -> L31
            androidx.leanback.widget.Action r2 = new androidx.leanback.widget.Action     // Catch: java.lang.Exception -> L31
            r3 = 2132017457(0x7f140131, float:1.9673193E38)
            java.lang.String r3 = r8.getString(r3)     // Catch: java.lang.Exception -> L31
            r4 = 3
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L31
            r3 = 3
            r1.set(r3, r2)     // Catch: java.lang.Exception -> L31
        L90:
            androidx.leanback.widget.Action r2 = new androidx.leanback.widget.Action     // Catch: java.lang.Exception -> L31
            r3 = 2132018623(0x7f1405bf, float:1.9675558E38)
            java.lang.String r3 = r8.getString(r3)     // Catch: java.lang.Exception -> L31
            r4 = 4
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L31
            r3 = 4
            r1.set(r3, r2)     // Catch: java.lang.Exception -> L31
            androidx.leanback.widget.Action r2 = new androidx.leanback.widget.Action     // Catch: java.lang.Exception -> L31
            r3 = 2132017217(0x7f140041, float:1.9672706E38)
            java.lang.String r3 = r8.getString(r3)     // Catch: java.lang.Exception -> L31
            r4 = 5
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L31
            r1.set(r0, r2)     // Catch: java.lang.Exception -> L31
            androidx.leanback.widget.DetailsOverviewRow r2 = r8.f31050h     // Catch: java.lang.Exception -> L31
            kotlin.jvm.internal.AbstractC3292y.f(r2)     // Catch: java.lang.Exception -> L31
            r2.setActionsAdapter(r1)     // Catch: java.lang.Exception -> L31
            goto Lbf
        Lbc:
            r1.printStackTrace()
        Lbf:
            r8.f31045c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.F0():void");
    }

    private final void G0(final FragmentActivity fragmentActivity) {
        this.f31055m = new C3329b();
        FullWidthDetailsOverviewRowPresenter fullWidthDetailsOverviewRowPresenter = new FullWidthDetailsOverviewRowPresenter(this.f31055m, new C3330c());
        fullWidthDetailsOverviewRowPresenter.setBackgroundColor(ContextCompat.getColor(fragmentActivity, R.color.background_color));
        fullWidthDetailsOverviewRowPresenter.setInitialState(0);
        FullWidthDetailsOverviewSharedElementHelper fullWidthDetailsOverviewSharedElementHelper = new FullWidthDetailsOverviewSharedElementHelper();
        fullWidthDetailsOverviewSharedElementHelper.setSharedElementEnterTransition(fragmentActivity, "transition_name");
        fullWidthDetailsOverviewRowPresenter.setListener(fullWidthDetailsOverviewSharedElementHelper);
        fullWidthDetailsOverviewRowPresenter.setParticipatingEntranceTransition(false);
        prepareEntranceTransition();
        fullWidthDetailsOverviewRowPresenter.setOnActionClickedListener(new OnActionClickedListener() { // from class: n5.g
            @Override // androidx.leanback.widget.OnActionClickedListener
            public final void onActionClicked(Action action) {
                TvAppDetailFragment.H0(TvAppDetailFragment.this, fragmentActivity, action);
            }
        });
        fullWidthDetailsOverviewRowPresenter.setActionsBackgroundColor(ContextCompat.getColor(fragmentActivity, R.color.main_blue));
        ClassPresenterSelector classPresenterSelector = new ClassPresenterSelector();
        classPresenterSelector.addClassPresenter(DetailsOverviewRow.class, fullWidthDetailsOverviewRowPresenter);
        classPresenterSelector.addClassPresenter(ListRow.class, new ListRowPresenter());
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(classPresenterSelector);
        this.f31046d = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(TvAppDetailFragment tvAppDetailFragment, FragmentActivity fragmentActivity, Action action) {
        AbstractC3292y.i(action, "action");
        if (action.getId() == 1) {
            tvAppDetailFragment.K();
            return;
        }
        if (action.getId() == 2) {
            tvAppDetailFragment.K0();
            return;
        }
        if (action.getId() == 3) {
            if (tvAppDetailFragment.f31043a != null) {
                Intent intent = new Intent(fragmentActivity, (Class<?>) TvOldVersionsActivity.class);
                intent.putExtra("appInfo", tvAppDetailFragment.f31043a);
                tvAppDetailFragment.startActivity(intent, UptodownApp.f29249C.a(fragmentActivity));
                return;
            }
            return;
        }
        if (action.getId() == 4) {
            if (tvAppDetailFragment.f31043a != null) {
                Intent intent2 = new Intent(fragmentActivity, (Class<?>) VirusTotalReport.class);
                intent2.putExtra("appInfo", tvAppDetailFragment.f31043a);
                tvAppDetailFragment.startActivity(intent2, UptodownApp.f29249C.a(fragmentActivity));
                return;
            }
            return;
        }
        if (action.getId() == 5) {
            tvAppDetailFragment.l0();
        }
    }

    private final void I0() {
        SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
        DetailsOverviewRow detailsOverviewRow = new DetailsOverviewRow(this.f31043a);
        this.f31050h = detailsOverviewRow;
        AbstractC3292y.f(detailsOverviewRow);
        detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
        C2043h c2043h = this.f31043a;
        AbstractC3292y.f(c2043h);
        if (c2043h.c0() != null) {
            s h8 = s.h();
            C2043h c2043h2 = this.f31043a;
            AbstractC3292y.f(c2043h2);
            h8.l(c2043h2.c0()).e(new i());
        } else if (getContext() != null) {
            Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.feature_tv);
            BackgroundManager backgroundManager = this.f31047e;
            AbstractC3292y.f(backgroundManager);
            backgroundManager.setDrawable(drawable);
        }
        s h9 = s.h();
        C2043h c2043h3 = this.f31043a;
        AbstractC3292y.f(c2043h3);
        h9.l(c2043h3.j0()).e(new j());
        ArrayObjectAdapter arrayObjectAdapter = this.f31046d;
        AbstractC3292y.f(arrayObjectAdapter);
        arrayObjectAdapter.add(this.f31050h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k(null), 3, null);
    }

    private final void K() {
        switch (this.f31045c) {
            case 0:
                k0();
                return;
            case 1:
                Y();
                return;
            case 2:
                Y();
                return;
            case 3:
                L();
                return;
            case 4:
                Y();
                return;
            case 5:
                Y();
                return;
            case 6:
                Y();
                return;
            default:
                return;
        }
    }

    private final void K0() {
        C2043h c2043h = this.f31043a;
        if (c2043h != null) {
            AbstractC3292y.f(c2043h);
            if (c2043h.v0() != null) {
                Context requireContext = requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                J4.i iVar = new J4.i(requireContext);
                C2043h c2043h2 = this.f31043a;
                AbstractC3292y.f(c2043h2);
                String v02 = c2043h2.v0();
                AbstractC3292y.f(v02);
                iVar.h(v02);
            }
        }
    }

    private final void L() {
        String str;
        if (this.f31043a != null && getContext() != null) {
            DownloadApkWorker.a aVar = DownloadApkWorker.f31190k;
            C2043h c2043h = this.f31043a;
            AbstractC3292y.f(c2043h);
            aVar.a(c2043h.h());
            C3791p.a aVar2 = C3791p.f37286s;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C3791p a9 = aVar2.a(requireContext);
            a9.a();
            C2043h c2043h2 = this.f31043a;
            AbstractC3292y.f(c2043h2);
            r Z8 = a9.Z(String.valueOf(c2043h2.d0()));
            a9.z(Z8);
            if (Z8 != null) {
                str = Z8.X();
            } else {
                str = null;
            }
            if (str != null) {
                C3794s c3794s = new C3794s();
                Context requireContext2 = requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                File f8 = c3794s.f(requireContext2);
                String X8 = Z8.X();
                AbstractC3292y.f(X8);
                new File(f8, X8).delete();
            }
            a9.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M(C2043h c2043h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(c2043h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void N(r rVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(getString(R.string.descarga_completada));
        builder.setTitle(rVar.X());
        builder.setPositiveButton(R.string.option_button_install, new DialogInterface.OnClickListener() { // from class: n5.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.O(TvAppDetailFragment.this, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: n5.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.P(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        if (getActivity() != null && !requireActivity().isFinishing()) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void O(com.uptodown.tv.ui.fragment.TvAppDetailFragment r12, android.content.DialogInterface r13, int r14) {
        /*
            java.lang.String r14 = "dialogInterface"
            kotlin.jvm.internal.AbstractC3292y.i(r13, r14)
            r13.dismiss()
            q5.p$a r13 = q5.C3791p.f37286s
            android.content.Context r14 = r12.requireContext()
            java.lang.String r0 = "requireContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r14, r0)
            q5.p r13 = r13.a(r14)
            r13.a()
            c5.h r14 = r12.f31043a
            kotlin.jvm.internal.AbstractC3292y.f(r14)
            java.lang.String r14 = r14.v0()
            r1 = 1
            java.lang.String r2 = "next(...)"
            java.lang.String r3 = "iterator(...)"
            r4 = 0
            if (r14 == 0) goto L7a
            c5.h r14 = r12.f31043a
            kotlin.jvm.internal.AbstractC3292y.f(r14)
            java.lang.String r14 = r14.v0()
            kotlin.jvm.internal.AbstractC3292y.f(r14)
            c5.Q r14 = r13.s0(r14)
            if (r14 == 0) goto L42
            java.lang.String r5 = r14.l()
            goto L43
        L42:
            r5 = r4
        L43:
            if (r5 == 0) goto L7a
            q5.s r5 = new q5.s
            r5.<init>()
            android.content.Context r6 = r12.requireContext()
            kotlin.jvm.internal.AbstractC3292y.h(r6, r0)
            java.util.ArrayList r5 = r5.e(r6)
            java.util.Iterator r5 = r5.iterator()
            kotlin.jvm.internal.AbstractC3292y.h(r5, r3)
        L5c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r5.next()
            kotlin.jvm.internal.AbstractC3292y.h(r6, r2)
            java.io.File r6 = (java.io.File) r6
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = r14.l()
            boolean r7 = l6.n.s(r7, r8, r1)
            if (r7 == 0) goto L5c
            goto L7b
        L7a:
            r6 = r4
        L7b:
            if (r6 != 0) goto Lce
            c5.h r14 = r12.f31043a
            kotlin.jvm.internal.AbstractC3292y.f(r14)
            long r7 = r14.d0()
            java.lang.String r14 = java.lang.String.valueOf(r7)
            c5.r r14 = r13.Z(r14)
            if (r14 == 0) goto Lce
            q5.s r5 = new q5.s
            r5.<init>()
            android.content.Context r6 = r12.requireContext()
            kotlin.jvm.internal.AbstractC3292y.h(r6, r0)
            java.util.ArrayList r0 = r5.d(r6)
            java.lang.String r5 = r14.X()
            if (r5 == 0) goto Lcc
            java.util.Iterator r0 = r0.iterator()
            kotlin.jvm.internal.AbstractC3292y.h(r0, r3)
        Lad:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lcc
            java.lang.Object r3 = r0.next()
            kotlin.jvm.internal.AbstractC3292y.h(r3, r2)
            java.io.File r3 = (java.io.File) r3
            java.lang.String r5 = r3.getName()
            java.lang.String r6 = r14.X()
            boolean r5 = l6.n.s(r5, r6, r1)
            if (r5 == 0) goto Lad
            r7 = r3
            goto Lcf
        Lcc:
            r7 = r4
            goto Lcf
        Lce:
            r7 = r6
        Lcf:
            r13.i()
            if (r7 == 0) goto Le5
            com.uptodown.UptodownApp$a r6 = com.uptodown.UptodownApp.f29249C
            androidx.fragment.app.FragmentActivity r8 = r12.requireActivity()
            java.lang.String r12 = "requireActivity(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r8, r12)
            r10 = 4
            r11 = 0
            r9 = 0
            com.uptodown.UptodownApp.a.Z(r6, r7, r8, r9, r10, r11)
        Le5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.O(com.uptodown.tv.ui.fragment.TvAppDetailFragment, android.content.DialogInterface, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void Q(final r rVar, String str) {
        AlertDialog alertDialog = this.f31048f;
        if (alertDialog != null) {
            AbstractC3292y.f(alertDialog);
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: n5.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.R(TvAppDetailFragment.this, rVar, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: n5.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.S(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        this.f31048f = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(TvAppDetailFragment tvAppDetailFragment, r rVar, DialogInterface dialog, int i8) {
        AbstractC3292y.i(dialog, "dialog");
        tvAppDetailFragment.Z(rVar);
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(DialogInterface dialog, int i8) {
        AbstractC3292y.i(dialog, "dialog");
        dialog.dismiss();
    }

    private final boolean T() {
        AlertDialog alertDialog = this.f31049g;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        if (aVar.V(requireContext)) {
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            if (!aVar.j0(requireContext2)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                builder.setMessage(getString(R.string.tracking_disabled_warning_gdpr));
                builder.setPositiveButton(R.string.gdpr_set_up, new DialogInterface.OnClickListener() { // from class: n5.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        TvAppDetailFragment.U(TvAppDetailFragment.this, dialogInterface, i8);
                    }
                });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: n5.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        TvAppDetailFragment.V(dialogInterface, i8);
                    }
                });
                builder.setCancelable(true);
                this.f31049g = builder.create();
                if (!requireActivity().isFinishing()) {
                    AlertDialog alertDialog2 = this.f31049g;
                    if (alertDialog2 != null) {
                        alertDialog2.show();
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(TvAppDetailFragment tvAppDetailFragment, DialogInterface dialogInterface, int i8) {
        dialogInterface.dismiss();
        tvAppDetailFragment.startActivity(new Intent(tvAppDetailFragment.requireActivity(), (Class<?>) TvPrivacyPreferences.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void W(String str) {
        AlertDialog alertDialog = this.f31048f;
        if (alertDialog != null) {
            AbstractC3292y.f(alertDialog);
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: n5.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvAppDetailFragment.X(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        this.f31048f = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(DialogInterface dialog, int i8) {
        AbstractC3292y.i(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Y() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvAppDetailFragment.Y():void");
    }

    private final void Z(r rVar) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C2043h c2043h = this.f31043a;
            AbstractC3292y.f(c2043h);
            rVar.a(c2043h);
            int l02 = rVar.l0(activity);
            if (l02 >= 0) {
                if (!DownloadApkWorker.f31190k.f(activity, l02)) {
                    Y y8 = Y.f34578a;
                    String string = getString(R.string.msg_added_to_downlads_queue);
                    AbstractC3292y.h(string, "getString(...)");
                    C2043h c2043h2 = this.f31043a;
                    AbstractC3292y.f(c2043h2);
                    String format = String.format(string, Arrays.copyOf(new Object[]{c2043h2.q0()}, 1));
                    AbstractC3292y.h(format, "format(...)");
                    W(format);
                    return;
                }
                return;
            }
            String string2 = getString(R.string.descarga_error);
            AbstractC3292y.h(string2, "getString(...)");
            W(string2);
            v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b0(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new d(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void c0() {
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        new X4.i(requireContext, this.f31044b, new e(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    private final boolean e0() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            return isExternalStorageManager;
        }
        return d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        if (this.f31043a != null && getActivity() != null && !h0() && !T()) {
            n0();
        }
    }

    private final boolean g0() {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.p() != null) {
            C2047l p8 = aVar.p();
            AbstractC3292y.f(p8);
            String d8 = p8.d();
            C2043h c2043h = this.f31043a;
            AbstractC3292y.f(c2043h);
            if (n.s(d8, c2043h.v0(), true)) {
                return true;
            }
        }
        return false;
    }

    private final boolean h0() {
        DownloadApkWorker.a aVar = DownloadApkWorker.f31190k;
        C2043h c2043h = this.f31043a;
        AbstractC3292y.f(c2043h);
        return aVar.c(c2043h.h());
    }

    private final void i0(String str) {
        C3795t c3795t = new C3795t(requireActivity());
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        if (g0()) {
            bundle.putInt("deeplink", 1);
        } else {
            bundle.putInt("deeplink", 0);
        }
        c3795t.e("warning", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(TvAppDetailFragment tvAppDetailFragment, ActivityResult activityResult) {
        if (tvAppDetailFragment.e0()) {
            tvAppDetailFragment.c0();
        }
    }

    private final void k0() {
        C2043h c2043h = this.f31043a;
        if (c2043h != null) {
            AbstractC3292y.f(c2043h);
            if (c2043h.v0() != null && getContext() != null) {
                PackageManager packageManager = requireContext().getPackageManager();
                C2043h c2043h2 = this.f31043a;
                AbstractC3292y.f(c2043h2);
                String v02 = c2043h2.v0();
                AbstractC3292y.f(v02);
                Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(v02);
                if (leanbackLaunchIntentForPackage == null) {
                    PackageManager packageManager2 = requireContext().getPackageManager();
                    C2043h c2043h3 = this.f31043a;
                    AbstractC3292y.f(c2043h3);
                    String v03 = c2043h3.v0();
                    AbstractC3292y.f(v03);
                    leanbackLaunchIntentForPackage = packageManager2.getLaunchIntentForPackage(v03);
                }
                if (leanbackLaunchIntentForPackage != null) {
                    startActivity(leanbackLaunchIntentForPackage);
                }
            }
        }
    }

    private final void l0() {
        Bundle bundle;
        if (this.f31043a != null) {
            Intent intent = new Intent(getContext(), (Class<?>) MoreInfo.class);
            intent.putExtra("appInfo", this.f31043a);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                bundle = UptodownApp.f29249C.a(activity);
            } else {
                bundle = null;
            }
            startActivity(intent, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(r rVar) {
        String str;
        if (getContext() != null && this.f31043a != null) {
            if (this.f31051i) {
                if (this.f31052j == null) {
                    B0();
                    return;
                }
                if (rVar == null) {
                    if (!this.f31053k) {
                        F0();
                        return;
                    } else {
                        D0();
                        return;
                    }
                }
                if (!this.f31053k) {
                    F0();
                    return;
                }
                if (!this.f31054l) {
                    if (h0()) {
                        w0(rVar);
                        return;
                    } else {
                        E0();
                        return;
                    }
                }
                D0();
                return;
            }
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            if (!aVar.R(requireContext)) {
                s0();
                return;
            }
            if (this.f31058p) {
                x0();
                return;
            }
            C2043h c2043h = this.f31043a;
            AbstractC3292y.f(c2043h);
            if (c2043h.i1()) {
                t0();
                return;
            }
            C2043h c2043h2 = this.f31043a;
            AbstractC3292y.f(c2043h2);
            if (!c2043h2.d1()) {
                A0();
                return;
            }
            C2043h c2043h3 = this.f31043a;
            AbstractC3292y.f(c2043h3);
            if (c2043h3.f1()) {
                u0();
                return;
            }
            C2043h c2043h4 = this.f31043a;
            AbstractC3292y.f(c2043h4);
            if (c2043h4.v0() != null) {
                P4.a h8 = J4.j.f4395g.h();
                if (h8 != null) {
                    str = h8.b();
                } else {
                    str = null;
                }
                C2043h c2043h5 = this.f31043a;
                AbstractC3292y.f(c2043h5);
                if (n.s(str, c2043h5.v0(), true)) {
                    z0();
                    return;
                }
                if (this.f31052j != null) {
                    C3791p.a aVar2 = C3791p.f37286s;
                    Context requireContext2 = requireContext();
                    AbstractC3292y.h(requireContext2, "requireContext(...)");
                    C3791p a9 = aVar2.a(requireContext2);
                    a9.a();
                    Q q8 = this.f31052j;
                    AbstractC3292y.f(q8);
                    a9.M(q8.s());
                    a9.i();
                }
                if (rVar == null) {
                    v0();
                    return;
                }
                if (!this.f31053k) {
                    w0(rVar);
                    return;
                }
                if (!this.f31054l) {
                    if (h0()) {
                        w0(rVar);
                        return;
                    } else {
                        C0();
                        return;
                    }
                }
                y0();
            }
        }
    }

    private final void n0() {
        boolean z8;
        boolean z9;
        boolean z10;
        r rVar = new r();
        C2043h c2043h = this.f31043a;
        AbstractC3292y.f(c2043h);
        rVar.k0(c2043h);
        C2052q c2052q = new C2052q();
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c2052q.i(requireContext);
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        Context requireContext2 = requireContext();
        AbstractC3292y.h(requireContext2, "requireContext(...)");
        if (aVar.k1(requireContext2)) {
            z8 = c2052q.g(rVar);
            z10 = c2052q.e(rVar);
            z9 = c2052q.f(rVar);
        } else {
            z8 = true;
            z9 = true;
            z10 = true;
        }
        if (z8 && z10 && z9) {
            Z(rVar);
            return;
        }
        if (!z8) {
            i0("sdk");
            String string = getString(R.string.msg_warning_incompatible_sdk);
            AbstractC3292y.h(string, "getString(...)");
            Q(rVar, string);
            return;
        }
        if (!z10) {
            i0("abi");
            String string2 = getString(R.string.msg_warning_incompatible_abi);
            AbstractC3292y.h(string2, "getString(...)");
            Q(rVar, string2);
            return;
        }
        i0("density");
        String string3 = getString(R.string.msg_warning_incompatible_density);
        AbstractC3292y.h(string3, "getString(...)");
        Q(rVar, string3);
    }

    private final void o0() {
        if (!d0()) {
            ActivityCompat.requestPermissions(requireActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
        } else {
            c0();
        }
    }

    private final void p0() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                try {
                    this.f31059q.launch(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + requireContext().getPackageName())));
                    return;
                } catch (ActivityNotFoundException unused) {
                    o0();
                    return;
                }
            }
            o0();
            return;
        }
        o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q0(U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new g(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r0(DetailsOverviewRow detailsOverviewRow, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new h(detailsOverviewRow, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void s0() {
        if (getActivity() != null && this.f31045c != 9) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.status_checking_device_compatibility)));
            DetailsOverviewRow detailsOverviewRow = this.f31050h;
            AbstractC3292y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f31045c = 9;
        }
    }

    private final void t0() {
        if (getActivity() != null && this.f31045c != 8) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.coming_soon_button)));
            DetailsOverviewRow detailsOverviewRow = this.f31050h;
            AbstractC3292y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f31045c = 8;
        }
    }

    private final void u0() {
        if (getActivity() != null && this.f31045c != 13) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.status_discontinued)));
            DetailsOverviewRow detailsOverviewRow = this.f31050h;
            AbstractC3292y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f31045c = 13;
        }
    }

    private final void v0() {
        SparseArrayObjectAdapter sparseArrayObjectAdapter;
        long j8;
        C2043h c2043h;
        if (getActivity() != null) {
            if (this.f31045c != 1) {
                try {
                    sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
                    try {
                        c2043h = this.f31043a;
                    } catch (NumberFormatException e8) {
                        e8.printStackTrace();
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                if (c2043h != null) {
                    AbstractC3292y.f(c2043h);
                    if (c2043h.P0() != null) {
                        C2043h c2043h2 = this.f31043a;
                        AbstractC3292y.f(c2043h2);
                        String P02 = c2043h2.P0();
                        AbstractC3292y.f(P02);
                        j8 = Long.parseLong(P02);
                        sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(R.string.updates_button_download_app), new S4.g().c(j8)));
                        sparseArrayObjectAdapter.set(3, new Action(3L, requireActivity().getString(R.string.dialogo_app_old_versions)));
                        sparseArrayObjectAdapter.set(4, new Action(4L, requireActivity().getString(R.string.virustotal_safety_report_title)));
                        sparseArrayObjectAdapter.set(5, new Action(5L, requireActivity().getString(R.string.app_detail_more_info_title)));
                        DetailsOverviewRow detailsOverviewRow = this.f31050h;
                        AbstractC3292y.f(detailsOverviewRow);
                        detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                        this.f31045c = 1;
                    }
                }
                j8 = 0;
                sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(R.string.updates_button_download_app), new S4.g().c(j8)));
                sparseArrayObjectAdapter.set(3, new Action(3L, requireActivity().getString(R.string.dialogo_app_old_versions)));
                sparseArrayObjectAdapter.set(4, new Action(4L, requireActivity().getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, requireActivity().getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow2 = this.f31050h;
                AbstractC3292y.f(detailsOverviewRow2);
                detailsOverviewRow2.setActionsAdapter(sparseArrayObjectAdapter);
                this.f31045c = 1;
            }
            C3329b c3329b = this.f31055m;
            AbstractC3292y.f(c3329b);
            c3329b.b(0);
        }
    }

    private final void w0(r rVar) {
        if (getActivity() != null) {
            if (this.f31045c != 3) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
                sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(android.R.string.cancel)));
                if (this.f31043a != null) {
                    String packageName = requireActivity().getPackageName();
                    C2043h c2043h = this.f31043a;
                    AbstractC3292y.f(c2043h);
                    if (!n.s(packageName, c2043h.v0(), true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f31050h;
                AbstractC3292y.f(detailsOverviewRow);
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f31045c = 3;
            }
            C3329b c3329b = this.f31055m;
            AbstractC3292y.f(c3329b);
            c3329b.b(rVar.Z());
        }
    }

    private final void x0() {
        if (getActivity() != null && this.f31045c != 10) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
            sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.app_detail_not_available)));
            DetailsOverviewRow detailsOverviewRow = this.f31050h;
            AbstractC3292y.f(detailsOverviewRow);
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.f31045c = 10;
        }
    }

    private final void y0() {
        if (getActivity() != null) {
            if (this.f31045c != 2) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.option_button_install)));
                if (getActivity() != null && this.f31043a != null) {
                    String packageName = requireActivity().getPackageName();
                    C2043h c2043h = this.f31043a;
                    AbstractC3292y.f(c2043h);
                    if (!n.s(packageName, c2043h.v0(), true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f31050h;
                AbstractC3292y.f(detailsOverviewRow);
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f31045c = 2;
            }
            C3329b c3329b = this.f31055m;
            AbstractC3292y.f(c3329b);
            c3329b.b(0);
        }
    }

    private final void z0() {
        if (getActivity() != null) {
            if (this.f31045c != 7) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new C3328a());
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(R.string.installing)));
                if (getActivity() != null && this.f31043a != null) {
                    String packageName = requireActivity().getPackageName();
                    C2043h c2043h = this.f31043a;
                    AbstractC3292y.f(c2043h);
                    if (!n.s(packageName, c2043h.v0(), true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.f31050h;
                AbstractC3292y.f(detailsOverviewRow);
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.f31045c = 7;
            }
            C3329b c3329b = this.f31055m;
            AbstractC3292y.f(c3329b);
            c3329b.c(true);
        }
    }

    public final void L0(int i8, String str) {
        C2043h c2043h = this.f31043a;
        if (c2043h != null) {
            AbstractC3292y.f(c2043h);
            if (c2043h.v0() != null) {
                C2043h c2043h2 = this.f31043a;
                AbstractC3292y.f(c2043h2);
                if (n.s(c2043h2.v0(), str, true)) {
                    if (i8 != 301 && i8 != 351) {
                        B0();
                        this.f31045c = 0;
                    } else {
                        z0();
                    }
                }
            }
        }
    }

    public final void M0(String str) {
        C2043h c2043h = this.f31043a;
        if (c2043h != null && str != null) {
            AbstractC3292y.f(c2043h);
            if (n.s(str, c2043h.v0(), true)) {
                J0();
            }
        }
    }

    public final void N0(int i8, r rVar) {
        if (this.f31043a != null && rVar != null && rVar.Y() != null) {
            String Y8 = rVar.Y();
            C2043h c2043h = this.f31043a;
            AbstractC3292y.f(c2043h);
            if (n.s(Y8, c2043h.v0(), true)) {
                if (i8 != 200) {
                    if (i8 != 201) {
                        if (i8 == 202) {
                            N(rVar);
                        }
                        J0();
                        return;
                    }
                    w0(rVar);
                    return;
                }
                w0(rVar);
            }
        }
    }

    public final void a0() {
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        new X4.i(requireContext, this.f31044b, new c(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final boolean d0() {
        if (Build.VERSION.SDK_INT < 33 && ContextCompat.checkSelfPermission(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        BackgroundManager backgroundManager;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C3795t c3795t = new C3795t(activity);
            String simpleName = TvAppDetailFragment.class.getSimpleName();
            AbstractC3292y.h(simpleName, "getSimpleName(...)");
            c3795t.g(simpleName);
            Bundle extras = activity.getIntent().getExtras();
            if (extras != null) {
                if (extras.containsKey("appId")) {
                    this.f31044b = extras.getLong("appId");
                }
                if (extras.containsKey("appInfo")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = extras.getParcelable("appInfo", C2043h.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        parcelable = extras.getParcelable("appInfo");
                    }
                    C2043h c2043h = (C2043h) parcelable;
                    this.f31043a = c2043h;
                    if (c2043h != null) {
                        AbstractC3292y.f(c2043h);
                        this.f31044b = c2043h.h();
                    }
                }
            }
            BackgroundManager backgroundManager2 = BackgroundManager.getInstance(activity);
            this.f31047e = backgroundManager2;
            if (backgroundManager2 != null && !backgroundManager2.isAttached() && (backgroundManager = this.f31047e) != null) {
                backgroundManager.attach(activity.getWindow());
            }
            Drawable drawable = ContextCompat.getDrawable(activity, R.drawable.tv_default_background);
            BackgroundManager backgroundManager3 = this.f31047e;
            if (backgroundManager3 != null) {
                backgroundManager3.setDrawable(drawable);
            }
            G0(activity);
            I0();
            a0();
            T();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i8, String[] permissions, int[] grantResults) {
        boolean z8;
        AbstractC3292y.i(permissions, "permissions");
        AbstractC3292y.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i8, permissions, grantResults);
        if (i8 == 831) {
            if (grantResults.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((!z8) && grantResults[0] == 0) {
                c0();
            }
        }
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f31057o) {
            J0();
        } else {
            this.f31057o = false;
        }
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!this.f31056n) {
            AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new f(null), 3, null);
        }
        this.f31056n = false;
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        BackgroundManager backgroundManager = this.f31047e;
        AbstractC3292y.f(backgroundManager);
        backgroundManager.release();
        super.onStop();
    }
}
