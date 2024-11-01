package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$OutlinedTextFieldLayout$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ InterfaceC2072n $container;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ InterfaceC2072n $leading;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onLabelMeasured;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ InterfaceC2073o $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ InterfaceC2072n $supporting;
    final /* synthetic */ InterfaceC2072n $textField;
    final /* synthetic */ InterfaceC2072n $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextFieldLayout$2(Modifier modifier, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, boolean z8, float f8, Function1 function1, InterfaceC2072n interfaceC2072n5, InterfaceC2072n interfaceC2072n6, PaddingValues paddingValues, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$textField = interfaceC2072n;
        this.$placeholder = interfaceC2073o;
        this.$label = interfaceC2072n2;
        this.$leading = interfaceC2072n3;
        this.$trailing = interfaceC2072n4;
        this.$singleLine = z8;
        this.$animationProgress = f8;
        this.$onLabelMeasured = function1;
        this.$container = interfaceC2072n5;
        this.$supporting = interfaceC2072n6;
        this.$paddingValues = paddingValues;
        this.$$changed = i8;
        this.$$changed1 = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        OutlinedTextFieldKt.OutlinedTextFieldLayout(this.$modifier, this.$textField, this.$placeholder, this.$label, this.$leading, this.$trailing, this.$singleLine, this.$animationProgress, this.$onLabelMeasured, this.$container, this.$supporting, this.$paddingValues, composer, this.$$changed | 1, this.$$changed1);
    }
}
