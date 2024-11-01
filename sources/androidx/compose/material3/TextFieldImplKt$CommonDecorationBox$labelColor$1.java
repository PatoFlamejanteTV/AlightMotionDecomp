package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(TextFieldColors textFieldColors, boolean z8, boolean z9, InteractionSource interactionSource, int i8) {
        super(3);
        this.$colors = textFieldColors;
        this.$enabled = z8;
        this.$isError = z9;
        this.$interactionSource = interactionSource;
        this.$$dirty1 = i8;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return Color.m2938boximpl(m1845invokeXeAY9LY((InputPhase) obj, (Composer) obj2, ((Number) obj3).intValue()));
    }

    @Composable
    /* renamed from: invoke-XeAY9LY, reason: not valid java name */
    public final long m1845invokeXeAY9LY(InputPhase it, Composer composer, int i8) {
        AbstractC3292y.i(it, "it");
        composer.startReplaceableGroup(-379813807);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-379813807, i8, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
        }
        TextFieldColors textFieldColors = this.$colors;
        boolean z8 = this.$enabled;
        boolean z9 = this.$isError;
        InteractionSource interactionSource = this.$interactionSource;
        int i9 = this.$$dirty1;
        long m2958unboximpl = textFieldColors.labelColor$material3_release(z8, z9, interactionSource, composer, (i9 & 1022) | ((i9 >> 3) & 7168)).getValue().m2958unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2958unboximpl;
    }
}
