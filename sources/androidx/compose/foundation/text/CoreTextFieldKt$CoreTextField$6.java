package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$6 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ InterfaceC2073o $decorationBox;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onTextLayout;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$6(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z8, int i8, int i9, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z9, boolean z10, InterfaceC2073o interfaceC2073o, int i10, int i11, int i12) {
        super(2);
        this.$value = textFieldValue;
        this.$onValueChange = function1;
        this.$modifier = modifier;
        this.$textStyle = textStyle;
        this.$visualTransformation = visualTransformation;
        this.$onTextLayout = function12;
        this.$interactionSource = mutableInteractionSource;
        this.$cursorBrush = brush;
        this.$softWrap = z8;
        this.$maxLines = i8;
        this.$minLines = i9;
        this.$imeOptions = imeOptions;
        this.$keyboardActions = keyboardActions;
        this.$enabled = z9;
        this.$readOnly = z10;
        this.$decorationBox = interfaceC2073o;
        this.$$changed = i10;
        this.$$changed1 = i11;
        this.$$default = i12;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        CoreTextFieldKt.CoreTextField(this.$value, this.$onValueChange, this.$modifier, this.$textStyle, this.$visualTransformation, this.$onTextLayout, this.$interactionSource, this.$cursorBrush, this.$softWrap, this.$maxLines, this.$minLines, this.$imeOptions, this.$keyboardActions, this.$enabled, this.$readOnly, this.$decorationBox, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
