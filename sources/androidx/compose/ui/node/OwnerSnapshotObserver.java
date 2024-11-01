package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver {
    public static final int $stable = SnapshotStateObserver.$stable;
    private final SnapshotStateObserver observer;
    private final Function1 onCommitAffectingLookaheadMeasure = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.INSTANCE;
    private final Function1 onCommitAffectingMeasure = OwnerSnapshotObserver$onCommitAffectingMeasure$1.INSTANCE;
    private final Function1 onCommitAffectingSemantics = OwnerSnapshotObserver$onCommitAffectingSemantics$1.INSTANCE;
    private final Function1 onCommitAffectingLayout = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;
    private final Function1 onCommitAffectingLayoutModifier = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.INSTANCE;
    private final Function1 onCommitAffectingLayoutModifierInLookahead = OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.INSTANCE;
    private final Function1 onCommitAffectingLookahead = OwnerSnapshotObserver$onCommitAffectingLookahead$1.INSTANCE;

    public OwnerSnapshotObserver(Function1 function1) {
        this.observer = new SnapshotStateObserver(function1);
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z8, Function0 function0, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z8, function0);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z8, Function0 function0, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z8, function0);
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z8, Function0 function0, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z8, function0);
    }

    public final void clear$ui_release(Object obj) {
        this.observer.clear(obj);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(OwnerSnapshotObserver$clearInvalidObservations$1.INSTANCE);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(LayoutNode layoutNode, boolean z8, Function0 function0) {
        if (z8 && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifierInLookahead, function0);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifier, function0);
        }
    }

    public final void observeLayoutSnapshotReads$ui_release(LayoutNode layoutNode, boolean z8, Function0 function0) {
        if (z8 && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookahead, function0);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayout, function0);
        }
    }

    public final void observeMeasureSnapshotReads$ui_release(LayoutNode layoutNode, boolean z8, Function0 function0) {
        if (z8 && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookaheadMeasure, function0);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingMeasure, function0);
        }
    }

    public final <T extends OwnerScope> void observeReads$ui_release(T t8, Function1 function1, Function0 function0) {
        this.observer.observeReads(t8, function1, function0);
    }

    public final void observeSemanticsReads$ui_release(LayoutNode layoutNode, Function0 function0) {
        observeReads$ui_release(layoutNode, this.onCommitAffectingSemantics, function0);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
