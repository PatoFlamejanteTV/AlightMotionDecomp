package H6;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3288a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3289b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3290c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f3291d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3292e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3293f;

    public f(Integer num, Integer num2, String str, Boolean bool, String str2, List list) {
        this.f3288a = num;
        this.f3289b = num2;
        this.f3290c = str;
        this.f3291d = bool;
        this.f3292e = str2;
        this.f3293f = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3292y.d(this.f3288a, fVar.f3288a) && AbstractC3292y.d(this.f3289b, fVar.f3289b) && AbstractC3292y.d(this.f3290c, fVar.f3290c) && AbstractC3292y.d(this.f3291d, fVar.f3291d) && AbstractC3292y.d(this.f3292e, fVar.f3292e) && AbstractC3292y.d(this.f3293f, fVar.f3293f)) {
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
        Integer num = this.f3288a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        Integer num2 = this.f3289b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str = this.f3290c;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool = this.f3291d;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str2 = this.f3292e;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        List list = this.f3293f;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i13 + i8;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("MSPASensitivePurpose(id=");
        a9.append(this.f3288a);
        a9.append(", order=");
        a9.append(this.f3289b);
        a9.append(", title=");
        a9.append((Object) this.f3290c);
        a9.append(", value=");
        a9.append(this.f3291d);
        a9.append(", description=");
        a9.append((Object) this.f3292e);
        a9.append(", nationalIds=");
        a9.append(this.f3293f);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ f(Integer num, Integer num2, String str, Boolean bool, String str2, List list, int i8) {
        this((i8 & 1) != 0 ? 0 : num, (i8 & 2) != 0 ? 0 : num2, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? Boolean.FALSE : null, (i8 & 16) != 0 ? "" : str2, (i8 & 32) != 0 ? AbstractC1435t.m() : list);
    }
}
