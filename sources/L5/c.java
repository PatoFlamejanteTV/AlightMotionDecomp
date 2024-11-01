package L5;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5405a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5406b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5407c;

    public c(String str, a banner, List purposes) {
        AbstractC3292y.i(banner, "banner");
        AbstractC3292y.i(purposes, "purposes");
        this.f5405a = str;
        this.f5406b = banner;
        this.f5407c = purposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3292y.d(this.f5405a, cVar.f5405a) && AbstractC3292y.d(this.f5406b, cVar.f5406b) && AbstractC3292y.d(this.f5407c, cVar.f5407c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f5405a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f5407c.hashCode() + ((this.f5406b.hashCode() + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("GBCPurposeResponse(language=");
        a9.append((Object) this.f5405a);
        a9.append(", banner=");
        a9.append(this.f5406b);
        a9.append(", purposes=");
        a9.append(this.f5407c);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ c(String str, a aVar, List list, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? new a(null, null, null, null, 15) : null, (i8 & 4) != 0 ? AbstractC1435t.m() : null);
    }
}
