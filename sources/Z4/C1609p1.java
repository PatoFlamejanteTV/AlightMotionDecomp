package Z4;

import I4.C1231j;
import Z4.C1609p1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import c5.C2043h;
import c5.C2046k;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.C3795t;

/* renamed from: Z4.p1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1609p1 extends Fragment {

    /* renamed from: n, reason: collision with root package name */
    public static final a f13757n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C2046k f13758a;

    /* renamed from: b, reason: collision with root package name */
    private C1231j f13759b;

    /* renamed from: e, reason: collision with root package name */
    private c5.P f13762e;

    /* renamed from: f, reason: collision with root package name */
    private c5.P f13763f;

    /* renamed from: g, reason: collision with root package name */
    private C2043h f13764g;

    /* renamed from: h, reason: collision with root package name */
    private RelativeLayout f13765h;

    /* renamed from: i, reason: collision with root package name */
    private RecyclerView f13766i;

    /* renamed from: j, reason: collision with root package name */
    private View f13767j;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f13760c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f13761d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private b5.s f13768k = new d();

    /* renamed from: l, reason: collision with root package name */
    private final b f13769l = new b();

    /* renamed from: m, reason: collision with root package name */
    private final c f13770m = new c();

    /* renamed from: Z4.p1$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1609p1 a(C2046k category) {
            AbstractC3292y.i(category, "category");
            C1609p1 c1609p1 = new C1609p1();
            c1609p1.setArguments(category.z());
            return c1609p1;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: Z4.p1$c */
    /* loaded from: classes5.dex */
    public static final class c implements b5.q {
        c() {
        }

        @Override // b5.q
        public void a(c5.P topByCategoryReceived) {
            AbstractC3292y.i(topByCategoryReceived, "topByCategoryReceived");
            C1609p1.this.f13763f = topByCategoryReceived;
        }

        @Override // b5.q
        public void b(ArrayList topsByCategoryReceived) {
            C1231j c1231j;
            AbstractC3292y.i(topsByCategoryReceived, "topsByCategoryReceived");
            if (topsByCategoryReceived.size() > 0 && C1609p1.this.r() != null && (c1231j = C1609p1.this.f13759b) != null) {
                C2046k r8 = C1609p1.this.r();
                AbstractC3292y.f(r8);
                c1231j.m(topsByCategoryReceived, r8);
            }
        }

        @Override // b5.q
        public void c(ArrayList featuresReceived) {
            AbstractC3292y.i(featuresReceived, "featuresReceived");
            C1609p1.this.f13761d = featuresReceived;
        }

        @Override // b5.q
        public void d(ArrayList floatingCategories) {
            AbstractC3292y.i(floatingCategories, "floatingCategories");
            C1231j c1231j = C1609p1.this.f13759b;
            if (c1231j != null) {
                c1231j.i(floatingCategories);
            }
        }

        @Override // b5.q
        public void e(C2043h appReplacement) {
            AbstractC3292y.i(appReplacement, "appReplacement");
            C1231j c1231j = C1609p1.this.f13759b;
            if (c1231j != null) {
                c1231j.b(appReplacement);
            }
        }

        @Override // b5.q
        public void f(c5.P recentsByCategoryReceived) {
            AbstractC3292y.i(recentsByCategoryReceived, "recentsByCategoryReceived");
            C1609p1.this.f13762e = recentsByCategoryReceived;
        }

        @Override // b5.q
        public void g() {
            C1609p1.this.p();
        }

        @Override // b5.q
        public void h(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            C1609p1.this.f13764g = appInfo;
        }

        @Override // b5.q
        public void i(ArrayList categoriesReceived) {
            AbstractC3292y.i(categoriesReceived, "categoriesReceived");
            C1609p1.this.f13760c = categoriesReceived;
        }

        @Override // b5.q
        public void j(c5.P topByCategoryReceived) {
            AbstractC3292y.i(topByCategoryReceived, "topByCategoryReceived");
            C1231j c1231j = C1609p1.this.f13759b;
            if (c1231j != null) {
                c1231j.k(topByCategoryReceived);
            }
        }
    }

    /* renamed from: Z4.p1$d */
    /* loaded from: classes5.dex */
    public static final class d implements b5.s {
        d() {
        }

        @Override // b5.InterfaceC1980d
        public void a(C2043h app) {
            AbstractC3292y.i(app, "app");
            if (UptodownApp.f29249C.a0() && C1609p1.this.getActivity() != null && (C1609p1.this.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = C1609p1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).C2(app.h());
            }
        }

        @Override // b5.s
        public void b(c5.P topByCategory) {
            AbstractC3292y.i(topByCategory, "topByCategory");
            if (UptodownApp.f29249C.a0()) {
                FragmentActivity activity = C1609p1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).p8(topByCategory.b());
            }
        }

        @Override // b5.InterfaceC1983g
        public void c(C2046k category) {
            AbstractC3292y.i(category, "category");
            if (UptodownApp.f29249C.a0()) {
                FragmentActivity activity = C1609p1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).p8(category);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.p1$e */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13775a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13776b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1609p1 f13777c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, C1609p1 c1609p1, U5.d dVar) {
            super(2, dVar);
            this.f13776b = str;
            this.f13777c = c1609p1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f13776b, this.f13777c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1231j c1231j;
            V5.b.e();
            if (this.f13775a == 0) {
                Q5.t.b(obj);
                String str = this.f13776b;
                if (str != null && str.length() != 0 && this.f13777c.f13766i != null && (c1231j = this.f13777c.f13759b) != null) {
                    String str2 = this.f13776b;
                    RecyclerView recyclerView = this.f13777c.f13766i;
                    AbstractC3292y.f(recyclerView);
                    c1231j.w(str2, recyclerView);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:            if (r0.isEmpty() == false) goto L11;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r7 = this;
            I4.j r0 = r7.f13759b
            if (r0 == 0) goto L14
            if (r0 == 0) goto Lb
            java.util.ArrayList r0 = r0.r()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L14
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L33
        L14:
            I4.j r0 = new I4.j
            b5.s r1 = r7.f13768k
            Z4.p1$b r2 = r7.f13769l
            android.content.Context r3 = r7.requireContext()
            java.lang.String r4 = "requireContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r3, r4)
            java.lang.Class<Z4.p1> r4 = Z4.C1609p1.class
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r5 = "getSimpleName(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r4, r5)
            r0.<init>(r1, r2, r3, r4)
            r7.f13759b = r0
        L33:
            java.util.ArrayList r0 = r7.f13761d
            int r0 = r0.size()
            if (r0 <= 0) goto L5d
            java.util.ArrayList r0 = r7.f13760c
            int r0 = r0.size()
            if (r0 <= 0) goto L5d
            I4.j r1 = r7.f13759b
            if (r1 == 0) goto L54
            java.util.ArrayList r2 = r7.f13761d
            java.util.ArrayList r3 = r7.f13760c
            c5.P r4 = r7.f13762e
            c5.h r5 = r7.f13764g
            c5.P r6 = r7.f13763f
            r1.p(r2, r3, r4, r5, r6)
        L54:
            androidx.recyclerview.widget.RecyclerView r0 = r7.f13766i
            if (r0 == 0) goto L5d
            I4.j r1 = r7.f13759b
            r0.setAdapter(r1)
        L5d:
            android.widget.RelativeLayout r0 = r7.f13765h
            if (r0 == 0) goto L66
            r1 = 8
            r0.setVisibility(r1)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1609p1.p():void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C2046k c2046k = new C2046k(0, null, null, 7, null);
            this.f13758a = c2046k;
            AbstractC3292y.f(c2046k);
            c2046k.y(arguments);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        if (this.f13767j == null) {
            View inflate = inflater.inflate(R.layout.parent_category_fragment, viewGroup, false);
            this.f13767j = inflate;
            AbstractC3292y.f(inflate);
            this.f13765h = (RelativeLayout) inflate.findViewById(R.id.loading_view_parent_category_fragment);
            View view = this.f13767j;
            AbstractC3292y.f(view);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            this.f13766i = recyclerView;
            if (recyclerView != null) {
                recyclerView.setItemAnimator(null);
            }
            RecyclerView recyclerView2 = this.f13766i;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            }
            RecyclerView recyclerView3 = this.f13766i;
            if (recyclerView3 != null) {
                recyclerView3.addItemDecoration(new s5.p((int) getResources().getDimension(R.dimen.margin_m)));
            }
            RelativeLayout relativeLayout = this.f13765h;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        } else {
            RelativeLayout relativeLayout2 = this.f13765h;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
        }
        q();
        return this.f13767j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        h2.e o8 = UptodownApp.f29249C.o();
        if (o8 != null) {
            o8.pause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        h2.e o8;
        super.onResume();
        new C3795t(getContext()).g("ParentCategoryFragment");
        UptodownApp.a aVar = UptodownApp.f29249C;
        h2.e n8 = aVar.n();
        if (n8 != null) {
            n8.pause();
        }
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            if (aVar.f(requireContext)) {
                SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
                Context requireContext2 = requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                if (aVar2.k(requireContext2) > 0 && (o8 = aVar.o()) != null) {
                    o8.play();
                }
            }
        }
    }

    public final void q() {
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c cVar = this.f13770m;
        C2046k c2046k = this.f13758a;
        AbstractC3292y.f(c2046k);
        new X4.h(requireContext, cVar, c2046k, LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final C2046k r() {
        return this.f13758a;
    }

    public final void s() {
        RecyclerView recyclerView = this.f13766i;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    public final void t(String str) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new e(str, this, null), 2, null);
    }

    /* renamed from: Z4.p1$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC1977a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I c(C1609p1 c1609p1, C2043h c2043h) {
            c1609p1.t(c2043h.v0());
            return Q5.I.f8786a;
        }

        @Override // b5.InterfaceC1977a
        public void a(final C2043h appInfo, int i8) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (C1609p1.this.getActivity() instanceof MainActivity) {
                FragmentActivity activity = C1609p1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                RelativeLayout O52 = ((MainActivity) activity).O5();
                if (O52 == null || O52.getVisibility() != 0) {
                    FragmentActivity activity2 = C1609p1.this.getActivity();
                    AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    final C1609p1 c1609p1 = C1609p1.this;
                    ((MainActivity) activity2).p7(appInfo, new Function0() { // from class: Z4.q1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Q5.I c8;
                            c8 = C1609p1.b.c(C1609p1.this, appInfo);
                            return c8;
                        }
                    });
                    Context requireContext = C1609p1.this.requireContext();
                    AbstractC3292y.h(requireContext, "requireContext(...)");
                    new X4.i(requireContext, appInfo.h(), new a(C1609p1.this), LifecycleOwnerKt.getLifecycleScope(C1609p1.this));
                }
            }
        }

        /* renamed from: Z4.p1$b$a */
        /* loaded from: classes5.dex */
        public static final class a implements b5.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1609p1 f13772a;

            a(C1609p1 c1609p1) {
                this.f13772a = c1609p1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Q5.I d(C1609p1 c1609p1, C2043h c2043h) {
                c1609p1.t(c2043h.v0());
                return Q5.I.f8786a;
            }

            @Override // b5.r
            public void c(final C2043h appInfo) {
                AbstractC3292y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f13772a.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                final C1609p1 c1609p1 = this.f13772a;
                ((MainActivity) activity).p7(appInfo, new Function0() { // from class: Z4.r1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Q5.I d8;
                        d8 = C1609p1.b.a.d(C1609p1.this, appInfo);
                        return d8;
                    }
                });
            }

            @Override // b5.r
            public void b(int i8) {
            }
        }
    }
}
