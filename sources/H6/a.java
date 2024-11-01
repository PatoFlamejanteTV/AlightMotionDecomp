package H6;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3250a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3251b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3252c;

    /* renamed from: d, reason: collision with root package name */
    public List f3253d;

    public a(String str, String str2, List list, List list2) {
        this.f3250a = str;
        this.f3251b = str2;
        this.f3252c = list;
        this.f3253d = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3292y.d(this.f3250a, aVar.f3250a) && AbstractC3292y.d(this.f3251b, aVar.f3251b) && AbstractC3292y.d(this.f3252c, aVar.f3252c) && AbstractC3292y.d(this.f3253d, aVar.f3253d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f3250a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f3251b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        List list = this.f3252c;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        List list2 = this.f3253d;
        if (list2 != null) {
            i8 = list2.hashCode();
        }
        return i11 + i8;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("MSPAConfig(jurisdiction=");
        a9.append((Object) this.f3250a);
        a9.append(", state=");
        a9.append((Object) this.f3251b);
        a9.append(", purposes=");
        a9.append(this.f3252c);
        a9.append(", applicablePurposes=");
        a9.append(this.f3253d);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ a(String str, String str2, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) == 0 ? null : "", (i8 & 4) != 0 ? AbstractC1435t.m() : list, (i8 & 8) != 0 ? AbstractC1435t.m() : null);
    }
}
