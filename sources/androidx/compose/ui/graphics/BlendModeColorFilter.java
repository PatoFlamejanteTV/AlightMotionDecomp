package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class BlendModeColorFilter extends ColorFilter {
    private final int blendMode;
    private final long color;

    public /* synthetic */ BlendModeColorFilter(long j8, int i8, android.graphics.ColorFilter colorFilter, AbstractC3284p abstractC3284p) {
        this(j8, i8, colorFilter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        if (Color.m2949equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m2865equalsimpl0(this.blendMode, blendModeColorFilter.blendMode)) {
            return true;
        }
        return false;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m2898getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m2899getColor0d7_KjU() {
        return this.color;
    }

    public int hashCode() {
        return (Color.m2955hashCodeimpl(this.color) * 31) + BlendMode.m2866hashCodeimpl(this.blendMode);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) Color.m2956toStringimpl(this.color)) + ", blendMode=" + ((Object) BlendMode.m2867toStringimpl(this.blendMode)) + ')';
    }

    public /* synthetic */ BlendModeColorFilter(long j8, int i8, AbstractC3284p abstractC3284p) {
        this(j8, i8);
    }

    private BlendModeColorFilter(long j8, int i8, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j8;
        this.blendMode = i8;
    }

    private BlendModeColorFilter(long j8, int i8) {
        this(j8, i8, AndroidColorFilter_androidKt.m2820actualTintColorFilterxETnrds(j8, i8), null);
    }
}
