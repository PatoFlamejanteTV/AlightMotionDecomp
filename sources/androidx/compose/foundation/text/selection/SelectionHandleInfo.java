package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SelectionHandleInfo {
    private final Handle handle;
    private final long position;

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j8, AbstractC3284p abstractC3284p) {
        this(handle, j8);
    }

    /* renamed from: copy-Uv8p0NA$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m1002copyUv8p0NA$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i8 & 2) != 0) {
            j8 = selectionHandleInfo.position;
        }
        return selectionHandleInfo.m1004copyUv8p0NA(handle, j8);
    }

    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m1003component2F1C5BW0() {
        return this.position;
    }

    /* renamed from: copy-Uv8p0NA, reason: not valid java name */
    public final SelectionHandleInfo m1004copyUv8p0NA(Handle handle, long j8) {
        AbstractC3292y.i(handle, "handle");
        return new SelectionHandleInfo(handle, j8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.handle == selectionHandleInfo.handle && Offset.m2709equalsimpl0(this.position, selectionHandleInfo.position);
    }

    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1005getPositionF1C5BW0() {
        return this.position;
    }

    public int hashCode() {
        return (this.handle.hashCode() * 31) + Offset.m2714hashCodeimpl(this.position);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m2720toStringimpl(this.position)) + ')';
    }

    private SelectionHandleInfo(Handle handle, long j8) {
        AbstractC3292y.i(handle, "handle");
        this.handle = handle;
        this.position = j8;
    }
}
