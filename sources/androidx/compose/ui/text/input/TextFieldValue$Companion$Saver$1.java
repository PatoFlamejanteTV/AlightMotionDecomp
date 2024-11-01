package androidx.compose.ui.text.input;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextFieldValue$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final TextFieldValue$Companion$Saver$1 INSTANCE = new TextFieldValue$Companion$Saver$1();

    TextFieldValue$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
        return AbstractC1435t.g(SaversKt.save(textFieldValue.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m4657boximpl(textFieldValue.m4906getSelectiond9O1mEE()), SaversKt.getSaver(TextRange.Companion), saverScope));
    }
}
