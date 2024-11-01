package x5;

import D5.s;
import R5.AbstractC1435t;
import R5.a0;
import S7.p;
import U7.w;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class k extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f41122a;

    /* renamed from: b, reason: collision with root package name */
    public final J6.f f41123b;

    /* renamed from: c, reason: collision with root package name */
    public final D5.e f41124c;

    /* renamed from: d, reason: collision with root package name */
    public final G6.l f41125d;

    /* renamed from: e, reason: collision with root package name */
    public final U7.e f41126e;

    /* renamed from: f, reason: collision with root package name */
    public final w f41127f;

    /* renamed from: g, reason: collision with root package name */
    public final List f41128g;

    /* renamed from: h, reason: collision with root package name */
    public final List f41129h;

    /* renamed from: i, reason: collision with root package name */
    public final List f41130i;

    /* renamed from: j, reason: collision with root package name */
    public final List f41131j;

    /* renamed from: k, reason: collision with root package name */
    public final L5.c f41132k;

    /* renamed from: l, reason: collision with root package name */
    public final int f41133l;

    /* renamed from: m, reason: collision with root package name */
    public Set f41134m;

    /* renamed from: n, reason: collision with root package name */
    public Set f41135n;

    /* renamed from: o, reason: collision with root package name */
    public MutableLiveData f41136o;

    public k(s tcModel, J6.f portalConfig, D5.e googleVendorList, G6.l lVar, U7.e consentRepository, w translationsTextRepository, List initScreenCustomLinks, List vendorSpecialPurposeIds, List vendorFeaturesIds, List publisherStacksSelectedIds, Integer num, L5.c gbcPurposeResponse) {
        AbstractC3292y.i(tcModel, "tcModel");
        AbstractC3292y.i(portalConfig, "portalConfig");
        AbstractC3292y.i(googleVendorList, "googleVendorList");
        AbstractC3292y.i(consentRepository, "consentRepository");
        AbstractC3292y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3292y.i(initScreenCustomLinks, "initScreenCustomLinks");
        AbstractC3292y.i(vendorSpecialPurposeIds, "vendorSpecialPurposeIds");
        AbstractC3292y.i(vendorFeaturesIds, "vendorFeaturesIds");
        AbstractC3292y.i(publisherStacksSelectedIds, "publisherStacksSelectedIds");
        AbstractC3292y.i(gbcPurposeResponse, "gbcPurposeResponse");
        this.f41122a = tcModel;
        this.f41123b = portalConfig;
        this.f41124c = googleVendorList;
        this.f41125d = lVar;
        this.f41126e = consentRepository;
        this.f41127f = translationsTextRepository;
        this.f41128g = initScreenCustomLinks;
        this.f41129h = vendorSpecialPurposeIds;
        this.f41130i = vendorFeaturesIds;
        this.f41131j = publisherStacksSelectedIds;
        this.f41132k = gbcPurposeResponse;
        this.f41133l = 2;
        this.f41134m = new LinkedHashSet();
        this.f41135n = new LinkedHashSet();
        this.f41136o = new MutableLiveData();
    }

    public final b8.d a(String str, Set set, int i8) {
        if (AbstractC3292y.d(str, "ALL_VENDORS") && this.f41125d != null && set.contains(Integer.valueOf(i8))) {
            G6.l lVar = this.f41125d;
            return new b8.d(lVar, null, b8.f.NON_SWITCH, b8.e.PURPOSE_PARTNER, false, lVar.f3124b, null, 82);
        }
        return null;
    }

    public final List b() {
        Map map;
        int i8;
        Map map2;
        int i9;
        Collection collection;
        Map map3;
        G6.j jVar;
        Map map4;
        int i10;
        int i11;
        Map map5;
        int i12;
        Collection collection2;
        Map map6;
        G6.j jVar2;
        ArrayList arrayList = new ArrayList();
        G6.e eVar = this.f41122a.f1414a;
        if (eVar != null && (map4 = eVar.f3114d) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map4.entrySet()) {
                if (this.f41122a.f1431r.contains(((G6.i) entry.getValue()).f3123a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Set set = this.f41134m;
                if (set == null || set.isEmpty()) {
                    Set set2 = this.f41134m;
                    Iterator it = this.f41131j.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        G6.e eVar2 = this.f41122a.f1414a;
                        if (eVar2 == null || (map6 = eVar2.f3120j) == null || (jVar2 = (G6.j) map6.get(String.valueOf(intValue))) == null) {
                            collection2 = null;
                        } else {
                            collection2 = jVar2.f3127c;
                        }
                        if (collection2 == null) {
                            collection2 = a0.f();
                        }
                        set2.addAll(collection2);
                    }
                }
                if (!this.f41134m.contains(Integer.valueOf(((G6.i) entry2.getValue()).f3123a))) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                int i13 = ((G6.i) entry3.getValue()).f3123a;
                G6.e eVar3 = this.f41122a.f1414a;
                if (eVar3 == null || (map5 = eVar3.f3119i) == null) {
                    i10 = 0;
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry4 : map5.entrySet()) {
                        if (((G6.l) entry4.getValue()).f3137k == null) {
                            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    Iterator it2 = linkedHashMap3.entrySet().iterator();
                    i10 = 0;
                    while (it2.hasNext()) {
                        Set set3 = ((G6.l) ((Map.Entry) it2.next()).getValue()).f3130d;
                        if ((set3 instanceof Collection) && set3.isEmpty()) {
                            i12 = 0;
                        } else {
                            Iterator it3 = set3.iterator();
                            i12 = 0;
                            while (it3.hasNext()) {
                                if (((Number) it3.next()).intValue() == i13 && (i12 = i12 + 1) < 0) {
                                    AbstractC1435t.v();
                                }
                            }
                        }
                        i10 += i12;
                    }
                }
                Iterator it4 = this.f41123b.f4498c.f4493a.iterator();
                while (it4.hasNext()) {
                    List list = ((J6.d) it4.next()).f4491f;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        i11 = 0;
                    } else {
                        Iterator it5 = list.iterator();
                        i11 = 0;
                        while (it5.hasNext()) {
                            if (((Number) it5.next()).intValue() == i13 && (i11 = i11 + 1) < 0) {
                                AbstractC1435t.v();
                            }
                        }
                    }
                    i10 += i11;
                }
                Iterator it6 = this.f41123b.f4497b.f4473s.iterator();
                while (it6.hasNext()) {
                    if (((Number) it6.next()).intValue() == i13) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    arrayList.add(new b8.d((G6.f) entry3.getValue(), this.f41122a.f1431r.get(((G6.i) entry3.getValue()).f3123a), null, b8.e.PURPOSE, false, this.f41127f.a().f9926d, Integer.valueOf(i10), 20));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        G6.e eVar4 = this.f41122a.f1414a;
        if (eVar4 != null && (map = eVar4.f3117g) != null) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry5 : map.entrySet()) {
                if (this.f41122a.f1430q.contains(((G6.d) entry5.getValue()).f3123a)) {
                    linkedHashMap4.put(entry5.getKey(), entry5.getValue());
                }
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Map.Entry entry6 : linkedHashMap4.entrySet()) {
                Set set4 = this.f41135n;
                if (set4 == null || set4.isEmpty()) {
                    Set set5 = this.f41135n;
                    Iterator it7 = this.f41131j.iterator();
                    while (it7.hasNext()) {
                        int intValue2 = ((Number) it7.next()).intValue();
                        G6.e eVar5 = this.f41122a.f1414a;
                        if (eVar5 == null || (map3 = eVar5.f3120j) == null || (jVar = (G6.j) map3.get(String.valueOf(intValue2))) == null) {
                            collection = null;
                        } else {
                            collection = jVar.f3128d;
                        }
                        if (collection == null) {
                            collection = a0.f();
                        }
                        set5.addAll(collection);
                    }
                }
                if (!this.f41135n.contains(Integer.valueOf(((G6.d) entry6.getValue()).f3123a))) {
                    linkedHashMap5.put(entry6.getKey(), entry6.getValue());
                }
            }
            for (Map.Entry entry7 : linkedHashMap5.entrySet()) {
                int i14 = ((G6.d) entry7.getValue()).f3123a;
                G6.e eVar6 = this.f41122a.f1414a;
                if (eVar6 == null || (map2 = eVar6.f3119i) == null) {
                    i8 = 0;
                } else {
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    for (Map.Entry entry8 : map2.entrySet()) {
                        if (((G6.l) entry8.getValue()).f3137k == null) {
                            linkedHashMap6.put(entry8.getKey(), entry8.getValue());
                        }
                    }
                    Iterator it8 = linkedHashMap6.entrySet().iterator();
                    i8 = 0;
                    while (it8.hasNext()) {
                        Set set6 = ((G6.l) ((Map.Entry) it8.next()).getValue()).f3135i;
                        if ((set6 instanceof Collection) && set6.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it9 = set6.iterator();
                            i9 = 0;
                            while (it9.hasNext()) {
                                if (((Number) it9.next()).intValue() == i14 && (i9 = i9 + 1) < 0) {
                                    AbstractC1435t.v();
                                }
                            }
                        }
                        i8 += i9;
                    }
                }
                Iterator it10 = this.f41123b.f4497b.f4477w.iterator();
                while (it10.hasNext()) {
                    if (((Number) it10.next()).intValue() == i14) {
                        i8++;
                    }
                }
                if (i8 > 0) {
                    arrayList2.add(new b8.d((G6.f) entry7.getValue(), this.f41122a.f1430q.get(((G6.d) entry7.getValue()).f3123a), null, b8.e.SPECIAL_FEATURE, false, this.f41127f.a().f9926d, Integer.valueOf(i8), 20));
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final List c() {
        Map map;
        int i8;
        Map map2;
        int i9;
        Map map3;
        int i10;
        Map map4;
        int i11;
        ArrayList arrayList = new ArrayList();
        G6.e eVar = this.f41122a.f1414a;
        if (eVar != null && (map3 = eVar.f3115e) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map3.entrySet()) {
                if (this.f41129h.contains(Integer.valueOf(((G6.i) entry.getValue()).f3123a)) || this.f41123b.f4497b.f4475u.contains(Integer.valueOf(((G6.i) entry.getValue()).f3123a))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int i12 = ((G6.i) entry2.getValue()).f3123a;
                G6.e eVar2 = this.f41122a.f1414a;
                if (eVar2 == null || (map4 = eVar2.f3119i) == null) {
                    i10 = 0;
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry3 : map4.entrySet()) {
                        if (((G6.l) entry3.getValue()).f3137k == null) {
                            linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        Set set = ((G6.l) ((Map.Entry) it.next()).getValue()).f3133g;
                        if ((set instanceof Collection) && set.isEmpty()) {
                            i11 = 0;
                        } else {
                            Iterator it2 = set.iterator();
                            i11 = 0;
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).intValue() == i12 && (i11 = i11 + 1) < 0) {
                                    AbstractC1435t.v();
                                }
                            }
                        }
                        i10 += i11;
                    }
                }
                Iterator it3 = this.f41123b.f4497b.f4475u.iterator();
                while (it3.hasNext()) {
                    if (((Number) it3.next()).intValue() == i12) {
                        i10++;
                    }
                }
                if (i10 > 0) {
                    arrayList.add(new b8.d((G6.f) entry2.getValue(), null, null, b8.e.SPECIAL_PURPOSE, false, this.f41127f.a().f9926d, Integer.valueOf(i10), 22));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        G6.e eVar3 = this.f41122a.f1414a;
        if (eVar3 != null && (map = eVar3.f3116f) != null) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry4 : map.entrySet()) {
                if (this.f41130i.contains(Integer.valueOf(((G6.d) entry4.getValue()).f3123a)) || this.f41123b.f4497b.f4476v.contains(Integer.valueOf(((G6.d) entry4.getValue()).f3123a))) {
                    linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                }
            }
            for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
                int i13 = ((G6.d) entry5.getValue()).f3123a;
                G6.e eVar4 = this.f41122a.f1414a;
                if (eVar4 == null || (map2 = eVar4.f3119i) == null) {
                    i8 = 0;
                } else {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry entry6 : map2.entrySet()) {
                        if (((G6.l) entry6.getValue()).f3137k == null) {
                            linkedHashMap4.put(entry6.getKey(), entry6.getValue());
                        }
                    }
                    Iterator it4 = linkedHashMap4.entrySet().iterator();
                    i8 = 0;
                    while (it4.hasNext()) {
                        Set set2 = ((G6.l) ((Map.Entry) it4.next()).getValue()).f3134h;
                        if ((set2 instanceof Collection) && set2.isEmpty()) {
                            i9 = 0;
                        } else {
                            Iterator it5 = set2.iterator();
                            i9 = 0;
                            while (it5.hasNext()) {
                                if (((Number) it5.next()).intValue() == i13 && (i9 = i9 + 1) < 0) {
                                    AbstractC1435t.v();
                                }
                            }
                        }
                        i8 += i9;
                    }
                }
                Iterator it6 = this.f41123b.f4497b.f4476v.iterator();
                while (it6.hasNext()) {
                    if (((Number) it6.next()).intValue() == i13) {
                        i8++;
                    }
                }
                if (i8 > 0) {
                    arrayList2.add(new b8.d((G6.f) entry5.getValue(), null, null, b8.e.FEATURES, false, this.f41127f.a().f9926d, Integer.valueOf(i8), 22));
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final List d() {
        Map map;
        String str;
        Map map2;
        G6.j jVar;
        boolean booleanValue;
        boolean booleanValue2;
        Map map3;
        ArrayList arrayList = new ArrayList();
        G6.e eVar = this.f41122a.f1414a;
        if (eVar != null && (map = eVar.f3120j) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (this.f41131j.contains(Integer.valueOf(((G6.j) entry.getValue()).f3123a))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Iterator it = ((G6.j) entry2.getValue()).f3127c.iterator();
                boolean z8 = false;
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    G6.e eVar2 = this.f41122a.f1414a;
                    if (eVar2 != null && (map3 = eVar2.f3119i) != null) {
                        for (Map.Entry entry3 : map3.entrySet()) {
                            if (((G6.l) entry3.getValue()).f3137k == null && ((G6.l) entry3.getValue()).f3130d.contains(Integer.valueOf(intValue))) {
                                z8 = true;
                            }
                        }
                    }
                }
                if (z8) {
                    int i8 = ((G6.j) entry2.getValue()).f3123a;
                    String str2 = ((G6.j) entry2.getValue()).f3124b;
                    int i9 = ((G6.j) entry2.getValue()).f3123a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    G6.e eVar3 = this.f41122a.f1414a;
                    if (eVar3 != null && (map2 = eVar3.f3120j) != null && (jVar = (G6.j) map2.get(String.valueOf(i9))) != null) {
                        List list = jVar.f3127c;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            if (this.f41122a.f1431r.contains(((Number) obj).intValue())) {
                                arrayList2.add(obj);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Boolean bool = this.f41122a.f1431r.get(((Number) it2.next()).intValue());
                            if (bool == null) {
                                booleanValue2 = false;
                            } else {
                                booleanValue2 = bool.booleanValue();
                            }
                            linkedHashSet.add(Boolean.valueOf(booleanValue2));
                        }
                        List list2 = jVar.f3128d;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (this.f41122a.f1430q.contains(((Number) obj2).intValue())) {
                                arrayList3.add(obj2);
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Boolean bool2 = this.f41122a.f1430q.get(((Number) it3.next()).intValue());
                            if (bool2 == null) {
                                booleanValue = false;
                            } else {
                                booleanValue = bool2.booleanValue();
                            }
                            linkedHashSet.add(Boolean.valueOf(booleanValue));
                        }
                    }
                    Boolean bool3 = Boolean.TRUE;
                    if (linkedHashSet.contains(bool3) && linkedHashSet.contains(Boolean.FALSE)) {
                        str = this.f41127f.f().f9903l;
                    } else if (linkedHashSet.contains(bool3)) {
                        str = this.f41127f.f().f9904m;
                    } else {
                        str = this.f41127f.f().f9902k;
                    }
                    arrayList.add(new p(i8, str2, str));
                }
            }
        }
        return arrayList;
    }

    public final void e() {
        String str = this.f41123b.f4497b.f4444I;
        if (str != null) {
            PrivacyEncodingMode privacyEncodingMode = PrivacyEncodingMode.GPP;
            if (str.equals(privacyEncodingMode.getValue())) {
                this.f41126e.a(privacyEncodingMode, true);
                return;
            }
        }
        String str2 = this.f41123b.f4497b.f4444I;
        if (str2 != null) {
            PrivacyEncodingMode privacyEncodingMode2 = PrivacyEncodingMode.TCF;
            if (str2.equals(privacyEncodingMode2.getValue())) {
                this.f41126e.a(privacyEncodingMode2, true);
                return;
            }
        }
        this.f41126e.a(PrivacyEncodingMode.TCF_AND_GPP, true);
    }
}
