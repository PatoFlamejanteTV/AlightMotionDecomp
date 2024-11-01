package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import c6.InterfaceC2072n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends ModifierNodeElement<SuspendingPointerInputModifierNodeImpl> {
    public static final int $stable = 0;
    private final Object key1;
    private final Object key2;
    private final Object[] keys;
    private final InterfaceC2072n pointerInputHandler;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, InterfaceC2072n interfaceC2072n, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : obj, (i8 & 2) != 0 ? null : obj2, (i8 & 4) != 0 ? null : objArr, interfaceC2072n);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!AbstractC3292y.d(this.key1, suspendPointerInputElement.key1) || !AbstractC3292y.d(this.key2, suspendPointerInputElement.key2)) {
            return false;
        }
        Object[] objArr = this.keys;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.keys;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.keys != null) {
            return false;
        }
        return true;
    }

    public final Object getKey1() {
        return this.key1;
    }

    public final Object getKey2() {
        return this.key2;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final InterfaceC2072n getPointerInputHandler() {
        return this.pointerInputHandler;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i8;
        int i9;
        Object obj = this.key1;
        int i10 = 0;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = i8 * 31;
        Object obj2 = this.key2;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i11 + i9) * 31;
        Object[] objArr = this.keys;
        if (objArr != null) {
            i10 = Arrays.hashCode(objArr);
        }
        return i12 + i10;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerInput");
        inspectorInfo.getProperties().set("key1", this.key1);
        inspectorInfo.getProperties().set("key2", this.key2);
        inspectorInfo.getProperties().set("keys", this.keys);
        inspectorInfo.getProperties().set("pointerInputHandler", this.pointerInputHandler);
    }

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, InterfaceC2072n interfaceC2072n) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this.pointerInputHandler = interfaceC2072n;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SuspendingPointerInputModifierNodeImpl create() {
        return new SuspendingPointerInputModifierNodeImpl(this.pointerInputHandler);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl) {
        suspendingPointerInputModifierNodeImpl.setPointerInputHandler(this.pointerInputHandler);
    }
}
