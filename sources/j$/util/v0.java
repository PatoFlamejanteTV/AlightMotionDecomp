package j$.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f33652a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33653b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33654c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f33655d;

    /* renamed from: e, reason: collision with root package name */
    private int f33656e;

    /* renamed from: f, reason: collision with root package name */
    private int f33657f;

    public v0(CharSequence charSequence) {
        Objects.requireNonNull("", "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull("", "The suffix must not be null");
        this.f33652a = "".toString();
        this.f33653b = charSequence.toString();
        this.f33654c = "".toString();
    }

    private void b() {
        String[] strArr;
        if (this.f33656e > 1) {
            char[] cArr = new char[this.f33657f];
            int c8 = c(this.f33655d[0], cArr, 0);
            int i8 = 1;
            do {
                int c9 = c8 + c(this.f33653b, cArr, c8);
                c8 = c9 + c(this.f33655d[i8], cArr, c9);
                strArr = this.f33655d;
                strArr[i8] = null;
                i8++;
            } while (i8 < this.f33656e);
            this.f33656e = 1;
            strArr[0] = new String(cArr);
        }
    }

    private static int c(String str, char[] cArr, int i8) {
        int length = str.length();
        str.getChars(0, length, cArr, i8);
        return length;
    }

    public final void a(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        String[] strArr = this.f33655d;
        if (strArr == null) {
            this.f33655d = new String[8];
        } else {
            int i8 = this.f33656e;
            if (i8 == strArr.length) {
                this.f33655d = (String[]) Arrays.copyOf(strArr, i8 * 2);
            }
            this.f33657f = this.f33653b.length() + this.f33657f;
        }
        this.f33657f = valueOf.length() + this.f33657f;
        String[] strArr2 = this.f33655d;
        int i9 = this.f33656e;
        this.f33656e = i9 + 1;
        strArr2[i9] = valueOf;
    }

    public final void d(v0 v0Var) {
        Objects.requireNonNull(v0Var);
        if (v0Var.f33655d == null) {
            return;
        }
        v0Var.b();
        a(v0Var.f33655d[0]);
    }

    public final String toString() {
        String[] strArr = this.f33655d;
        int i8 = this.f33656e;
        String str = this.f33652a;
        int length = str.length();
        String str2 = this.f33654c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            b();
            return i8 == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f33657f + length2];
        int c8 = c(str, cArr, 0);
        if (i8 > 0) {
            c8 += c(strArr[0], cArr, c8);
            for (int i9 = 1; i9 < i8; i9++) {
                int c9 = c8 + c(this.f33653b, cArr, c8);
                c8 = c9 + c(strArr[i9], cArr, c9);
            }
        }
        c(str2, cArr, c8);
        return new String(cArr);
    }
}
