package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.material3.ComposableSingletons$AppBarKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$AppBarKt$lambda2$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final ComposableSingletons$AppBarKt$lambda2$1 INSTANCE = new ComposableSingletons$AppBarKt$lambda2$1();

    ComposableSingletons$AppBarKt$lambda2$1() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(RowScope rowScope, Composer composer, int i8) {
        AbstractC3292y.i(rowScope, "$this$null");
        if ((i8 & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1394022792, i8, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-2.<anonymous> (AppBar.kt:123)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
