package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.A3;
import j$.util.Objects;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2453v {

    /* renamed from: f, reason: collision with root package name */
    private static final C2453v f18080f = new C2453v(null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final int f18081a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18082b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f18083c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18084d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumMap f18085e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2453v(Boolean bool, int i8) {
        this((Boolean) null, i8, (Boolean) null, (String) null);
    }

    public static C2453v b(Bundle bundle, int i8) {
        Boolean bool = null;
        if (bundle == null) {
            return new C2453v(null, i8);
        }
        EnumMap enumMap = new EnumMap(A3.a.class);
        for (A3.a aVar : B3.DMA.a()) {
            enumMap.put((EnumMap) aVar, (A3.a) A3.k(bundle.getString(aVar.f17133a)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new C2453v(enumMap, i8, bool, bundle.getString("cps_display_str"));
    }

    public static C2453v c(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(A3.a.class);
            A3.a[] a9 = B3.DMA.a();
            int length = a9.length;
            int i8 = 1;
            int i9 = 0;
            while (i9 < length) {
                enumMap.put((EnumMap) a9[i9], (A3.a) A3.i(split[i8].charAt(0)));
                i9++;
                i8++;
            }
            return new C2453v(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return f18080f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2453v d(l0.p pVar, int i8) {
        EnumMap enumMap = new EnumMap(A3.a.class);
        enumMap.put((EnumMap) A3.a.AD_USER_DATA, (A3.a) pVar);
        return new C2453v(enumMap, -10, (Boolean) null, (String) null);
    }

    public static Boolean e(Bundle bundle) {
        l0.p k8;
        if (bundle == null || (k8 = A3.k(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i8 = AbstractC2481z.f18138a[k8.ordinal()];
        if (i8 != 3) {
            if (i8 != 4) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18081a);
        for (A3.a aVar : B3.DMA.a()) {
            sb.append(":");
            sb.append(A3.a((l0.p) this.f18085e.get(aVar)));
        }
        return sb.toString();
    }

    public final int a() {
        return this.f18081a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2453v)) {
            return false;
        }
        C2453v c2453v = (C2453v) obj;
        if (!this.f18082b.equalsIgnoreCase(c2453v.f18082b) || !Objects.equals(this.f18083c, c2453v.f18083c)) {
            return false;
        }
        return Objects.equals(this.f18084d, c2453v.f18084d);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f18085e.entrySet()) {
            String r8 = A3.r((l0.p) entry.getValue());
            if (r8 != null) {
                bundle.putString(((A3.a) entry.getKey()).f17133a, r8);
            }
        }
        Boolean bool = this.f18083c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f18084d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final l0.p g() {
        l0.p pVar = (l0.p) this.f18085e.get(A3.a.AD_USER_DATA);
        if (pVar == null) {
            return l0.p.UNINITIALIZED;
        }
        return pVar;
    }

    public final Boolean h() {
        return this.f18083c;
    }

    public final int hashCode() {
        int i8;
        int hashCode;
        Boolean bool = this.f18083c;
        if (bool == null) {
            i8 = 3;
        } else if (bool == Boolean.TRUE) {
            i8 = 7;
        } else {
            i8 = 13;
        }
        String str = this.f18084d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return this.f18082b.hashCode() + (i8 * 29) + (hashCode * 137);
    }

    public final String i() {
        return this.f18084d;
    }

    public final String j() {
        return this.f18082b;
    }

    public final boolean k() {
        Iterator it = this.f18085e.values().iterator();
        while (it.hasNext()) {
            if (((l0.p) it.next()) != l0.p.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(A3.g(this.f18081a));
        for (A3.a aVar : B3.DMA.a()) {
            sb.append(",");
            sb.append(aVar.f17133a);
            sb.append("=");
            l0.p pVar = (l0.p) this.f18085e.get(aVar);
            if (pVar == null) {
                sb.append("uninitialized");
            } else {
                int i8 = AbstractC2481z.f18138a[pVar.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                sb.append("granted");
                            }
                        } else {
                            sb.append("denied");
                        }
                    } else {
                        sb.append("eu_consent_policy");
                    }
                } else {
                    sb.append("uninitialized");
                }
            }
        }
        if (this.f18083c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f18083c);
        }
        if (this.f18084d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f18084d);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2453v(Boolean bool, int i8, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(A3.a.class);
        this.f18085e = enumMap;
        enumMap.put((EnumMap) A3.a.AD_USER_DATA, (A3.a) A3.j(bool));
        this.f18081a = i8;
        this.f18082b = l();
        this.f18083c = bool2;
        this.f18084d = str;
    }

    private C2453v(EnumMap enumMap, int i8, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(A3.a.class);
        this.f18085e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f18081a = i8;
        this.f18082b = l();
        this.f18083c = bool;
        this.f18084d = str;
    }
}
