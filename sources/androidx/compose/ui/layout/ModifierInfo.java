package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ModifierInfo {
    public static final int $stable = 8;
    private final LayoutCoordinates coordinates;
    private final Object extra;
    private final Modifier modifier;

    public ModifierInfo(Modifier modifier, LayoutCoordinates layoutCoordinates, Object obj) {
        this.modifier = modifier;
        this.coordinates = layoutCoordinates;
        this.extra = obj;
    }

    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    public final Object getExtra() {
        return this.extra;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public String toString() {
        return "ModifierInfo(" + this.modifier + ", " + this.coordinates + ", " + this.extra + ')';
    }

    public /* synthetic */ ModifierInfo(Modifier modifier, LayoutCoordinates layoutCoordinates, Object obj, int i8, AbstractC3284p abstractC3284p) {
        this(modifier, layoutCoordinates, (i8 & 4) != 0 ? null : obj);
    }
}
