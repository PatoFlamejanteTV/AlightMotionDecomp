package H6;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3282b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f3283c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f3284d;

    /* renamed from: e, reason: collision with root package name */
    public final L5.a f3285e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3286f;

    /* renamed from: g, reason: collision with root package name */
    public List f3287g;

    public e(Integer num, String str, Boolean bool, Boolean bool2, L5.a aVar, List list, List list2) {
        this.f3281a = num;
        this.f3282b = str;
        this.f3283c = bool;
        this.f3284d = bool2;
        this.f3285e = aVar;
        this.f3286f = list;
        this.f3287g = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3292y.d(this.f3281a, eVar.f3281a) && AbstractC3292y.d(this.f3282b, eVar.f3282b) && AbstractC3292y.d(this.f3283c, eVar.f3283c) && AbstractC3292y.d(this.f3284d, eVar.f3284d) && AbstractC3292y.d(this.f3285e, eVar.f3285e) && AbstractC3292y.d(this.f3286f, eVar.f3286f) && AbstractC3292y.d(this.f3287g, eVar.f3287g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        Integer num = this.f3281a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        String str = this.f3282b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Boolean bool = this.f3283c;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool2 = this.f3284d;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        L5.a aVar = this.f3285e;
        if (aVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = aVar.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        List list = this.f3286f;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        List list2 = this.f3287g;
        if (list2 != null) {
            i8 = list2.hashCode();
        }
        return i14 + i8;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("MSPAPurpose(id=");
        a9.append(this.f3281a);
        a9.append(", category=");
        a9.append((Object) this.f3282b);
        a9.append(", defaultValue=");
        a9.append(this.f3283c);
        a9.append(", value=");
        a9.append(this.f3284d);
        a9.append(", consentBanner=");
        a9.append(this.f3285e);
        a9.append(", purposes=");
        a9.append(this.f3286f);
        a9.append(", applicableSensitivePurposes=");
        a9.append(this.f3287g);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ e(Integer num, String str, Boolean bool, Boolean bool2, L5.a aVar, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? 0 : num, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? Boolean.FALSE : bool, (i8 & 8) != 0 ? Boolean.FALSE : null, (i8 & 16) != 0 ? new L5.a(null, null, null, null, 15) : aVar, (i8 & 32) != 0 ? AbstractC1435t.m() : list, (i8 & 64) != 0 ? AbstractC1435t.m() : null);
    }
}
