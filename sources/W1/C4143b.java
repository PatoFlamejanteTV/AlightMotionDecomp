package w1;

import x1.AbstractC4200d;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4143b extends AbstractC4142a {
    public C4143b(Boolean bool) {
        d(bool);
    }

    @Override // w1.AbstractC4142a
    public void a(String str) {
        this.f40668a = Boolean.valueOf(AbstractC4200d.a(str));
    }

    @Override // w1.AbstractC4142a
    public String b() {
        return AbstractC4200d.b((Boolean) this.f40668a);
    }

    @Override // w1.AbstractC4142a
    public String e(String str, int i8) {
        return str.substring(i8, i8 + 1);
    }
}
