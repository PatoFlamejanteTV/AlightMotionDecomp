package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 INSTANCE = new ComposableSingletons$SnackbarHostKt$lambda1$1();

    ComposableSingletons$SnackbarHostKt$lambda1$1() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SnackbarData) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(SnackbarData it, Composer composer, int i8) {
        int i9;
        AbstractC3292y.i(it, "it");
        if ((i8 & 14) == 0) {
            i9 = i8 | (composer.changed(it) ? 4 : 2);
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(818736383, i9, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:221)");
        }
        SnackbarKt.m1750SnackbarsDKtq54(it, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i9 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
