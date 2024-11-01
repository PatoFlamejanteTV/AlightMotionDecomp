package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ScrollKt$rememberScrollState$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ int $initial;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$rememberScrollState$1$1(int i8) {
        super(0);
        this.$initial = i8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScrollState invoke() {
        return new ScrollState(this.$initial);
    }
}
