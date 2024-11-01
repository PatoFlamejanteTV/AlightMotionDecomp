package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$ParagraphStyleSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$ParagraphStyleSaver$1 INSTANCE = new SaversKt$ParagraphStyleSaver$1();

    SaversKt$ParagraphStyleSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, ParagraphStyle paragraphStyle) {
        return AbstractC1435t.g(SaversKt.save(TextAlign.m5052boximpl(paragraphStyle.m4584getTextAligne0LSkKk())), SaversKt.save(TextDirection.m5066boximpl(paragraphStyle.m4586getTextDirections_7Xco())), SaversKt.save(TextUnit.m5332boximpl(paragraphStyle.m4582getLineHeightXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.Companion), saverScope));
    }
}
