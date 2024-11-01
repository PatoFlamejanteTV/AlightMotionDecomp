package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class A3 {

    /* renamed from: c, reason: collision with root package name */
    public static final A3 f17125c = new A3(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f17126a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17127b;

    /* loaded from: classes3.dex */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* renamed from: a, reason: collision with root package name */
        public final String f17133a;

        a(String str) {
            this.f17133a = str;
        }
    }

    private A3(EnumMap enumMap, int i8) {
        EnumMap enumMap2 = new EnumMap(a.class);
        this.f17126a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f17127b = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char a(l0.p pVar) {
        if (pVar != null) {
            int ordinal = pVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static A3 c(Bundle bundle, int i8) {
        a[] aVarArr;
        if (bundle == null) {
            return new A3(null, null, i8);
        }
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = B3.STORAGE.f17156a;
        for (a aVar : aVarArr) {
            enumMap.put((EnumMap) aVar, (a) k(bundle.getString(aVar.f17133a)));
        }
        return new A3(enumMap, i8);
    }

    public static A3 e(String str, int i8) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str == null) {
            str = "";
        }
        a[] a9 = B3.STORAGE.a();
        for (int i9 = 0; i9 < a9.length; i9++) {
            a aVar = a9[i9];
            int i10 = i9 + 2;
            if (i10 < str.length()) {
                enumMap.put((EnumMap) aVar, (a) i(str.charAt(i10)));
            } else {
                enumMap.put((EnumMap) aVar, (a) l0.p.UNINITIALIZED);
            }
        }
        return new A3(enumMap, i8);
    }

    public static A3 f(l0.p pVar, l0.p pVar2, int i8) {
        EnumMap enumMap = new EnumMap(a.class);
        enumMap.put((EnumMap) a.AD_STORAGE, (a) pVar);
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) pVar2);
        return new A3(enumMap, -10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(int i8) {
        if (i8 != -30) {
            if (i8 != -20) {
                if (i8 != -10) {
                    if (i8 != 0) {
                        if (i8 != 30) {
                            if (i8 != 90) {
                                if (i8 != 100) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static String h(Bundle bundle) {
        a[] aVarArr;
        String string;
        aVarArr = B3.STORAGE.f17156a;
        int length = aVarArr.length;
        int i8 = 0;
        while (true) {
            Boolean bool = null;
            if (i8 >= length) {
                return null;
            }
            a aVar = aVarArr[i8];
            if (bundle.containsKey(aVar.f17133a) && (string = bundle.getString(aVar.f17133a)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0.p i(char c8) {
        if (c8 != '+') {
            if (c8 != '0') {
                if (c8 != '1') {
                    return l0.p.UNINITIALIZED;
                }
                return l0.p.GRANTED;
            }
            return l0.p.DENIED;
        }
        return l0.p.POLICY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0.p j(Boolean bool) {
        if (bool == null) {
            return l0.p.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return l0.p.GRANTED;
        }
        return l0.p.DENIED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0.p k(String str) {
        if (str == null) {
            return l0.p.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return l0.p.GRANTED;
        }
        if (str.equals("denied")) {
            return l0.p.DENIED;
        }
        return l0.p.UNINITIALIZED;
    }

    public static boolean l(int i8, int i9) {
        if (i8 == -20 && i9 == -30) {
            return true;
        }
        return (i8 == -30 && i9 == -20) || i8 == i9 || i8 < i9;
    }

    public static A3 q(String str) {
        return e(str, 100);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String r(l0.p pVar) {
        int ordinal = pVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                return null;
            }
            return "granted";
        }
        return "denied";
    }

    public final boolean A() {
        Iterator it = this.f17126a.values().iterator();
        while (it.hasNext()) {
            if (((l0.p) it.next()) != l0.p.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        return this.f17127b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.A3 d(com.google.android.gms.measurement.internal.A3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.A3$a> r1 = com.google.android.gms.measurement.internal.A3.a.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.B3 r1 = com.google.android.gms.measurement.internal.B3.STORAGE
            com.google.android.gms.measurement.internal.A3$a[] r1 = com.google.android.gms.measurement.internal.B3.b(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f17126a
            java.lang.Object r5 = r5.get(r4)
            l0.p r5 = (l0.p) r5
            java.util.EnumMap r6 = r9.f17126a
            java.lang.Object r6 = r6.get(r4)
            l0.p r6 = (l0.p) r6
            if (r5 != 0) goto L26
            goto L35
        L26:
            if (r6 != 0) goto L29
            goto L45
        L29:
            l0.p r7 = l0.p.UNINITIALIZED
            if (r5 != r7) goto L2e
            goto L35
        L2e:
            if (r6 != r7) goto L31
            goto L45
        L31:
            l0.p r7 = l0.p.POLICY
            if (r5 != r7) goto L37
        L35:
            r5 = r6
            goto L45
        L37:
            if (r6 != r7) goto L3a
            goto L45
        L3a:
            l0.p r7 = l0.p.DENIED
            if (r5 == r7) goto L44
            if (r6 != r7) goto L41
            goto L44
        L41:
            l0.p r5 = l0.p.GRANTED
            goto L45
        L44:
            r5 = r7
        L45:
            if (r5 == 0) goto L4a
            r0.put(r4, r5)
        L4a:
            int r3 = r3 + 1
            goto Lf
        L4d:
            com.google.android.gms.measurement.internal.A3 r9 = new com.google.android.gms.measurement.internal.A3
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.A3.d(com.google.android.gms.measurement.internal.A3):com.google.android.gms.measurement.internal.A3");
    }

    public final boolean equals(Object obj) {
        a[] aVarArr;
        if (!(obj instanceof A3)) {
            return false;
        }
        A3 a32 = (A3) obj;
        aVarArr = B3.STORAGE.f17156a;
        for (a aVar : aVarArr) {
            if (this.f17126a.get(aVar) != a32.f17126a.get(aVar)) {
                return false;
            }
        }
        if (this.f17127b != a32.f17127b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i8 = this.f17127b * 17;
        Iterator it = this.f17126a.values().iterator();
        while (it.hasNext()) {
            i8 = (i8 * 31) + ((l0.p) it.next()).hashCode();
        }
        return i8;
    }

    public final boolean m(a aVar) {
        if (((l0.p) this.f17126a.get(aVar)) == l0.p.DENIED) {
            return false;
        }
        return true;
    }

    public final boolean n(A3 a32, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!a32.m(aVar) && m(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f17126a.entrySet()) {
            String r8 = r((l0.p) entry.getValue());
            if (r8 != null) {
                bundle.putString(((a) entry.getKey()).f17133a, r8);
            }
        }
        return bundle;
    }

    public final A3 p(A3 a32) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = B3.STORAGE.f17156a;
        for (a aVar : aVarArr) {
            l0.p pVar = (l0.p) this.f17126a.get(aVar);
            if (pVar == l0.p.UNINITIALIZED) {
                pVar = (l0.p) a32.f17126a.get(aVar);
            }
            if (pVar != null) {
                enumMap.put((EnumMap) aVar, (a) pVar);
            }
        }
        return new A3(enumMap, this.f17127b);
    }

    public final boolean s(A3 a32, a... aVarArr) {
        for (a aVar : aVarArr) {
            l0.p pVar = (l0.p) this.f17126a.get(aVar);
            l0.p pVar2 = (l0.p) a32.f17126a.get(aVar);
            l0.p pVar3 = l0.p.DENIED;
            if (pVar == pVar3 && pVar2 != pVar3) {
                return true;
            }
        }
        return false;
    }

    public final l0.p t() {
        l0.p pVar = (l0.p) this.f17126a.get(a.AD_STORAGE);
        if (pVar == null) {
            return l0.p.UNINITIALIZED;
        }
        return pVar;
    }

    public final String toString() {
        a[] aVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(g(this.f17127b));
        aVarArr = B3.STORAGE.f17156a;
        for (a aVar : aVarArr) {
            sb.append(",");
            sb.append(aVar.f17133a);
            sb.append("=");
            l0.p pVar = (l0.p) this.f17126a.get(aVar);
            if (pVar == null) {
                pVar = l0.p.UNINITIALIZED;
            }
            sb.append(pVar);
        }
        return sb.toString();
    }

    public final boolean u(A3 a32) {
        return s(a32, (a[]) this.f17126a.keySet().toArray(new a[0]));
    }

    public final l0.p v() {
        l0.p pVar = (l0.p) this.f17126a.get(a.ANALYTICS_STORAGE);
        if (pVar == null) {
            return l0.p.UNINITIALIZED;
        }
        return pVar;
    }

    public final String w() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : B3.STORAGE.a()) {
            l0.p pVar = (l0.p) this.f17126a.get(aVar);
            char c8 = '-';
            if (pVar != null && (ordinal = pVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c8 = '0';
                    }
                }
                c8 = '1';
            }
            sb.append(c8);
        }
        return sb.toString();
    }

    public final String x() {
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : B3.STORAGE.a()) {
            sb.append(a((l0.p) this.f17126a.get(aVar)));
        }
        return sb.toString();
    }

    public final boolean y() {
        return m(a.AD_STORAGE);
    }

    public final boolean z() {
        return m(a.ANALYTICS_STORAGE);
    }

    public A3(Boolean bool, Boolean bool2, int i8) {
        EnumMap enumMap = new EnumMap(a.class);
        this.f17126a = enumMap;
        enumMap.put((EnumMap) a.AD_STORAGE, (a) j(null));
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) j(null));
        this.f17127b = i8;
    }
}
