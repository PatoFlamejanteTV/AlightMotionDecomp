package y7;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
final class l implements w {

    /* renamed from: c, reason: collision with root package name */
    private static final Map f41233c;

    /* renamed from: a, reason: collision with root package name */
    private final int f41234a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41235b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b("SHA-256", 32, 16, 67), new l(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(b("SHA-512", 64, 16, 131), new l(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(b("SHAKE128", 32, 16, 67), new l(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(b("SHAKE256", 64, 16, 131), new l(67108868, "WOTSP_SHAKE256_W16"));
        f41233c = DesugarCollections.unmodifiableMap(hashMap);
    }

    private l(int i8, String str) {
        this.f41234a = i8;
        this.f41235b = str;
    }

    private static String b(String str, int i8, int i9, int i10) {
        if (str != null) {
            return str + "-" + i8 + "-" + i9 + "-" + i10;
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static l c(String str, int i8, int i9, int i10) {
        if (str != null) {
            return (l) f41233c.get(b(str, i8, i9, i10));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // y7.w
    public int a() {
        return this.f41234a;
    }

    public String toString() {
        return this.f41235b;
    }
}
