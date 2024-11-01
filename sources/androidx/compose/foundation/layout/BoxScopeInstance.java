package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BoxScopeInstance implements BoxScope {
    public static final BoxScopeInstance INSTANCE = new BoxScopeInstance();

    private BoxScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier align(Modifier modifier, Alignment alignment) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(alignment, "alignment");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new BoxScopeInstance$align$$inlined$debugInspectorInfo$1(alignment);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new BoxChildDataElement(alignment, false, noInspectorInfo));
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier matchParentSize(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        Alignment center = Alignment.Companion.getCenter();
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new BoxChildDataElement(center, true, noInspectorInfo));
    }
}
