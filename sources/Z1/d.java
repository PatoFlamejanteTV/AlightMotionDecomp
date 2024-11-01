package Z1;

import X1.i;
import b2.AbstractC1968f;

/* loaded from: classes4.dex */
class d extends c {

    /* renamed from: z, reason: collision with root package name */
    private String f13210z;

    public d(int i8) {
        super(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z1.b
    public void f() {
        int i8 = this.f13194g + 1;
        this.f13194g = i8;
        if (i8 >= this.f13209y) {
            this.f13188a = (char) 26;
        } else {
            this.f13188a = this.f13210z.charAt(i8);
        }
    }

    @Override // Z1.b
    protected void k() {
        int i8 = this.f13194g + 1;
        this.f13194g = i8;
        if (i8 < this.f13209y) {
            this.f13188a = this.f13210z.charAt(i8);
        } else {
            this.f13188a = (char) 26;
            throw new e(this.f13194g - 1, 3, "EOF");
        }
    }

    @Override // Z1.b
    protected void n() {
        int i8 = this.f13194g + 1;
        this.f13194g = i8;
        if (i8 >= this.f13209y) {
            this.f13188a = (char) 26;
        } else {
            this.f13188a = this.f13210z.charAt(i8);
        }
    }

    @Override // Z1.c
    protected void u(int i8, int i9) {
        this.f13193f = this.f13210z.substring(i8, i9);
    }

    @Override // Z1.c
    protected void v(int i8, int i9) {
        while (i8 < i9 - 1 && Character.isWhitespace(this.f13210z.charAt(i8))) {
            i8++;
        }
        while (true) {
            int i10 = i9 - 1;
            if (i10 <= i8 || !Character.isWhitespace(this.f13210z.charAt(i10))) {
                break;
            } else {
                i9--;
            }
        }
        u(i8, i9);
    }

    @Override // Z1.c
    protected int w(char c8, int i8) {
        return this.f13210z.indexOf(c8, i8);
    }

    public Object x(String str) {
        return y(str, i.f10946c.f14910b);
    }

    public Object y(String str, AbstractC1968f abstractC1968f) {
        this.f13189b = abstractC1968f.f14913a;
        this.f13210z = str;
        this.f13209y = str.length();
        return d(abstractC1968f);
    }
}
