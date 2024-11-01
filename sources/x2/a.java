package X2;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10952a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2072n f10953b = ComposableLambdaKt.composableLambdaInstance(364257093, false, C0229a.f10956a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC2072n f10954c = ComposableLambdaKt.composableLambdaInstance(-1783088598, false, b.f10957a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC2072n f10955d = ComposableLambdaKt.composableLambdaInstance(501093267, false, c.f10958a);

    /* renamed from: X2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0229a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0229a f10956a = new C0229a();

        C0229a() {
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
                ComposerKt.traceEventStart(364257093, i8, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-1.<anonymous> (LinkButton.kt:176)");
            }
            f.c(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f10957a = new b();

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
                ComposerKt.traceEventStart(-1783088598, i8, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-2.<anonymous> (LinkButton.kt:217)");
            }
            f.c(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f10958a = new c();

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
                ComposerKt.traceEventStart(501093267, i8, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-3.<anonymous> (LinkButton.kt:218)");
            }
            f.b(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2072n a() {
        return f10953b;
    }

    public final InterfaceC2072n b() {
        return f10954c;
    }

    public final InterfaceC2072n c() {
        return f10955d;
    }
}
