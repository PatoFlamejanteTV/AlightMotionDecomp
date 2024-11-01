package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class ValueInsets implements WindowInsets {
    private final String name;
    private final MutableState value$delegate;

    public ValueInsets(InsetsValues insets, String name) {
        MutableState mutableStateOf$default;
        AbstractC3292y.i(insets, "insets");
        AbstractC3292y.i(name, "name");
        this.name = name;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(insets, null, 2, null);
        this.value$delegate = mutableStateOf$default;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValueInsets)) {
            return false;
        }
        return AbstractC3292y.d(getValue$foundation_layout_release(), ((ValueInsets) obj).getValue$foundation_layout_release());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3292y.i(density, "density");
        return getValue$foundation_layout_release().getBottom();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        return getValue$foundation_layout_release().getLeft();
    }

    public final String getName() {
        return this.name;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        return getValue$foundation_layout_release().getRight();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3292y.i(density, "density");
        return getValue$foundation_layout_release().getTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InsetsValues getValue$foundation_layout_release() {
        return (InsetsValues) this.value$delegate.getValue();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final void setValue$foundation_layout_release(InsetsValues insetsValues) {
        AbstractC3292y.i(insetsValues, "<set-?>");
        this.value$delegate.setValue(insetsValues);
    }

    public String toString() {
        return this.name + "(left=" + getValue$foundation_layout_release().getLeft() + ", top=" + getValue$foundation_layout_release().getTop() + ", right=" + getValue$foundation_layout_release().getRight() + ", bottom=" + getValue$foundation_layout_release().getBottom() + ')';
    }
}
