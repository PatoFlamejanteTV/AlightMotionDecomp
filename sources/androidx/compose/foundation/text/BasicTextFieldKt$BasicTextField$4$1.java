package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$4$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ MutableState<String> $lastTextValue$delegate;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValueState$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$4$1(Function1 function1, MutableState<TextFieldValue> mutableState, MutableState<String> mutableState2) {
        super(1);
        this.$onValueChange = function1;
        this.$textFieldValueState$delegate = mutableState;
        this.$lastTextValue$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return I.f8786a;
    }

    public final void invoke(TextFieldValue newTextFieldValueState) {
        String BasicTextField$lambda$6;
        AbstractC3292y.i(newTextFieldValueState, "newTextFieldValueState");
        this.$textFieldValueState$delegate.setValue(newTextFieldValueState);
        BasicTextField$lambda$6 = BasicTextFieldKt.BasicTextField$lambda$6(this.$lastTextValue$delegate);
        boolean z8 = !AbstractC3292y.d(BasicTextField$lambda$6, newTextFieldValueState.getText());
        this.$lastTextValue$delegate.setValue(newTextFieldValueState.getText());
        if (z8) {
            this.$onValueChange.invoke(newTextFieldValueState.getText());
        }
    }
}
