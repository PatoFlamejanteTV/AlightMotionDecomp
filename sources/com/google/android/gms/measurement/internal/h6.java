package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2148g6;
import com.google.android.gms.internal.measurement.C2153h2;
import com.google.android.gms.internal.measurement.C2162i2;
import com.google.android.gms.internal.measurement.C2171j2;
import com.google.android.gms.internal.measurement.C2231q2;
import com.google.android.gms.internal.measurement.C2238r2;
import com.google.android.gms.internal.measurement.C2306z6;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h6 extends E5 {

    /* renamed from: d, reason: collision with root package name */
    private String f17844d;

    /* renamed from: e, reason: collision with root package name */
    private Set f17845e;

    /* renamed from: f, reason: collision with root package name */
    private Map f17846f;

    /* renamed from: g, reason: collision with root package name */
    private Long f17847g;

    /* renamed from: h, reason: collision with root package name */
    private Long f17848h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h6(H5 h52) {
        super(h52);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:            r5 = a().L();        r6 = com.google.android.gms.measurement.internal.C2401n2.s(r13.f17844d);     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:            if (r7.O() == false) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:            r9 = java.lang.Integer.valueOf(r7.j());     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:            r5.c("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r9));        r7 = false;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void B(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.h6.B(java.util.List):void");
    }

    private final void C(List list, boolean z8) {
        A a9;
        m6 m6Var;
        Integer num;
        Map map;
        long j8;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        m6 m6Var2 = new m6(this);
        ArrayMap arrayMap = new ArrayMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2171j2 c2171j2 = (C2171j2) it.next();
            C2171j2 a10 = m6Var2.a(this.f17844d, c2171j2);
            if (a10 != null) {
                C2377k n8 = n();
                String str2 = this.f17844d;
                String U8 = a10.U();
                A L02 = n8.L0(str2, c2171j2.U());
                if (L02 == null) {
                    n8.a().L().c("Event aggregate wasn't created during raw event logging. appId, event", C2401n2.s(str2), n8.d().c(U8));
                    a9 = new A(str2, c2171j2.U(), 1L, 1L, 1L, c2171j2.R(), 0L, null, null, null, null);
                } else {
                    a9 = new A(L02.f17109a, L02.f17110b, L02.f17111c + 1, L02.f17112d + 1, L02.f17113e + 1, L02.f17114f, L02.f17115g, L02.f17116h, L02.f17117i, L02.f17118j, L02.f17119k);
                }
                A a11 = a9;
                n().U(a11);
                if (!C2148g6.a() || !b().H(str, G.f17281Z0) || !z8) {
                    long j9 = a11.f17111c;
                    String U9 = a10.U();
                    Map map2 = (Map) arrayMap.get(U9);
                    if (map2 == null) {
                        map2 = n().P0(this.f17844d, U9);
                        arrayMap.put(U9, map2);
                    }
                    Map map3 = map2;
                    for (Integer num2 : map3.keySet()) {
                        int intValue = num2.intValue();
                        if (this.f17845e.contains(num2)) {
                            a().K().b("Skipping failed audience ID", num2);
                        } else {
                            Iterator it2 = ((List) map3.get(num2)).iterator();
                            boolean z9 = true;
                            while (true) {
                                if (it2.hasNext()) {
                                    com.google.android.gms.internal.measurement.I1 i12 = (com.google.android.gms.internal.measurement.I1) it2.next();
                                    l6 l6Var = new l6(this, this.f17844d, intValue, i12);
                                    m6Var = m6Var2;
                                    num = num2;
                                    int i8 = intValue;
                                    map = map3;
                                    j8 = j9;
                                    z9 = l6Var.k(this.f17847g, this.f17848h, a10, j9, a11, D(intValue, i12.J()));
                                    if (z9) {
                                        v(num).c(l6Var);
                                        num2 = num;
                                        m6Var2 = m6Var;
                                        intValue = i8;
                                        map3 = map;
                                        j9 = j8;
                                    } else {
                                        this.f17845e.add(num);
                                        break;
                                    }
                                } else {
                                    m6Var = m6Var2;
                                    num = num2;
                                    map = map3;
                                    j8 = j9;
                                    break;
                                }
                            }
                            if (!z9) {
                                this.f17845e.add(num);
                            }
                            m6Var2 = m6Var;
                            map3 = map;
                            j9 = j8;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    private final boolean D(int i8, int i9) {
        j6 j6Var = (j6) this.f17846f.get(Integer.valueOf(i8));
        if (j6Var == null) {
            return false;
        }
        return j6.b(j6Var).get(i9);
    }

    private final List E() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.f17846f.keySet();
        keySet.removeAll(this.f17845e);
        for (Integer num : keySet) {
            int intValue = num.intValue();
            j6 j6Var = (j6) this.f17846f.get(num);
            AbstractC1396p.l(j6Var);
            C2153h2 a9 = j6Var.a(intValue);
            arrayList.add(a9);
            C2377k n8 = n();
            String str = this.f17844d;
            C2231q2 M8 = a9.M();
            n8.r();
            n8.k();
            AbstractC1396p.f(str);
            AbstractC1396p.l(M8);
            byte[] i8 = M8.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put(MBridgeConstans.APP_ID, str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", i8);
            try {
                if (n8.B().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    n8.a().G().b("Failed to insert filter results (got -1). appId", C2401n2.s(str));
                }
            } catch (SQLiteException e8) {
                n8.a().G().c("Error storing filter results. appId", C2401n2.s(str), e8);
            }
        }
        return arrayList;
    }

    private final j6 v(Integer num) {
        if (this.f17846f.containsKey(num)) {
            return (j6) this.f17846f.get(num);
        }
        j6 j6Var = new j6(this, this.f17844d);
        this.f17846f.put(num, j6Var);
        return j6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List A(String str, List list, List list2, Long l8, Long l9, boolean z8) {
        boolean z9;
        boolean z10;
        boolean z11;
        Map map;
        List<com.google.android.gms.internal.measurement.I1> list3;
        Iterator it;
        Iterator it2;
        Map map2;
        Long l10;
        Map map3;
        Iterator it3;
        AbstractC1396p.f(str);
        AbstractC1396p.l(list);
        AbstractC1396p.l(list2);
        this.f17844d = str;
        this.f17845e = new HashSet();
        this.f17846f = new ArrayMap();
        this.f17847g = l8;
        this.f17848h = l9;
        Iterator it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                if ("_s".equals(((C2171j2) it4.next()).U())) {
                    z9 = true;
                    break;
                }
            } else {
                z9 = false;
                break;
            }
        }
        if (C2306z6.a() && b().H(this.f17844d, G.f17328q0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (C2306z6.a() && b().H(this.f17844d, G.f17326p0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9) {
            C2377k n8 = n();
            String str2 = this.f17844d;
            n8.r();
            n8.k();
            AbstractC1396p.f(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                n8.B().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e8) {
                n8.a().G().c("Error resetting session-scoped event counts. appId", C2401n2.s(str2), e8);
            }
        }
        Map emptyMap = Collections.emptyMap();
        if (z11 && z10) {
            emptyMap = n().a1(this.f17844d);
        }
        Map Z02 = n().Z0(this.f17844d);
        if (!Z02.isEmpty()) {
            HashSet hashSet = new HashSet(Z02.keySet());
            if (z9) {
                String str3 = this.f17844d;
                Map b12 = n().b1(this.f17844d);
                AbstractC1396p.f(str3);
                AbstractC1396p.l(Z02);
                Map arrayMap = new ArrayMap();
                if (!Z02.isEmpty()) {
                    Iterator it5 = Z02.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer num = (Integer) it5.next();
                        num.intValue();
                        C2231q2 c2231q2 = (C2231q2) Z02.get(num);
                        List list4 = (List) b12.get(num);
                        if (list4 == null || list4.isEmpty()) {
                            map3 = b12;
                            it3 = it5;
                            arrayMap.put(num, c2231q2);
                        } else {
                            List P8 = l().P(c2231q2.V(), list4);
                            if (!P8.isEmpty()) {
                                C2231q2.a t8 = ((C2231q2.a) c2231q2.x()).s().t(P8);
                                t8.y().A(l().P(c2231q2.X(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (C2162i2 c2162i2 : c2231q2.U()) {
                                    Map map4 = b12;
                                    Iterator it6 = it5;
                                    if (!list4.contains(Integer.valueOf(c2162i2.j()))) {
                                        arrayList.add(c2162i2);
                                    }
                                    b12 = map4;
                                    it5 = it6;
                                }
                                map3 = b12;
                                it3 = it5;
                                t8.q().r(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (C2238r2 c2238r2 : c2231q2.W()) {
                                    if (!list4.contains(Integer.valueOf(c2238r2.J()))) {
                                        arrayList2.add(c2238r2);
                                    }
                                }
                                t8.w().x(arrayList2);
                                arrayMap.put(num, (C2231q2) ((AbstractC2240r4) t8.m()));
                            }
                        }
                        b12 = map3;
                        it5 = it3;
                    }
                }
                map = arrayMap;
            } else {
                map = Z02;
            }
            Iterator it7 = hashSet.iterator();
            Map map5 = Z02;
            while (it7.hasNext()) {
                Integer num2 = (Integer) it7.next();
                num2.intValue();
                C2231q2 c2231q22 = (C2231q2) map.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                ArrayMap arrayMap2 = new ArrayMap();
                if (c2231q22 != null && c2231q22.j() != 0) {
                    for (C2162i2 c2162i22 : c2231q22.U()) {
                        if (c2162i22.M()) {
                            Integer valueOf = Integer.valueOf(c2162i22.j());
                            if (c2162i22.L()) {
                                l10 = Long.valueOf(c2162i22.I());
                            } else {
                                l10 = null;
                            }
                            arrayMap2.put(valueOf, l10);
                        }
                    }
                }
                ArrayMap arrayMap3 = new ArrayMap();
                if (c2231q22 != null && c2231q22.L() != 0) {
                    Iterator it8 = c2231q22.W().iterator();
                    while (it8.hasNext()) {
                        C2238r2 c2238r22 = (C2238r2) it8.next();
                        if (c2238r22.N() && c2238r22.j() > 0) {
                            it2 = it8;
                            map2 = map;
                            arrayMap3.put(Integer.valueOf(c2238r22.J()), Long.valueOf(c2238r22.G(c2238r22.j() - 1)));
                        } else {
                            it2 = it8;
                            map2 = map;
                        }
                        it8 = it2;
                        map = map2;
                    }
                }
                Map map6 = map;
                if (c2231q22 != null) {
                    int i8 = 0;
                    while (i8 < (c2231q22.O() << 6)) {
                        if (Z5.e0(c2231q22.X(), i8)) {
                            it = it7;
                            a().K().c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i8));
                            bitSet2.set(i8);
                            if (Z5.e0(c2231q22.V(), i8)) {
                                bitSet.set(i8);
                                i8++;
                                it7 = it;
                            }
                        } else {
                            it = it7;
                        }
                        arrayMap2.remove(Integer.valueOf(i8));
                        i8++;
                        it7 = it;
                    }
                }
                Iterator it9 = it7;
                C2231q2 c2231q23 = (C2231q2) map5.get(num2);
                if (z11 && z10 && (list3 = (List) emptyMap.get(num2)) != null && this.f17848h != null && this.f17847g != null) {
                    for (com.google.android.gms.internal.measurement.I1 i12 : list3) {
                        int J8 = i12.J();
                        long longValue = this.f17848h.longValue() / 1000;
                        if (i12.Q()) {
                            longValue = this.f17847g.longValue() / 1000;
                        }
                        if (arrayMap2.containsKey(Integer.valueOf(J8))) {
                            arrayMap2.put(Integer.valueOf(J8), Long.valueOf(longValue));
                        }
                        if (arrayMap3.containsKey(Integer.valueOf(J8))) {
                            arrayMap3.put(Integer.valueOf(J8), Long.valueOf(longValue));
                        }
                    }
                }
                this.f17846f.put(num2, new j6(this, this.f17844d, c2231q23, bitSet, bitSet2, arrayMap2, arrayMap3));
                it7 = it9;
                map5 = map5;
                map = map6;
            }
        }
        if (C2148g6.a() && b().H(null, G.f17281Z0)) {
            C(list, z8);
            if (z8) {
                return new ArrayList();
            }
            B(list2);
            return E();
        }
        C(list, true);
        B(list2);
        return E();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List z(String str, List list, List list2, Long l8, Long l9) {
        return A(str, list, list2, l8, l9, false);
    }
}
