package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$TextIndentSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$TextIndentSaver$1 INSTANCE = new SaversKt$TextIndentSaver$1();

    SaversKt$TextIndentSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, TextIndent textIndent) {
        TextUnit m5332boximpl = TextUnit.m5332boximpl(textIndent.m5083getFirstLineXSAIIZE());
        TextUnit.Companion companion = TextUnit.Companion;
        return AbstractC1435t.g(SaversKt.save(m5332boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(TextUnit.m5332boximpl(textIndent.m5084getRestLineXSAIIZE()), SaversKt.getSaver(companion), saverScope));
    }
}
