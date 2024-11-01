package J6;

import D5.t;
import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public List f4493a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4494b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4495c;

    public e(List nonIabVendorList, String updateAt, String nonIabVendorsHash) {
        AbstractC3292y.i(nonIabVendorList, "nonIabVendorList");
        AbstractC3292y.i(updateAt, "updateAt");
        AbstractC3292y.i(nonIabVendorsHash, "nonIabVendorsHash");
        this.f4493a = nonIabVendorList;
        this.f4494b = updateAt;
        this.f4495c = nonIabVendorsHash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3292y.d(this.f4493a, eVar.f4493a) && AbstractC3292y.d(this.f4494b, eVar.f4494b) && AbstractC3292y.d(this.f4495c, eVar.f4495c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f4495c.hashCode() + t.a(this.f4494b, this.f4493a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("NonIabVendorsInfo(nonIabVendorList=");
        a9.append(this.f4493a);
        a9.append(", updateAt=");
        a9.append(this.f4494b);
        a9.append(", nonIabVendorsHash=");
        a9.append(this.f4495c);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ e(List list, String str, String str2, int i8) {
        this((i8 & 1) != 0 ? AbstractC1435t.m() : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : null);
    }
}
