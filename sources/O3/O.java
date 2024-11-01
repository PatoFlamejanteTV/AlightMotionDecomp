package O3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f7236a = CompositionLocalKt.staticCompositionLocalOf(a.f7239a);

    /* renamed from: b, reason: collision with root package name */
    private static final ProvidableCompositionLocal f7237b = CompositionLocalKt.staticCompositionLocalOf(b.f7240a);

    /* renamed from: c, reason: collision with root package name */
    private static final ProvidableCompositionLocal f7238c = CompositionLocalKt.staticCompositionLocalOf(c.f7241a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7239a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke() {
            return new K(0L, 0L, 0L, 0L, 0L, 31, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7240a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            return new M(0.0f, 0.0f, 3, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7241a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P invoke() {
            return new P(null, 0L, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f7242a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC2072n interfaceC2072n) {
            super(2);
            this.f7242a = interfaceC2072n;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-780814166, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<anonymous> (PrimaryButtonTheme.kt:156)");
            }
            this.f7242a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K f7243a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f7244b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P f7245c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f7246d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7247e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7248f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K k8, M m8, P p8, InterfaceC2072n interfaceC2072n, int i8, int i9) {
            super(2);
            this.f7243a = k8;
            this.f7244b = m8;
            this.f7245c = p8;
            this.f7246d = interfaceC2072n;
            this.f7247e = i8;
            this.f7248f = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            O.a(this.f7243a, this.f7244b, this.f7245c, this.f7246d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7247e | 1), this.f7248f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:            if ((r32 & 4) != 0) goto L65;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(O3.K r26, O3.M r27, O3.P r28, c6.InterfaceC2072n r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.O.a(O3.K, O3.M, O3.P, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ProvidableCompositionLocal b() {
        return f7236a;
    }

    public static final ProvidableCompositionLocal c() {
        return f7237b;
    }

    public static final ProvidableCompositionLocal d() {
        return f7238c;
    }
}
