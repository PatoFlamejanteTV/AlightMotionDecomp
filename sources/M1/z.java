package m1;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3359i f34993a;

    /* renamed from: b, reason: collision with root package name */
    private final C3347C f34994b;

    /* renamed from: c, reason: collision with root package name */
    private final C3352b f34995c;

    public z(EnumC3359i eventType, C3347C sessionData, C3352b applicationInfo) {
        AbstractC3292y.i(eventType, "eventType");
        AbstractC3292y.i(sessionData, "sessionData");
        AbstractC3292y.i(applicationInfo, "applicationInfo");
        this.f34993a = eventType;
        this.f34994b = sessionData;
        this.f34995c = applicationInfo;
    }

    public final C3352b a() {
        return this.f34995c;
    }

    public final EnumC3359i b() {
        return this.f34993a;
    }

    public final C3347C c() {
        return this.f34994b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f34993a == zVar.f34993a && AbstractC3292y.d(this.f34994b, zVar.f34994b) && AbstractC3292y.d(this.f34995c, zVar.f34995c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34993a.hashCode() * 31) + this.f34994b.hashCode()) * 31) + this.f34995c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f34993a + ", sessionData=" + this.f34994b + ", applicationInfo=" + this.f34995c + ')';
    }
}
