package androidx.compose.animation.core;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animateTo$2 extends AbstractC3293z implements Function1 {
    public static final SuspendAnimationKt$animateTo$2 INSTANCE = new SuspendAnimationKt$animateTo$2();

    SuspendAnimationKt$animateTo$2() {
        super(1);
    }

    public final void invoke(AnimationScope animationScope) {
        AbstractC3292y.i(animationScope, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope) obj);
        return I.f8786a;
    }
}
