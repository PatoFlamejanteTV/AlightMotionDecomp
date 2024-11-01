package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldKt$TextFieldLayout$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ InterfaceC2072n $leading;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ InterfaceC2073o $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ InterfaceC2072n $textField;
    final /* synthetic */ InterfaceC2072n $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextFieldLayout$2(Modifier modifier, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, boolean z8, float f8, PaddingValues paddingValues, int i8) {
        super(2);
        this.$modifier = modifier;
        this.$textField = interfaceC2072n;
        this.$label = interfaceC2072n2;
        this.$placeholder = interfaceC2073o;
        this.$leading = interfaceC2072n3;
        this.$trailing = interfaceC2072n4;
        this.$singleLine = z8;
        this.$animationProgress = f8;
        this.$paddingValues = paddingValues;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        TextFieldKt.TextFieldLayout(this.$modifier, this.$textField, this.$label, this.$placeholder, this.$leading, this.$trailing, this.$singleLine, this.$animationProgress, this.$paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
