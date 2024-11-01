package m1;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final String f34989a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34990b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34991c;

    /* renamed from: d, reason: collision with root package name */
    private final long f34992d;

    public y(String sessionId, String firstSessionId, int i8, long j8) {
        AbstractC3292y.i(sessionId, "sessionId");
        AbstractC3292y.i(firstSessionId, "firstSessionId");
        this.f34989a = sessionId;
        this.f34990b = firstSessionId;
        this.f34991c = i8;
        this.f34992d = j8;
    }

    public final String a() {
        return this.f34990b;
    }

    public final String b() {
        return this.f34989a;
    }

    public final int c() {
        return this.f34991c;
    }

    public final long d() {
        return this.f34992d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (AbstractC3292y.d(this.f34989a, yVar.f34989a) && AbstractC3292y.d(this.f34990b, yVar.f34990b) && this.f34991c == yVar.f34991c && this.f34992d == yVar.f34992d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f34989a.hashCode() * 31) + this.f34990b.hashCode()) * 31) + this.f34991c) * 31) + androidx.collection.a.a(this.f34992d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f34989a + ", firstSessionId=" + this.f34990b + ", sessionIndex=" + this.f34991c + ", sessionStartTimestampUs=" + this.f34992d + ')';
    }
}
