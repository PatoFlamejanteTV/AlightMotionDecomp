package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
/* loaded from: classes.dex */
public final class EnterTransitionImpl extends EnterTransition {
    private final TransitionData data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterTransitionImpl(TransitionData data) {
        super(null);
        AbstractC3292y.i(data, "data");
        this.data = data;
    }

    @Override // androidx.compose.animation.EnterTransition
    public TransitionData getData$animation_release() {
        return this.data;
    }
}
