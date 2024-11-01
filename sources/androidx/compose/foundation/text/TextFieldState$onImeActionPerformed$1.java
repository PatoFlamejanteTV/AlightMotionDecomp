package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldState$onImeActionPerformed$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ TextFieldState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldState$onImeActionPerformed$1(TextFieldState textFieldState) {
        super(1);
        this.this$0 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m931invokeKlQnJC8(((ImeAction) obj).m4835unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-KlQnJC8, reason: not valid java name */
    public final void m931invokeKlQnJC8(int i8) {
        KeyboardActionRunner keyboardActionRunner;
        keyboardActionRunner = this.this$0.keyboardActionRunner;
        keyboardActionRunner.m858runActionKlQnJC8(i8);
    }
}
