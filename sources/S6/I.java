package s6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class I {
    public static final int a(String str, int i8, int i9, int i10) {
        return (int) G.c(str, i8, i9, i10);
    }

    public static final long b(String str, long j8, long j9, long j10) {
        String d8 = G.d(str);
        if (d8 == null) {
            return j8;
        }
        Long k8 = l6.n.k(d8);
        if (k8 != null) {
            long longValue = k8.longValue();
            if (j9 <= longValue && longValue <= j10) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j9 + ".." + j10 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d8 + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String d8 = G.d(str);
        if (d8 != null) {
            return d8;
        }
        return str2;
    }

    public static final boolean d(String str, boolean z8) {
        String d8 = G.d(str);
        if (d8 != null) {
            return Boolean.parseBoolean(d8);
        }
        return z8;
    }

    public static /* synthetic */ int e(String str, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i9 = 1;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return G.b(str, i8, i9, i10);
    }

    public static /* synthetic */ long f(String str, long j8, long j9, long j10, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j9 = 1;
        }
        long j11 = j9;
        if ((i8 & 8) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return G.c(str, j8, j11, j10);
    }
}
