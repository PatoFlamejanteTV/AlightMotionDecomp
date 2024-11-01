package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$windowInsetsPadding$1 extends AbstractC3293z implements InterfaceC2073o {
    public WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$windowInsetsPadding$1() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(359872873);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(359872873, i8, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
        }
        WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 8);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(current);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InsetsPaddingModifier(current.getMandatorySystemGestures(), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return insetsPaddingModifier;
    }
}
