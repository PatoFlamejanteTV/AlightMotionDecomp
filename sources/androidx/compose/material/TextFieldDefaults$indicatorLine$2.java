package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextFieldDefaults$indicatorLine$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ float $focusedIndicatorLineThickness;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ float $unfocusedIndicatorLineThickness;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$indicatorLine$2(boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, float f8, float f9) {
        super(3);
        this.$enabled = z8;
        this.$isError = z9;
        this.$interactionSource = interactionSource;
        this.$colors = textFieldColors;
        this.$focusedIndicatorLineThickness = f8;
        this.$unfocusedIndicatorLineThickness = f9;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(1398930845);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1398930845, i8, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:280)");
        }
        Modifier drawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.Companion, (BorderStroke) TextFieldDefaultsKt.m1379access$animateBorderStrokeAsStateNuRrP5Q(this.$enabled, this.$isError, this.$interactionSource, this.$colors, this.$focusedIndicatorLineThickness, this.$unfocusedIndicatorLineThickness, composer, 0).getValue());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawIndicatorLine;
    }
}
