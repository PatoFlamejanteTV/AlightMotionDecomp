package w1;

import x1.AbstractC4206j;

/* renamed from: w1.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4147f extends AbstractC4142a {

    /* renamed from: b, reason: collision with root package name */
    private int f40670b;

    public C4147f(int i8, Integer num) {
        this.f40670b = i8;
        d(num);
    }

    @Override // w1.AbstractC4142a
    public void a(String str) {
        this.f40668a = Integer.valueOf(AbstractC4206j.a(str));
    }

    @Override // w1.AbstractC4142a
    public String b() {
        return AbstractC4206j.b(((Integer) this.f40668a).intValue(), this.f40670b);
    }

    @Override // w1.AbstractC4142a
    public String e(String str, int i8) {
        return str.substring(i8, this.f40670b + i8);
    }
}
