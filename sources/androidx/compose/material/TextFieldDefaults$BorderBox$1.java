package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldDefaults$BorderBox$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ float $focusedBorderThickness;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ TextFieldDefaults $tmp0_rcvr;
    final /* synthetic */ float $unfocusedBorderThickness;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$BorderBox$1(TextFieldDefaults textFieldDefaults, boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f8, float f9, int i8, int i9) {
        super(2);
        this.$tmp0_rcvr = textFieldDefaults;
        this.$enabled = z8;
        this.$isError = z9;
        this.$interactionSource = interactionSource;
        this.$colors = textFieldColors;
        this.$shape = shape;
        this.$focusedBorderThickness = f8;
        this.$unfocusedBorderThickness = f9;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.m1368BorderBoxnbWgWpA(this.$enabled, this.$isError, this.$interactionSource, this.$colors, this.$shape, this.$focusedBorderThickness, this.$unfocusedBorderThickness, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
