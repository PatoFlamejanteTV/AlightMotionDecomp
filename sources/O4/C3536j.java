package o4;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;

/* renamed from: o4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3536j {

    /* renamed from: a, reason: collision with root package name */
    private final float f35995a;

    /* renamed from: b, reason: collision with root package name */
    private final float f35996b;

    /* renamed from: c, reason: collision with root package name */
    private final float f35997c;

    public C3536j(float f8, float f9, float f10) {
        this.f35995a = f8;
        this.f35996b = f9;
        this.f35997c = f10;
    }

    public static /* synthetic */ C3536j b(C3536j c3536j, float f8, float f9, float f10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = c3536j.f35995a;
        }
        if ((i8 & 2) != 0) {
            f9 = c3536j.f35996b;
        }
        if ((i8 & 4) != 0) {
            f10 = c3536j.f35997c;
        }
        return c3536j.a(f8, f9, f10);
    }

    public final C3536j a(float f8, float f9, float f10) {
        return new C3536j(f8, f9, f10);
    }

    public final float c() {
        return this.f35996b;
    }

    public final float d() {
        return this.f35997c;
    }

    public final float e() {
        return this.f35995a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3536j)) {
            return false;
        }
        C3536j c3536j = (C3536j) obj;
        if (Float.compare(this.f35995a, c3536j.f35995a) == 0 && Float.compare(this.f35996b, c3536j.f35996b) == 0 && Float.compare(this.f35997c, c3536j.f35997c) == 0) {
            return true;
        }
        return false;
    }

    public final Shape f() {
        return RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl(this.f35995a));
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f35995a) * 31) + Float.floatToIntBits(this.f35996b)) * 31) + Float.floatToIntBits(this.f35997c);
    }

    public String toString() {
        return "StripeShapes(cornerRadius=" + this.f35995a + ", borderStrokeWidth=" + this.f35996b + ", borderStrokeWidthSelected=" + this.f35997c + ")";
    }
}
