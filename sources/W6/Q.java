package W6;

/* loaded from: classes5.dex */
public class Q extends AbstractC1472b {
    public Q(InterfaceC1476d interfaceC1476d) {
        super(interfaceC1476d.d().k("DER"), 0);
    }

    static Q A(byte[] bArr) {
        if (bArr.length >= 1) {
            byte b9 = bArr[0];
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            if (length != 0) {
                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
            }
            return new Q(bArr2, b9);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public static Q B(AbstractC1499z abstractC1499z, boolean z8) {
        AbstractC1492s v8 = abstractC1499z.v();
        if (!z8 && !(v8 instanceof Q)) {
            return A(AbstractC1489o.v(v8).y());
        }
        return C(v8);
    }

    public static Q C(Object obj) {
        if (obj != null && !(obj instanceof Q)) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                return new Q(n0Var.f10827a, n0Var.f10828b);
            }
            if (obj instanceof byte[]) {
                try {
                    return (Q) AbstractC1492s.q((byte[]) obj);
                } catch (Exception e8) {
                    throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (Q) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        int i8;
        byte[] bArr = this.f10827a;
        int length = bArr.length;
        if (length != 0 && (i8 = this.f10828b) != 0) {
            int i9 = length - 1;
            byte b9 = bArr[i9];
            if (b9 != ((byte) ((255 << i8) & b9))) {
                c1491q.l(z8, 3, (byte) i8, bArr, 0, i9, (byte) (b9 & (255 << i8)));
                return;
            }
        }
        c1491q.k(z8, 3, (byte) this.f10828b, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        return E0.a(this.f10827a.length + 1) + 1 + this.f10827a.length + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        return false;
    }

    public Q(byte[] bArr) {
        this(bArr, 0);
    }

    public Q(byte[] bArr, int i8) {
        super(bArr, i8);
    }

    @Override // W6.AbstractC1472b, W6.AbstractC1492s
    AbstractC1492s s() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s t() {
        return this;
    }
}
