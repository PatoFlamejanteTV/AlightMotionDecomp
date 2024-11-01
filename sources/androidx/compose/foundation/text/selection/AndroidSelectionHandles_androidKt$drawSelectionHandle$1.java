package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1(boolean z8, ResolvedTextDirection resolvedTextDirection, boolean z9) {
        super(3);
        this.$isStartHandle = z8;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z9;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-1538687176);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1538687176, i8, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:111)");
        }
        long m1071getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1071getHandleColor0d7_KjU();
        Modifier.Companion companion = Modifier.Companion;
        Object[] objArr = {Color.m2938boximpl(m1071getHandleColor0d7_KjU), Boolean.valueOf(this.$isStartHandle), this.$direction, Boolean.valueOf(this.$handlesCrossed)};
        boolean z8 = this.$isStartHandle;
        ResolvedTextDirection resolvedTextDirection = this.$direction;
        boolean z9 = this.$handlesCrossed;
        composer.startReplaceableGroup(-568225417);
        boolean z10 = false;
        for (int i9 = 0; i9 < 4; i9++) {
            z10 |= composer.changed(objArr[i9]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(m1071getHandleColor0d7_KjU, z8, resolvedTextDirection, z9);
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
