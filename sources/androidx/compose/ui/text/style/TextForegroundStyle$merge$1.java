package androidx.compose.ui.text.style;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextForegroundStyle$merge$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ TextForegroundStyle this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextForegroundStyle$merge$1(TextForegroundStyle textForegroundStyle) {
        super(0);
        this.this$0 = textForegroundStyle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.this$0.getAlpha());
    }
}
