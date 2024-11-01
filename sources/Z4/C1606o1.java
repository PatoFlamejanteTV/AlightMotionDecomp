package Z4;

import I4.C1231j;
import R5.AbstractC1435t;
import Z4.C1606o1;
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
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3795t;
import q5.C3797v;

/* renamed from: Z4.o1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1606o1 extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private C1231j f13718a;

    /* renamed from: d, reason: collision with root package name */
    private c5.P f13721d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f13722e;

    /* renamed from: f, reason: collision with root package name */
    private c5.P f13723f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f13724g;

    /* renamed from: h, reason: collision with root package name */
    private RecyclerView f13725h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13727j;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f13719b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f13720c = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f13726i = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13728k = true;

    /* renamed from: l, reason: collision with root package name */
    private b5.s f13729l = new c();

    /* renamed from: m, reason: collision with root package name */
    private final a f13730m = new a();

    /* renamed from: n, reason: collision with root package name */
    private final b f13731n = new b();

    /* renamed from: Z4.o1$b */
    /* loaded from: classes5.dex */
    public static final class b implements b5.n {
        b() {
        }

        @Override // b5.n
        public void a(c5.P topHorizontalTopReceived) {
            AbstractC3292y.i(topHorizontalTopReceived, "topHorizontalTopReceived");
            C1231j c1231j = C1606o1.this.f13718a;
            if (c1231j != null) {
                c1231j.u(topHorizontalTopReceived);
            }
        }

        @Override // b5.n
        public void b(ArrayList miniTopsReceived) {
            C1231j c1231j;
            AbstractC3292y.i(miniTopsReceived, "miniTopsReceived");
            C1606o1.this.f13720c = miniTopsReceived;
            if (C1606o1.this.f13720c.size() > 0 && (c1231j = C1606o1.this.f13718a) != null) {
                c1231j.l(C1606o1.this.f13720c);
            }
        }

        @Override // b5.n
        public void c(C2043h appInfoReceived) {
            AbstractC3292y.i(appInfoReceived, "appInfoReceived");
            C1231j c1231j = C1606o1.this.f13718a;
            if (c1231j != null) {
                c1231j.j(appInfoReceived);
            }
        }

        @Override // b5.n
        public void d(c5.P topHorizontalLatestReceived) {
            AbstractC3292y.i(topHorizontalLatestReceived, "topHorizontalLatestReceived");
            C1231j c1231j = C1606o1.this.f13718a;
            if (c1231j != null) {
                c1231j.t(topHorizontalLatestReceived);
            }
        }

        @Override // b5.n
        public void e(ArrayList homeFeaturesReceived) {
            AbstractC3292y.i(homeFeaturesReceived, "homeFeaturesReceived");
            C1606o1.this.f13719b = homeFeaturesReceived;
        }

        @Override // b5.n
        public void f() {
            C1606o1.this.x();
        }

        @Override // b5.n
        public void g(C2043h appReplacement) {
            AbstractC3292y.i(appReplacement, "appReplacement");
            C1231j c1231j = C1606o1.this.f13718a;
            if (c1231j != null) {
                c1231j.b(appReplacement);
            }
        }

        @Override // b5.n
        public void h(ArrayList recentFeaturedReceived) {
            C1231j c1231j;
            AbstractC3292y.i(recentFeaturedReceived, "recentFeaturedReceived");
            if (recentFeaturedReceived.size() > 0 && (c1231j = C1606o1.this.f13718a) != null) {
                c1231j.s((C2043h) AbstractC1435t.m0(recentFeaturedReceived));
            }
        }

        @Override // b5.n
        public void i(ArrayList floatingMiniTopsReceived) {
            AbstractC3292y.i(floatingMiniTopsReceived, "floatingMiniTopsReceived");
            if (floatingMiniTopsReceived.size() <= 3) {
                C1606o1.this.f13722e = floatingMiniTopsReceived;
            } else {
                C1606o1.this.f13722e = new ArrayList();
                ArrayList arrayList = C1606o1.this.f13722e;
                if (arrayList != null) {
                    arrayList.add(floatingMiniTopsReceived.get(0));
                }
                ArrayList arrayList2 = C1606o1.this.f13722e;
                if (arrayList2 != null) {
                    arrayList2.add(floatingMiniTopsReceived.get(1));
                }
                ArrayList arrayList3 = C1606o1.this.f13722e;
                if (arrayList3 != null) {
                    arrayList3.add(floatingMiniTopsReceived.get(2));
                }
            }
            C1231j c1231j = C1606o1.this.f13718a;
            if (c1231j != null) {
                c1231j.o(C1606o1.this.f13722e);
            }
        }

        @Override // b5.n
        public void j(c5.P topHorizontalNewReleasesReceived) {
            AbstractC3292y.i(topHorizontalNewReleasesReceived, "topHorizontalNewReleasesReceived");
            C1606o1.this.f13723f = topHorizontalNewReleasesReceived;
        }

        @Override // b5.n
        public void k(ArrayList categoriesReceived) {
            AbstractC3292y.i(categoriesReceived, "categoriesReceived");
        }

        @Override // b5.n
        public void l(c5.P topByCategory) {
            AbstractC3292y.i(topByCategory, "topByCategory");
            C1606o1.this.f13721d = topByCategory;
        }
    }

    /* renamed from: Z4.o1$c */
    /* loaded from: classes5.dex */
    public static final class c implements b5.s {
        c() {
        }

        @Override // b5.InterfaceC1980d
        public void a(C2043h app) {
            AbstractC3292y.i(app, "app");
            if (UptodownApp.f29249C.a0() && C1606o1.this.getActivity() != null && (C1606o1.this.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = C1606o1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).C2(app.h());
            }
        }

        @Override // b5.s
        public void b(c5.P topByCategory) {
            AbstractC3292y.i(topByCategory, "topByCategory");
            if (UptodownApp.f29249C.a0()) {
                int b9 = topByCategory.b().b();
                if (b9 != -3 && b9 != -2) {
                    if (b9 != -1) {
                        if (b9 != 523) {
                            if (topByCategory.b().s()) {
                                FragmentActivity activity = C1606o1.this.getActivity();
                                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                                ((MainActivity) activity).p8(topByCategory.b());
                                return;
                            } else {
                                FragmentActivity activity2 = C1606o1.this.getActivity();
                                AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                                ((MainActivity) activity2).s8(topByCategory.b());
                                return;
                            }
                        }
                        FragmentActivity activity3 = C1606o1.this.getActivity();
                        AbstractC3292y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                        ((MainActivity) activity3).z5(1);
                        return;
                    }
                    FragmentActivity activity4 = C1606o1.this.getActivity();
                    AbstractC3292y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity4).z5(2);
                    return;
                }
                FragmentActivity activity5 = C1606o1.this.getActivity();
                AbstractC3292y.g(activity5, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity5).p8(topByCategory.b());
            }
        }

        @Override // b5.InterfaceC1983g
        public void c(C2046k category) {
            AbstractC3292y.i(category, "category");
            if (UptodownApp.f29249C.a0()) {
                if (category.b() == 523) {
                    FragmentActivity activity = C1606o1.this.getActivity();
                    AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).z5(1);
                } else {
                    FragmentActivity activity2 = C1606o1.this.getActivity();
                    AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity2).s8(category);
                }
            }
        }
    }

    /* renamed from: Z4.o1$d */
    /* loaded from: classes5.dex */
    public static final class d extends RecyclerView.OnScrollListener {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3292y.i(recyclerView, "recyclerView");
            if (i9 > 0 && !C1606o1.this.f13727j && C1606o1.this.f13728k && !recyclerView.canScrollVertically(1)) {
                C1606o1.this.z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.o1$e */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13737a;

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13737a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C1606o1 c1606o1 = C1606o1.this;
                this.f13737a = 1;
                if (c1606o1.A(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.o1$f */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13739a;

        /* renamed from: b, reason: collision with root package name */
        Object f13740b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f13741c;

        /* renamed from: e, reason: collision with root package name */
        int f13743e;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13741c = obj;
            this.f13743e |= Integer.MIN_VALUE;
            return C1606o1.this.A(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.o1$g */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13744a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f13746c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ArrayList arrayList, U5.d dVar) {
            super(2, dVar);
            this.f13746c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f13746c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            V5.b.e();
            if (this.f13744a == 0) {
                Q5.t.b(obj);
                Context requireContext = C1606o1.this.requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                C3775H c3775h = new C3775H(requireContext);
                ArrayList arrayList = new ArrayList();
                if (C1606o1.this.f13722e != null) {
                    ArrayList arrayList2 = C1606o1.this.f13722e;
                    AbstractC3292y.f(arrayList2);
                    Iterator it = arrayList2.iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3292y.h(next, "next(...)");
                        arrayList.add(kotlin.coroutines.jvm.internal.b.c(((c5.P) next).b().b()));
                    }
                }
                if (arrayList.size() <= 0) {
                    C1606o1.this.f13728k = false;
                } else {
                    c5.K j8 = c3775h.j(arrayList, 20, 0);
                    if (!j8.b() && j8.d() != null) {
                        String d8 = j8.d();
                        AbstractC3292y.f(d8);
                        if (d8.length() > 0) {
                            String d9 = j8.d();
                            AbstractC3292y.f(d9);
                            JSONObject jSONObject = new JSONObject(d9);
                            if (!jSONObject.isNull("success")) {
                                i8 = jSONObject.getInt("success");
                            } else {
                                i8 = 0;
                            }
                            if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                                int length = jSONArray.length();
                                for (int i9 = 0; i9 < length; i9++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                                    if (!jSONObject2.isNull("floatingCategory")) {
                                        JSONObject jSONObject3 = jSONObject2.getJSONObject("floatingCategory");
                                        C2046k c2046k = new C2046k(0, null, null, 7, null);
                                        AbstractC3292y.f(jSONObject3);
                                        c2046k.x(jSONObject3);
                                        ArrayList arrayList3 = new ArrayList();
                                        if (!jSONObject2.isNull("apps")) {
                                            JSONArray jSONArray2 = jSONObject2.getJSONArray("apps");
                                            int length2 = jSONArray2.length();
                                            for (int i10 = 0; i10 < length2; i10++) {
                                                C2043h c2043h = new C2043h();
                                                JSONObject jSONObject4 = jSONArray2.getJSONObject(i10);
                                                AbstractC3292y.f(jSONObject4);
                                                c2043h.a(jSONObject4);
                                                arrayList3.add(c2043h);
                                            }
                                        }
                                        c5.P p8 = new c5.P(c2046k, arrayList3, 0, 4, null);
                                        p8.f(5);
                                        ArrayList arrayList4 = C1606o1.this.f13722e;
                                        if (arrayList4 != null) {
                                            kotlin.coroutines.jvm.internal.b.a(arrayList4.add(p8));
                                        }
                                        this.f13746c.add(p8);
                                    }
                                }
                            }
                        }
                    }
                    C1606o1.this.f13728k = false;
                }
                C1606o1.this.f13727j = false;
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.o1$h */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13747a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f13748b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1606o1 f13749c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ArrayList arrayList, C1606o1 c1606o1, U5.d dVar) {
            super(2, dVar);
            this.f13748b = arrayList;
            this.f13749c = c1606o1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f13748b, this.f13749c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13747a == 0) {
                Q5.t.b(obj);
                if (this.f13748b.size() < 4) {
                    this.f13749c.f13728k = false;
                }
                Iterator it = this.f13748b.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    c5.P p8 = (c5.P) next;
                    C1231j c1231j = this.f13749c.f13718a;
                    if (c1231j != null) {
                        c1231j.a(p8);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.o1$i */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13750a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13751b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1606o1 f13752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, C1606o1 c1606o1, U5.d dVar) {
            super(2, dVar);
            this.f13751b = str;
            this.f13752c = c1606o1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(this.f13751b, this.f13752c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1231j c1231j;
            V5.b.e();
            if (this.f13750a == 0) {
                Q5.t.b(obj);
                String str = this.f13751b;
                if (str != null && str.length() != 0 && (c1231j = this.f13752c.f13718a) != null) {
                    String str2 = this.f13751b;
                    RecyclerView recyclerView = this.f13752c.f13725h;
                    AbstractC3292y.f(recyclerView);
                    c1231j.w(str2, recyclerView);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(U5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Z4.C1606o1.f
            if (r0 == 0) goto L13
            r0 = r8
            Z4.o1$f r0 = (Z4.C1606o1.f) r0
            int r1 = r0.f13743e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13743e = r1
            goto L18
        L13:
            Z4.o1$f r0 = new Z4.o1$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f13741c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f13743e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r8)
            goto L7e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r2 = r0.f13740b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r4 = r0.f13739a
            Z4.o1 r4 = (Z4.C1606o1) r4
            Q5.t.b(r8)
            goto L68
        L41:
            Q5.t.b(r8)
            android.content.Context r8 = r7.getContext()
            if (r8 == 0) goto L81
            r7.f13727j = r4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            n6.I r8 = n6.C3445b0.b()
            Z4.o1$g r6 = new Z4.o1$g
            r6.<init>(r2, r5)
            r0.f13739a = r7
            r0.f13740b = r2
            r0.f13743e = r4
            java.lang.Object r8 = n6.AbstractC3458i.g(r8, r6, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r4 = r7
        L68:
            n6.J0 r8 = n6.C3445b0.c()
            Z4.o1$h r6 = new Z4.o1$h
            r6.<init>(r2, r4, r5)
            r0.f13739a = r5
            r0.f13740b = r5
            r0.f13743e = r3
            java.lang.Object r8 = n6.AbstractC3458i.g(r8, r6, r0)
            if (r8 != r1) goto L7e
            return r1
        L7e:
            Q5.I r8 = Q5.I.f8786a
            return r8
        L81:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.C1606o1.A(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        if (this.f13719b.size() > 0) {
            C1231j c1231j = this.f13718a;
            if (c1231j != null) {
                c1231j.q(this.f13719b, this.f13721d, this.f13723f);
            }
            RecyclerView recyclerView = this.f13725h;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f13718a);
            }
        }
        RelativeLayout relativeLayout = this.f13724g;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            if (this.f13726i) {
                this.f13726i = false;
                FragmentActivity activity = getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).H5();
            }
            if (C3797v.f37313a.d()) {
                FragmentActivity activity2 = getActivity();
                AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity2).R5();
            } else {
                FragmentActivity activity3 = getActivity();
                AbstractC3292y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity3).y7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    public final void B() {
        RecyclerView recyclerView = this.f13725h;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    public final void C(String str) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new i(str, this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13726i = true;
        b5.s sVar = this.f13729l;
        a aVar = this.f13730m;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        String simpleName = C1606o1.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        this.f13718a = new C1231j(sVar, aVar, requireContext, simpleName);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.home_fragment, viewGroup, false);
        this.f13724g = (RelativeLayout) inflate.findViewById(R.id.loading_view_home_fragment);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f13725h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        RecyclerView recyclerView2 = this.f13725h;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView3 = this.f13725h;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new s5.p((int) getResources().getDimension(R.dimen.margin_m)));
        }
        RecyclerView recyclerView4 = this.f13725h;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new d());
        }
        y();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        h2.e n8 = UptodownApp.f29249C.n();
        if (n8 != null) {
            n8.pause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        h2.e n8;
        super.onResume();
        new C3795t(getContext()).g("HomeFragment");
        UptodownApp.a aVar = UptodownApp.f29249C;
        h2.e o8 = aVar.o();
        if (o8 != null) {
            o8.pause();
        }
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            if (aVar.f(requireContext)) {
                SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
                Context requireContext2 = requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                if (aVar2.k(requireContext2) > 0 && (n8 = aVar.n()) != null) {
                    n8.play();
                }
            }
        }
    }

    public final void y() {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            new X4.c(requireContext, this.f13731n, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* renamed from: Z4.o1$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC1977a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I c(C1606o1 c1606o1, C2043h c2043h) {
            c1606o1.C(c2043h.v0());
            return Q5.I.f8786a;
        }

        @Override // b5.InterfaceC1977a
        public void a(final C2043h appInfo, int i8) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (C1606o1.this.getActivity() instanceof MainActivity) {
                FragmentActivity activity = C1606o1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                RelativeLayout O52 = ((MainActivity) activity).O5();
                if (O52 == null || O52.getVisibility() != 0) {
                    FragmentActivity activity2 = C1606o1.this.getActivity();
                    AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    final C1606o1 c1606o1 = C1606o1.this;
                    ((MainActivity) activity2).p7(appInfo, new Function0() { // from class: Z4.m1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Q5.I c8;
                            c8 = C1606o1.a.c(C1606o1.this, appInfo);
                            return c8;
                        }
                    });
                    Context requireContext = C1606o1.this.requireContext();
                    AbstractC3292y.h(requireContext, "requireContext(...)");
                    new X4.i(requireContext, appInfo.h(), new C0272a(C1606o1.this), LifecycleOwnerKt.getLifecycleScope(C1606o1.this));
                }
            }
        }

        /* renamed from: Z4.o1$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0272a implements b5.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1606o1 f13733a;

            C0272a(C1606o1 c1606o1) {
                this.f13733a = c1606o1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Q5.I d(C1606o1 c1606o1, C2043h c2043h) {
                c1606o1.C(c2043h.v0());
                return Q5.I.f8786a;
            }

            @Override // b5.r
            public void c(final C2043h appInfo) {
                AbstractC3292y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f13733a.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                final C1606o1 c1606o1 = this.f13733a;
                ((MainActivity) activity).p7(appInfo, new Function0() { // from class: Z4.n1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Q5.I d8;
                        d8 = C1606o1.a.C0272a.d(C1606o1.this, appInfo);
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
