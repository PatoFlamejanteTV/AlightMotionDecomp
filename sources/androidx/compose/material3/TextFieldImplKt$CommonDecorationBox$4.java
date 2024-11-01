package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.input.VisualTransformation;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$4 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ InterfaceC2072n $container;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC2072n $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ InterfaceC2072n $leadingIcon;
    final /* synthetic */ InterfaceC2072n $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ InterfaceC2072n $supportingText;
    final /* synthetic */ InterfaceC2072n $trailingIcon;
    final /* synthetic */ TextFieldType $type;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$4(TextFieldType textFieldType, String str, InterfaceC2072n interfaceC2072n, VisualTransformation visualTransformation, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, InterfaceC2072n interfaceC2072n5, InterfaceC2072n interfaceC2072n6, boolean z8, boolean z9, boolean z10, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, InterfaceC2072n interfaceC2072n7, int i8, int i9, int i10) {
        super(2);
        this.$type = textFieldType;
        this.$value = str;
        this.$innerTextField = interfaceC2072n;
        this.$visualTransformation = visualTransformation;
        this.$label = interfaceC2072n2;
        this.$placeholder = interfaceC2072n3;
        this.$leadingIcon = interfaceC2072n4;
        this.$trailingIcon = interfaceC2072n5;
        this.$supportingText = interfaceC2072n6;
        this.$singleLine = z8;
        this.$enabled = z9;
        this.$isError = z10;
        this.$interactionSource = interactionSource;
        this.$contentPadding = paddingValues;
        this.$colors = textFieldColors;
        this.$container = interfaceC2072n7;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        TextFieldImplKt.CommonDecorationBox(this.$type, this.$value, this.$innerTextField, this.$visualTransformation, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$supportingText, this.$singleLine, this.$enabled, this.$isError, this.$interactionSource, this.$contentPadding, this.$colors, this.$container, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
