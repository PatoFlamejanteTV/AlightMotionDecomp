package com.stripe.android.view;

import Q5.C1413h;
import Q5.InterfaceC1412g;
import Q5.InterfaceC1416k;
import R5.AbstractC1435t;
import android.app.Application;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c6.InterfaceC2072n;
import com.stripe.android.model.p;
import com.stripe.android.view.C2651g0;
import g3.C2903b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3269a;
import kotlin.jvm.internal.InterfaceC3286s;
import n2.AbstractC3390A;
import n6.AbstractC3462k;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* renamed from: com.stripe.android.view.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2650g extends AbstractC2658k {

    /* renamed from: d, reason: collision with root package name */
    public static final b f28954d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f28955e = 8;

    /* renamed from: a, reason: collision with root package name */
    private C2903b f28956a;

    /* renamed from: b, reason: collision with root package name */
    private final C2654i f28957b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f28958c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28959a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.view.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0690a implements InterfaceC3822g, InterfaceC3286s {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2650g f28961a;

            C0690a(C2650g c2650g) {
                this.f28961a = c2650g;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C2903b c2903b, U5.d dVar) {
                Object j8 = a.j(this.f28961a, c2903b, dVar);
                if (j8 == V5.b.e()) {
                    return j8;
                }
                return Q5.I.f8786a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC3822g) && (obj instanceof InterfaceC3286s)) {
                    return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC3286s
            public final InterfaceC1412g getFunctionDelegate() {
                return new C3269a(2, this.f28961a, C2650g.class, "onFpxBankStatusesUpdated", "onFpxBankStatusesUpdated(Lcom/stripe/android/model/BankStatuses;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        a(U5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object j(C2650g c2650g, C2903b c2903b, U5.d dVar) {
            c2650g.d(c2903b);
            return Q5.I.f8786a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f28959a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L d8 = C2650g.this.getViewModel().d();
                C0690a c0690a = new C0690a(C2650g.this);
                this.f28959a = 1;
                if (d8.collect(c0690a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.stripe.android.view.g$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ C2650g a(FragmentActivity activity) {
            AbstractC3292y.i(activity, "activity");
            return new C2650g(activity, null, 0, 6, null);
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.g$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(int i8) {
            C2650g.this.getViewModel().f(Integer.valueOf(i8));
        }
    }

    /* renamed from: com.stripe.android.view.g$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f28963a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FragmentActivity fragmentActivity) {
            super(0);
            this.f28963a = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2651g0 invoke() {
            FragmentActivity fragmentActivity = this.f28963a;
            Application application = this.f28963a.getApplication();
            AbstractC3292y.h(application, "getApplication(...)");
            return (C2651g0) new ViewModelProvider(fragmentActivity, new C2651g0.b(application)).get(C2651g0.class);
        }
    }

    public /* synthetic */ C2650g(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(fragmentActivity, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    private final EnumC2649f0 c(int i8) {
        return (EnumC2649f0) EnumC2649f0.e().get(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(C2903b c2903b) {
        if (c2903b != null) {
            e(c2903b);
        }
    }

    private final void e(C2903b c2903b) {
        this.f28956a = c2903b;
        this.f28957b.e(c2903b);
        i6.i n8 = AbstractC1435t.n(EnumC2649f0.e());
        ArrayList arrayList = new ArrayList();
        for (Object obj : n8) {
            if (!c2903b.a(c(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f28957b.c(((Number) it.next()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2651g0 getViewModel() {
        return (C2651g0) this.f28958c.getValue();
    }

    @Override // com.stripe.android.view.AbstractC2658k
    public com.stripe.android.model.p getCreateParams() {
        Integer valueOf = Integer.valueOf(this.f28957b.b());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return p.e.f(com.stripe.android.model.p.f25804u, new p.g(((EnumC2649f0) EnumC2649f0.e().get(valueOf.intValue())).d()), null, null, null, 14, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2650g(FragmentActivity activity, AttributeSet attributeSet, int i8) {
        super(activity, attributeSet, i8);
        AbstractC3292y.i(activity, "activity");
        this.f28956a = new C2903b(null, 1, null);
        C2654i c2654i = new C2654i(new S0(activity), EnumC2649f0.e(), new c());
        this.f28957b = c2654i;
        this.f28958c = Q5.l.b(new d(activity));
        L2.h c8 = L2.h.c(activity.getLayoutInflater(), this, true);
        AbstractC3292y.h(c8, "inflate(...)");
        setId(AbstractC3390A.f35108T);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new a(null), 3, null);
        RecyclerView recyclerView = c8.f5321b;
        recyclerView.setAdapter(c2654i);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Integer e8 = getViewModel().e();
        if (e8 != null) {
            c2654i.g(e8.intValue());
        }
    }
}
