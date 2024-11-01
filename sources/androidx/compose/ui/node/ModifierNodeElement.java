package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.InspectorInfo;
import c6.InterfaceC2072n;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.U;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    public static final int $stable = 0;
    private InspectorInfo _inspectorValues;

    private final InspectorInfo getInspectorValues() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo == null) {
            InspectorInfo inspectorInfo2 = new InspectorInfo();
            inspectorInfo2.setName(U.b(getClass()).b());
            inspectableProperties(inspectorInfo2);
            this._inspectorValues = inspectorInfo2;
            return inspectorInfo2;
        }
        return inspectorInfo;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    public abstract N create();

    public abstract boolean equals(Object obj);

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final InterfaceC3255g getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    public abstract int hashCode();

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Actual_jvmKt.tryPopulateReflectively(inspectorInfo, this);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    public abstract void update(N n8);
}
