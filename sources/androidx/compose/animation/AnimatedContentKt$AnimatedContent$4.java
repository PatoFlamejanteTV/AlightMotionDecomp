package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$4 extends AbstractC3293z implements Function1 {
    public static final AnimatedContentKt$AnimatedContent$4 INSTANCE = new AnimatedContentKt$AnimatedContent$4();

    AnimatedContentKt$AnimatedContent$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
        AbstractC3292y.i(animatedContentTransitionScope, "$this$null");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m139scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
    }
}
