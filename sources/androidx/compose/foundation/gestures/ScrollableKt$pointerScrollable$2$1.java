package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollableKt$pointerScrollable$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$2$1(State<ScrollingLogic> state) {
        super(0);
        this.$scrollLogic = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$scrollLogic.getValue().shouldScrollImmediately());
    }
}
