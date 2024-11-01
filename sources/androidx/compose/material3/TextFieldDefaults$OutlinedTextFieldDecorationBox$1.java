package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldDefaults$OutlinedTextFieldDecorationBox$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$OutlinedTextFieldDecorationBox$1(boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, int i8, int i9) {
        super(2);
        this.$enabled = z8;
        this.$isError = z9;
        this.$interactionSource = interactionSource;
        this.$colors = textFieldColors;
        this.$$dirty = i8;
        this.$$dirty1 = i9;
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
            ComposerKt.traceEventStart(144282315, i8, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        boolean z8 = this.$enabled;
        boolean z9 = this.$isError;
        InteractionSource interactionSource = this.$interactionSource;
        TextFieldColors textFieldColors = this.$colors;
        int i9 = this.$$dirty;
        textFieldDefaults.m1827OutlinedBorderContainerBoxnbWgWpA(z8, z9, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer, ((i9 >> 9) & 896) | ((i9 >> 6) & 14) | 12582912 | ((i9 >> 15) & 112) | ((this.$$dirty1 << 3) & 7168), 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
