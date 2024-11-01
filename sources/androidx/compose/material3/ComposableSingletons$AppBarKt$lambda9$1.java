package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.material3.ComposableSingletons$AppBarKt$lambda-9$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$AppBarKt$lambda9$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final ComposableSingletons$AppBarKt$lambda9$1 INSTANCE = new ComposableSingletons$AppBarKt$lambda9$1();

    ComposableSingletons$AppBarKt$lambda9$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1044424363, i8, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-9.<anonymous> (AppBar.kt:339)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
