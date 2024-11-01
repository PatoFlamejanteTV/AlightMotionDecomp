package com.stripe.android.paymentsheet;

import O3.AbstractActivityC1357e;
import Q5.I;
import Q5.InterfaceC1416k;
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
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.v;
import com.stripe.android.paymentsheet.w;
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
public final class PaymentOptionsActivity extends AbstractActivityC1357e {

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f26765b = new v.b(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f26766c = new ViewModelLazy(U.b(v.class), new b(this), new e(), new c(null, this));

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1416k f26767d = Q5.l.b(new d());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0566a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentOptionsActivity f26769a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0567a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f26770a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PaymentOptionsActivity f26771b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3965g f26772c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0568a implements InterfaceC3822g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PaymentOptionsActivity f26773a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C3965g f26774b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0569a extends kotlin.coroutines.jvm.internal.d {

                        /* renamed from: a, reason: collision with root package name */
                        Object f26775a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f26776b;

                        /* renamed from: d, reason: collision with root package name */
                        int f26778d;

                        C0569a(U5.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f26776b = obj;
                            this.f26778d |= Integer.MIN_VALUE;
                            return C0568a.this.emit(null, this);
                        }
                    }

                    C0568a(PaymentOptionsActivity paymentOptionsActivity, C3965g c3965g) {
                        this.f26773a = paymentOptionsActivity;
                        this.f26774b = c3965g;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // q6.InterfaceC3822g
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(com.stripe.android.paymentsheet.q r5, U5.d r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0566a.C0567a.C0568a.C0569a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a r0 = (com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0566a.C0567a.C0568a.C0569a) r0
                            int r1 = r0.f26778d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f26778d = r1
                            goto L18
                        L13:
                            com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a r0 = new com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f26776b
                            java.lang.Object r1 = V5.b.e()
                            int r2 = r0.f26778d
                            r3 = 1
                            if (r2 == 0) goto L35
                            if (r2 != r3) goto L2d
                            java.lang.Object r5 = r0.f26775a
                            com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$a$a r5 = (com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0566a.C0567a.C0568a) r5
                            Q5.t.b(r6)
                            goto L4b
                        L2d:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L35:
                            Q5.t.b(r6)
                            com.stripe.android.paymentsheet.PaymentOptionsActivity r6 = r4.f26773a
                            r6.s(r5)
                            s4.g r5 = r4.f26774b
                            r0.f26775a = r4
                            r0.f26778d = r3
                            java.lang.Object r5 = r5.c(r0)
                            if (r5 != r1) goto L4a
                            return r1
                        L4a:
                            r5 = r4
                        L4b:
                            com.stripe.android.paymentsheet.PaymentOptionsActivity r6 = r5.f26773a
                            com.stripe.android.paymentsheet.v r6 = r6.k()
                            E3.b r6 = r6.r()
                            r6.d()
                            com.stripe.android.paymentsheet.PaymentOptionsActivity r5 = r5.f26773a
                            r5.finish()
                            Q5.I r5 = Q5.I.f8786a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsActivity.a.C0566a.C0567a.C0568a.emit(com.stripe.android.paymentsheet.q, U5.d):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0567a(PaymentOptionsActivity paymentOptionsActivity, C3965g c3965g, U5.d dVar) {
                    super(2, dVar);
                    this.f26771b = paymentOptionsActivity;
                    this.f26772c = c3965g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0567a(this.f26771b, this.f26772c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f26770a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            Q5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Q5.t.b(obj);
                        InterfaceC3821f v8 = AbstractC3823h.v(this.f26771b.k().R());
                        C0568a c0568a = new C0568a(this.f26771b, this.f26772c);
                        this.f26770a = 1;
                        if (v8.collect(c0568a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0567a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$b */
            /* loaded from: classes4.dex */
            public /* synthetic */ class b extends C3289v implements Function0 {
                b(Object obj) {
                    super(0, obj, v.class, "onUserCancel", "onUserCancel()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5492invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5492invoke() {
                    ((v) this.receiver).H();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3293z implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PaymentOptionsActivity f26779a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PaymentOptionsActivity paymentOptionsActivity) {
                    super(2);
                    this.f26779a = paymentOptionsActivity;
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
                        ComposerKt.traceEventStart(713072409, i8, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:71)");
                    }
                    com.stripe.android.paymentsheet.ui.b.g(this.f26779a.k(), composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsActivity$a$a$d */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f26780a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(State state) {
                    super(1);
                    this.f26780a = state;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    AbstractC3292y.i(it, "it");
                    return Boolean.valueOf(!C0566a.b(this.f26780a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0566a(PaymentOptionsActivity paymentOptionsActivity) {
                super(2);
                this.f26769a = paymentOptionsActivity;
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
                    ComposerKt.traceEventStart(526390752, i8, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous>.<anonymous> (PaymentOptionsActivity.kt:52)");
                }
                State a9 = A4.f.a(this.f26769a.k().v(), composer, 8);
                composer.startReplaceableGroup(1788261935);
                boolean changed = composer.changed(a9);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new d(a9);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                C3965g b9 = AbstractC3966h.b(null, (Function1) rememberedValue, composer, 0, 1);
                EffectsKt.LaunchedEffect(I.f8786a, new C0567a(this.f26769a, b9, null), composer, 70);
                AbstractC4074a.a(b9, null, new b(this.f26769a.k()), ComposableLambdaKt.composableLambda(composer, 713072409, true, new c(this.f26769a)), composer, C3965g.f39091e | 3072, 2);
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
                ComposerKt.traceEventStart(-1719713842, i8, -1, "com.stripe.android.paymentsheet.PaymentOptionsActivity.onCreate.<anonymous> (PaymentOptionsActivity.kt:51)");
            }
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 526390752, true, new C0566a(PaymentOptionsActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26781a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f26781a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26781a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26782a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26783b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26782a = function0;
            this.f26783b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26782a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26783b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentOptionContract.a invoke() {
            PaymentOptionContract.a.C0565a c0565a = PaymentOptionContract.a.f26759e;
            Intent intent = PaymentOptionsActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            return c0565a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PaymentOptionsActivity.this.q();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentOptionContract.a invoke() {
            PaymentOptionContract.a o8 = PaymentOptionsActivity.this.o();
            if (o8 != null) {
                return o8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentOptionContract.a o() {
        return (PaymentOptionContract.a) this.f26767d.getValue();
    }

    private final PaymentOptionContract.a r() {
        boolean z8;
        N3.l b9;
        w.g a9;
        w.b h8;
        PaymentOptionContract.a o8 = o();
        if (o8 != null && (b9 = o8.b()) != null && (a9 = b9.a()) != null && (h8 = a9.h()) != null) {
            x.a(h8);
        }
        if (o() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        m(z8);
        return o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O3.AbstractActivityC1357e, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        PaymentOptionContract.a r8 = r();
        super.onCreate(bundle);
        if (r8 == null) {
            finish();
            return;
        }
        if (!P3.a.a(this)) {
            k().c().b();
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1719713842, true, new a()), 1, null);
    }

    @Override // O3.AbstractActivityC1357e
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public v k() {
        return (v) this.f26766c.getValue();
    }

    public final ViewModelProvider.Factory q() {
        return this.f26765b;
    }

    public void s(q result) {
        AbstractC3292y.i(result, "result");
        setResult(result.a(), new Intent().putExtras(result.b()));
    }
}
