package r4;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3532f;
import r4.x0;

/* renamed from: r4.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3918q {

    /* renamed from: a, reason: collision with root package name */
    public static final C3918q f38587a = new C3918q();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC2072n f38588b = ComposableLambdaKt.composableLambdaInstance(549433638, false, a.f38589a);

    /* renamed from: r4.q$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38589a = new a();

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
                ComposerKt.traceEventStart(549433638, i8, -1, "com.stripe.android.uicore.elements.ComposableSingletons$TextFieldUIKt.lambda-1.<anonymous> (TextFieldUI.kt:428)");
            }
            C0.u(new x0.c(AbstractC3532f.f35945a, null, true, null, 10, null), false, SizeKt.m624size3ABfNKs(Modifier.Companion, Dp.m5155constructorimpl(8)), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC2072n a() {
        return f38588b;
    }
}
