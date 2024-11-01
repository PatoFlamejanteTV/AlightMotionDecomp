package O3;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final long f7223a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7224b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7225c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7226d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7227e;

    public /* synthetic */ K(long j8, long j9, long j10, long j11, long j12, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12);
    }

    public final long a() {
        return this.f7223a;
    }

    public final long b() {
        return this.f7227e;
    }

    public final long c() {
        return this.f7224b;
    }

    public final long d() {
        return this.f7226d;
    }

    public final long e() {
        return this.f7225c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        if (Color.m2949equalsimpl0(this.f7223a, k8.f7223a) && Color.m2949equalsimpl0(this.f7224b, k8.f7224b) && Color.m2949equalsimpl0(this.f7225c, k8.f7225c) && Color.m2949equalsimpl0(this.f7226d, k8.f7226d) && Color.m2949equalsimpl0(this.f7227e, k8.f7227e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Color.m2955hashCodeimpl(this.f7223a) * 31) + Color.m2955hashCodeimpl(this.f7224b)) * 31) + Color.m2955hashCodeimpl(this.f7225c)) * 31) + Color.m2955hashCodeimpl(this.f7226d)) * 31) + Color.m2955hashCodeimpl(this.f7227e);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + Color.m2956toStringimpl(this.f7223a) + ", onBackground=" + Color.m2956toStringimpl(this.f7224b) + ", successBackground=" + Color.m2956toStringimpl(this.f7225c) + ", onSuccessBackground=" + Color.m2956toStringimpl(this.f7226d) + ", border=" + Color.m2956toStringimpl(this.f7227e) + ")";
    }

    private K(long j8, long j9, long j10, long j11, long j12) {
        this.f7223a = j8;
        this.f7224b = j9;
        this.f7225c = j10;
        this.f7226d = j11;
        this.f7227e = j12;
    }

    public /* synthetic */ K(long j8, long j9, long j10, long j11, long j12, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j9, (i8 & 4) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j10, (i8 & 8) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j11, (i8 & 16) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j12, null);
    }
}
