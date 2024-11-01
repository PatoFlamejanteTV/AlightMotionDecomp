package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ObserverModifierNodeKt {
    public static final <T extends Modifier.Node & ObserverModifierNode> void observeReads(T t8, Function0 function0) {
        ObserverNodeOwnerScope ownerScope$ui_release = t8.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new ObserverNodeOwnerScope(t8);
            t8.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        DelegatableNodeKt.requireOwner(t8).getSnapshotObserver().observeReads$ui_release(ownerScope$ui_release, ObserverNodeOwnerScope.Companion.getOnObserveReadsChanged$ui_release(), function0);
    }
}
