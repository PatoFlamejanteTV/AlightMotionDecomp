package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextFieldState$onValueChangeOriginal$1 extends AbstractC3293z implements Function1 {
    public static final TextFieldState$onValueChangeOriginal$1 INSTANCE = new TextFieldState$onValueChangeOriginal$1();

    TextFieldState$onValueChangeOriginal$1() {
        super(1);
    }

    public final void invoke(TextFieldValue it) {
        AbstractC3292y.i(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return I.f8786a;
    }
}
