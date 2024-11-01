package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$BasicTextFieldKt$lambda2$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final ComposableSingletons$BasicTextFieldKt$lambda2$1 INSTANCE = new ComposableSingletons$BasicTextFieldKt$lambda2$1();

    ComposableSingletons$BasicTextFieldKt$lambda2$1() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((InterfaceC2072n) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void invoke(InterfaceC2072n innerTextField, Composer composer, int i8) {
        AbstractC3292y.i(innerTextField, "innerTextField");
        if ((i8 & 14) == 0) {
            i8 |= composer.changedInstance(innerTextField) ? 4 : 2;
        }
        if ((i8 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2105616367, i8, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-2.<anonymous> (BasicTextField.kt:285)");
        }
        innerTextField.invoke(composer, Integer.valueOf(i8 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
