package y7;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y7.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4253d implements w {

    /* renamed from: c, reason: collision with root package name */
    private static final Map f41202c;

    /* renamed from: a, reason: collision with root package name */
    private final int f41203a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41204b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b("SHA-256", 32, 16, 67, 20, 2), new C4253d(1, "XMSSMT_SHA2_20/2_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 20, 4), new C4253d(2, "XMSSMT_SHA2_20/4_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 40, 2), new C4253d(3, "XMSSMT_SHA2_40/2_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 40, 2), new C4253d(4, "XMSSMT_SHA2_40/4_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 40, 4), new C4253d(5, "XMSSMT_SHA2_40/8_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 60, 8), new C4253d(6, "XMSSMT_SHA2_60/3_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 60, 6), new C4253d(7, "XMSSMT_SHA2_60/6_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 60, 12), new C4253d(8, "XMSSMT_SHA2_60/12_256"));
        hashMap.put(b("SHA-512", 64, 16, 131, 20, 2), new C4253d(9, "XMSSMT_SHA2_20/2_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 20, 4), new C4253d(10, "XMSSMT_SHA2_20/4_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 40, 2), new C4253d(11, "XMSSMT_SHA2_40/2_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 40, 4), new C4253d(12, "XMSSMT_SHA2_40/4_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 40, 8), new C4253d(13, "XMSSMT_SHA2_40/8_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 60, 3), new C4253d(14, "XMSSMT_SHA2_60/3_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 60, 6), new C4253d(15, "XMSSMT_SHA2_60/6_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 60, 12), new C4253d(16, "XMSSMT_SHA2_60/12_512"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 20, 2), new C4253d(17, "XMSSMT_SHAKE_20/2_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 20, 4), new C4253d(18, "XMSSMT_SHAKE_20/4_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 40, 2), new C4253d(19, "XMSSMT_SHAKE_40/2_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 40, 4), new C4253d(20, "XMSSMT_SHAKE_40/4_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 40, 8), new C4253d(21, "XMSSMT_SHAKE_40/8_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 60, 3), new C4253d(22, "XMSSMT_SHAKE_60/3_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 60, 6), new C4253d(23, "XMSSMT_SHAKE_60/6_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 60, 12), new C4253d(24, "XMSSMT_SHAKE_60/12_256"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 20, 2), new C4253d(25, "XMSSMT_SHAKE_20/2_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 20, 4), new C4253d(26, "XMSSMT_SHAKE_20/4_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 40, 2), new C4253d(27, "XMSSMT_SHAKE_40/2_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 40, 4), new C4253d(28, "XMSSMT_SHAKE_40/4_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 40, 8), new C4253d(29, "XMSSMT_SHAKE_40/8_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 60, 3), new C4253d(30, "XMSSMT_SHAKE_60/3_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 60, 6), new C4253d(31, "XMSSMT_SHAKE_60/6_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 60, 12), new C4253d(32, "XMSSMT_SHAKE_60/12_512"));
        f41202c = DesugarCollections.unmodifiableMap(hashMap);
    }

    private C4253d(int i8, String str) {
        this.f41203a = i8;
        this.f41204b = str;
    }

    private static String b(String str, int i8, int i9, int i10, int i11, int i12) {
        if (str != null) {
            return str + "-" + i8 + "-" + i9 + "-" + i10 + "-" + i11 + "-" + i12;
        }
        throw new NullPointerException("algorithmName == null");
    }

    public static C4253d c(String str, int i8, int i9, int i10, int i11, int i12) {
        if (str != null) {
            return (C4253d) f41202c.get(b(str, i8, i9, i10, i11, i12));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // y7.w
    public int a() {
        return this.f41203a;
    }

    public String toString() {
        return this.f41204b;
    }
}
