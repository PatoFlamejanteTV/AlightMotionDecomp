package Z1;

/* loaded from: classes4.dex */
abstract class c extends b {

    /* renamed from: y, reason: collision with root package name */
    protected int f13209y;

    public c(int i8) {
        super(i8);
    }

    @Override // Z1.b
    protected void j(boolean[] zArr) {
        int i8 = this.f13194g;
        s(zArr);
        v(i8, this.f13194g);
    }

    @Override // Z1.b
    protected Object l(boolean[] zArr) {
        int i8 = this.f13194g;
        f();
        r();
        char c8 = this.f13188a;
        if (c8 != '.' && c8 != 'E' && c8 != 'e') {
            t();
            char c9 = this.f13188a;
            if (c9 >= 0 && c9 < '~' && !zArr[c9] && c9 != 26) {
                s(zArr);
                v(i8, this.f13194g);
                if (this.f13197j) {
                    return this.f13193f;
                }
                throw new e(this.f13194g, 1, this.f13193f);
            }
            v(i8, this.f13194g);
            return e(this.f13193f);
        }
        if (c8 == '.') {
            f();
            r();
        }
        char c10 = this.f13188a;
        if (c10 != 'E' && c10 != 'e') {
            t();
            char c11 = this.f13188a;
            if (c11 >= 0 && c11 < '~' && !zArr[c11] && c11 != 26) {
                s(zArr);
                v(i8, this.f13194g);
                if (this.f13197j) {
                    return this.f13193f;
                }
                throw new e(this.f13194g, 1, this.f13193f);
            }
            v(i8, this.f13194g);
            return c();
        }
        this.f13191d.a('E');
        f();
        char c12 = this.f13188a;
        if (c12 != '+' && c12 != '-' && (c12 < '0' || c12 > '9')) {
            s(zArr);
            v(i8, this.f13194g);
            if (this.f13197j) {
                if (!this.f13195h) {
                    b();
                }
                return this.f13193f;
            }
            throw new e(this.f13194g, 1, this.f13193f);
        }
        this.f13191d.a(c12);
        f();
        r();
        t();
        char c13 = this.f13188a;
        if (c13 >= 0 && c13 < '~' && !zArr[c13] && c13 != 26) {
            s(zArr);
            v(i8, this.f13194g);
            if (this.f13197j) {
                return this.f13193f;
            }
            throw new e(this.f13194g, 1, this.f13193f);
        }
        v(i8, this.f13194g);
        return c();
    }

    @Override // Z1.b
    protected void o() {
        if (!this.f13198k && this.f13188a == '\'') {
            if (this.f13197j) {
                j(b.f13183t);
                return;
            }
            throw new e(this.f13194g, 0, Character.valueOf(this.f13188a));
        }
        int w8 = w(this.f13188a, this.f13194g + 1);
        if (w8 != -1) {
            u(this.f13194g + 1, w8);
            if (this.f13193f.indexOf(92) == -1) {
                a();
                this.f13194g = w8;
                f();
                return;
            } else {
                this.f13191d.b();
                p();
                return;
            }
        }
        throw new e(this.f13209y, 3, null);
    }

    protected abstract void u(int i8, int i9);

    protected abstract void v(int i8, int i9);

    protected abstract int w(char c8, int i8);
}
