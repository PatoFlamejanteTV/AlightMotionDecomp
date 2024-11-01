package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class InspectableValueKt {
    private static final Function1 NoInspectorInfo = InspectableValueKt$NoInspectorInfo$1.INSTANCE;
    private static boolean isDebugInspectorInfoEnabled;

    public static final Function1 debugInspectorInfo(Function1 function1) {
        if (isDebugInspectorInfoEnabled()) {
            return new InspectableValueKt$debugInspectorInfo$1(function1);
        }
        return getNoInspectorInfo();
    }

    public static final Function1 getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    public static final Modifier inspectable(Modifier modifier, Function1 function1, Function1 function12) {
        return inspectableWrapper(modifier, function1, (Modifier) function12.invoke(Modifier.Companion));
    }

    public static final Modifier inspectableWrapper(Modifier modifier, Function1 function1, Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(function1);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z8) {
        isDebugInspectorInfoEnabled = z8;
    }
}
