package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Transition$totalDurationNanos$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$totalDurationNanos$2(Transition<S> transition) {
        super(0);
        this.this$0 = transition;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        SnapshotStateList snapshotStateList;
        SnapshotStateList snapshotStateList2;
        snapshotStateList = ((Transition) this.this$0)._animations;
        Iterator<T> it = snapshotStateList.iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 = Math.max(j8, ((Transition.TransitionAnimationState) it.next()).getDurationNanos$animation_core_release());
        }
        snapshotStateList2 = ((Transition) this.this$0)._transitions;
        Iterator<T> it2 = snapshotStateList2.iterator();
        while (it2.hasNext()) {
            j8 = Math.max(j8, ((Transition) it2.next()).getTotalDurationNanos());
        }
        return Long.valueOf(j8);
    }
}
