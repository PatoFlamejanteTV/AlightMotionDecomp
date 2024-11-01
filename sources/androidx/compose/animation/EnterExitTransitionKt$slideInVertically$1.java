package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class EnterExitTransitionKt$slideInVertically$1 extends AbstractC3293z implements Function1 {
    public static final EnterExitTransitionKt$slideInVertically$1 INSTANCE = new EnterExitTransitionKt$slideInVertically$1();

    EnterExitTransitionKt$slideInVertically$1() {
        super(1);
    }

    public final Integer invoke(int i8) {
        return Integer.valueOf((-i8) / 2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
