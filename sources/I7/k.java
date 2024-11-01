package I7;

/* loaded from: classes5.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private b f3823a;

    /* renamed from: b, reason: collision with root package name */
    private i f3824b;

    /* renamed from: c, reason: collision with root package name */
    protected i[] f3825c;

    /* renamed from: d, reason: collision with root package name */
    protected i[] f3826d;

    public k(b bVar, i iVar) {
        this.f3823a = bVar;
        this.f3824b = iVar;
        b();
        a();
    }

    private void a() {
        int f8;
        int g8 = this.f3824b.g();
        i[] iVarArr = new i[g8];
        int i8 = g8 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            iVarArr[i9] = new i(this.f3825c[i9]);
        }
        this.f3826d = new i[g8];
        while (i8 >= 0) {
            this.f3826d[i8] = new i(this.f3823a, i8);
            i8--;
        }
        for (int i10 = 0; i10 < g8; i10++) {
            if (iVarArr[i10].f(i10) == 0) {
                int i11 = i10 + 1;
                boolean z8 = false;
                while (i11 < g8) {
                    if (iVarArr[i11].f(i10) != 0) {
                        d(iVarArr, i10, i11);
                        d(this.f3826d, i10, i11);
                        i11 = g8;
                        z8 = true;
                    }
                    i11++;
                }
                if (!z8) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int f9 = this.f3823a.f(iVarArr[i10].f(i10));
            iVarArr[i10].m(f9);
            this.f3826d[i10].m(f9);
            for (int i12 = 0; i12 < g8; i12++) {
                if (i12 != i10 && (f8 = iVarArr[i12].f(i10)) != 0) {
                    i n8 = iVarArr[i10].n(f8);
                    i n9 = this.f3826d[i10].n(f8);
                    iVarArr[i12].b(n8);
                    this.f3826d[i12].b(n9);
                }
            }
        }
    }

    private void b() {
        int i8;
        int g8 = this.f3824b.g();
        this.f3825c = new i[g8];
        int i9 = 0;
        while (true) {
            i8 = g8 >> 1;
            if (i9 >= i8) {
                break;
            }
            int i10 = i9 << 1;
            int[] iArr = new int[i10 + 1];
            iArr[i10] = 1;
            this.f3825c[i9] = new i(this.f3823a, iArr);
            i9++;
        }
        while (i8 < g8) {
            int i11 = i8 << 1;
            int[] iArr2 = new int[i11 + 1];
            iArr2[i11] = 1;
            this.f3825c[i8] = new i(this.f3823a, iArr2).k(this.f3824b);
            i8++;
        }
    }

    private static void d(i[] iVarArr, int i8, int i9) {
        i iVar = iVarArr[i8];
        iVarArr[i8] = iVarArr[i9];
        iVarArr[i9] = iVar;
    }

    public i[] c() {
        return this.f3826d;
    }
}
