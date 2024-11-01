package androidx.compose.foundation.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(1);
        this.$scrollerPosition = textFieldScrollerPosition;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }

    public final Float invoke(float f8) {
        float offset = this.$scrollerPosition.getOffset() + f8;
        if (offset > this.$scrollerPosition.getMaximum()) {
            f8 = this.$scrollerPosition.getMaximum() - this.$scrollerPosition.getOffset();
        } else if (offset < 0.0f) {
            f8 = -this.$scrollerPosition.getOffset();
        }
        TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
        textFieldScrollerPosition.setOffset(textFieldScrollerPosition.getOffset() + f8);
        return Float.valueOf(f8);
    }
}
