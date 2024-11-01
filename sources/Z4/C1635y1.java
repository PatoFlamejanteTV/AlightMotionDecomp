package Z4;

import I4.H;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Z4.C1635y1;
import Z4.F1;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import b5.InterfaceC1980d;
import b5.InterfaceC1981e;
import c5.C2043h;
import c5.C2046k;
import c5.T;
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
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3776a;
import q5.C3784i;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;
import q5.C3797v;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* renamed from: Z4.y1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1635y1 extends Fragment {

    /* renamed from: i, reason: collision with root package name */
    public static final a f13904i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f13905a = Q5.l.b(new Function0() { // from class: Z4.s1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.n0 x8;
            x8 = C1635y1.x(C1635y1.this);
            return x8;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f13906b;

    /* renamed from: c, reason: collision with root package name */
    private C2046k f13907c;

    /* renamed from: d, reason: collision with root package name */
    private String f13908d;

    /* renamed from: e, reason: collision with root package name */
    private I4.H f13909e;

    /* renamed from: f, reason: collision with root package name */
    private m f13910f;

    /* renamed from: g, reason: collision with root package name */
    private l f13911g;

    /* renamed from: h, reason: collision with root package name */
    private final b f13912h;

    /* renamed from: Z4.y1$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1635y1 a(C2046k category) {
            AbstractC3292y.i(category, "category");
            C1635y1 c1635y1 = new C1635y1();
            c1635y1.Q(category);
            return c1635y1;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: Z4.y1$c */
    /* loaded from: classes5.dex */
    public static final class c implements b5.J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2043h f13917b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.r f13918c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13919d;

        c(C2043h c2043h, c5.r rVar, int i8) {
            this.f13917b = c2043h;
            this.f13918c = rVar;
            this.f13919d = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I e(C1635y1 c1635y1, c5.r rVar) {
            c1635y1.F(rVar);
            return Q5.I.f8786a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I f(C1635y1 c1635y1, C2043h c2043h, int i8) {
            c1635y1.y(c2043h, i8);
            return Q5.I.f8786a;
        }

        @Override // b5.J
        public void a() {
            C1635y1.this.F(this.f13918c);
        }

        @Override // b5.J
        public void b(c5.J reportVT) {
            AbstractC3292y.i(reportVT, "reportVT");
            if (C1635y1.this.getActivity() != null && (C1635y1.this.getActivity() instanceof AbstractActivityC2691a) && !C1635y1.this.requireActivity().isFinishing()) {
                this.f13917b.q1(reportVT);
                if (reportVT.h() <= 0) {
                    C1635y1.this.F(this.f13918c);
                    return;
                }
                FragmentActivity activity = C1635y1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                C2043h c2043h = this.f13917b;
                final C1635y1 c1635y1 = C1635y1.this;
                final c5.r rVar = this.f13918c;
                Function0 function0 = new Function0() { // from class: Z4.D1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Q5.I e8;
                        e8 = C1635y1.c.e(C1635y1.this, rVar);
                        return e8;
                    }
                };
                final C1635y1 c1635y12 = C1635y1.this;
                final C2043h c2043h2 = this.f13917b;
                final int i8 = this.f13919d;
                ((AbstractActivityC2691a) activity).g2(c2043h, function0, new Function0() { // from class: Z4.E1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Q5.I f8;
                        f8 = C1635y1.c.f(C1635y1.this, c2043h2, i8);
                        return f8;
                    }
                });
            }
        }
    }

    /* renamed from: Z4.y1$d */
    /* loaded from: classes5.dex */
    public static final class d implements b5.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13921b;

        d(int i8) {
            this.f13921b = i8;
        }

        @Override // b5.r
        public void b(int i8) {
            Toast.makeText(C1635y1.this.requireContext(), C1635y1.this.getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            ArrayList arrayList;
            AbstractC3292y.i(appInfo, "appInfo");
            c5.r rVar = new c5.r();
            rVar.a(appInfo);
            C1635y1.this.z(rVar, appInfo, this.f13921b);
            I4.H h8 = C1635y1.this.f13909e;
            if (h8 != null) {
                arrayList = h8.c();
            } else {
                arrayList = null;
            }
            AbstractC3292y.f(arrayList);
            ((H.b) arrayList.get(this.f13921b)).e(appInfo);
            I4.H h9 = C1635y1.this.f13909e;
            if (h9 != null) {
                h9.notifyItemChanged(this.f13921b);
            }
        }
    }

    /* renamed from: Z4.y1$e */
    /* loaded from: classes5.dex */
    public static final class e extends RecyclerView.OnScrollListener {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3292y.i(recyclerView, "recyclerView");
            if (i9 > 0 && !C1635y1.this.J().h() && recyclerView.getLayoutManager() != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                AbstractC3292y.f(layoutManager);
                int childCount = layoutManager.getChildCount();
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                AbstractC3292y.f(layoutManager2);
                int itemCount = layoutManager2.getItemCount();
                RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                AbstractC3292y.f(layoutManager3);
                int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager3).findFirstVisibleItemPosition();
                if (!C1635y1.this.J().f() && childCount + findFirstVisibleItemPosition >= itemCount - 10) {
                    C1635y1.this.M();
                }
            }
        }
    }

    /* renamed from: Z4.y1$f */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13923a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.y1$f$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1635y1 f13925a;

            a(C1635y1 c1635y1) {
                this.f13925a = c1635y1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                boolean z8;
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f13925a.G().f12866c.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    if (((F1.a) cVar.a()).a()) {
                        if (((F1.a) cVar.a()).b().size() > 0) {
                            this.f13925a.R(((F1.a) cVar.a()).b());
                            this.f13925a.G().f12867d.setVisibility(0);
                            this.f13925a.G().f12869f.setVisibility(8);
                        } else {
                            this.f13925a.G().f12867d.setVisibility(8);
                            this.f13925a.G().f12869f.setVisibility(0);
                        }
                    } else {
                        if (this.f13925a.H().b() != -2 && this.f13925a.H().b() != -3) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        I4.H h8 = this.f13925a.f13909e;
                        if (h8 != null) {
                            h8.a(((F1.a) cVar.a()).b(), z8);
                        }
                    }
                    this.f13925a.J().k(false);
                    this.f13925a.G().f12866c.f12236b.setVisibility(8);
                } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
            }
        }

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
            int i8 = this.f13923a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L g8 = C1635y1.this.J().g();
                a aVar = new a(C1635y1.this);
                this.f13923a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.y1$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f13926a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f13926a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.f13926a;
        }
    }

    /* renamed from: Z4.y1$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f13927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0) {
            super(0);
            this.f13927a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f13927a.invoke();
        }
    }

    /* renamed from: Z4.y1$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f13928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC1416k interfaceC1416k) {
            super(0);
            this.f13928a = interfaceC1416k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStoreOwner m5430viewModels$lambda1;
            m5430viewModels$lambda1 = FragmentViewModelLazyKt.m5430viewModels$lambda1(this.f13928a);
            return m5430viewModels$lambda1.getViewModelStore();
        }
    }

    /* renamed from: Z4.y1$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f13929a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f13930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, InterfaceC1416k interfaceC1416k) {
            super(0);
            this.f13929a = function0;
            this.f13930b = interfaceC1416k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            ViewModelStoreOwner m5430viewModels$lambda1;
            CreationExtras creationExtras;
            Function0 function0 = this.f13929a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            m5430viewModels$lambda1 = FragmentViewModelLazyKt.m5430viewModels$lambda1(this.f13930b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5430viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5430viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* renamed from: Z4.y1$k */
    /* loaded from: classes5.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f13931a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f13932b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment, InterfaceC1416k interfaceC1416k) {
            super(0);
            this.f13931a = fragment;
            this.f13932b = interfaceC1416k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelStoreOwner m5430viewModels$lambda1;
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            m5430viewModels$lambda1 = FragmentViewModelLazyKt.m5430viewModels$lambda1(this.f13932b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5430viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5430viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.f13931a.getDefaultViewModelProviderFactory();
            AbstractC3292y.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* renamed from: Z4.y1$l */
    /* loaded from: classes5.dex */
    public static final class l implements InterfaceC1981e {
        l() {
        }

        @Override // b5.InterfaceC1981e
        public void a(C2043h appInfo, int i8) {
            AbstractC3292y.i(appInfo, "appInfo");
            C1635y1.this.y(appInfo, i8);
        }

        @Override // b5.InterfaceC1981e
        public void b(C2043h appInfo, int i8) {
            boolean z8;
            boolean z9;
            AbstractC3292y.i(appInfo, "appInfo");
            if (C1635y1.this.getContext() != null) {
                C3791p.a aVar = C3791p.f37286s;
                Context context = C1635y1.this.getContext();
                AbstractC3292y.f(context);
                C3791p a9 = aVar.a(context);
                a9.a();
                c5.r Z8 = a9.Z(String.valueOf(appInfo.d0()));
                boolean t8 = new C3784i().t(appInfo.v0(), C1635y1.this.getContext());
                String v02 = appInfo.v0();
                AbstractC3292y.f(v02);
                c5.Q s02 = a9.s0(v02);
                a9.i();
                UptodownApp.a aVar2 = UptodownApp.f29249C;
                Context context2 = C1635y1.this.getContext();
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
                            Context context3 = C1635y1.this.getContext();
                            AbstractC3292y.f(context3);
                            File f8 = c3794s.f(context3);
                            String X8 = Z8.X();
                            AbstractC3292y.f(X8);
                            File file = new File(f8, X8);
                            Context context4 = C1635y1.this.getContext();
                            AbstractC3292y.f(context4);
                            aVar2.X(file, context4, appInfo.r0());
                            return;
                        }
                        Context context5 = C1635y1.this.getContext();
                        AbstractC3292y.f(context5);
                        Z8.n0(context5);
                        I4.H h8 = C1635y1.this.f13909e;
                        if (h8 != null) {
                            h8.notifyItemChanged(i8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!t8) {
                    C1635y1.this.E(appInfo.h(), i8);
                    return;
                }
                if (s02 == null) {
                    C1635y1.this.N(appInfo.v0());
                    return;
                }
                if (s02.u() != 100) {
                    C1635y1.this.E(appInfo.h(), i8);
                    return;
                }
                C3794s c3794s2 = new C3794s();
                Context context6 = C1635y1.this.getContext();
                AbstractC3292y.f(context6);
                File g8 = c3794s2.g(context6);
                String l8 = s02.l();
                AbstractC3292y.f(l8);
                File file2 = new File(g8, l8);
                Context context7 = C1635y1.this.getContext();
                AbstractC3292y.f(context7);
                aVar2.X(file2, context7, appInfo.r0());
            }
        }
    }

    /* renamed from: Z4.y1$m */
    /* loaded from: classes5.dex */
    public static final class m implements InterfaceC1980d {
        m() {
        }

        @Override // b5.InterfaceC1980d
        public void a(C2043h app) {
            AbstractC3292y.i(app, "app");
            if (UptodownApp.f29249C.a0()) {
                if (C1635y1.this.getActivity() != null && (C1635y1.this.getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = C1635y1.this.getActivity();
                    AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).C2(app.h());
                } else if (C1635y1.this.getActivity() != null && (C1635y1.this.getActivity() instanceof AbstractActivityC2691a)) {
                    FragmentActivity activity2 = C1635y1.this.getActivity();
                    AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    ((AbstractActivityC2691a) activity2).C2(app.h());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.y1$n */
    /* loaded from: classes5.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13935a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13936b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1635y1 f13937c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, C1635y1 c1635y1, U5.d dVar) {
            super(2, dVar);
            this.f13936b = str;
            this.f13937c = c1635y1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new n(this.f13936b, this.f13937c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13935a == 0) {
                Q5.t.b(obj);
                String str = this.f13936b;
                if (str != null && str.length() != 0 && this.f13937c.f13909e != null) {
                    I4.H h8 = this.f13937c.f13909e;
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
                                if (AbstractC3292y.d(b10.v0(), this.f13936b)) {
                                    I4.H h9 = this.f13937c.f13909e;
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
            return ((n) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public C1635y1() {
        InterfaceC1416k a9 = Q5.l.a(Q5.o.f8805c, new h(new g(this)));
        this.f13906b = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.U.b(F1.class), new i(a9), new j(null, a9), new k(this, a9));
        this.f13907c = new C2046k(0, null, null, 7, null);
        this.f13910f = new m();
        this.f13911g = new l();
        this.f13912h = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I A(C1635y1 c1635y1, c5.r rVar) {
        c1635y1.F(rVar);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I B(C1635y1 c1635y1, C2043h c2043h, int i8) {
        c1635y1.y(c2043h, i8);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I C(C1635y1 c1635y1, c5.r rVar) {
        c1635y1.F(rVar);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I D(C1635y1 c1635y1, C2043h c2043h, int i8) {
        c1635y1.y(c2043h, i8);
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(long j8, int i8) {
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        new X4.i(requireContext, j8, new d(i8), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(c5.r rVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Y4.n0 G() {
        return (Y4.n0) this.f13905a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F1 J() {
        return (F1) this.f13906b.getValue();
    }

    private final void K() {
        String h8 = this.f13907c.h();
        if (h8 != null && h8.length() != 0) {
            if (this.f13907c.b() >= 0 && !AbstractC3292y.d(this.f13907c.h(), getString(R.string.top_downloads_title))) {
                this.f13908d = getResources().getString(R.string.top_category, this.f13907c.h());
            } else {
                this.f13908d = this.f13907c.h();
            }
        } else {
            this.f13908d = getResources().getString(R.string.top_downloads_title);
        }
        G().f12868e.setVisibility(0);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.vector_arrow_left);
        if (drawable != null) {
            G().f12868e.setNavigationIcon(drawable);
            G().f12868e.setNavigationContentDescription(getString(R.string.back));
        }
        G().f12868e.setNavigationOnClickListener(new View.OnClickListener() { // from class: Z4.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1635y1.L(C1635y1.this, view);
            }
        });
        TextView textView = G().f12870g;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        G().f12870g.setText(this.f13908d);
        G().f12869f.setTypeface(aVar.v());
        G().f12869f.setVisibility(8);
        G().f12867d.setItemAnimator(null);
        G().f12867d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView = G().f12867d;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        recyclerView.addItemDecoration(new s5.s(requireContext, 11));
        if (this.f13907c.b() != -1) {
            RecyclerView recyclerviewTopCat = G().f12867d;
            AbstractC3292y.h(recyclerviewTopCat, "recyclerviewTopCat");
            recyclerviewTopCat.setPadding(0, 0, 0, 0);
        }
        G().f12867d.addOnScrollListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(C1635y1 c1635y1, View view) {
        FragmentActivity activity = c1635y1.getActivity();
        if (activity instanceof MainActivity) {
            if (c1635y1.f13907c.b() == -1) {
                FragmentActivity activity2 = c1635y1.getActivity();
                AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity2).z5(0);
                return;
            } else {
                FragmentActivity activity3 = c1635y1.getActivity();
                AbstractC3292y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity3).Z6();
                return;
            }
        }
        if (activity instanceof AppDetailActivity) {
            FragmentActivity activity4 = c1635y1.getActivity();
            AbstractC3292y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity4).finish();
        } else if (activity instanceof MoreInfo) {
            FragmentActivity activity5 = c1635y1.getActivity();
            AbstractC3292y.g(activity5, "null cannot be cast to non-null type com.uptodown.activities.MoreInfo");
            ((MoreInfo) activity5).finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        if (getContext() != null) {
            F1 J8 = J();
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            J8.e(requireContext, this.f13907c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(String str) {
        Intent launchIntentForPackage;
        if (getActivity() != null && str != null && str.length() != 0 && (launchIntentForPackage = requireActivity().getPackageManager().getLaunchIntentForPackage(str)) != null) {
            startActivity(launchIntentForPackage);
        }
    }

    private final void O() {
        I4.H h8;
        if (this.f13909e != null && G().f12867d.getAdapter() == null) {
            G().f12867d.setAdapter(this.f13909e);
        }
        if (J4.j.f4395g.h() == null && (h8 = this.f13909e) != null) {
            h8.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(ArrayList arrayList) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            c5.P p8 = new c5.P(this.f13907c, arrayList, 0, 4, null);
            m mVar = this.f13910f;
            l lVar = this.f13911g;
            b bVar = this.f13912h;
            String a9 = this.f13907c.a();
            String string = getString(R.string.read_more_desc_app_detail);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = getString(R.string.read_less_desc_app_detail);
            AbstractC3292y.h(string2, "getString(...)");
            this.f13909e = new I4.H(mVar, lVar, bVar, a9, null, string, string2);
            float dimension = getResources().getDimension(R.dimen.margin_xl);
            I4.H h8 = this.f13909e;
            if (h8 != null) {
                h8.b(p8, (int) dimension);
            }
            G().f12867d.setAdapter(this.f13909e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.n0 x(C1635y1 c1635y1) {
        return Y4.n0.c(c1635y1.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(C2043h c2043h, int i8) {
        if (getContext() != null) {
            C3791p.a aVar = C3791p.f37286s;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C3791p a9 = aVar.a(requireContext);
            a9.a();
            c5.r Z8 = a9.Z(String.valueOf(c2043h.d0()));
            String v02 = c2043h.v0();
            AbstractC3292y.f(v02);
            c5.Q s02 = a9.s0(v02);
            a9.i();
            if (Z8 != null) {
                DownloadApkWorker.f31190k.a(c2043h.h());
                C3776a c3776a = new C3776a();
                Context requireContext2 = requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                c3776a.a(requireContext2, Z8.X());
                Context requireContext3 = requireContext();
                AbstractC3292y.h(requireContext3, "requireContext(...)");
                Z8.n0(requireContext3);
                I4.H h8 = this.f13909e;
                if (h8 != null) {
                    h8.notifyItemChanged(i8);
                }
                if (getActivity() != null && (getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = getActivity();
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
                Context requireContext4 = requireContext();
                AbstractC3292y.h(requireContext4, "requireContext(...)");
                aVar2.c0(s8, requireContext4);
                String l8 = s02.l();
                if (l8 != null && l8.length() != 0) {
                    C3794s c3794s = new C3794s();
                    Context requireContext5 = requireContext();
                    AbstractC3292y.h(requireContext5, "requireContext(...)");
                    File g8 = c3794s.g(requireContext5);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(final c5.r rVar, final C2043h c2043h, final int i8) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            T.b bVar = c5.T.f15689k;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            c5.T e8 = bVar.e(requireActivity);
            if (e8 != null && e8.y()) {
                if (c2043h.h1()) {
                    FragmentActivity activity = getActivity();
                    AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    ((AbstractActivityC2691a) activity).g2(c2043h, new Function0() { // from class: Z4.u1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Q5.I A8;
                            A8 = C1635y1.A(C1635y1.this, rVar);
                            return A8;
                        }
                    }, new Function0() { // from class: Z4.v1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Q5.I B8;
                            B8 = C1635y1.B(C1635y1.this, c2043h, i8);
                            return B8;
                        }
                    });
                    Q5.I i9 = Q5.I.f8786a;
                    return;
                }
                if (c2043h.J0() == null) {
                    FragmentActivity requireActivity2 = requireActivity();
                    AbstractC3292y.h(requireActivity2, "requireActivity(...)");
                    new X4.m(requireActivity2, String.valueOf(c2043h.d0()), c2043h.M0(), new c(c2043h, rVar, i8), LifecycleOwnerKt.getLifecycleScope(this));
                    return;
                }
                c5.J J02 = c2043h.J0();
                AbstractC3292y.f(J02);
                if (J02.h() > 0) {
                    FragmentActivity activity2 = getActivity();
                    AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    ((AbstractActivityC2691a) activity2).g2(c2043h, new Function0() { // from class: Z4.w1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Q5.I C8;
                            C8 = C1635y1.C(C1635y1.this, rVar);
                            return C8;
                        }
                    }, new Function0() { // from class: Z4.x1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Q5.I D8;
                            D8 = C1635y1.D(C1635y1.this, c2043h, i8);
                            return D8;
                        }
                    });
                } else {
                    F(rVar);
                }
                Q5.I i10 = Q5.I.f8786a;
                return;
            }
            F(rVar);
            Q5.I i11 = Q5.I.f8786a;
        }
    }

    public final C2046k H() {
        return this.f13907c;
    }

    public final void I() {
        if (getContext() != null) {
            F1 J8 = J();
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            J8.d(requireContext, this.f13907c);
        }
    }

    public final void P() {
        G().f12867d.smoothScrollToPosition(0);
    }

    public final void Q(C2046k c2046k) {
        AbstractC3292y.i(c2046k, "<set-?>");
        this.f13907c = c2046k;
    }

    public final void S(String str) {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new n(str, this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C2046k c2046k;
        Object parcelable;
        super.onCreate(bundle);
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = bundle.getParcelable("category", C2046k.class);
                c2046k = (C2046k) parcelable;
            } else {
                c2046k = (C2046k) bundle.getParcelable("category");
            }
            if (c2046k != null) {
                this.f13907c = c2046k;
            }
        }
        if (this.f13907c.b() != 0 && this.f13907c.b() >= -3) {
            I();
        } else if (this.f13907c.b() == 0) {
            this.f13907c.Q(-1);
            I();
        }
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new f(null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        K();
        RelativeLayout root = G().getRoot();
        AbstractC3292y.h(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        new C3795t(getContext()).g("TopByCategoryFragment");
        O();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        AbstractC3292y.i(outState, "outState");
        outState.putParcelable("category", this.f13907c);
        super.onSaveInstanceState(outState);
    }

    /* renamed from: Z4.y1$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC1977a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I d(C2043h c2043h, C1635y1 c1635y1) {
            if (c2043h.v0() != null) {
                String v02 = c2043h.v0();
                AbstractC3292y.f(v02);
                c1635y1.S(v02);
            }
            return Q5.I.f8786a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q5.I e(C2043h c2043h, C1635y1 c1635y1) {
            if (c2043h.v0() != null) {
                String v02 = c2043h.v0();
                AbstractC3292y.f(v02);
                c1635y1.S(v02);
            }
            return Q5.I.f8786a;
        }

        @Override // b5.InterfaceC1977a
        public void a(final C2043h appInfo, int i8) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (C1635y1.this.getActivity() instanceof MainActivity) {
                FragmentActivity activity = C1635y1.this.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                RelativeLayout O52 = ((MainActivity) activity).O5();
                if (O52 == null || O52.getVisibility() != 0) {
                    FragmentActivity activity2 = C1635y1.this.getActivity();
                    AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    final C1635y1 c1635y1 = C1635y1.this;
                    ((MainActivity) activity2).p7(appInfo, new Function0() { // from class: Z4.z1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Q5.I d8;
                            d8 = C1635y1.b.d(C2043h.this, c1635y1);
                            return d8;
                        }
                    });
                    Context requireContext = C1635y1.this.requireContext();
                    AbstractC3292y.h(requireContext, "requireContext(...)");
                    new X4.i(requireContext, appInfo.h(), new a(C1635y1.this), LifecycleOwnerKt.getLifecycleScope(C1635y1.this));
                    return;
                }
            }
            if (C1635y1.this.getActivity() instanceof AppDetailActivity) {
                FragmentActivity activity3 = C1635y1.this.getActivity();
                AbstractC3292y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                ((AppDetailActivity) activity3).s3(C1635y1.this.G().f12865b.getRoot());
                FragmentActivity activity4 = C1635y1.this.getActivity();
                AbstractC3292y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                final C1635y1 c1635y12 = C1635y1.this;
                ((AppDetailActivity) activity4).t3(appInfo, new Function0() { // from class: Z4.A1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Q5.I e8;
                        e8 = C1635y1.b.e(C2043h.this, c1635y12);
                        return e8;
                    }
                });
                Context requireContext2 = C1635y1.this.requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                new X4.i(requireContext2, appInfo.h(), new C0275b(C1635y1.this), LifecycleOwnerKt.getLifecycleScope(C1635y1.this));
            }
        }

        /* renamed from: Z4.y1$b$a */
        /* loaded from: classes5.dex */
        public static final class a implements b5.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1635y1 f13914a;

            a(C1635y1 c1635y1) {
                this.f13914a = c1635y1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Q5.I d(C1635y1 c1635y1, C2043h c2043h) {
                c1635y1.S(c2043h.v0());
                return Q5.I.f8786a;
            }

            @Override // b5.r
            public void c(final C2043h appInfo) {
                AbstractC3292y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f13914a.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                final C1635y1 c1635y1 = this.f13914a;
                ((MainActivity) activity).p7(appInfo, new Function0() { // from class: Z4.B1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Q5.I d8;
                        d8 = C1635y1.b.a.d(C1635y1.this, appInfo);
                        return d8;
                    }
                });
            }

            @Override // b5.r
            public void b(int i8) {
            }
        }

        /* renamed from: Z4.y1$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0275b implements b5.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1635y1 f13915a;

            C0275b(C1635y1 c1635y1) {
                this.f13915a = c1635y1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Q5.I d(C1635y1 c1635y1, C2043h c2043h) {
                c1635y1.S(c2043h.v0());
                return Q5.I.f8786a;
            }

            @Override // b5.r
            public void c(final C2043h appInfo) {
                AbstractC3292y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f13915a.getActivity();
                AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                final C1635y1 c1635y1 = this.f13915a;
                ((AppDetailActivity) activity).t3(appInfo, new Function0() { // from class: Z4.C1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Q5.I d8;
                        d8 = C1635y1.b.C0275b.d(C1635y1.this, appInfo);
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
