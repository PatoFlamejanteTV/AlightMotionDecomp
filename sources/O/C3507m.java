package o;

import D5.s;
import Q5.p;
import R5.AbstractC1435t;
import R5.a0;
import U7.w;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import w5.AbstractC4157a;

/* renamed from: o.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3507m extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f35811a;

    /* renamed from: b, reason: collision with root package name */
    public final J6.f f35812b;

    /* renamed from: c, reason: collision with root package name */
    public final J6.e f35813c;

    /* renamed from: d, reason: collision with root package name */
    public final w f35814d;

    /* renamed from: e, reason: collision with root package name */
    public final G6.l f35815e;

    /* renamed from: f, reason: collision with root package name */
    public final List f35816f;

    /* renamed from: g, reason: collision with root package name */
    public final List f35817g;

    /* renamed from: h, reason: collision with root package name */
    public final List f35818h;

    /* renamed from: i, reason: collision with root package name */
    public final List f35819i;

    /* renamed from: j, reason: collision with root package name */
    public G5.j f35820j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35821k;

    /* renamed from: l, reason: collision with root package name */
    public int f35822l;

    public C3507m(s tcModel, J6.f portalConfig, J6.e nonIabVendorsInfo, w translationsTextRepository, G6.l lVar, List vendorPurposeLegitimateInterestIds, List vendorSpecialPurposeIds, List vendorFeaturesIds, List vendorSpecialFeaturesIds) {
        AbstractC3292y.i(tcModel, "tcModel");
        AbstractC3292y.i(portalConfig, "portalConfig");
        AbstractC3292y.i(nonIabVendorsInfo, "nonIabVendorsInfo");
        AbstractC3292y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3292y.i(vendorPurposeLegitimateInterestIds, "vendorPurposeLegitimateInterestIds");
        AbstractC3292y.i(vendorSpecialPurposeIds, "vendorSpecialPurposeIds");
        AbstractC3292y.i(vendorFeaturesIds, "vendorFeaturesIds");
        AbstractC3292y.i(vendorSpecialFeaturesIds, "vendorSpecialFeaturesIds");
        this.f35811a = tcModel;
        this.f35812b = portalConfig;
        this.f35813c = nonIabVendorsInfo;
        this.f35814d = translationsTextRepository;
        this.f35815e = lVar;
        this.f35816f = vendorPurposeLegitimateInterestIds;
        this.f35817g = vendorSpecialPurposeIds;
        this.f35818h = vendorFeaturesIds;
        this.f35819i = vendorSpecialFeaturesIds;
        this.f35820j = G5.j.ALL_VENDORS;
        this.f35822l = 4;
    }

    public static /* synthetic */ List c(C3507m c3507m, String str, int i8) {
        String str2;
        if ((i8 & 1) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        return c3507m.b(str2);
    }

    public final String a(Set ids, G5.a type) {
        Set b12;
        Map map;
        G6.f fVar;
        AbstractC3292y.i(ids, "ids");
        AbstractC3292y.i(type, "type");
        a0.f();
        int ordinal = type.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            b12 = AbstractC1435t.b1(ids);
                            G6.e eVar = this.f35811a.f1414a;
                            if (eVar != null) {
                                map = eVar.f3121k;
                            }
                            map = null;
                        } else {
                            throw new p();
                        }
                    } else {
                        b12 = AbstractC1435t.b1(this.f35819i);
                        G6.e eVar2 = this.f35811a.f1414a;
                        if (eVar2 != null) {
                            map = eVar2.f3117g;
                        }
                        map = null;
                    }
                } else {
                    b12 = AbstractC1435t.b1(this.f35818h);
                    G6.e eVar3 = this.f35811a.f1414a;
                    if (eVar3 != null) {
                        map = eVar3.f3116f;
                    }
                    map = null;
                }
            } else {
                b12 = AbstractC1435t.b1(this.f35817g);
                G6.e eVar4 = this.f35811a.f1414a;
                if (eVar4 != null) {
                    map = eVar4.f3115e;
                }
                map = null;
            }
        } else {
            b12 = AbstractC1435t.b1(this.f35816f);
            G6.e eVar5 = this.f35811a.f1414a;
            if (eVar5 != null) {
                map = eVar5.f3114d;
            }
            map = null;
        }
        SortedSet b02 = AbstractC1435t.b0(ids);
        ArrayList arrayList = new ArrayList();
        for (Object obj : b02) {
            if (b12.contains((Integer) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (map != null && (fVar = (G6.f) map.get(String.valueOf(num))) != null) {
                StringBuilder a9 = AbstractC4157a.a(str);
                Y y8 = Y.f34578a;
                String format = String.format("• %s.", Arrays.copyOf(new Object[]{fVar.f3124b}, 1));
                AbstractC3292y.h(format, "format(format, *args)");
                a9.append(format);
                a9.append('\n');
                str = a9.toString();
            }
        }
        return str;
    }

    public final List b(String search) {
        List g8;
        G6.e eVar;
        Map map;
        int i8;
        int i9;
        int i10;
        AbstractC3292y.i(search, "search");
        int ordinal = this.f35820j.ordinal();
        if (ordinal != 0) {
            g8 = ordinal != 1 ? ordinal != 2 ? new ArrayList() : g() : f();
        } else {
            g8 = g();
            ArrayList arrayList = (ArrayList) g8;
            arrayList.addAll(f());
            b8.d h8 = h();
            if (h8 != null) {
                arrayList.add(0, h8);
            }
        }
        String str = this.f35814d.e().f9873h;
        b8.f fVar = b8.f.LABEL;
        g8.add(0, new b8.d(null, null, fVar, null, false, str, null, 91));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0, new b8.d(null, null, fVar, null, false, this.f35814d.e().f9872g, null, 91));
        Map i11 = i();
        if (i11 != null) {
            for (Map.Entry entry : i11.entrySet()) {
                int i12 = ((G6.i) entry.getValue()).f3123a;
                G5.j jVar = this.f35820j;
                if ((jVar != G5.j.ALL_VENDORS && jVar != G5.j.IAB_VENDORS) || (eVar = this.f35811a.f1414a) == null || (map = eVar.f3119i) == null) {
                    i8 = 0;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (((G6.l) entry2.getValue()).f3137k == null) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    Iterator it = linkedHashMap.entrySet().iterator();
                    i8 = 0;
                    while (it.hasNext()) {
                        Set set = ((G6.l) ((Map.Entry) it.next()).getValue()).f3131e;
                        if ((set instanceof Collection) && set.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it2 = set.iterator();
                            i9 = 0;
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).intValue() == i12 && (i9 = i9 + 1) < 0) {
                                    AbstractC1435t.v();
                                }
                            }
                        }
                        i8 += i9;
                    }
                }
                G5.j jVar2 = this.f35820j;
                if (jVar2 == G5.j.ALL_VENDORS || jVar2 == G5.j.NON_IAB_VENDORS) {
                    Iterator it3 = this.f35812b.f4498c.f4493a.iterator();
                    while (it3.hasNext()) {
                        List list = ((J6.d) it3.next()).f4492g;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            i10 = 0;
                        } else {
                            Iterator it4 = list.iterator();
                            i10 = 0;
                            while (it4.hasNext()) {
                                if (((Number) it4.next()).intValue() == i12 && (i10 = i10 + 1) < 0) {
                                    AbstractC1435t.v();
                                }
                            }
                        }
                        i8 += i10;
                    }
                }
                if (i8 > 0) {
                    arrayList2.add(new b8.d((G6.f) entry.getValue(), this.f35811a.f1432s.get(((G6.i) entry.getValue()).f3123a), null, b8.e.PURPOSE, false, this.f35814d.a().f9926d, Integer.valueOf(i8), 4));
                }
            }
        }
        g8.addAll(0, arrayList2);
        if (search.length() > 0) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : g8) {
                b8.d dVar = (b8.d) obj;
                if (dVar.f15125d != b8.e.PURPOSE && l6.n.E(dVar.f15122a.f3124b, search, true)) {
                    arrayList3.add(obj);
                }
            }
            return AbstractC1435t.Z0(arrayList3);
        }
        return g8;
    }

    public final Set d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = b("").iterator();
        while (it.hasNext()) {
            Boolean bool = ((b8.d) it.next()).f15123b;
            if (bool != null) {
                linkedHashSet.add(bool);
            }
        }
        return linkedHashSet;
    }

    public final void e(G5.j jVar) {
        AbstractC3292y.i(jVar, "<set-?>");
        this.f35820j = jVar;
    }

    public final List f() {
        Map map;
        ArrayList arrayList = new ArrayList();
        G6.e eVar = this.f35811a.f1414a;
        if (eVar != null && (map = eVar.f3119i) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((G6.l) entry.getValue()).f3137k == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!((G6.l) entry2.getValue()).f3131e.isEmpty()) {
                    arrayList.add(new b8.d((G6.f) entry2.getValue(), this.f35811a.f1409C.get(((G6.l) entry2.getValue()).f3123a), null, null, false, null, null, 124));
                }
            }
        }
        return arrayList;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (J6.d dVar : this.f35813c.f4493a) {
            if (!dVar.f4492g.isEmpty()) {
                arrayList.add(new b8.d(dVar.a(), this.f35811a.f1410D.get(dVar.f4486a), null, b8.e.NON_IAB_VENDOR, false, null, null, 116));
            }
        }
        return arrayList;
    }

    public final b8.d h() {
        boolean booleanValue;
        G6.l lVar = this.f35815e;
        if (lVar == null) {
            return null;
        }
        Boolean bool = this.f35811a.f1434u.get(lVar.f3123a);
        if (bool == null) {
            booleanValue = true;
        } else {
            booleanValue = bool.booleanValue();
        }
        return new b8.d(lVar, Boolean.valueOf(booleanValue), null, b8.e.PUBLISHER_VENDOR, false, null, null, 116);
    }

    public final Map i() {
        Map map;
        G6.e eVar = this.f35811a.f1414a;
        if (eVar == null || (map = eVar.f3114d) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.f35811a.f1432s.contains(((G6.i) entry.getValue()).f3123a)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!AbstractC3292y.d(this.f35811a.f1421h, "DE")) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((G6.i) entry2.getValue()).f3123a != 1) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            return linkedHashMap2;
        }
        return linkedHashMap;
    }
}
