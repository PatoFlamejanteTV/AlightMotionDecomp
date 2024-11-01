package m1;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: m1.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3355e {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3354d f34920a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3354d f34921b;

    /* renamed from: c, reason: collision with root package name */
    private final double f34922c;

    public C3355e(EnumC3354d performance, EnumC3354d crashlytics, double d8) {
        AbstractC3292y.i(performance, "performance");
        AbstractC3292y.i(crashlytics, "crashlytics");
        this.f34920a = performance;
        this.f34921b = crashlytics;
        this.f34922c = d8;
    }

    public final EnumC3354d a() {
        return this.f34921b;
    }

    public final EnumC3354d b() {
        return this.f34920a;
    }

    public final double c() {
        return this.f34922c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3355e)) {
            return false;
        }
        C3355e c3355e = (C3355e) obj;
        if (this.f34920a == c3355e.f34920a && this.f34921b == c3355e.f34921b && Double.compare(this.f34922c, c3355e.f34922c) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34920a.hashCode() * 31) + this.f34921b.hashCode()) * 31) + androidx.compose.animation.core.b.a(this.f34922c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f34920a + ", crashlytics=" + this.f34921b + ", sessionSamplingRate=" + this.f34922c + ')';
    }
}
