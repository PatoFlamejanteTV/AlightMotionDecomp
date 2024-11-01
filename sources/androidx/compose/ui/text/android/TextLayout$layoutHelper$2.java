package androidx.compose.ui.text.android;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextLayout$layoutHelper$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ TextLayout this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLayout$layoutHelper$2(TextLayout textLayout) {
        super(0);
        this.this$0 = textLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LayoutHelper invoke() {
        return new LayoutHelper(this.this$0.getLayout());
    }
}
