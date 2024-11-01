package E6;

import A6.k;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f1992a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    private int[] f1993b;

    /* renamed from: c, reason: collision with root package name */
    private int f1994c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1995a = new a();

        private a() {
        }
    }

    public D() {
        int[] iArr = new int[8];
        for (int i8 = 0; i8 < 8; i8++) {
            iArr[i8] = -1;
        }
        this.f1993b = iArr;
        this.f1994c = -1;
    }

    private final void e() {
        int i8 = this.f1994c * 2;
        Object[] copyOf = Arrays.copyOf(this.f1992a, i8);
        AbstractC3292y.h(copyOf, "copyOf(...)");
        this.f1992a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f1993b, i8);
        AbstractC3292y.h(copyOf2, "copyOf(...)");
        this.f1993b = copyOf2;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i8 = this.f1994c + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            Object obj = this.f1992a[i9];
            if (obj instanceof A6.f) {
                A6.f fVar = (A6.f) obj;
                if (AbstractC3292y.d(fVar.getKind(), k.b.f289a)) {
                    if (this.f1993b[i9] != -1) {
                        sb.append("[");
                        sb.append(this.f1993b[i9]);
                        sb.append("]");
                    }
                } else {
                    int i10 = this.f1993b[i9];
                    if (i10 >= 0) {
                        sb.append(".");
                        sb.append(fVar.f(i10));
                    }
                }
            } else if (obj != a.f1995a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    public final void b() {
        int i8 = this.f1994c;
        int[] iArr = this.f1993b;
        if (iArr[i8] == -2) {
            iArr[i8] = -1;
            this.f1994c = i8 - 1;
        }
        int i9 = this.f1994c;
        if (i9 != -1) {
            this.f1994c = i9 - 1;
        }
    }

    public final void c(A6.f sd) {
        AbstractC3292y.i(sd, "sd");
        int i8 = this.f1994c + 1;
        this.f1994c = i8;
        if (i8 == this.f1992a.length) {
            e();
        }
        this.f1992a[i8] = sd;
    }

    public final void d() {
        int[] iArr = this.f1993b;
        int i8 = this.f1994c;
        if (iArr[i8] == -2) {
            this.f1992a[i8] = a.f1995a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f1993b;
        int i8 = this.f1994c;
        if (iArr[i8] != -2) {
            int i9 = i8 + 1;
            this.f1994c = i9;
            if (i9 == this.f1992a.length) {
                e();
            }
        }
        Object[] objArr = this.f1992a;
        int i10 = this.f1994c;
        objArr[i10] = obj;
        this.f1993b[i10] = -2;
    }

    public final void g(int i8) {
        this.f1993b[this.f1994c] = i8;
    }

    public String toString() {
        return a();
    }
}
