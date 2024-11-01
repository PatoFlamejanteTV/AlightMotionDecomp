package W6;

/* renamed from: W6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1474c extends AbstractC1492s {

    /* renamed from: b, reason: collision with root package name */
    public static final C1474c f10830b = new C1474c((byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1474c f10831c = new C1474c((byte) -1);

    /* renamed from: a, reason: collision with root package name */
    private final byte f10832a;

    private C1474c(byte b9) {
        this.f10832a = b9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1474c u(byte[] bArr) {
        if (bArr.length == 1) {
            byte b9 = bArr[0];
            if (b9 != -1) {
                if (b9 != 0) {
                    return new C1474c(b9);
                }
                return f10830b;
            }
            return f10831c;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return v() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof C1474c) || v() != ((C1474c) abstractC1492s).v()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.j(z8, 1, this.f10832a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s s() {
        if (v()) {
            return f10831c;
        }
        return f10830b;
    }

    public String toString() {
        if (v()) {
            return "TRUE";
        }
        return "FALSE";
    }

    public boolean v() {
        if (this.f10832a != 0) {
            return true;
        }
        return false;
    }
}
