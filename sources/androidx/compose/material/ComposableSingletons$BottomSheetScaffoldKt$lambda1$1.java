package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$BottomSheetScaffoldKt$lambda1$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final ComposableSingletons$BottomSheetScaffoldKt$lambda1$1 INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt$lambda1$1();

    ComposableSingletons$BottomSheetScaffoldKt$lambda1$1() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(SnackbarHostState it, Composer composer, int i8) {
        AbstractC3292y.i(it, "it");
        if ((i8 & 14) == 0) {
            i8 |= composer.changed(it) ? 4 : 2;
        }
        if ((i8 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(895288908, i8, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-1.<anonymous> (BottomSheetScaffold.kt:419)");
        }
        SnackbarHostKt.SnackbarHost(it, null, null, composer, i8 & 14, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
