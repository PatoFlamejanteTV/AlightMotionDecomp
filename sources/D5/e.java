package D5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Map f1371a;

    public e(Map googleVendorsInfoList) {
        AbstractC3292y.i(googleVendorsInfoList, "googleVendorsInfoList");
        this.f1371a = googleVendorsInfoList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && AbstractC3292y.d(this.f1371a, ((e) obj).f1371a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1371a.hashCode();
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("GoogleVendorList(googleVendorsInfoList=");
        a9.append(this.f1371a);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ e(Map map, int i8) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : null);
    }
}
