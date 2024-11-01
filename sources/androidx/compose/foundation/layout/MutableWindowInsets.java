package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public final class MutableWindowInsets implements WindowInsets {
    public static final int $stable = 0;
    private final MutableState insets$delegate;

    public MutableWindowInsets() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3292y.i(density, "density");
        return getInsets().getBottom(density);
    }

    public final WindowInsets getInsets() {
        return (WindowInsets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        return getInsets().getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        return getInsets().getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3292y.i(density, "density");
        return getInsets().getTop(density);
    }

    public final void setInsets(WindowInsets windowInsets) {
        AbstractC3292y.i(windowInsets, "<set-?>");
        this.insets$delegate.setValue(windowInsets);
    }

    public MutableWindowInsets(WindowInsets initialInsets) {
        MutableState mutableStateOf$default;
        AbstractC3292y.i(initialInsets, "initialInsets");
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialInsets, null, 2, null);
        this.insets$delegate = mutableStateOf$default;
    }

    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }
}
