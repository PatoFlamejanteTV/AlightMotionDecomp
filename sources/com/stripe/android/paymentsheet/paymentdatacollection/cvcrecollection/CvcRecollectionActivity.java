package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import J3.f;
import Q5.I;
import Q5.InterfaceC1416k;
import Q5.l;
import Q5.t;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
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
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d;
import com.stripe.android.paymentsheet.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.U;
import n6.M;
import o4.AbstractC3539m;
import q6.AbstractC3823h;
import q6.InterfaceC3802A;
import s4.AbstractC3966h;
import s4.C3965g;
import u2.AbstractC4074a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CvcRecollectionActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f27482a = l.b(new a());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f27483b = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d.class), new c(this), new e(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CvcRecollectionContract.a invoke() {
            CvcRecollectionContract.a.C0631a c0631a = CvcRecollectionContract.a.f27502e;
            Intent intent = CvcRecollectionActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            CvcRecollectionContract.a a9 = c0631a.a(intent);
            if (a9 != null) {
                return a9;
            }
            throw new IllegalStateException("Cannot start CVC Recollection flow without args");
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CvcRecollectionActivity f27486a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0627a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f27487a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CvcRecollectionActivity f27488b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3965g f27489c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0628a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                    /* renamed from: a, reason: collision with root package name */
                    int f27490a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f27491b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ CvcRecollectionActivity f27492c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C3965g f27493d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0628a(CvcRecollectionActivity cvcRecollectionActivity, C3965g c3965g, U5.d dVar) {
                        super(2, dVar);
                        this.f27492c = cvcRecollectionActivity;
                        this.f27493d = c3965g;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final U5.d create(Object obj, U5.d dVar) {
                        C0628a c0628a = new C0628a(this.f27492c, this.f27493d, dVar);
                        c0628a.f27491b = obj;
                        return c0628a;
                    }

                    @Override // c6.InterfaceC2072n
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a aVar, U5.d dVar) {
                        return ((C0628a) create(aVar, dVar)).invokeSuspend(I.f8786a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object e8 = V5.b.e();
                        int i8 = this.f27490a;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a aVar = (com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a) this.f27491b;
                            CvcRecollectionActivity cvcRecollectionActivity = this.f27492c;
                            a.b bVar = com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a.f27507k0;
                            Intent intent = cvcRecollectionActivity.getIntent();
                            AbstractC3292y.h(intent, "getIntent(...)");
                            cvcRecollectionActivity.setResult(-1, bVar.b(intent, aVar));
                            C3965g c3965g = this.f27493d;
                            this.f27490a = 1;
                            if (c3965g.c(this) == e8) {
                                return e8;
                            }
                        }
                        this.f27492c.finish();
                        return I.f8786a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0627a(CvcRecollectionActivity cvcRecollectionActivity, C3965g c3965g, U5.d dVar) {
                    super(2, dVar);
                    this.f27488b = cvcRecollectionActivity;
                    this.f27489c = c3965g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0627a(this.f27488b, this.f27489c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f27487a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3802A b9 = this.f27488b.n().b();
                        C0628a c0628a = new C0628a(this.f27488b, this.f27489c, null);
                        this.f27487a = 1;
                        if (AbstractC3823h.j(b9, c0628a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0627a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0629b extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CvcRecollectionActivity f27494a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0629b(CvcRecollectionActivity cvcRecollectionActivity) {
                    super(0);
                    this.f27494a = cvcRecollectionActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5509invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5509invoke() {
                    this.f27494a.n().d(c.a.f27552a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3293z implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f27495a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CvcRecollectionActivity f27496b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class C0630a extends C3289v implements Function1 {
                    C0630a(Object obj) {
                        super(1, obj, com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewAction;)V", 0);
                    }

                    public final void d(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c p02) {
                        AbstractC3292y.i(p02, "p0");
                        ((com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d) this.receiver).d(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        d((com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c) obj);
                        return I.f8786a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(State state, CvcRecollectionActivity cvcRecollectionActivity) {
                    super(2);
                    this.f27495a = state;
                    this.f27496b = cvcRecollectionActivity;
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
                        ComposerKt.traceEventStart(-943727818, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionActivity.kt:55)");
                    }
                    com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.e(((f) this.f27495a.getValue()).d(), ((f) this.f27495a.getValue()).f(), ((f) this.f27495a.getValue()).c(), new C0630a(this.f27496b.n()), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CvcRecollectionActivity cvcRecollectionActivity) {
                super(2);
                this.f27486a = cvcRecollectionActivity;
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
                    ComposerKt.traceEventStart(1441971965, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous>.<anonymous> (CvcRecollectionActivity.kt:35)");
                }
                C3965g b9 = AbstractC3966h.b(null, null, composer, 0, 3);
                State a9 = A4.f.a(this.f27486a.n().c(), composer, 8);
                C0627a c0627a = new C0627a(this.f27486a, b9, null);
                int i9 = C3965g.f39091e;
                EffectsKt.LaunchedEffect(b9, c0627a, composer, i9 | 64);
                AbstractC4074a.a(b9, null, new C0629b(this.f27486a), ComposableLambdaKt.composableLambda(composer, -943727818, true, new c(a9, this.f27486a)), composer, i9 | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        b() {
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
                ComposerKt.traceEventStart(1759306475, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous> (CvcRecollectionActivity.kt:34)");
            }
            AbstractC3539m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 1441971965, true, new a(CvcRecollectionActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27497a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f27497a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f27497a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27498a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f27498a = function0;
            this.f27499b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27498a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f27499b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new d.a(CvcRecollectionActivity.this.m());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CvcRecollectionContract.a m() {
        return (CvcRecollectionContract.a) this.f27482a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d n() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d) this.f27483b.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        A4.c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x.a(m().a());
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1759306475, true, new b()), 1, null);
    }
}
