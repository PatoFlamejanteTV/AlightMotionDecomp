package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ContentTransform {
    public static final int $stable = 8;
    private final ExitTransition initialContentExit;
    private SizeTransform sizeTransform;
    private final EnterTransition targetContentEnter;
    private final MutableFloatState targetContentZIndex$delegate;

    public ContentTransform(EnterTransition targetContentEnter, ExitTransition initialContentExit, float f8, SizeTransform sizeTransform) {
        AbstractC3292y.i(targetContentEnter, "targetContentEnter");
        AbstractC3292y.i(initialContentExit, "initialContentExit");
        this.targetContentEnter = targetContentEnter;
        this.initialContentExit = initialContentExit;
        this.targetContentZIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f8);
        this.sizeTransform = sizeTransform;
    }

    public final ExitTransition getInitialContentExit() {
        return this.initialContentExit;
    }

    public final SizeTransform getSizeTransform() {
        return this.sizeTransform;
    }

    public final EnterTransition getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float getTargetContentZIndex() {
        return this.targetContentZIndex$delegate.getFloatValue();
    }

    public final void setSizeTransform$animation_release(SizeTransform sizeTransform) {
        this.sizeTransform = sizeTransform;
    }

    public final void setTargetContentZIndex(float f8) {
        this.targetContentZIndex$delegate.setFloatValue(f8);
    }

    public /* synthetic */ ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f8, SizeTransform sizeTransform, int i8, AbstractC3284p abstractC3284p) {
        this(enterTransition, exitTransition, (i8 & 4) != 0 ? 0.0f : f8, (i8 & 8) != 0 ? AnimatedContentKt.SizeTransform$default(false, null, 3, null) : sizeTransform);
    }
}
