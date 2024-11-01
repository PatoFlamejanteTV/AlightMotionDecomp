package c2;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2017c {

    /* renamed from: a, reason: collision with root package name */
    public final String f15236a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f15237b;

    /* renamed from: c, reason: collision with root package name */
    C2017c f15238c;

    /* renamed from: c2.c$a */
    /* loaded from: classes4.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f15239a;

        /* renamed from: b, reason: collision with root package name */
        private C2017c[] f15240b = new C2017c[6];

        private void a(C2017c c2017c) {
            int i8 = this.f15239a;
            C2017c[] c2017cArr = this.f15240b;
            if (i8 >= c2017cArr.length) {
                C2017c[] c2017cArr2 = new C2017c[c2017cArr.length + 6];
                System.arraycopy(c2017cArr, 0, c2017cArr2, 0, i8);
                this.f15240b = c2017cArr2;
            }
            C2017c[] c2017cArr3 = this.f15240b;
            int i9 = this.f15239a;
            this.f15239a = i9 + 1;
            c2017cArr3[i9] = c2017c;
        }

        private boolean c(C2017c c2017c) {
            for (int i8 = 0; i8 < this.f15239a; i8++) {
                if (this.f15240b[i8].f15236a.equals(c2017c.f15236a)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(C2017c c2017c) {
            while (c2017c != null) {
                if (!c(c2017c)) {
                    a(c2017c);
                }
                c2017c = c2017c.f15238c;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2017c[] d() {
            int i8 = this.f15239a;
            C2017c[] c2017cArr = new C2017c[i8];
            System.arraycopy(this.f15240b, 0, c2017cArr, 0, i8);
            return c2017cArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C2017c(String str) {
        this.f15236a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(C2012C c2012c, int i8, int i9) {
        int i10;
        if ((i8 & 4096) != 0 && c2012c.R() < 49) {
            c2012c.D("Synthetic");
            i10 = 6;
        } else {
            i10 = 0;
        }
        if (i9 != 0) {
            c2012c.D("Signature");
            i10 += 8;
        }
        if ((i8 & 131072) != 0) {
            c2012c.D("Deprecated");
            return i10 + 6;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(C2012C c2012c, int i8, int i9, C2018d c2018d) {
        if ((i8 & 4096) != 0 && c2012c.R() < 49) {
            c2018d.k(c2012c.D("Synthetic")).i(0);
        }
        if (i9 != 0) {
            c2018d.k(c2012c.D("Signature")).i(2).k(i9);
        }
        if ((i8 & 131072) != 0) {
            c2018d.k(c2012c.D("Deprecated")).i(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(C2012C c2012c) {
        return c(c2012c, null, 0, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(C2012C c2012c, byte[] bArr, int i8, int i9, int i10) {
        h hVar = c2012c.f15198a;
        int i11 = 0;
        for (C2017c c2017c = this; c2017c != null; c2017c = c2017c.f15238c) {
            c2012c.D(c2017c.f15236a);
            i11 += c2017c.j(hVar, bArr, i8, i9, i10).f15242b + 6;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        int i8 = 0;
        for (C2017c c2017c = this; c2017c != null; c2017c = c2017c.f15238c) {
            i8++;
        }
        return i8;
    }

    public boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(C2012C c2012c, C2018d c2018d) {
        h(c2012c, null, 0, -1, -1, c2018d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(C2012C c2012c, byte[] bArr, int i8, int i9, int i10, C2018d c2018d) {
        h hVar = c2012c.f15198a;
        for (C2017c c2017c = this; c2017c != null; c2017c = c2017c.f15238c) {
            C2018d j8 = c2017c.j(hVar, bArr, i8, i9, i10);
            c2018d.k(c2012c.D(c2017c.f15236a)).i(j8.f15242b);
            c2018d.h(j8.f15241a, 0, j8.f15242b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C2017c i(C2019e c2019e, int i8, int i9, char[] cArr, int i10, s[] sVarArr) {
        C2017c c2017c = new C2017c(this.f15236a);
        byte[] bArr = new byte[i9];
        c2017c.f15237b = bArr;
        System.arraycopy(c2019e.f15245c, i8, bArr, 0, i9);
        return c2017c;
    }

    protected C2018d j(h hVar, byte[] bArr, int i8, int i9, int i10) {
        return new C2018d(this.f15237b);
    }
}
