package w1;

import j$.time.ZonedDateTime;
import x1.AbstractC4202f;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4144c extends AbstractC4142a {
    public C4144c(ZonedDateTime zonedDateTime) {
        d(zonedDateTime);
    }

    @Override // w1.AbstractC4142a
    public void a(String str) {
        this.f40668a = AbstractC4202f.a(str);
    }

    @Override // w1.AbstractC4142a
    public String b() {
        return AbstractC4202f.b((ZonedDateTime) this.f40668a);
    }

    @Override // w1.AbstractC4142a
    public String e(String str, int i8) {
        return str.substring(i8, i8 + 36);
    }
}
