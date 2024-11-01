package m1;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3352b {

    /* renamed from: a, reason: collision with root package name */
    private final String f34870a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34871b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34872c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34873d;

    /* renamed from: e, reason: collision with root package name */
    private final t f34874e;

    /* renamed from: f, reason: collision with root package name */
    private final C3351a f34875f;

    public C3352b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, t logEnvironment, C3351a androidAppInfo) {
        AbstractC3292y.i(appId, "appId");
        AbstractC3292y.i(deviceModel, "deviceModel");
        AbstractC3292y.i(sessionSdkVersion, "sessionSdkVersion");
        AbstractC3292y.i(osVersion, "osVersion");
        AbstractC3292y.i(logEnvironment, "logEnvironment");
        AbstractC3292y.i(androidAppInfo, "androidAppInfo");
        this.f34870a = appId;
        this.f34871b = deviceModel;
        this.f34872c = sessionSdkVersion;
        this.f34873d = osVersion;
        this.f34874e = logEnvironment;
        this.f34875f = androidAppInfo;
    }

    public final C3351a a() {
        return this.f34875f;
    }

    public final String b() {
        return this.f34870a;
    }

    public final String c() {
        return this.f34871b;
    }

    public final t d() {
        return this.f34874e;
    }

    public final String e() {
        return this.f34873d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3352b)) {
            return false;
        }
        C3352b c3352b = (C3352b) obj;
        if (AbstractC3292y.d(this.f34870a, c3352b.f34870a) && AbstractC3292y.d(this.f34871b, c3352b.f34871b) && AbstractC3292y.d(this.f34872c, c3352b.f34872c) && AbstractC3292y.d(this.f34873d, c3352b.f34873d) && this.f34874e == c3352b.f34874e && AbstractC3292y.d(this.f34875f, c3352b.f34875f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34872c;
    }

    public int hashCode() {
        return (((((((((this.f34870a.hashCode() * 31) + this.f34871b.hashCode()) * 31) + this.f34872c.hashCode()) * 31) + this.f34873d.hashCode()) * 31) + this.f34874e.hashCode()) * 31) + this.f34875f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f34870a + ", deviceModel=" + this.f34871b + ", sessionSdkVersion=" + this.f34872c + ", osVersion=" + this.f34873d + ", logEnvironment=" + this.f34874e + ", androidAppInfo=" + this.f34875f + ')';
    }
}
