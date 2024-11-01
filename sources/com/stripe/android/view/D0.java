package com.stripe.android.view;

import R5.AbstractC1435t;
import android.app.Application;
import android.content.res.Resources;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.model.o;
import j6.InterfaceC3214c;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;
import n2.AbstractC3403f;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import o2.C3525g;
import o2.InterfaceC3521c;
import q6.AbstractC3815N;

/* loaded from: classes4.dex */
public final class D0 extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28597a;

    /* renamed from: b, reason: collision with root package name */
    private String f28598b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28599c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3521c f28600d;

    /* renamed from: e, reason: collision with root package name */
    private final Resources f28601e;

    /* renamed from: f, reason: collision with root package name */
    private final C2681z f28602f;

    /* renamed from: g, reason: collision with root package name */
    private volatile InterfaceC3488x0 f28603g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f28604h;

    /* renamed from: i, reason: collision with root package name */
    private final q6.w f28605i;

    /* renamed from: j, reason: collision with root package name */
    private final q6.w f28606j;

    /* renamed from: k, reason: collision with root package name */
    private final q6.w f28607k;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Application f28608a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f28609b;

        /* renamed from: c, reason: collision with root package name */
        private final String f28610c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f28611d;

        public a(Application application, Object obj, String str, boolean z8) {
            AbstractC3292y.i(application, "application");
            this.f28608a = application;
            this.f28609b = obj;
            this.f28610c = str;
            this.f28611d = z8;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            return new D0(this.f28608a, SavedStateHandleSupport.createSavedStateHandle(extras), this.f28609b, this.f28610c, this.f28611d, null, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28612a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28614c;

        /* loaded from: classes4.dex */
        public static final class a implements AbstractC3403f.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f28615a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ D0 f28616b;

            a(boolean z8, D0 d02) {
                this.f28615a = z8;
                this.f28616b = d02;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, U5.d dVar) {
            super(2, dVar);
            this.f28614c = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f28614c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f28612a == 0) {
                Q5.t.b(obj);
                D0.this.f().setValue(kotlin.coroutines.jvm.internal.b.a(true));
                Object obj2 = D0.this.f28597a;
                D0 d02 = D0.this;
                boolean z8 = this.f28614c;
                Throwable e8 = Q5.s.e(obj2);
                if (e8 == null) {
                    android.support.v4.media.a.a(obj2);
                    AbstractC3403f.b(null, o.p.f25755i, null, null, null, d02.e(), new a(z8, d02), 14, null);
                } else {
                    d02.d().setValue(Q5.s.a(Q5.s.b(Q5.t.a(e8))));
                    d02.f().setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ D0(android.app.Application r8, androidx.lifecycle.SavedStateHandle r9, java.lang.Object r10, java.lang.String r11, boolean r12, o2.InterfaceC3521c r13, int r14, kotlin.jvm.internal.AbstractC3284p r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L5
            r11 = 0
        L5:
            r4 = r11
            r11 = r14 & 32
            if (r11 == 0) goto L19
            o2.d r11 = o2.C3522d.f35921a
            android.content.Context r13 = r8.getApplicationContext()
            java.lang.String r14 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r13, r14)
            o2.c r13 = r11.a(r13)
        L19:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.D0.<init>(android.app.Application, androidx.lifecycle.SavedStateHandle, java.lang.Object, java.lang.String, boolean, o2.c, int, kotlin.jvm.internal.p):void");
    }

    private final String b(com.stripe.android.model.o oVar, int i8) {
        o.g gVar = oVar.f25638h;
        if (gVar != null) {
            return this.f28601e.getString(i8, this.f28602f.b(gVar));
        }
        return null;
    }

    private final void c(boolean z8) {
        InterfaceC3488x0 d8;
        InterfaceC3488x0 interfaceC3488x0 = this.f28603g;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        if (z8) {
            this.f28600d.c();
        }
        d8 = AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new b(z8, null), 3, null);
        this.f28603g = d8;
    }

    public final q6.w d() {
        return this.f28605i;
    }

    public final Set e() {
        return this.f28604h;
    }

    public final q6.w f() {
        return this.f28607k;
    }

    public final String g() {
        return this.f28598b;
    }

    public final q6.w h() {
        return this.f28606j;
    }

    public final void i(com.stripe.android.model.o paymentMethod) {
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        String b9 = b(paymentMethod, AbstractC3394E.f35230f);
        if (b9 != null) {
            this.f28606j.setValue(b9);
            this.f28606j.setValue(null);
        }
        c(false);
    }

    public final void j(com.stripe.android.model.o paymentMethod) {
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        String b9 = b(paymentMethod, AbstractC3394E.f35193G0);
        if (b9 != null) {
            this.f28606j.setValue(b9);
            this.f28606j.setValue(null);
        }
    }

    public final void k(String str) {
        this.f28598b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(Application application, SavedStateHandle savedStateHandle, Object obj, String str, boolean z8, InterfaceC3521c eventReporter) {
        super(application);
        AbstractC3292y.i(application, "application");
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(eventReporter, "eventReporter");
        this.f28597a = obj;
        this.f28598b = str;
        this.f28599c = z8;
        this.f28600d = eventReporter;
        this.f28601e = application.getResources();
        this.f28602f = new C2681z(application);
        this.f28604h = AbstractC1435t.b1(AbstractC1435t.r(z8 ? "PaymentSession" : null, "PaymentMethodsActivity"));
        this.f28605i = AbstractC3815N.a(null);
        this.f28606j = AbstractC3815N.a(null);
        this.f28607k = AbstractC3815N.a(Boolean.FALSE);
        C3525g.f35925a.c(this, savedStateHandle);
        c(true);
    }
}
