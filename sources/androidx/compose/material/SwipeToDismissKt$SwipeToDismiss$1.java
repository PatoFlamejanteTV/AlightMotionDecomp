package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwipeToDismissKt$SwipeToDismiss$1 extends AbstractC3293z implements Function1 {
    public static final SwipeToDismissKt$SwipeToDismiss$1 INSTANCE = new SwipeToDismissKt$SwipeToDismiss$1();

    SwipeToDismissKt$SwipeToDismiss$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FixedThreshold invoke(DismissDirection it) {
        float f8;
        AbstractC3292y.i(it, "it");
        f8 = SwipeToDismissKt.DISMISS_THRESHOLD;
        return new FixedThreshold(f8, null);
    }
}
