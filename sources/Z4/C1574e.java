package Z4;

import I4.H;
import Q5.InterfaceC1416k;
import Z4.C1574e;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import b5.InterfaceC1980d;
import b5.InterfaceC1981e;
import c5.C2040e;
import c5.C2043h;
import c5.C2046k;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2691a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadUpdatesWorker;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.C3776a;
import q5.C3784i;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;
import q5.C3797v;

/* renamed from: Z4.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1574e extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    public static final a f13529f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public C2040e f13531b;

    /* renamed from: c, reason: collision with root package name */
    private I4.H f13532c;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f13530a = Q5.l.b(new Function0() { // from class: Z4.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.n0 q8;
            q8 = C1574e.q(C1574e.this);
            return q8;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private g f13533d = new g();

    /* renamed from: e, reason: collision with root package name */
    private f f13534e = new f();

    /* renamed from: Z4.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1574e a(C2040e alternatives) {
            AbstractC3292y.i(alternatives, "alternatives");
            C1574e c1574e = new C1574e();
            c1574e.z(alternatives);
            return c1574e;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: Z4.e$b */
    /* loaded from: classes5.dex */
    public static final class b implements b5.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13536b;

        b(int i8) {
            this.f13536b = i8;
        }

        @Override // b5.r
        public void b(int i8) {
            Toast.makeText(C1574e.this.requireContext(), C1574e.this.getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            ArrayList arrayList;
            AbstractC3292y.i(appInfo, "appInfo");
            c5.r rVar = new c5.r();
            rVar.a(appInfo);
            C1574e.this.s(rVar);
            I4.H h8 = C1574e.this.f13532c;
            if (h8 != null) {
                arrayList = h8.c();
            } else {
                arrayList = null;
            }
            AbstractC3292y.f(arrayList);
            ((H.b) arrayList.get(this.f13536b)).e(appInfo);
            I4.H h9 = C1574e.this.f13532c;
            if (h9 != null) {
                h9.notifyItemChanged(this.f13536b);
            }
        }
    }

    /* renamed from: Z4.e$e, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0271e implements InterfaceC1977a {
        C0271e() {
        }

        @Override // b5.InterfaceC1977a
        public void a(C2043h appInfo, int i8) {
            AbstractC3292y.i(appInfo, "appInfo");
            C1574e.this.A(appInfo);
        }
    }

    /* renamed from: Z4.e$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC1981e {
        f() {
        }

        @Override // b5.InterfaceC1981e
        public void a(C2043h appInfo, int i8) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (C1574e.this.getContext() != null) {
                C3791p.a aVar = C3791p.f37286s;
                Context context = C1574e.this.getContext();
                AbstractC3292y.f(context);
                C3791p a9 = aVar.a(context);
                a9.a();
                c5.r Z8 = a9.Z(String.valueOf(appInfo.d0()));
                String v02 = appInfo.v0();
                AbstractC3292y.f(v02);
                c5.Q s02 = a9.s0(v02);
                a9.i();
                if (Z8 != null) {
                    DownloadApkWorker.f31190k.a(appInfo.h());
                    C3776a c3776a = new C3776a();
                    Context context2 = C1574e.this.getContext();
                    AbstractC3292y.f(context2);
                    c3776a.a(context2, Z8.X());
                    Context context3 = C1574e.this.getContext();
                    AbstractC3292y.f(context3);
                    Z8.n0(context3);
                    I4.H h8 = C1574e.this.f13532c;
                    if (h8 != null) {
                        h8.notifyItemChanged(i8);
                    }
                    if (C1574e.this.getActivity() != null && (C1574e.this.getActivity() instanceof MainActivity)) {
                        FragmentActivity activity = C1574e.this.getActivity();
                        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                        ((MainActivity) activity).G2(Z8);
                        return;
                    }
                    return;
                }
                if (s02 != null) {
                    DownloadUpdatesWorker.f31198k.a(s02.s());
                    UptodownApp.a aVar2 = UptodownApp.f29249C;
                    String s8 = s02.s();
                    Context context4 = C1574e.this.getContext();
                    AbstractC3292y.f(context4);
                    aVar2.c0(s8, context4);
                    String l8 = s02.l();
                    if (l8 != null && l8.length() != 0) {
                        C3794s c3794s = new C3794s();
                        Context context5 = C1574e.this.getContext();
                        AbstractC3292y.f(context5);
                        File g8 = c3794s.g(context5);
                        String l9 = s02.l();
                        AbstractC3292y.f(l9);
                        File file = new File(g8, l9);
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
            }
        }

        @Override // b5.InterfaceC1981e
        public void b(C2043h appInfo, int i8) {
            boolean z8;
            boolean z9;
            AbstractC3292y.i(appInfo, "appInfo");
            if (C1574e.this.getContext() != null) {
                C3791p.a aVar = C3791p.f37286s;
                Context context = C1574e.this.getContext();
                AbstractC3292y.f(context);
                C3791p a9 = aVar.a(context);
                a9.a();
                c5.r Z8 = a9.Z(String.valueOf(appInfo.d0()));
                boolean t8 = new C3784i().t(appInfo.v0(), C1574e.this.getContext());
                String v02 = appInfo.v0();
                AbstractC3292y.f(v02);
                c5.Q s02 = a9.s0(v02);
                a9.i();
                UptodownApp.a aVar2 = UptodownApp.f29249C;
                Context context2 = C1574e.this.getContext();
                AbstractC3292y.f(context2);
                boolean z10 = false;
                if (aVar2.V("downloadApkWorker", context2) && DownloadApkWorker.f31190k.c(appInfo.h())) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (Z8 != null && Z8.h0()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (Z8 != null && Z8.z() == 0) {
                    z10 = true;
                }
                if (Z8 != null && (z8 || z9 || z10)) {
                    int Z9 = Z8.Z();
                    if (1 > Z9 || Z9 >= 100 || !DownloadApkWorker.f31190k.d(appInfo.h(), appInfo.m0())) {
                        if (Z8.Z() == 100) {
                            C3794s c3794s = new C3794s();
                            Context context3 = C1574e.this.getContext();
                            AbstractC3292y.f(context3);
                            File f8 = c3794s.f(context3);
                            String X8 = Z8.X();
                            AbstractC3292y.f(X8);
                            File file = new File(f8, X8);
                            Context context4 = C1574e.this.getContext();
                            AbstractC3292y.f(context4);
                            aVar2.X(file, context4, appInfo.r0());
                            return;
                        }
                        Context context5 = C1574e.this.getContext();
                        AbstractC3292y.f(context5);
                        Z8.n0(context5);
                        I4.H h8 = C1574e.this.f13532c;
                        if (h8 != null) {
                            h8.notifyItemChanged(i8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!t8) {
                    C1574e.this.r(appInfo.h(), i8);
                    return;
                }
                if (s02 == null) {
                    C1574e.this.x(appInfo.v0());
                    return;
                }
                if (s02.u() != 100) {
                    C1574e.this.r(appInfo.h(), i8);
                    return;
                }
                C3794s c3794s2 = new C3794s();
                Context context6 = C1574e.this.getContext();
                AbstractC3292y.f(context6);
                File g8 = c3794s2.g(context6);
                String l8 = s02.l();
                AbstractC3292y.f(l8);
                File file2 = new File(g8, l8);
                Context context7 = C1574e.this.getContext();
                AbstractC3292y.f(context7);
                aVar2.X(file2, context7, appInfo.r0());
            }
        }
    }

    /* renamed from: Z4.e$g */
    /* loaded from: classes5.dex */
    public static final class g implements InterfaceC1980d {
        g() {
        }

        @Override // b5.InterfaceC1980d
        public void a(C2043h app) {
            AbstractC3292y.i(app, "app");
            if (UptodownApp.f29249C.a0()) {
                if (C1574e.this.getActivity() != null && (C1574e.this.getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = C1574e.this.getActivity();
                    AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).C2(app.h());
                } else if (C1574e.this.getActivity() != null && (C1574e.this.getActivity() instanceof AbstractActivityC2691a)) {
                    FragmentActivity activity2 = C1574e.this.getActivity();
                    AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    ((AbstractActivityC2691a) activity2).C2(app.h());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.e$h */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13543b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1574e f13544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, C1574e c1574e, U5.d dVar) {
            super(2, dVar);
            this.f13543b = str;
            this.f13544c = c1574e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f13543b, this.f13544c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13542a == 0) {
                Q5.t.b(obj);
                String str = this.f13543b;
                if (str != null && str.length() != 0 && this.f13544c.f13532c != null) {
                    I4.H h8 = this.f13544c.f13532c;
                    AbstractC3292y.f(h8);
                    int i8 = 0;
                    for (H.b bVar : h8.c()) {
                        int i9 = i8 + 1;
                        if (bVar.b() != null) {
                            C2043h b9 = bVar.b();
                            AbstractC3292y.f(b9);
                            if (b9.v0() != null) {
                                C2043h b10 = bVar.b();
                                AbstractC3292y.f(b10);
                                if (AbstractC3292y.d(b10.v0(), this.f13543b)) {
                                    I4.H h9 = this.f13544c.f13532c;
                                    AbstractC3292y.f(h9);
                                    h9.notifyItemChanged(i8);
                                }
                            }
                        }
                        i8 = i9;
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(final C2043h c2043h) {
        if (getActivity() instanceof MainActivity) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).p7(c2043h, new Function0() { // from class: Z4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q5.I B8;
                    B8 = C1574e.B(C2043h.this, this);
                    return B8;
                }
            });
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            new X4.i(requireContext, c2043h.h(), new c(), LifecycleOwnerKt.getLifecycleScope(this));
            return;
        }
        if (getActivity() instanceof AppDetailActivity) {
            FragmentActivity activity2 = getActivity();
            AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).s3(u().f12865b.getRoot());
            FragmentActivity activity3 = getActivity();
            AbstractC3292y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity3).t3(c2043h, new Function0() { // from class: Z4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q5.I C8;
                    C8 = C1574e.C(C2043h.this, this);
                    return C8;
                }
            });
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            new X4.i(requireContext2, c2043h.h(), new d(), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I B(C2043h c2043h, C1574e c1574e) {
        if (c2043h.v0() != null) {
            String v02 = c2043h.v0();
            AbstractC3292y.f(v02);
            c1574e.E(v02);
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I C(C2043h c2043h, C1574e c1574e) {
        if (c2043h.v0() != null) {
            String v02 = c2043h.v0();
            AbstractC3292y.f(v02);
            c1574e.E(v02);
        }
        return Q5.I.f8786a;
    }

    private final void D(C2040e c2040e) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            c5.P p8 = new c5.P(null, null, 0, 7, null);
            ArrayList a9 = c2040e.a();
            AbstractC3292y.f(a9);
            p8.d(a9);
            p8.e(new C2046k(-4, c2040e.c(), c2040e.b()));
            float dimension = getResources().getDimension(R.dimen.margin_xl);
            g gVar = this.f13533d;
            f fVar = this.f13534e;
            C0271e c0271e = new C0271e();
            String b9 = c2040e.b();
            String c8 = c2040e.c();
            String string = getString(R.string.read_more_desc_app_detail);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = getString(R.string.read_less_desc_app_detail);
            AbstractC3292y.h(string2, "getString(...)");
            I4.H h8 = new I4.H(gVar, fVar, c0271e, b9, c8, string, string2);
            this.f13532c = h8;
            h8.b(p8, (int) dimension);
            u().f12867d.setAdapter(this.f13532c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.n0 q(C1574e c1574e) {
        return Y4.n0.c(c1574e.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(long j8, int i8) {
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        new X4.i(requireContext, j8, new b(i8), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(c5.r rVar) {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            int l02 = rVar.l0(requireContext);
            if (l02 >= 0) {
                if (C3797v.f37313a.d()) {
                    DownloadApkWorker.a aVar = DownloadApkWorker.f31190k;
                    Context requireContext2 = requireContext();
                    AbstractC3292y.h(requireContext2, "requireContext(...)");
                    aVar.f(requireContext2, l02);
                }
                if (getActivity() != null && (getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = getActivity();
                    AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).P1(rVar);
                    return;
                }
                return;
            }
            Toast.makeText(requireContext(), getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
        }
    }

    private final Y4.n0 u() {
        return (Y4.n0) this.f13530a.getValue();
    }

    private final void v() {
        u().f12868e.setVisibility(0);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.vector_arrow_left);
        if (drawable != null) {
            u().f12868e.setNavigationIcon(drawable);
            u().f12868e.setNavigationContentDescription(getString(R.string.back));
        }
        u().f12868e.setNavigationOnClickListener(new View.OnClickListener() { // from class: Z4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1574e.w(C1574e.this, view);
            }
        });
        u().f12869f.setTypeface(J4.j.f4395g.v());
        u().f12869f.setVisibility(8);
        u().f12867d.setItemAnimator(null);
        u().f12867d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView = u().f12867d;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        recyclerView.addItemDecoration(new s5.s(requireContext, 11));
        RecyclerView recyclerviewTopCat = u().f12867d;
        AbstractC3292y.h(recyclerviewTopCat, "recyclerviewTopCat");
        recyclerviewTopCat.setPadding(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(C1574e c1574e, View view) {
        FragmentActivity activity = c1574e.getActivity();
        if (activity instanceof MainActivity) {
            FragmentActivity activity2 = c1574e.getActivity();
            AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity2).Z6();
        } else if (activity instanceof AppDetailActivity) {
            FragmentActivity activity3 = c1574e.getActivity();
            AbstractC3292y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity3).finish();
        } else if (activity instanceof MoreInfo) {
            FragmentActivity activity4 = c1574e.getActivity();
            AbstractC3292y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.MoreInfo");
            ((MoreInfo) activity4).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String str) {
        Intent launchIntentForPackage;
        if (getActivity() != null && str != null && str.length() != 0 && (launchIntentForPackage = requireActivity().getPackageManager().getLaunchIntentForPackage(str)) != null) {
            startActivity(launchIntentForPackage);
        }
    }

    private final void y() {
        I4.H h8;
        if (J4.j.f4395g.h() == null && (h8 = this.f13532c) != null) {
            h8.notifyDataSetChanged();
        }
    }

    public final void E(String str) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new h(str, this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        D(t());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        v();
        RelativeLayout root = u().getRoot();
        AbstractC3292y.h(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        new C3795t(getContext()).g("AlternativesFragment");
        y();
    }

    public final C2040e t() {
        C2040e c2040e = this.f13531b;
        if (c2040e != null) {
            return c2040e;
        }
        AbstractC3292y.y("alternatives");
        return null;
    }

    public final void z(C2040e c2040e) {
        AbstractC3292y.i(c2040e, "<set-?>");
        this.f13531b = c2040e;
    }

    /* renamed from: Z4.e$c */
    /* loaded from: classes5.dex */
    public static final class c implements b5.r {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I d(C1574e c1574e, C2043h c2043h) {
            c1574e.E(c2043h.v0());
            return Q5.I.f8786a;
        }

        @Override // b5.r
        public void c(final C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            FragmentActivity activity = C1574e.this.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            final C1574e c1574e = C1574e.this;
            ((MainActivity) activity).p7(appInfo, new Function0() { // from class: Z4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q5.I d8;
                    d8 = C1574e.c.d(C1574e.this, appInfo);
                    return d8;
                }
            });
        }

        @Override // b5.r
        public void b(int i8) {
        }
    }

    /* renamed from: Z4.e$d */
    /* loaded from: classes5.dex */
    public static final class d implements b5.r {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I d(C1574e c1574e, C2043h c2043h) {
            c1574e.E(c2043h.v0());
            return Q5.I.f8786a;
        }

        @Override // b5.r
        public void c(final C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            FragmentActivity activity = C1574e.this.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            final C1574e c1574e = C1574e.this;
            ((AppDetailActivity) activity).t3(appInfo, new Function0() { // from class: Z4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q5.I d8;
                    d8 = C1574e.d.d(C1574e.this, appInfo);
                    return d8;
                }
            });
        }

        @Override // b5.r
        public void b(int i8) {
        }
    }
}
