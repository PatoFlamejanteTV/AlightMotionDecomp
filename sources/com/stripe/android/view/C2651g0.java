package com.stripe.android.view;

import B2.j;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import g3.C2903b;
import j6.InterfaceC3214c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;

/* renamed from: com.stripe.android.view.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2651g0 extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final String f28964a;

    /* renamed from: b, reason: collision with root package name */
    private final j3.m f28965b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f28966c;

    /* renamed from: d, reason: collision with root package name */
    private final q6.w f28967d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f28968e;

    /* renamed from: com.stripe.android.view.g0$a */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f28969a;

        /* renamed from: b, reason: collision with root package name */
        int f28970b;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            q6.w wVar;
            Object obj2;
            Object e8 = V5.b.e();
            int i8 = this.f28970b;
            if (i8 != 0) {
                if (i8 == 1) {
                    wVar = (q6.w) this.f28969a;
                    Q5.t.b(obj);
                    obj2 = ((Q5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                q6.w wVar2 = C2651g0.this.f28967d;
                j3.m mVar = C2651g0.this.f28965b;
                j.c cVar = new j.c(C2651g0.this.f28964a, null, null, 6, null);
                this.f28969a = wVar2;
                this.f28970b = 1;
                Object z8 = mVar.z(cVar, this);
                if (z8 == e8) {
                    return e8;
                }
                wVar = wVar2;
                obj2 = z8;
            }
            if (Q5.s.e(obj2) != null) {
                obj2 = new C2903b(null, 1, null);
            }
            wVar.setValue(obj2);
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.stripe.android.view.g0$b */
    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Application f28972a;

        /* renamed from: com.stripe.android.view.g0$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f28973a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f28973a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f28973a;
            }
        }

        public b(Application application) {
            AbstractC3292y.i(application, "application");
            this.f28972a = application;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            String f8 = n2.r.f35413c.a(this.f28972a).f();
            return new C2651g0(this.f28972a, f8, new com.stripe.android.networking.a(this.f28972a, new a(f8), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2651g0(Application application, String publishableKey, j3.m stripeRepository) {
        super(application);
        AbstractC3292y.i(application, "application");
        AbstractC3292y.i(publishableKey, "publishableKey");
        AbstractC3292y.i(stripeRepository, "stripeRepository");
        this.f28964a = publishableKey;
        this.f28965b = stripeRepository;
        q6.w a9 = AbstractC3815N.a(null);
        this.f28967d = a9;
        this.f28968e = AbstractC3823h.b(a9);
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    public final InterfaceC3813L d() {
        return this.f28968e;
    }

    public final Integer e() {
        return this.f28966c;
    }

    public final void f(Integer num) {
        this.f28966c = num;
    }
}
