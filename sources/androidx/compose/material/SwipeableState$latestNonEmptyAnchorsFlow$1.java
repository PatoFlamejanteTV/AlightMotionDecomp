package androidx.compose.material;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwipeableState$latestNonEmptyAnchorsFlow$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$latestNonEmptyAnchorsFlow$1(SwipeableState<T> swipeableState) {
        super(0);
        this.this$0 = swipeableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Float, T> invoke() {
        return this.this$0.getAnchors$material_release();
    }
}
