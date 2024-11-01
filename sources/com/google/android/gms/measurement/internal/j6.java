package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2153h2;
import com.google.android.gms.internal.measurement.C2162i2;
import com.google.android.gms.internal.measurement.C2231q2;
import com.google.android.gms.internal.measurement.C2238r2;
import com.google.android.gms.internal.measurement.C2306z6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    private String f17884a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17885b;

    /* renamed from: c, reason: collision with root package name */
    private C2231q2 f17886c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f17887d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f17888e;

    /* renamed from: f, reason: collision with root package name */
    private Map f17889f;

    /* renamed from: g, reason: collision with root package name */
    private Map f17890g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ h6 f17891h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet b(j6 j6Var) {
        return j6Var.f17887d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.r4$b, com.google.android.gms.internal.measurement.h2$a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.android.gms.internal.measurement.q2$a] */
    public final C2153h2 a(int i8) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? J8 = C2153h2.J();
        J8.q(i8);
        J8.t(this.f17885b);
        C2231q2 c2231q2 = this.f17886c;
        if (c2231q2 != null) {
            J8.s(c2231q2);
        }
        ?? A8 = C2231q2.R().t(Z5.O(this.f17887d)).A(Z5.O(this.f17888e));
        if (this.f17889f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f17889f.size());
            for (Integer num : this.f17889f.keySet()) {
                int intValue = num.intValue();
                Long l8 = (Long) this.f17889f.get(num);
                if (l8 != null) {
                    arrayList.add((C2162i2) ((AbstractC2240r4) C2162i2.J().q(intValue).r(l8.longValue()).m()));
                }
            }
        }
        if (arrayList != null) {
            A8.r(arrayList);
        }
        if (this.f17890g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f17890g.size());
            for (Integer num2 : this.f17890g.keySet()) {
                C2238r2.a q8 = C2238r2.K().q(num2.intValue());
                List list = (List) this.f17890g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    q8.r(list);
                }
                arrayList2.add((C2238r2) ((AbstractC2240r4) q8.m()));
            }
        }
        A8.x(arrayList2);
        J8.r(A8);
        return (C2153h2) ((AbstractC2240r4) J8.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(AbstractC2314b abstractC2314b) {
        int a9 = abstractC2314b.a();
        Boolean bool = abstractC2314b.f17687c;
        if (bool != null) {
            this.f17888e.set(a9, bool.booleanValue());
        }
        Boolean bool2 = abstractC2314b.f17688d;
        if (bool2 != null) {
            this.f17887d.set(a9, bool2.booleanValue());
        }
        if (abstractC2314b.f17689e != null) {
            Long l8 = (Long) this.f17889f.get(Integer.valueOf(a9));
            long longValue = abstractC2314b.f17689e.longValue() / 1000;
            if (l8 == null || longValue > l8.longValue()) {
                this.f17889f.put(Integer.valueOf(a9), Long.valueOf(longValue));
            }
        }
        if (abstractC2314b.f17690f != null) {
            List list = (List) this.f17890g.get(Integer.valueOf(a9));
            if (list == null) {
                list = new ArrayList();
                this.f17890g.put(Integer.valueOf(a9), list);
            }
            if (abstractC2314b.j()) {
                list.clear();
            }
            if (C2306z6.a() && this.f17891h.b().H(this.f17884a, G.f17328q0) && abstractC2314b.i()) {
                list.clear();
            }
            if (C2306z6.a() && this.f17891h.b().H(this.f17884a, G.f17328q0)) {
                long longValue2 = abstractC2314b.f17690f.longValue() / 1000;
                if (!list.contains(Long.valueOf(longValue2))) {
                    list.add(Long.valueOf(longValue2));
                    return;
                }
                return;
            }
            list.add(Long.valueOf(abstractC2314b.f17690f.longValue() / 1000));
        }
    }

    private j6(h6 h6Var, String str) {
        this.f17891h = h6Var;
        this.f17884a = str;
        this.f17885b = true;
        this.f17887d = new BitSet();
        this.f17888e = new BitSet();
        this.f17889f = new ArrayMap();
        this.f17890g = new ArrayMap();
    }

    private j6(h6 h6Var, String str, C2231q2 c2231q2, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f17891h = h6Var;
        this.f17884a = str;
        this.f17887d = bitSet;
        this.f17888e = bitSet2;
        this.f17889f = map;
        this.f17890g = new ArrayMap();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f17890g.put(num, arrayList);
            }
        }
        this.f17885b = false;
        this.f17886c = c2231q2;
    }
}
