package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$2$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ Function1 $onTextLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$2$1(MutableState<TextLayoutResult> mutableState, Function1 function1) {
        super(1);
        this.$layoutResult = mutableState;
        this.$onTextLayout = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextLayoutResult) obj);
        return I.f8786a;
    }

    public final void invoke(TextLayoutResult it) {
        AbstractC3292y.i(it, "it");
        this.$layoutResult.setValue(it);
        this.$onTextLayout.invoke(it);
    }
}
