package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidCursorHandle_androidKt$drawCursorHandle$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final AndroidCursorHandle_androidKt$drawCursorHandle$1 INSTANCE = new AndroidCursorHandle_androidKt$drawCursorHandle$1();

    AndroidCursorHandle_androidKt$drawCursorHandle$1() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-2126899193);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126899193, i8, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:61)");
        }
        long m1071getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1071getHandleColor0d7_KjU();
        Modifier.Companion companion = Modifier.Companion;
        Color m2938boximpl = Color.m2938boximpl(m1071getHandleColor0d7_KjU);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m2938boximpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(m1071getHandleColor0d7_KjU);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier then = composed.then(DrawModifierKt.drawWithCache(companion, (Function1) rememberedValue));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
