package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ScrollState$canScrollBackward$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ScrollState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$canScrollBackward$2(ScrollState scrollState) {
        super(0);
        this.this$0 = scrollState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.getValue() > 0);
    }
}
