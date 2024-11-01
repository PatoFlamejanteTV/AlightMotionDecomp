package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$TabRowKt$lambda1$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final ComposableSingletons$TabRowKt$lambda1$1 INSTANCE = new ComposableSingletons$TabRowKt$lambda1$1();

    ComposableSingletons$TabRowKt$lambda1$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182187156, i8, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-1.<anonymous> (TabRow.kt:140)");
        }
        TabRowDefaults.INSTANCE.m1355Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
