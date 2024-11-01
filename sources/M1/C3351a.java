package m1;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3351a {

    /* renamed from: a, reason: collision with root package name */
    private final String f34864a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34865b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34866c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34867d;

    /* renamed from: e, reason: collision with root package name */
    private final u f34868e;

    /* renamed from: f, reason: collision with root package name */
    private final List f34869f;

    public C3351a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, u currentProcessDetails, List appProcessDetails) {
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(versionName, "versionName");
        AbstractC3292y.i(appBuildVersion, "appBuildVersion");
        AbstractC3292y.i(deviceManufacturer, "deviceManufacturer");
        AbstractC3292y.i(currentProcessDetails, "currentProcessDetails");
        AbstractC3292y.i(appProcessDetails, "appProcessDetails");
        this.f34864a = packageName;
        this.f34865b = versionName;
        this.f34866c = appBuildVersion;
        this.f34867d = deviceManufacturer;
        this.f34868e = currentProcessDetails;
        this.f34869f = appProcessDetails;
    }

    public final String a() {
        return this.f34866c;
    }

    public final List b() {
        return this.f34869f;
    }

    public final u c() {
        return this.f34868e;
    }

    public final String d() {
        return this.f34867d;
    }

    public final String e() {
        return this.f34864a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3351a)) {
            return false;
        }
        C3351a c3351a = (C3351a) obj;
        if (AbstractC3292y.d(this.f34864a, c3351a.f34864a) && AbstractC3292y.d(this.f34865b, c3351a.f34865b) && AbstractC3292y.d(this.f34866c, c3351a.f34866c) && AbstractC3292y.d(this.f34867d, c3351a.f34867d) && AbstractC3292y.d(this.f34868e, c3351a.f34868e) && AbstractC3292y.d(this.f34869f, c3351a.f34869f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34865b;
    }

    public int hashCode() {
        return (((((((((this.f34864a.hashCode() * 31) + this.f34865b.hashCode()) * 31) + this.f34866c.hashCode()) * 31) + this.f34867d.hashCode()) * 31) + this.f34868e.hashCode()) * 31) + this.f34869f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f34864a + ", versionName=" + this.f34865b + ", appBuildVersion=" + this.f34866c + ", deviceManufacturer=" + this.f34867d + ", currentProcessDetails=" + this.f34868e + ", appProcessDetails=" + this.f34869f + ')';
    }
}
