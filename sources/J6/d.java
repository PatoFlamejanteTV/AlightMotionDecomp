package J6;

import D5.t;
import G6.l;
import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f4486a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4487b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4488c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4489d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4490e;

    /* renamed from: f, reason: collision with root package name */
    public final List f4491f;

    /* renamed from: g, reason: collision with root package name */
    public final List f4492g;

    public d(int i8, String pCode, String name, String description, String privacyPolicyUrl, List nonIabPurposeConsentIds, List nonIabPurposeLegitimateInterestIds) {
        AbstractC3292y.i(pCode, "pCode");
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(description, "description");
        AbstractC3292y.i(privacyPolicyUrl, "privacyPolicyUrl");
        AbstractC3292y.i(nonIabPurposeConsentIds, "nonIabPurposeConsentIds");
        AbstractC3292y.i(nonIabPurposeLegitimateInterestIds, "nonIabPurposeLegitimateInterestIds");
        this.f4486a = i8;
        this.f4487b = pCode;
        this.f4488c = name;
        this.f4489d = description;
        this.f4490e = privacyPolicyUrl;
        this.f4491f = nonIabPurposeConsentIds;
        this.f4492g = nonIabPurposeLegitimateInterestIds;
    }

    public final l a() {
        return new l(this.f4486a, this.f4488c, this.f4489d, AbstractC1435t.a1(this.f4491f), AbstractC1435t.a1(this.f4492g), null, null, null, null, this.f4490e, null, null, 0, false, false, null, null, null, null, null, 914912);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f4486a == dVar.f4486a && AbstractC3292y.d(this.f4487b, dVar.f4487b) && AbstractC3292y.d(this.f4488c, dVar.f4488c) && AbstractC3292y.d(this.f4489d, dVar.f4489d) && AbstractC3292y.d(this.f4490e, dVar.f4490e) && AbstractC3292y.d(this.f4491f, dVar.f4491f) && AbstractC3292y.d(this.f4492g, dVar.f4492g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f4492g.hashCode() + H6.l.a(this.f4491f, t.a(this.f4490e, t.a(this.f4489d, t.a(this.f4488c, t.a(this.f4487b, this.f4486a * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("NonIABVendor(vendorId=");
        a9.append(this.f4486a);
        a9.append(", pCode=");
        a9.append(this.f4487b);
        a9.append(", name=");
        a9.append(this.f4488c);
        a9.append(", description=");
        a9.append(this.f4489d);
        a9.append(", privacyPolicyUrl=");
        a9.append(this.f4490e);
        a9.append(", nonIabPurposeConsentIds=");
        a9.append(this.f4491f);
        a9.append(", nonIabPurposeLegitimateInterestIds=");
        a9.append(this.f4492g);
        a9.append(')');
        return a9.toString();
    }
}
