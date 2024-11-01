package c2;

/* renamed from: c2.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2014E {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f15225a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15226b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2014E(byte[] bArr, int i8) {
        this.f15225a = bArr;
        this.f15226b = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(C2014E c2014e, C2018d c2018d) {
        if (c2014e == null) {
            c2018d.g(0);
            return;
        }
        byte[] bArr = c2014e.f15225a;
        int i8 = c2014e.f15226b;
        c2018d.h(bArr, i8, (bArr[i8] * 2) + 1);
    }

    public int a() {
        return this.f15225a[this.f15226b];
    }

    public int b(int i8) {
        return this.f15225a[this.f15226b + (i8 * 2) + 1];
    }

    public int c(int i8) {
        return this.f15225a[this.f15226b + (i8 * 2) + 2];
    }

    public String toString() {
        int a9 = a();
        StringBuilder sb = new StringBuilder(a9 * 2);
        for (int i8 = 0; i8 < a9; i8++) {
            int b9 = b(i8);
            if (b9 != 0) {
                if (b9 != 1) {
                    if (b9 != 2) {
                        if (b9 == 3) {
                            sb.append(c(i8));
                            sb.append(';');
                        } else {
                            throw new AssertionError();
                        }
                    } else {
                        sb.append('*');
                    }
                } else {
                    sb.append('.');
                }
            } else {
                sb.append('[');
            }
        }
        return sb.toString();
    }
}
