package G3;

import D3.f;
import Q5.C1413h;
import Q5.I;
import Q5.t;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n6.M;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f2831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f2832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G3.d f2833c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: G3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0049a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ G3.d f2834a;

            C0049a(G3.d dVar) {
                this.f2834a = dVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(f.e.d dVar, U5.d dVar2) {
                if (dVar != null) {
                    this.f2834a.g().invoke(dVar);
                }
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, G3.d dVar, U5.d dVar2) {
            super(2, dVar2);
            this.f2832b = hVar;
            this.f2833c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f2832b, this.f2833c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f2831a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3821f w8 = this.f2832b.w();
                C0049a c0049a = new C0049a(this.f2833c);
                this.f2831a = 1;
                if (w8.collect(c0049a, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f2835a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f2836b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G3.d f2837c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ G3.d f2838a;

            a(G3.d dVar) {
                this.f2838a = dVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.bankaccount.navigation.d dVar, U5.d dVar2) {
                Function1 f8;
                if (dVar != null && (f8 = this.f2838a.f()) != null) {
                    f8.invoke(dVar);
                }
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h hVar, G3.d dVar, U5.d dVar2) {
            super(2, dVar2);
            this.f2836b = hVar;
            this.f2837c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f2836b, this.f2837c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f2835a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3821f o8 = this.f2836b.o();
                a aVar = new a(this.f2837c);
                this.f2835a = 1;
                if (o8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0050c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f2839a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f2840b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G3.d f2841c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: G3.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ G3.d f2842a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: G3.c$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0051a extends AbstractC3293z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f2843a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0051a(boolean z8) {
                    super(1);
                    this.f2843a = z8;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PrimaryButton.b invoke(PrimaryButton.b bVar) {
                    if (bVar != null) {
                        return PrimaryButton.b.b(bVar, null, null, this.f2843a, false, 11, null);
                    }
                    return null;
                }
            }

            a(G3.d dVar) {
                this.f2842a = dVar;
            }

            public final Object b(boolean z8, U5.d dVar) {
                this.f2842a.k().invoke(new C0051a(z8));
                return I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0050c(h hVar, G3.d dVar, U5.d dVar2) {
            super(2, dVar2);
            this.f2840b = hVar;
            this.f2841c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0050c(this.f2840b, this.f2841c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f2839a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3813L v8 = this.f2840b.v();
                a aVar = new a(this.f2841c);
                this.f2839a = 1;
                if (v8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0050c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f2844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G3.d f2845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f2846c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f2847d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ State f2848e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3289v implements Function1 {
            a(Object obj) {
                super(1, obj, h.class, "handlePrimaryButtonClick", "handlePrimaryButtonClick(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;)V", 0);
            }

            public final void d(G3.f p02) {
                AbstractC3292y.i(p02, "p0");
                ((h) this.receiver).F(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((G3.f) obj);
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(G3.d dVar, h hVar, State state, State state2, U5.d dVar2) {
            super(2, dVar2);
            this.f2845b = dVar;
            this.f2846c = hVar;
            this.f2847d = state;
            this.f2848e = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f2845b, this.f2846c, this.f2847d, this.f2848e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            V5.b.e();
            if (this.f2844a == 0) {
                t.b(obj);
                G3.d dVar = this.f2845b;
                G3.f b9 = c.b(this.f2847d);
                if (c.c(this.f2848e) && !c.b(this.f2847d).h()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                k.a(dVar, b9, z8, new a(this.f2846c));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f2849a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistryOwner f2850b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G3.d f2851c;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f2852a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PrimaryButton.b invoke(PrimaryButton.b bVar) {
                return null;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements DisposableEffectResult {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ G3.d f2853a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f2854b;

            public b(G3.d dVar, h hVar) {
                this.f2853a = dVar;
                this.f2854b = hVar;
            }

            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.f2853a.k().invoke(a.f2852a);
                this.f2854b.H();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h hVar, ActivityResultRegistryOwner activityResultRegistryOwner, G3.d dVar) {
            super(1);
            this.f2849a = hVar;
            this.f2850b = activityResultRegistryOwner;
            this.f2851c = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
            AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
            h hVar = this.f2849a;
            ActivityResultRegistryOwner activityResultRegistryOwner = this.f2850b;
            AbstractC3292y.f(activityResultRegistryOwner);
            hVar.I(activityResultRegistryOwner);
            return new b(this.f2851c, this.f2849a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f2855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G3.d f2856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(h hVar, G3.d dVar, int i8) {
            super(2);
            this.f2855a = hVar;
            this.f2856b = dVar;
            this.f2857c = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            c.a(this.f2855a, this.f2856b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2857c | 1));
        }
    }

    public static final void a(h viewModel, G3.d usBankAccountFormArgs, Composer composer, int i8) {
        AbstractC3292y.i(viewModel, "viewModel");
        AbstractC3292y.i(usBankAccountFormArgs, "usBankAccountFormArgs");
        Composer startRestartGroup = composer.startRestartGroup(356178850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(356178850, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountEmitters (USBankAccountEmitters.kt:13)");
        }
        State a9 = A4.f.a(viewModel.p(), startRestartGroup, 8);
        State a10 = A4.f.a(viewModel.v(), startRestartGroup, 8);
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(startRestartGroup, LocalActivityResultRegistryOwner.$stable);
        I i9 = I.f8786a;
        EffectsKt.LaunchedEffect(i9, new a(viewModel, usBankAccountFormArgs, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect(i9, new b(viewModel, usBankAccountFormArgs, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect(i9, new C0050c(viewModel, usBankAccountFormArgs, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect(b(a9), Boolean.valueOf(c(a10)), new d(usBankAccountFormArgs, viewModel, a9, a10, null), startRestartGroup, 520);
        EffectsKt.DisposableEffect(i9, new e(viewModel, current, usBankAccountFormArgs), startRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(viewModel, usBankAccountFormArgs, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G3.f b(State state) {
        return (G3.f) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
