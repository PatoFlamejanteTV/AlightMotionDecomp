package o4;

import androidx.compose.material.Colors;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: o4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3534h {

    /* renamed from: a, reason: collision with root package name */
    private final long f35983a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35984b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35985c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35986d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35987e;

    /* renamed from: f, reason: collision with root package name */
    private final long f35988f;

    /* renamed from: g, reason: collision with root package name */
    private final long f35989g;

    /* renamed from: h, reason: collision with root package name */
    private final long f35990h;

    /* renamed from: i, reason: collision with root package name */
    private final Colors f35991i;

    public /* synthetic */ C3534h(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors colors, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, colors);
    }

    public static /* synthetic */ C3534h b(C3534h c3534h, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors colors, int i8, Object obj) {
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        Colors colors2;
        if ((i8 & 1) != 0) {
            j16 = c3534h.f35983a;
        } else {
            j16 = j8;
        }
        if ((i8 & 2) != 0) {
            j17 = c3534h.f35984b;
        } else {
            j17 = j9;
        }
        if ((i8 & 4) != 0) {
            j18 = c3534h.f35985c;
        } else {
            j18 = j10;
        }
        if ((i8 & 8) != 0) {
            j19 = c3534h.f35986d;
        } else {
            j19 = j11;
        }
        if ((i8 & 16) != 0) {
            j20 = c3534h.f35987e;
        } else {
            j20 = j12;
        }
        if ((i8 & 32) != 0) {
            j21 = c3534h.f35988f;
        } else {
            j21 = j13;
        }
        if ((i8 & 64) != 0) {
            j22 = c3534h.f35989g;
        } else {
            j22 = j14;
        }
        long j24 = j22;
        if ((i8 & 128) != 0) {
            j23 = c3534h.f35990h;
        } else {
            j23 = j15;
        }
        if ((i8 & 256) != 0) {
            colors2 = c3534h.f35991i;
        } else {
            colors2 = colors;
        }
        return c3534h.a(j16, j17, j18, j19, j20, j21, j24, j23, colors2);
    }

    public final C3534h a(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors materialColors) {
        AbstractC3292y.i(materialColors, "materialColors");
        return new C3534h(j8, j9, j10, j11, j12, j13, j14, j15, materialColors, null);
    }

    public final long c() {
        return this.f35990h;
    }

    public final long d() {
        return this.f35983a;
    }

    public final long e() {
        return this.f35984b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3534h)) {
            return false;
        }
        C3534h c3534h = (C3534h) obj;
        if (Color.m2949equalsimpl0(this.f35983a, c3534h.f35983a) && Color.m2949equalsimpl0(this.f35984b, c3534h.f35984b) && Color.m2949equalsimpl0(this.f35985c, c3534h.f35985c) && Color.m2949equalsimpl0(this.f35986d, c3534h.f35986d) && Color.m2949equalsimpl0(this.f35987e, c3534h.f35987e) && Color.m2949equalsimpl0(this.f35988f, c3534h.f35988f) && Color.m2949equalsimpl0(this.f35989g, c3534h.f35989g) && Color.m2949equalsimpl0(this.f35990h, c3534h.f35990h) && AbstractC3292y.d(this.f35991i, c3534h.f35991i)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f35985c;
    }

    public final Colors g() {
        return this.f35991i;
    }

    public final long h() {
        return this.f35986d;
    }

    public int hashCode() {
        return (((((((((((((((Color.m2955hashCodeimpl(this.f35983a) * 31) + Color.m2955hashCodeimpl(this.f35984b)) * 31) + Color.m2955hashCodeimpl(this.f35985c)) * 31) + Color.m2955hashCodeimpl(this.f35986d)) * 31) + Color.m2955hashCodeimpl(this.f35987e)) * 31) + Color.m2955hashCodeimpl(this.f35988f)) * 31) + Color.m2955hashCodeimpl(this.f35989g)) * 31) + Color.m2955hashCodeimpl(this.f35990h)) * 31) + this.f35991i.hashCode();
    }

    public final long i() {
        return this.f35989g;
    }

    public final long j() {
        return this.f35987e;
    }

    public final long k() {
        return this.f35988f;
    }

    public String toString() {
        return "StripeColors(component=" + Color.m2956toStringimpl(this.f35983a) + ", componentBorder=" + Color.m2956toStringimpl(this.f35984b) + ", componentDivider=" + Color.m2956toStringimpl(this.f35985c) + ", onComponent=" + Color.m2956toStringimpl(this.f35986d) + ", subtitle=" + Color.m2956toStringimpl(this.f35987e) + ", textCursor=" + Color.m2956toStringimpl(this.f35988f) + ", placeholderText=" + Color.m2956toStringimpl(this.f35989g) + ", appBarIcon=" + Color.m2956toStringimpl(this.f35990h) + ", materialColors=" + this.f35991i + ")";
    }

    private C3534h(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Colors materialColors) {
        AbstractC3292y.i(materialColors, "materialColors");
        this.f35983a = j8;
        this.f35984b = j9;
        this.f35985c = j10;
        this.f35986d = j11;
        this.f35987e = j12;
        this.f35988f = j13;
        this.f35989g = j14;
        this.f35990h = j15;
        this.f35991i = materialColors;
    }
}
