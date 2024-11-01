package m1;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: m1.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3347C {

    /* renamed from: a, reason: collision with root package name */
    private final String f34838a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34839b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34840c;

    /* renamed from: d, reason: collision with root package name */
    private final long f34841d;

    /* renamed from: e, reason: collision with root package name */
    private final C3355e f34842e;

    /* renamed from: f, reason: collision with root package name */
    private final String f34843f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34844g;

    public C3347C(String sessionId, String firstSessionId, int i8, long j8, C3355e dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        AbstractC3292y.i(sessionId, "sessionId");
        AbstractC3292y.i(firstSessionId, "firstSessionId");
        AbstractC3292y.i(dataCollectionStatus, "dataCollectionStatus");
        AbstractC3292y.i(firebaseInstallationId, "firebaseInstallationId");
        AbstractC3292y.i(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f34838a = sessionId;
        this.f34839b = firstSessionId;
        this.f34840c = i8;
        this.f34841d = j8;
        this.f34842e = dataCollectionStatus;
        this.f34843f = firebaseInstallationId;
        this.f34844g = firebaseAuthenticationToken;
    }

    public final C3355e a() {
        return this.f34842e;
    }

    public final long b() {
        return this.f34841d;
    }

    public final String c() {
        return this.f34844g;
    }

    public final String d() {
        return this.f34843f;
    }

    public final String e() {
        return this.f34839b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3347C)) {
            return false;
        }
        C3347C c3347c = (C3347C) obj;
        if (AbstractC3292y.d(this.f34838a, c3347c.f34838a) && AbstractC3292y.d(this.f34839b, c3347c.f34839b) && this.f34840c == c3347c.f34840c && this.f34841d == c3347c.f34841d && AbstractC3292y.d(this.f34842e, c3347c.f34842e) && AbstractC3292y.d(this.f34843f, c3347c.f34843f) && AbstractC3292y.d(this.f34844g, c3347c.f34844g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34838a;
    }

    public final int g() {
        return this.f34840c;
    }

    public int hashCode() {
        return (((((((((((this.f34838a.hashCode() * 31) + this.f34839b.hashCode()) * 31) + this.f34840c) * 31) + androidx.collection.a.a(this.f34841d)) * 31) + this.f34842e.hashCode()) * 31) + this.f34843f.hashCode()) * 31) + this.f34844g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f34838a + ", firstSessionId=" + this.f34839b + ", sessionIndex=" + this.f34840c + ", eventTimestampUs=" + this.f34841d + ", dataCollectionStatus=" + this.f34842e + ", firebaseInstallationId=" + this.f34843f + ", firebaseAuthenticationToken=" + this.f34844g + ')';
    }
}
