package J6;

import S7.i;
import S7.n;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public g f4496a;

    /* renamed from: b, reason: collision with root package name */
    public a f4497b;

    /* renamed from: c, reason: collision with root package name */
    public e f4498c;

    /* renamed from: d, reason: collision with root package name */
    public S7.e f4499d;

    /* renamed from: e, reason: collision with root package name */
    public i f4500e;

    /* renamed from: f, reason: collision with root package name */
    public n f4501f;

    public f(g premiumProperties, a coreConfig, e nonIabVendorsInfo, S7.e coreUiLabels, i mobileUiLabels, n premiumUiLabels) {
        AbstractC3292y.i(premiumProperties, "premiumProperties");
        AbstractC3292y.i(coreConfig, "coreConfig");
        AbstractC3292y.i(nonIabVendorsInfo, "nonIabVendorsInfo");
        AbstractC3292y.i(coreUiLabels, "coreUiLabels");
        AbstractC3292y.i(mobileUiLabels, "mobileUiLabels");
        AbstractC3292y.i(premiumUiLabels, "premiumUiLabels");
        this.f4496a = premiumProperties;
        this.f4497b = coreConfig;
        this.f4498c = nonIabVendorsInfo;
        this.f4499d = coreUiLabels;
        this.f4500e = mobileUiLabels;
        this.f4501f = premiumUiLabels;
    }

    public final a a() {
        return this.f4497b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3292y.d(this.f4496a, fVar.f4496a) && AbstractC3292y.d(this.f4497b, fVar.f4497b) && AbstractC3292y.d(this.f4498c, fVar.f4498c) && AbstractC3292y.d(this.f4499d, fVar.f4499d) && AbstractC3292y.d(this.f4500e, fVar.f4500e) && AbstractC3292y.d(this.f4501f, fVar.f4501f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f4501f.hashCode() + ((this.f4500e.hashCode() + ((this.f4499d.hashCode() + ((this.f4498c.hashCode() + ((this.f4497b.hashCode() + (this.f4496a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("PortalConfig(premiumProperties=");
        a9.append(this.f4496a);
        a9.append(", coreConfig=");
        a9.append(this.f4497b);
        a9.append(", nonIabVendorsInfo=");
        a9.append(this.f4498c);
        a9.append(", coreUiLabels=");
        a9.append(this.f4499d);
        a9.append(", mobileUiLabels=");
        a9.append(this.f4500e);
        a9.append(", premiumUiLabels=");
        a9.append(this.f4501f);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ f(g gVar, a aVar, e eVar, S7.e eVar2, i iVar, n nVar, int i8) {
        this((i8 & 1) != 0 ? new g(null, null, null, 7) : gVar, (i8 & 2) != 0 ? new a(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, null, false, null, null, null, null, false, null, -1, 8191) : aVar, (i8 & 4) != 0 ? new e(null, null, null, 7) : eVar, (i8 & 8) != 0 ? new S7.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143) : eVar2, (i8 & 16) != 0 ? new i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767) : null, (i8 & 32) != 0 ? new n(null, null, null, null, null, null, null, null, null, null, 1023) : nVar);
    }
}
