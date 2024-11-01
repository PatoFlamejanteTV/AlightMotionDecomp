package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AnimationKt$createAnimation$1 extends AbstractC3293z implements Function1 {
    public static final AnimationKt$createAnimation$1 INSTANCE = new AnimationKt$createAnimation$1();

    AnimationKt$createAnimation$1() {
        super(1);
    }

    /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
    @Override // kotlin.jvm.functions.Function1
    public final AnimationVector invoke(AnimationVector it) {
        AbstractC3292y.i(it, "it");
        return it;
    }
}
