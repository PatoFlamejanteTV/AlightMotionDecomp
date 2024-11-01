package o4;

import androidx.compose.material.Shapes;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: o4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3535i {

    /* renamed from: a, reason: collision with root package name */
    private final float f35992a;

    /* renamed from: b, reason: collision with root package name */
    private final float f35993b;

    /* renamed from: c, reason: collision with root package name */
    private final Shapes f35994c;

    public /* synthetic */ C3535i(float f8, float f9, Shapes shapes, AbstractC3284p abstractC3284p) {
        this(f8, f9, shapes);
    }

    public final Shapes a() {
        return this.f35994c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3535i)) {
            return false;
        }
        C3535i c3535i = (C3535i) obj;
        if (Dp.m5160equalsimpl0(this.f35992a, c3535i.f35992a) && Dp.m5160equalsimpl0(this.f35993b, c3535i.f35993b) && AbstractC3292y.d(this.f35994c, c3535i.f35994c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Dp.m5161hashCodeimpl(this.f35992a) * 31) + Dp.m5161hashCodeimpl(this.f35993b)) * 31) + this.f35994c.hashCode();
    }

    public String toString() {
        return "StripeComposeShapes(borderStrokeWidth=" + Dp.m5166toStringimpl(this.f35992a) + ", borderStrokeWidthSelected=" + Dp.m5166toStringimpl(this.f35993b) + ", material=" + this.f35994c + ")";
    }

    private C3535i(float f8, float f9, Shapes material) {
        AbstractC3292y.i(material, "material");
        this.f35992a = f8;
        this.f35993b = f9;
        this.f35994c = material;
    }
}
