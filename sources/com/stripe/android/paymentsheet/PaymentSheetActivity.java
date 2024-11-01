package com.stripe.android.paymentsheet;

import O3.AbstractActivityC1357e;
import Q5.I;
import Q5.InterfaceC1416k;
import Q5.s;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.A;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.U;
import n6.M;
import o4.AbstractC3539m;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import s4.AbstractC3966h;
import s4.C3965g;
import u2.AbstractC4074a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentSheetActivity extends AbstractActivityC1357e {

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f26787b = new A.d(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f26788c = new ViewModelLazy(U.b(A.class), new b(this), new e(), new c(null, this));

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1416k f26789d = Q5.l.b(new d());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0570a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentSheetActivity f26791a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0571a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f26792a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PaymentSheetActivity f26793b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3965g f26794c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0572a implements InterfaceC3822g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PaymentSheetActivity f26795a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C3965g f26796b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0573a extends kotlin.coroutines.jvm.internal.d {

                        /* renamed from: a, reason: collision with root package name */
                        Object f26797a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f26798b;

                        /* renamed from: d, reason: collision with root package name */
                        int f26800d;

                        C0573a(U5.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f26798b = obj;
                            this.f26800d |= Integer.MIN_VALUE;
                            return C0572a.this.emit(null, this);
                        }
                    }

                    C0572a(PaymentSheetActivity paymentSheetActivity, C3965g c3965g) {
                        this.f26795a = paymentSheetActivity;
                        this.f26796b = c3965g;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // q6.InterfaceC3822g
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(com.stripe.android.paymentsheet.z r5, U5.d r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0570a.C0571a.C0572a.C0573a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a r0 = (com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0570a.C0571a.C0572a.C0573a) r0
                            int r1 = r0.f26800d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f26800d = r1
                            goto L18
                        L13:
                            com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a r0 = new com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f26798b
                            java.lang.Object r1 = V5.b.e()
                            int r2 = r0.f26800d
                            r3 = 1
                            if (r2 == 0) goto L35
                            if (r2 != r3) goto L2d
                            java.lang.Object r5 = r0.f26797a
                            com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a r5 = (com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0570a.C0571a.C0572a) r5
                            Q5.t.b(r6)
                            goto L4b
                        L2d:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L35:
                            Q5.t.b(r6)
                            com.stripe.android.paymentsheet.PaymentSheetActivity r6 = r4.f26795a
                            r6.u(r5)
                            s4.g r5 = r4.f26796b
                            r0.f26797a = r4
                            r0.f26800d = r3
                            java.lang.Object r5 = r5.c(r0)
                            if (r5 != r1) goto L4a
                            return r1
                        L4a:
                            r5 = r4
                        L4b:
                            com.stripe.android.paymentsheet.PaymentSheetActivity r6 = r5.f26795a
                            com.stripe.android.paymentsheet.A r6 = r6.k()
                            E3.b r6 = r6.r()
                            r6.d()
                            com.stripe.android.paymentsheet.PaymentSheetActivity r5 = r5.f26795a
                            r5.finish()
                            Q5.I r5 = Q5.I.f8786a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0570a.C0571a.C0572a.emit(com.stripe.android.paymentsheet.z, U5.d):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0571a(PaymentSheetActivity paymentSheetActivity, C3965g c3965g, U5.d dVar) {
                    super(2, dVar);
                    this.f26793b = paymentSheetActivity;
                    this.f26794c = c3965g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0571a(this.f26793b, this.f26794c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f26792a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            Q5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Q5.t.b(obj);
                        InterfaceC3821f v8 = AbstractC3823h.v(this.f26793b.k().s0());
                        C0572a c0572a = new C0572a(this.f26793b, this.f26794c);
                        this.f26792a = 1;
                        if (v8.collect(c0572a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0571a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$b */
            /* loaded from: classes4.dex */
            public /* synthetic */ class b extends C3289v implements Function0 {
                b(Object obj) {
                    super(0, obj, A.class, "onUserCancel", "onUserCancel()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5493invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5493invoke() {
                    ((A) this.receiver).H();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3293z implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PaymentSheetActivity f26801a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PaymentSheetActivity paymentSheetActivity) {
                    super(2);
                    this.f26801a = paymentSheetActivity;
                }

                @Override // c6.InterfaceC2072n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f8786a;
                }

                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1652456663, i8, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaymentSheetActivity.kt:75)");
                    }
                    com.stripe.android.paymentsheet.ui.b.h(this.f26801a.k(), composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$d */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f26802a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(State state) {
                    super(1);
                    this.f26802a = state;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    AbstractC3292y.i(it, "it");
                    return Boolean.valueOf(!C0570a.b(this.f26802a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0570a(PaymentSheetActivity paymentSheetActivity) {
                super(2);
                this.f26791a = paymentSheetActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean b(State state) {
                return ((Boolean) state.getValue()).booleanValue();
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(952004382, i8, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous>.<anonymous> (PaymentSheetActivity.kt:56)");
                }
                State a9 = A4.f.a(this.f26791a.k().v(), composer, 8);
                composer.startReplaceableGroup(2130490094);
                boolean changed = composer.changed(a9);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new d(a9);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                C3965g b9 = AbstractC3966h.b(null, (Function1) rememberedValue, composer, 0, 1);
                EffectsKt.LaunchedEffect(I.f8786a, new C0571a(this.f26791a, b9, null), composer, 70);
                AbstractC4074a.a(b9, null, new b(this.f26791a.k()), ComposableLambdaKt.composableLambda(composer, 1652456663, true, new c(this.f26791a)), composer, C3965g.f39091e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        a() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(485212172, i8, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous> (PaymentSheetActivity.kt:55)");
            }
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 952004382, true, new C0570a(PaymentSheetActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26803a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f26803a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26803a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26804a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26805b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26804a = function0;
            this.f26805b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26804a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26805b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentSheetContractV2.a invoke() {
            PaymentSheetContractV2.a.C0575a c0575a = PaymentSheetContractV2.a.f26817e;
            Intent intent = PaymentSheetActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            return c0575a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PaymentSheetActivity.this.s();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentSheetContractV2.a invoke() {
            PaymentSheetContractV2.a q8 = PaymentSheetActivity.this.q();
            if (q8 != null) {
                return q8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private final IllegalArgumentException o() {
        return new IllegalArgumentException("PaymentSheet started without arguments.");
    }

    private final void p(Throwable th) {
        if (th == null) {
            th = o();
        }
        u(new z.c(th));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSheetContractV2.a q() {
        return (PaymentSheetContractV2.a) this.f26789d.getValue();
    }

    private final Object t() {
        Object b9;
        PaymentSheetContractV2.a q8 = q();
        if (q8 == null) {
            s.a aVar = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(o()));
        } else {
            try {
                q8.f().a();
                x.b(q8.a());
                x.a(q8.a().h());
                b9 = Q5.s.b(q8);
            } catch (IllegalArgumentException e8) {
                s.a aVar2 = Q5.s.f8810b;
                b9 = Q5.s.b(Q5.t.a(e8));
            }
        }
        m(Q5.s.g(b9));
        return b9;
    }

    @Override // O3.AbstractActivityC1357e, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Object obj;
        Object t8 = t();
        super.onCreate(bundle);
        if (Q5.s.g(t8)) {
            obj = null;
        } else {
            obj = t8;
        }
        if (((PaymentSheetContractV2.a) obj) == null) {
            p(Q5.s.e(t8));
            return;
        }
        k().L0(this, this);
        if (!P3.a.a(this)) {
            k().c().b();
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(485212172, true, new a()), 1, null);
    }

    @Override // O3.AbstractActivityC1357e
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public A k() {
        return (A) this.f26788c.getValue();
    }

    public final ViewModelProvider.Factory s() {
        return this.f26787b;
    }

    public void u(z result) {
        AbstractC3292y.i(result, "result");
        setResult(-1, new Intent().putExtras(new PaymentSheetContractV2.c(result).b()));
    }
}
