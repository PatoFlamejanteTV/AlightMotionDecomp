package com.uptodown.tv.ui.fragment;

import J4.i;
import Q5.I;
import Q5.t;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import b5.w;
import c5.C2033C;
import c5.C2041f;
import c5.C2043h;
import c5.r;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.tv.ui.fragment.TvOldVersionsFragment;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import l5.o;
import l6.n;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import q5.C3776a;
import q5.C3784i;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;

/* loaded from: classes5.dex */
public final class TvOldVersionsFragment extends VerticalGridSupportFragment {

    /* renamed from: f, reason: collision with root package name */
    public static final a f31135f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C2043h f31136a;

    /* renamed from: b, reason: collision with root package name */
    private C2041f f31137b;

    /* renamed from: c, reason: collision with root package name */
    private AlertDialog f31138c;

    /* renamed from: d, reason: collision with root package name */
    private b f31139d;

    /* renamed from: e, reason: collision with root package name */
    private String f31140e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends ArrayObjectAdapter {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o presenter) {
            super(presenter);
            AbstractC3292y.i(presenter, "presenter");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class c implements OnItemViewClickedListener {
        public c() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            if (obj instanceof C2033C) {
                if (TvOldVersionsFragment.this.f31137b != null) {
                    long l8 = ((C2033C) obj).l();
                    C2041f c2041f = TvOldVersionsFragment.this.f31137b;
                    AbstractC3292y.f(c2041f);
                    if (l8 == c2041f.f0()) {
                        return;
                    }
                }
                TvOldVersionsFragment.this.f31140e = null;
                C3791p.a aVar = C3791p.f37286s;
                Context requireContext = TvOldVersionsFragment.this.requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                C3791p a9 = aVar.a(requireContext);
                a9.a();
                C2033C c2033c = (C2033C) obj;
                r Z8 = a9.Z(String.valueOf(c2033c.a()));
                a9.i();
                if (Z8 != null) {
                    if (Z8.X() != null) {
                        int Z9 = Z8.Z();
                        if (1 <= Z9 && Z9 < 100) {
                            C3776a c3776a = new C3776a();
                            Context context = TvOldVersionsFragment.this.getContext();
                            AbstractC3292y.f(context);
                            c3776a.a(context, Z8.X());
                            return;
                        }
                        TvOldVersionsFragment.this.f31140e = Z8.X();
                        if (Z8.Z() != 100) {
                            TvOldVersionsFragment.this.y(Z8);
                            return;
                        }
                        TvOldVersionsFragment tvOldVersionsFragment = TvOldVersionsFragment.this;
                        C2043h c2043h = tvOldVersionsFragment.f31136a;
                        AbstractC3292y.f(c2043h);
                        String v02 = c2043h.v0();
                        long e02 = Z8.e0();
                        String X8 = Z8.X();
                        AbstractC3292y.f(X8);
                        tvOldVersionsFragment.C(v02, e02, X8);
                        return;
                    }
                    return;
                }
                r rVar = new r();
                rVar.w0(String.valueOf(c2033c.a()));
                rVar.J0(c2033c.l());
                rVar.G0(c2033c.i());
                TvOldVersionsFragment.this.y(rVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f31142a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31143b;

        /* renamed from: d, reason: collision with root package name */
        int f31145d;

        d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31143b = obj;
            this.f31145d |= Integer.MIN_VALUE;
            return TvOldVersionsFragment.this.z(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31146a;

        /* loaded from: classes5.dex */
        public static final class a implements w {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TvOldVersionsFragment f31148a;

            a(TvOldVersionsFragment tvOldVersionsFragment) {
                this.f31148a = tvOldVersionsFragment;
            }

            @Override // b5.w
            public void a() {
            }

            @Override // b5.x
            public void b(C2043h appInfo, C2041f c2041f) {
                AbstractC3292y.i(appInfo, "appInfo");
                this.f31148a.f31137b = c2041f;
                this.f31148a.f31136a = appInfo;
                if (this.f31148a.f31136a != null) {
                    C2043h c2043h = this.f31148a.f31136a;
                    AbstractC3292y.f(c2043h);
                    if (c2043h.t0() != null) {
                        TvOldVersionsFragment tvOldVersionsFragment = this.f31148a;
                        C2043h c2043h2 = tvOldVersionsFragment.f31136a;
                        AbstractC3292y.f(c2043h2);
                        tvOldVersionsFragment.B(c2043h2.t0());
                    }
                }
            }

            @Override // b5.w
            public void c(int i8) {
            }

            @Override // b5.w
            public void d(int i8) {
            }

            @Override // b5.x
            public void e(String appName) {
                AbstractC3292y.i(appName, "appName");
            }

            @Override // b5.w
            public void f() {
            }
        }

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            V5.b.e();
            if (this.f31146a == 0) {
                t.b(obj);
                if (TvOldVersionsFragment.this.f31136a != null && TvOldVersionsFragment.this.getContext() != null) {
                    C2043h c2043h = TvOldVersionsFragment.this.f31136a;
                    AbstractC3292y.f(c2043h);
                    if (c2043h.t0() != null) {
                        C2043h c2043h2 = TvOldVersionsFragment.this.f31136a;
                        AbstractC3292y.f(c2043h2);
                        ArrayList t02 = c2043h2.t0();
                        AbstractC3292y.f(t02);
                        if (t02.size() != 0) {
                            C2043h c2043h3 = TvOldVersionsFragment.this.f31136a;
                            AbstractC3292y.f(c2043h3);
                            ArrayList t03 = c2043h3.t0();
                            AbstractC3292y.f(t03);
                            i8 = t03.size();
                            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(TvOldVersionsFragment.this);
                            Context requireContext = TvOldVersionsFragment.this.requireContext();
                            AbstractC3292y.h(requireContext, "requireContext(...)");
                            C2041f c2041f = TvOldVersionsFragment.this.f31137b;
                            C2043h c2043h4 = TvOldVersionsFragment.this.f31136a;
                            AbstractC3292y.f(c2043h4);
                            new X4.f(lifecycleScope, requireContext, c2041f, c2043h4, new a(TvOldVersionsFragment.this), i8);
                        }
                    }
                    i8 = 0;
                    LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(TvOldVersionsFragment.this);
                    Context requireContext2 = TvOldVersionsFragment.this.requireContext();
                    AbstractC3292y.h(requireContext2, "requireContext(...)");
                    C2041f c2041f2 = TvOldVersionsFragment.this.f31137b;
                    C2043h c2043h42 = TvOldVersionsFragment.this.f31136a;
                    AbstractC3292y.f(c2043h42);
                    new X4.f(lifecycleScope2, requireContext2, c2041f2, c2043h42, new a(TvOldVersionsFragment.this), i8);
                }
                TvOldVersionsFragment.this.x();
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31149a;

        f(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f31149a == 0) {
                t.b(obj);
                try {
                    if (TvOldVersionsFragment.this.f31136a != null) {
                        C2043h c2043h = TvOldVersionsFragment.this.f31136a;
                        AbstractC3292y.f(c2043h);
                        if (c2043h.t0() != null) {
                            TvOldVersionsFragment tvOldVersionsFragment = TvOldVersionsFragment.this;
                            C2043h c2043h2 = tvOldVersionsFragment.f31136a;
                            AbstractC3292y.f(c2043h2);
                            tvOldVersionsFragment.B(c2043h2.t0());
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31151a;

        g(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31151a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvOldVersionsFragment tvOldVersionsFragment = TvOldVersionsFragment.this;
                this.f31151a = 1;
                if (tvOldVersionsFragment.z(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    private final boolean A(String str, long j8) {
        if (getActivity() != null) {
            PackageManager packageManager = requireActivity().getPackageManager();
            try {
                AbstractC3292y.f(packageManager);
                AbstractC3292y.f(str);
                if (j8 >= new S4.f().m(S4.r.d(packageManager, str, 1))) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(ArrayList arrayList) {
        b bVar = this.f31139d;
        AbstractC3292y.f(bVar);
        bVar.clear();
        AbstractC3292y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar2 = this.f31139d;
            AbstractC3292y.f(bVar2);
            bVar2.add(arrayList.get(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(String str, long j8, String str2) {
        if (A(str, j8)) {
            u(str);
            return;
        }
        C3794s c3794s = new C3794s();
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        File file = new File(c3794s.f(requireContext), str2);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        UptodownApp.a.Z(aVar, file, requireActivity, null, 4, null);
    }

    private final void D() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(2);
        setGridPresenter(verticalGridPresenter);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: n5.M
            @Override // java.lang.Runnable
            public final void run() {
                TvOldVersionsFragment.E(TvOldVersionsFragment.this);
            }
        }, 500L);
        setOnItemViewClickedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(TvOldVersionsFragment tvOldVersionsFragment) {
        tvOldVersionsFragment.startEntranceTransition();
    }

    private final void F(String str) {
        if (getActivity() != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            i iVar = new i(requireActivity);
            AbstractC3292y.f(str);
            iVar.h(str);
        }
    }

    private final void u(final String str) {
        AlertDialog alertDialog = this.f31138c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(getString(R.string.warning_title));
        builder.setMessage(R.string.msg_warning_old_versions);
        builder.setCancelable(false);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: n5.N
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvOldVersionsFragment.v(TvOldVersionsFragment.this, str, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: n5.O
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvOldVersionsFragment.w(dialogInterface, i8);
            }
        });
        AlertDialog create = builder.create();
        this.f31138c = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(TvOldVersionsFragment tvOldVersionsFragment, String str, DialogInterface dialog, int i8) {
        AbstractC3292y.i(dialog, "dialog");
        dialog.dismiss();
        tvOldVersionsFragment.F(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DialogInterface dialog, int i8) {
        AbstractC3292y.i(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        C3791p.a aVar = C3791p.f37286s;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        C3791p a9 = aVar.a(requireContext);
        a9.a();
        ArrayList c02 = a9.c0();
        if (c02.size() > 0) {
            C3794s c3794s = new C3794s();
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            ArrayList d8 = c3794s.d(requireContext2);
            Iterator it = c02.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                r rVar = (r) next;
                Iterator it2 = d8.iterator();
                AbstractC3292y.h(it2, "iterator(...)");
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        AbstractC3292y.h(next2, "next(...)");
                        if (n.s(((File) next2).getName(), rVar.X(), true)) {
                            break;
                        }
                    } else {
                        a9.z(rVar);
                        break;
                    }
                }
            }
        }
        a9.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(r rVar) {
        C2043h c2043h = this.f31136a;
        AbstractC3292y.f(c2043h);
        rVar.a(c2043h);
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        int l02 = rVar.l0(requireContext);
        if (l02 >= 0) {
            DownloadApkWorker.a aVar = DownloadApkWorker.f31190k;
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            if (!aVar.f(requireContext2, l02)) {
                Context context = getContext();
                Y y8 = Y.f34578a;
                String string = getString(R.string.msg_added_to_downlads_queue);
                AbstractC3292y.h(string, "getString(...)");
                C2043h c2043h2 = this.f31136a;
                AbstractC3292y.f(c2043h2);
                String format = String.format(string, Arrays.copyOf(new Object[]{c2043h2.q0()}, 1));
                AbstractC3292y.h(format, "format(...)");
                Toast.makeText(context, format, 1).show();
                return;
            }
            return;
        }
        Toast.makeText(getContext(), getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.tv.ui.fragment.TvOldVersionsFragment.d
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$d r0 = (com.uptodown.tv.ui.fragment.TvOldVersionsFragment.d) r0
            int r1 = r0.f31145d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31145d = r1
            goto L18
        L13:
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$d r0 = new com.uptodown.tv.ui.fragment.TvOldVersionsFragment$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31143b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f31145d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f31142a
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment r2 = (com.uptodown.tv.ui.fragment.TvOldVersionsFragment) r2
            Q5.t.b(r7)
            goto L55
        L3d:
            Q5.t.b(r7)
            n6.I r7 = n6.C3445b0.b()
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$e r2 = new com.uptodown.tv.ui.fragment.TvOldVersionsFragment$e
            r2.<init>(r5)
            r0.f31142a = r6
            r0.f31145d = r4
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            n6.J0 r7 = n6.C3445b0.c()
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$f r4 = new com.uptodown.tv.ui.fragment.TvOldVersionsFragment$f
            r4.<init>(r5)
            r0.f31142a = r5
            r0.f31145d = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvOldVersionsFragment.z(U5.d):java.lang.Object");
    }

    public final void G(int i8) {
        switch (i8) {
            case ComposerKt.providerKey /* 201 */:
                b bVar = this.f31139d;
                AbstractC3292y.f(bVar);
                b bVar2 = this.f31139d;
                AbstractC3292y.f(bVar2);
                bVar.notifyArrayItemRangeChanged(0, bVar2.size());
                return;
            case ComposerKt.compositionLocalMapKey /* 202 */:
            case ComposerKt.providerValuesKey /* 203 */:
                b bVar3 = this.f31139d;
                AbstractC3292y.f(bVar3);
                b bVar4 = this.f31139d;
                AbstractC3292y.f(bVar4);
                bVar3.notifyArrayItemRangeChanged(0, bVar4.size());
                return;
            default:
                return;
        }
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        C3795t c3795t = new C3795t(getContext());
        String simpleName = TvOldVersionsFragment.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null) {
            if (extras.containsKey(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP, C2041f.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                }
                this.f31137b = (C2041f) parcelable3;
            }
            if (extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C2043h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                this.f31136a = (C2043h) parcelable;
                C3784i c3784i = new C3784i();
                Context requireContext = requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                C2043h c2043h = this.f31136a;
                AbstractC3292y.f(c2043h);
                this.f31137b = c3784i.B(requireContext, c2043h.v0());
            }
        }
        if (this.f31137b != null) {
            C2041f c2041f = this.f31137b;
            AbstractC3292y.f(c2041f);
            this.f31139d = new b(new o(c2041f));
        } else if (this.f31136a != null) {
            C2043h c2043h2 = this.f31136a;
            AbstractC3292y.f(c2043h2);
            this.f31139d = new b(new o(c2043h2.v0()));
        }
        setAdapter(this.f31139d);
        setTitle(getString(R.string.rollback_title));
        if (bundle == null) {
            prepareEntranceTransition();
        }
        D();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new g(null), 3, null);
    }
}
