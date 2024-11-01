package O3;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final float f7233a;

    /* renamed from: b, reason: collision with root package name */
    private final float f7234b;

    public /* synthetic */ M(float f8, float f9, AbstractC3284p abstractC3284p) {
        this(f8, f9);
    }

    public final float a() {
        return this.f7234b;
    }

    public final float b() {
        return this.f7233a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        if (Dp.m5160equalsimpl0(this.f7233a, m8.f7233a) && Dp.m5160equalsimpl0(this.f7234b, m8.f7234b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Dp.m5161hashCodeimpl(this.f7233a) * 31) + Dp.m5161hashCodeimpl(this.f7234b);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + Dp.m5166toStringimpl(this.f7233a) + ", borderStrokeWidth=" + Dp.m5166toStringimpl(this.f7234b) + ")";
    }

    private M(float f8, float f9) {
        this.f7233a = f8;
        this.f7234b = f9;
    }

    public /* synthetic */ M(float f8, float f9, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Dp.Companion.m5175getUnspecifiedD9Ej5fM() : f8, (i8 & 2) != 0 ? Dp.Companion.m5175getUnspecifiedD9Ej5fM() : f9, null);
    }
}
