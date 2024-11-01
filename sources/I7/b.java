package I7;

import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f3808a;

    /* renamed from: b, reason: collision with root package name */
    private int f3809b;

    public b(byte[] bArr) {
        this.f3808a = 0;
        if (bArr.length == 4) {
            int d8 = f.d(bArr);
            this.f3809b = d8;
            if (j.c(d8)) {
                this.f3808a = j.a(this.f3809b);
                return;
            }
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    private static String i(int i8) {
        String str;
        if (i8 == 0) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        if (((byte) (i8 & 1)) == 1) {
            str = "1";
        } else {
            str = "";
        }
        int i9 = i8 >>> 1;
        int i10 = 1;
        while (i9 != 0) {
            if (((byte) (i9 & 1)) == 1) {
                str = str + "+x^" + i10;
            }
            i9 >>>= 1;
            i10++;
        }
        return str;
    }

    public int a(int i8, int i9) {
        return i8 ^ i9;
    }

    public String b(int i8) {
        StringBuilder sb;
        String str;
        String str2 = "";
        for (int i9 = 0; i9 < this.f3808a; i9++) {
            if ((((byte) i8) & 1) == 0) {
                sb = new StringBuilder();
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            } else {
                sb = new StringBuilder();
                str = "1";
            }
            sb.append(str);
            sb.append(str2);
            str2 = sb.toString();
            i8 >>>= 1;
        }
        return str2;
    }

    public int c(int i8, int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i8 == 0) {
            return 0;
        }
        if (i8 == 1) {
            return 1;
        }
        if (i9 < 0) {
            i8 = f(i8);
            i9 = -i9;
        }
        int i10 = 1;
        while (i9 != 0) {
            if ((i9 & 1) == 1) {
                i10 = h(i10, i8);
            }
            i8 = h(i8, i8);
            i9 >>>= 1;
        }
        return i10;
    }

    public int d() {
        return this.f3808a;
    }

    public byte[] e() {
        return f.c(this.f3809b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            if (this.f3808a == bVar.f3808a && this.f3809b == bVar.f3809b) {
                return true;
            }
        }
        return false;
    }

    public int f(int i8) {
        return c(i8, (1 << this.f3808a) - 2);
    }

    public boolean g(int i8) {
        int i9 = this.f3808a;
        if (i9 == 31) {
            if (i8 < 0) {
                return false;
            }
            return true;
        }
        if (i8 < 0 || i8 >= (1 << i9)) {
            return false;
        }
        return true;
    }

    public int h(int i8, int i9) {
        return j.d(i8, i9, this.f3809b);
    }

    public int hashCode() {
        return this.f3809b;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.f3808a + ") = GF(2)[X]/<" + i(this.f3809b) + "> ";
    }
}
