package x4;

import Q5.I;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4218a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4218a f40969a = new C4218a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2073o f40970b = ComposableLambdaKt.composableLambdaInstance(2051430169, false, C0934a.f40972a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC2073o f40971c = ComposableLambdaKt.composableLambdaInstance(1719901005, false, b.f40973a);

    /* renamed from: x4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0934a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final C0934a f40972a = new C0934a();

        C0934a() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i8) {
            AbstractC3292y.i(boxWithConstraintsScope, "$this$null");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2051430169, i8, -1, "com.stripe.android.uicore.image.ComposableSingletons$StripeImageKt.lambda-1.<anonymous> (StripeImage.kt:57)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: x4.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40973a = new b();

        b() {
            super(3);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i8) {
            AbstractC3292y.i(boxWithConstraintsScope, "$this$null");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1719901005, i8, -1, "com.stripe.android.uicore.image.ComposableSingletons$StripeImageKt.lambda-2.<anonymous> (StripeImage.kt:58)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2073o a() {
        return f40970b;
    }

    public final InterfaceC2073o b() {
        return f40971c;
    }
}
