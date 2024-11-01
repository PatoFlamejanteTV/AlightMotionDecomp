package Y2;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import r4.C3890A;
import r4.J;
import r4.Q;
import r4.g0;
import r4.s0;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11772a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2073o f11773b = ComposableLambdaKt.composableLambdaInstance(-1188167286, false, a.f11776a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC2072n f11774c = ComposableLambdaKt.composableLambdaInstance(-549453615, false, C0261b.f11777a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC2072n f11775d = ComposableLambdaKt.composableLambdaInstance(1855839629, false, c.f11779a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11776a = new a();

        a() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3292y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1188167286, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-1.<anonymous> (LinkInlineSignup.kt:258)");
            }
            X2.g.a(false, false, PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5155constructorimpl(16), 0.0f, 0.0f, 13, null), TextAlign.Companion.m5064getStarte0LSkKk(), composer, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: Y2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0261b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0261b f11777a = new C0261b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Y2.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f11778a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m65invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m65invoke() {
            }
        }

        C0261b() {
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
                ComposerKt.traceEventStart(-549453615, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-2.<anonymous> (LinkInlineSignup.kt:274)");
            }
            g0 g0Var = new g0(null, AbstractC1435t.m());
            s0 b9 = C3890A.a.b(C3890A.f37849h, "email@me.co", false, 2, null);
            Q b10 = Q.a.b(Q.f38111r, "5555555555", null, null, false, false, 30, null);
            s0 a9 = J.f38018h.a("My Name");
            Z2.a aVar = Z2.a.f13216c;
            a aVar2 = a.f11778a;
            int i9 = (g0.f38415c << 3) | 920322054;
            int i10 = s0.f38602x;
            h.g("Example, Inc.", g0Var, b9, b10, a9, aVar, true, true, true, null, aVar2, null, composer, i9 | (i10 << 6) | (Q.f38112s << 9) | (i10 << 12), 6, 2048);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11779a = new c();

        c() {
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
                ComposerKt.traceEventStart(1855839629, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-3.<anonymous> (LinkInlineSignup.kt:273)");
            }
            SurfaceKt.m1330SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, b.f11772a.b(), composer, 1572864, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2073o a() {
        return f11773b;
    }

    public final InterfaceC2072n b() {
        return f11774c;
    }
}
