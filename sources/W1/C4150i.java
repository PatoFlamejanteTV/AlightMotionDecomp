package w1;

import x1.n;

/* renamed from: w1.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4150i extends AbstractC4142a {

    /* renamed from: b, reason: collision with root package name */
    private int f40673b;

    public C4150i(int i8, String str) {
        this.f40673b = i8;
        d(str);
    }

    @Override // w1.AbstractC4142a
    public void a(String str) {
        this.f40668a = n.a(str);
    }

    @Override // w1.AbstractC4142a
    public String b() {
        return n.b((String) this.f40668a, this.f40673b);
    }

    @Override // w1.AbstractC4142a
    public String e(String str, int i8) {
        return str.substring(i8, (this.f40673b * 6) + i8);
    }
}
