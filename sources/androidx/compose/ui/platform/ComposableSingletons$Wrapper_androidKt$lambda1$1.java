package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$Wrapper_androidKt$lambda1$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final ComposableSingletons$Wrapper_androidKt$lambda1$1 INSTANCE = new ComposableSingletons$Wrapper_androidKt$lambda1$1();

    ComposableSingletons$Wrapper_androidKt$lambda1$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Q5.I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1759434350, i8, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:110)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
