package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class AndroidWindowInsets implements WindowInsets {
    private final MutableState insets$delegate;
    private final MutableState isVisible$delegate;
    private final String name;
    private final int type;

    public AndroidWindowInsets(int i8, String name) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        AbstractC3292y.i(name, "name");
        this.type = i8;
        this.name = name;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Insets.NONE, null, 2, null);
        this.insets$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.isVisible$delegate = mutableStateOf$default2;
    }

    private final void setVisible(boolean z8) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z8));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AndroidWindowInsets) && this.type == ((AndroidWindowInsets) obj).type) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3292y.i(density, "density");
        return getInsets$foundation_layout_release().bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Insets getInsets$foundation_layout_release() {
        return (Insets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        return getInsets$foundation_layout_release().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        return getInsets$foundation_layout_release().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3292y.i(density, "density");
        return getInsets$foundation_layout_release().top;
    }

    public final int getType$foundation_layout_release() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    public final void setInsets$foundation_layout_release(Insets insets) {
        AbstractC3292y.i(insets, "<set-?>");
        this.insets$delegate.setValue(insets);
    }

    public String toString() {
        return this.name + '(' + getInsets$foundation_layout_release().left + ", " + getInsets$foundation_layout_release().top + ", " + getInsets$foundation_layout_release().right + ", " + getInsets$foundation_layout_release().bottom + ')';
    }

    public final void update$foundation_layout_release(WindowInsetsCompat windowInsetsCompat, int i8) {
        AbstractC3292y.i(windowInsetsCompat, "windowInsetsCompat");
        if (i8 == 0 || (i8 & this.type) != 0) {
            setInsets$foundation_layout_release(windowInsetsCompat.getInsets(this.type));
            setVisible(windowInsetsCompat.isVisible(this.type));
        }
    }
}
