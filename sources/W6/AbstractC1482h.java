package W6;

/* renamed from: W6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1482h extends AbstractC1492s {

    /* renamed from: a, reason: collision with root package name */
    protected C1488n f10845a;

    /* renamed from: b, reason: collision with root package name */
    protected C1485k f10846b;

    /* renamed from: c, reason: collision with root package name */
    protected AbstractC1492s f10847c;

    /* renamed from: d, reason: collision with root package name */
    protected int f10848d;

    /* renamed from: e, reason: collision with root package name */
    protected AbstractC1492s f10849e;

    public AbstractC1482h(C1478e c1478e) {
        int i8 = 0;
        AbstractC1492s u8 = u(c1478e, 0);
        if (u8 instanceof C1488n) {
            this.f10845a = (C1488n) u8;
            u8 = u(c1478e, 1);
            i8 = 1;
        }
        if (u8 instanceof C1485k) {
            this.f10846b = (C1485k) u8;
            i8++;
            u8 = u(c1478e, i8);
        }
        if (!(u8 instanceof AbstractC1499z)) {
            this.f10847c = u8;
            i8++;
            u8 = u(c1478e, i8);
        }
        if (c1478e.f() != i8 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(u8 instanceof AbstractC1499z)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        AbstractC1499z abstractC1499z = (AbstractC1499z) u8;
        z(abstractC1499z.y());
        this.f10849e = abstractC1499z.v();
    }

    private void A(AbstractC1492s abstractC1492s) {
        this.f10849e = abstractC1492s;
    }

    private void B(C1485k c1485k) {
        this.f10846b = c1485k;
    }

    private AbstractC1492s u(C1478e c1478e, int i8) {
        if (c1478e.f() > i8) {
            return c1478e.d(i8).d();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    private void v(AbstractC1492s abstractC1492s) {
        this.f10847c = abstractC1492s;
    }

    private void y(C1488n c1488n) {
        this.f10845a = c1488n;
    }

    private void z(int i8) {
        if (i8 >= 0 && i8 <= 2) {
            this.f10848d = i8;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i8);
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        int i8;
        C1488n c1488n = this.f10845a;
        if (c1488n != null) {
            i8 = c1488n.hashCode();
        } else {
            i8 = 0;
        }
        C1485k c1485k = this.f10846b;
        if (c1485k != null) {
            i8 ^= c1485k.hashCode();
        }
        AbstractC1492s abstractC1492s = this.f10847c;
        if (abstractC1492s != null) {
            i8 ^= abstractC1492s.hashCode();
        }
        return i8 ^ this.f10849e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        AbstractC1492s abstractC1492s2;
        C1485k c1485k;
        C1488n c1488n;
        if (!(abstractC1492s instanceof AbstractC1482h)) {
            return false;
        }
        if (this == abstractC1492s) {
            return true;
        }
        AbstractC1482h abstractC1482h = (AbstractC1482h) abstractC1492s;
        C1488n c1488n2 = this.f10845a;
        if (c1488n2 != null && ((c1488n = abstractC1482h.f10845a) == null || !c1488n.o(c1488n2))) {
            return false;
        }
        C1485k c1485k2 = this.f10846b;
        if (c1485k2 != null && ((c1485k = abstractC1482h.f10846b) == null || !c1485k.o(c1485k2))) {
            return false;
        }
        AbstractC1492s abstractC1492s3 = this.f10847c;
        if (abstractC1492s3 != null && ((abstractC1492s2 = abstractC1482h.f10847c) == null || !abstractC1492s2.o(abstractC1492s3))) {
            return false;
        }
        return this.f10849e.o(abstractC1482h.f10849e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s s() {
        return new S(this.f10845a, this.f10846b, this.f10847c, this.f10848d, this.f10849e);
    }

    public AbstractC1482h(C1488n c1488n, C1485k c1485k, AbstractC1492s abstractC1492s, int i8, AbstractC1492s abstractC1492s2) {
        y(c1488n);
        B(c1485k);
        v(abstractC1492s);
        z(i8);
        A(abstractC1492s2.d());
    }
}
