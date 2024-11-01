package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;
    private InspectorInfo _values;
    private final Function1 info;

    public InspectorValueInfo(Function1 function1) {
        this.info = function1;
    }

    private final InspectorInfo getValues() {
        InspectorInfo inspectorInfo = this._values;
        if (inspectorInfo == null) {
            inspectorInfo = new InspectorInfo();
            this.info.invoke(inspectorInfo);
        }
        this._values = inspectorInfo;
        return inspectorInfo;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public InterfaceC3255g getInspectableElements() {
        return getValues().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getNameFallback() {
        return getValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public Object getValueOverride() {
        return getValues().getValue();
    }
}
