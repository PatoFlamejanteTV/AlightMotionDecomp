package s4;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3959a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3959a f39067a = new C3959a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2072n f39068b = ComposableLambdaKt.composableLambdaInstance(33061104, false, C0883a.f39069a);

    /* renamed from: s4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0883a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0883a f39069a = new C0883a();

        C0883a() {
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
                ComposerKt.traceEventStart(33061104, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.ComposableSingletons$StripeBottomSheetLayoutKt.lambda-1.<anonymous> (StripeBottomSheetLayout.kt:62)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2072n a() {
        return f39068b;
    }
}
