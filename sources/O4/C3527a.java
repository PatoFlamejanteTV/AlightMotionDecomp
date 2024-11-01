package o4;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3527a {

    /* renamed from: a, reason: collision with root package name */
    private final long f35929a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35930b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35931c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35932d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35933e;

    public /* synthetic */ C3527a(long j8, long j9, long j10, long j11, long j12, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12);
    }

    public final long a() {
        return this.f35929a;
    }

    public final long b() {
        return this.f35931c;
    }

    public final long c() {
        return this.f35930b;
    }

    public final long d() {
        return this.f35933e;
    }

    public final long e() {
        return this.f35932d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3527a)) {
            return false;
        }
        C3527a c3527a = (C3527a) obj;
        if (Color.m2949equalsimpl0(this.f35929a, c3527a.f35929a) && Color.m2949equalsimpl0(this.f35930b, c3527a.f35930b) && Color.m2949equalsimpl0(this.f35931c, c3527a.f35931c) && Color.m2949equalsimpl0(this.f35932d, c3527a.f35932d) && Color.m2949equalsimpl0(this.f35933e, c3527a.f35933e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Color.m2955hashCodeimpl(this.f35929a) * 31) + Color.m2955hashCodeimpl(this.f35930b)) * 31) + Color.m2955hashCodeimpl(this.f35931c)) * 31) + Color.m2955hashCodeimpl(this.f35932d)) * 31) + Color.m2955hashCodeimpl(this.f35933e);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + Color.m2956toStringimpl(this.f35929a) + ", onBackground=" + Color.m2956toStringimpl(this.f35930b) + ", border=" + Color.m2956toStringimpl(this.f35931c) + ", successBackground=" + Color.m2956toStringimpl(this.f35932d) + ", onSuccessBackground=" + Color.m2956toStringimpl(this.f35933e) + ")";
    }

    private C3527a(long j8, long j9, long j10, long j11, long j12) {
        this.f35929a = j8;
        this.f35930b = j9;
        this.f35931c = j10;
        this.f35932d = j11;
        this.f35933e = j12;
    }
}
