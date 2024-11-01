package L5;

import D5.t;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5399a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5400b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5401c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5402d;

    public a(String title, String sectionTitle, String description, String confirm) {
        AbstractC3292y.i(title, "title");
        AbstractC3292y.i(sectionTitle, "sectionTitle");
        AbstractC3292y.i(description, "description");
        AbstractC3292y.i(confirm, "confirm");
        this.f5399a = title;
        this.f5400b = sectionTitle;
        this.f5401c = description;
        this.f5402d = confirm;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3292y.d(this.f5399a, aVar.f5399a) && AbstractC3292y.d(this.f5400b, aVar.f5400b) && AbstractC3292y.d(this.f5401c, aVar.f5401c) && AbstractC3292y.d(this.f5402d, aVar.f5402d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5402d.hashCode() + t.a(this.f5401c, t.a(this.f5400b, this.f5399a.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("Banner(title=");
        a9.append(this.f5399a);
        a9.append(", sectionTitle=");
        a9.append(this.f5400b);
        a9.append(", description=");
        a9.append(this.f5401c);
        a9.append(", confirm=");
        a9.append(this.f5402d);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : str3, (i8 & 8) == 0 ? null : "");
    }
}
