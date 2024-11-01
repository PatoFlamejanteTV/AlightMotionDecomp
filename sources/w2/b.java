package W2;

import androidx.compose.material.Colors;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f10751a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10752b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10753c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10754d;

    /* renamed from: e, reason: collision with root package name */
    private final Colors f10755e;

    public /* synthetic */ b(long j8, long j9, long j10, long j11, Colors colors, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, colors);
    }

    public static /* synthetic */ b b(b bVar, long j8, long j9, long j10, long j11, Colors colors, int i8, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        Colors colors2;
        if ((i8 & 1) != 0) {
            j12 = bVar.f10751a;
        } else {
            j12 = j8;
        }
        if ((i8 & 2) != 0) {
            j13 = bVar.f10752b;
        } else {
            j13 = j9;
        }
        if ((i8 & 4) != 0) {
            j14 = bVar.f10753c;
        } else {
            j14 = j10;
        }
        if ((i8 & 8) != 0) {
            j15 = bVar.f10754d;
        } else {
            j15 = j11;
        }
        if ((i8 & 16) != 0) {
            colors2 = bVar.f10755e;
        } else {
            colors2 = colors;
        }
        return bVar.a(j12, j13, j14, j15, colors2);
    }

    public final b a(long j8, long j9, long j10, long j11, Colors materialColors) {
        AbstractC3292y.i(materialColors, "materialColors");
        return new b(j8, j9, j10, j11, materialColors, null);
    }

    public final long c() {
        return this.f10752b;
    }

    public final long d() {
        return this.f10751a;
    }

    public final long e() {
        return this.f10754d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Color.m2949equalsimpl0(this.f10751a, bVar.f10751a) && Color.m2949equalsimpl0(this.f10752b, bVar.f10752b) && Color.m2949equalsimpl0(this.f10753c, bVar.f10753c) && Color.m2949equalsimpl0(this.f10754d, bVar.f10754d) && AbstractC3292y.d(this.f10755e, bVar.f10755e)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f10753c;
    }

    public final Colors g() {
        return this.f10755e;
    }

    public int hashCode() {
        return (((((((Color.m2955hashCodeimpl(this.f10751a) * 31) + Color.m2955hashCodeimpl(this.f10752b)) * 31) + Color.m2955hashCodeimpl(this.f10753c)) * 31) + Color.m2955hashCodeimpl(this.f10754d)) * 31) + this.f10755e.hashCode();
    }

    public String toString() {
        return "LinkColors(buttonLabel=" + Color.m2956toStringimpl(this.f10751a) + ", actionLabelLight=" + Color.m2956toStringimpl(this.f10752b) + ", errorText=" + Color.m2956toStringimpl(this.f10753c) + ", errorComponentBackground=" + Color.m2956toStringimpl(this.f10754d) + ", materialColors=" + this.f10755e + ")";
    }

    private b(long j8, long j9, long j10, long j11, Colors materialColors) {
        AbstractC3292y.i(materialColors, "materialColors");
        this.f10751a = j8;
        this.f10752b = j9;
        this.f10753c = j10;
        this.f10754d = j11;
        this.f10755e = materialColors;
    }
}
