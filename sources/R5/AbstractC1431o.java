package R5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: R5.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1431o extends AbstractC1430n {
    public static int[] A(int[] iArr, int i8) {
        AbstractC3292y.i(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i8;
        AbstractC3292y.f(copyOf);
        return copyOf;
    }

    public static int[] B(int[] iArr, int[] elements) {
        AbstractC3292y.i(iArr, "<this>");
        AbstractC3292y.i(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        AbstractC3292y.f(copyOf);
        return copyOf;
    }

    public static long[] C(long[] jArr, long[] elements) {
        AbstractC3292y.i(jArr, "<this>");
        AbstractC3292y.i(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        AbstractC3292y.f(copyOf);
        return copyOf;
    }

    public static Object[] D(Object[] objArr, Object obj) {
        AbstractC3292y.i(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        AbstractC3292y.f(copyOf);
        return copyOf;
    }

    public static Object[] E(Object[] objArr, Object[] elements) {
        AbstractC3292y.i(objArr, "<this>");
        AbstractC3292y.i(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        AbstractC3292y.f(copyOf);
        return copyOf;
    }

    public static boolean[] F(boolean[] zArr, boolean[] elements) {
        AbstractC3292y.i(zArr, "<this>");
        AbstractC3292y.i(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        AbstractC3292y.f(copyOf);
        return copyOf;
    }

    public static void G(float[] fArr, int i8, int i9) {
        AbstractC3292y.i(fArr, "<this>");
        Arrays.sort(fArr, i8, i9);
    }

    public static void H(int[] iArr, int i8, int i9) {
        AbstractC3292y.i(iArr, "<this>");
        Arrays.sort(iArr, i8, i9);
    }

    public static void I(long[] jArr, int i8, int i9) {
        AbstractC3292y.i(jArr, "<this>");
        Arrays.sort(jArr, i8, i9);
    }

    public static void J(Object[] objArr) {
        AbstractC3292y.i(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void K(Object[] objArr, Comparator comparator) {
        AbstractC3292y.i(objArr, "<this>");
        AbstractC3292y.i(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void L(Object[] objArr, Comparator comparator, int i8, int i9) {
        AbstractC3292y.i(objArr, "<this>");
        AbstractC3292y.i(comparator, "comparator");
        Arrays.sort(objArr, i8, i9, comparator);
    }

    public static List c(Object[] objArr) {
        AbstractC3292y.i(objArr, "<this>");
        List a9 = AbstractC1433q.a(objArr);
        AbstractC3292y.h(a9, "asList(...)");
        return a9;
    }

    public static byte[] d(byte[] bArr, byte[] destination, int i8, int i9, int i10) {
        AbstractC3292y.i(bArr, "<this>");
        AbstractC3292y.i(destination, "destination");
        System.arraycopy(bArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static char[] e(char[] cArr, char[] destination, int i8, int i9, int i10) {
        AbstractC3292y.i(cArr, "<this>");
        AbstractC3292y.i(destination, "destination");
        System.arraycopy(cArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static float[] f(float[] fArr, float[] destination, int i8, int i9, int i10) {
        AbstractC3292y.i(fArr, "<this>");
        AbstractC3292y.i(destination, "destination");
        System.arraycopy(fArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static int[] g(int[] iArr, int[] destination, int i8, int i9, int i10) {
        AbstractC3292y.i(iArr, "<this>");
        AbstractC3292y.i(destination, "destination");
        System.arraycopy(iArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static long[] h(long[] jArr, long[] destination, int i8, int i9, int i10) {
        AbstractC3292y.i(jArr, "<this>");
        AbstractC3292y.i(destination, "destination");
        System.arraycopy(jArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static Object[] i(Object[] objArr, Object[] destination, int i8, int i9, int i10) {
        AbstractC3292y.i(objArr, "<this>");
        AbstractC3292y.i(destination, "destination");
        System.arraycopy(objArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ byte[] j(byte[] bArr, byte[] bArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = bArr.length;
        }
        return AbstractC1428l.d(bArr, bArr2, i8, i9, i10);
    }

    public static /* synthetic */ float[] k(float[] fArr, float[] fArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = fArr.length;
        }
        return AbstractC1428l.f(fArr, fArr2, i8, i9, i10);
    }

    public static /* synthetic */ int[] l(int[] iArr, int[] iArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        return AbstractC1428l.g(iArr, iArr2, i8, i9, i10);
    }

    public static /* synthetic */ long[] m(long[] jArr, long[] jArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = jArr.length;
        }
        return AbstractC1428l.h(jArr, jArr2, i8, i9, i10);
    }

    public static /* synthetic */ Object[] n(Object[] objArr, Object[] objArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        return AbstractC1428l.i(objArr, objArr2, i8, i9, i10);
    }

    public static byte[] o(byte[] bArr, int i8, int i9) {
        AbstractC3292y.i(bArr, "<this>");
        AbstractC1429m.b(i9, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i8, i9);
        AbstractC3292y.h(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] p(Object[] objArr, int i8, int i9) {
        AbstractC3292y.i(objArr, "<this>");
        AbstractC1429m.b(i9, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i8, i9);
        AbstractC3292y.h(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static final void q(float[] fArr, float f8, int i8, int i9) {
        AbstractC3292y.i(fArr, "<this>");
        Arrays.fill(fArr, i8, i9, f8);
    }

    public static void r(int[] iArr, int i8, int i9, int i10) {
        AbstractC3292y.i(iArr, "<this>");
        Arrays.fill(iArr, i9, i10, i8);
    }

    public static final void s(long[] jArr, long j8, int i8, int i9) {
        AbstractC3292y.i(jArr, "<this>");
        Arrays.fill(jArr, i8, i9, j8);
    }

    public static void t(Object[] objArr, Object obj, int i8, int i9) {
        AbstractC3292y.i(objArr, "<this>");
        Arrays.fill(objArr, i8, i9, obj);
    }

    public static /* synthetic */ void u(float[] fArr, float f8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = fArr.length;
        }
        q(fArr, f8, i8, i9);
    }

    public static /* synthetic */ void v(int[] iArr, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = iArr.length;
        }
        AbstractC1428l.r(iArr, i8, i9, i10);
    }

    public static /* synthetic */ void w(long[] jArr, long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = jArr.length;
        }
        s(jArr, j8, i8, i9);
    }

    public static /* synthetic */ void x(Object[] objArr, Object obj, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = objArr.length;
        }
        AbstractC1428l.t(objArr, obj, i8, i9);
    }

    public static char[] y(char[] cArr, char[] elements) {
        AbstractC3292y.i(cArr, "<this>");
        AbstractC3292y.i(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        AbstractC3292y.f(copyOf);
        return copyOf;
    }

    public static float[] z(float[] fArr, float[] elements) {
        AbstractC3292y.i(fArr, "<this>");
        AbstractC3292y.i(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        AbstractC3292y.f(copyOf);
        return copyOf;
    }
}
