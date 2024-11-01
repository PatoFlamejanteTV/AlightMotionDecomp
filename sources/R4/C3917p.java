package r4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: r4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3917p {

    /* renamed from: a, reason: collision with root package name */
    public static final C3917p f38560a = new C3917p();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2072n f38561b = ComposableLambdaKt.composableLambdaInstance(1685012640, false, a.f38562a);

    /* renamed from: r4.p$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38562a = new a();

        a() {
            super(2);
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
                ComposerKt.traceEventStart(1685012640, i8, -1, "com.stripe.android.uicore.elements.ComposableSingletons$SectionUIKt.lambda-1.<anonymous> (SectionUI.kt:34)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2072n a() {
        return f38561b;
    }
}
