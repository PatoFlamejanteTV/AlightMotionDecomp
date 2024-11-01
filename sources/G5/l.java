package G5;

import D5.s;
import Q5.p;
import R5.AbstractC1435t;
import R5.a0;
import U7.w;
import androidx.lifecycle.ViewModel;
import b.AbstractC1948c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import l6.n;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class l extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final w f3096a;

    /* renamed from: b, reason: collision with root package name */
    public final s f3097b;

    /* renamed from: c, reason: collision with root package name */
    public final J6.f f3098c;

    /* renamed from: d, reason: collision with root package name */
    public final D5.e f3099d;

    /* renamed from: e, reason: collision with root package name */
    public final G6.l f3100e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3101f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3102g;

    /* renamed from: h, reason: collision with root package name */
    public final List f3103h;

    /* renamed from: i, reason: collision with root package name */
    public final List f3104i;

    /* renamed from: j, reason: collision with root package name */
    public j f3105j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3106k;

    /* renamed from: l, reason: collision with root package name */
    public int f3107l;

    public l(w translationsTextRepository, s tcModel, J6.f portalConfig, D5.e googleVendorList, G6.l lVar, List vendorPurposeIds, List vendorSpecialPurposeIds, List vendorFeaturesIds, List vendorSpecialFeaturesIds) {
        AbstractC3292y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3292y.i(tcModel, "tcModel");
        AbstractC3292y.i(portalConfig, "portalConfig");
        AbstractC3292y.i(googleVendorList, "googleVendorList");
        AbstractC3292y.i(vendorPurposeIds, "vendorPurposeIds");
        AbstractC3292y.i(vendorSpecialPurposeIds, "vendorSpecialPurposeIds");
        AbstractC3292y.i(vendorFeaturesIds, "vendorFeaturesIds");
        AbstractC3292y.i(vendorSpecialFeaturesIds, "vendorSpecialFeaturesIds");
        this.f3096a = translationsTextRepository;
        this.f3097b = tcModel;
        this.f3098c = portalConfig;
        this.f3099d = googleVendorList;
        this.f3100e = lVar;
        this.f3101f = vendorPurposeIds;
        this.f3102g = vendorSpecialPurposeIds;
        this.f3103h = vendorFeaturesIds;
        this.f3104i = vendorSpecialFeaturesIds;
        this.f3105j = j.ALL_VENDORS;
        this.f3107l = 3;
    }

    public final String a(Set ids, a type) {
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
                            G6.e eVar = this.f3097b.f1414a;
                            if (eVar != null) {
                                map = eVar.f3121k;
                            }
                            map = null;
                        } else {
                            throw new p();
                        }
                    } else {
                        b12 = AbstractC1435t.b1(this.f3104i);
                        G6.e eVar2 = this.f3097b.f1414a;
                        if (eVar2 != null) {
                            map = eVar2.f3117g;
                        }
                        map = null;
                    }
                } else {
                    b12 = AbstractC1435t.b1(this.f3103h);
                    G6.e eVar3 = this.f3097b.f1414a;
                    if (eVar3 != null) {
                        map = eVar3.f3116f;
                    }
                    map = null;
                }
            } else {
                b12 = AbstractC1435t.b1(this.f3102g);
                G6.e eVar4 = this.f3097b.f1414a;
                if (eVar4 != null) {
                    map = eVar4.f3115e;
                }
                map = null;
            }
        } else {
            b12 = AbstractC1435t.b1(this.f3101f);
            G6.e eVar5 = this.f3097b.f1414a;
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

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3099d.f1371a.entrySet()) {
            if (this.f3097b.f1408B.get(((D5.f) entry.getValue()).f1372a) != null) {
                arrayList.add(new b8.d(((D5.f) entry.getValue()).a(), this.f3097b.f1408B.get(((D5.f) entry.getValue()).f1372a), null, b8.e.GOOGLE_VENDOR, false, null, null, 116));
            }
        }
        return arrayList;
    }

    public final List c(String search) {
        List f8;
        b8.d dVar;
        boolean booleanValue;
        AbstractC3292y.i(search, "search");
        int ordinal = this.f3105j.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        f8 = b();
                    } else {
                        throw new p();
                    }
                } else {
                    f8 = f();
                }
            } else {
                f8 = e();
            }
        } else {
            f8 = f();
            ArrayList arrayList = (ArrayList) f8;
            arrayList.addAll(e());
            arrayList.addAll(b());
            G6.l lVar = this.f3100e;
            if (lVar == null) {
                dVar = null;
            } else {
                Boolean bool = this.f3097b.f1433t.get(lVar.f3123a);
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                dVar = new b8.d(lVar, Boolean.valueOf(booleanValue), null, b8.e.PUBLISHER_VENDOR, false, null, null, 116);
            }
            if (dVar != null) {
                arrayList.add(0, dVar);
            }
        }
        f8.add(0, new b8.d(null, null, b8.f.LABEL, null, false, this.f3096a.a().f9926d, null, 91));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : f8) {
            if (n.E(((b8.d) obj).f15122a.f3124b, search, true)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC1435t.Z0(arrayList2);
    }

    public final void d(j jVar) {
        AbstractC3292y.i(jVar, "<set-?>");
        this.f3105j = jVar;
    }

    public final List e() {
        Map map;
        ArrayList arrayList = new ArrayList();
        G6.e eVar = this.f3097b.f1414a;
        if (eVar != null && (map = eVar.f3119i) != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (this.f3097b.f1439z.get(((G6.l) entry.getValue()).f3123a) != null) {
                    Set set = ((G6.l) entry.getValue()).f3130d;
                    List list = this.f3098c.f4497b.f4462h;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (AbstractC1948c.a((Number) it.next(), list)) {
                                arrayList.add(new b8.d((G6.f) entry.getValue(), this.f3097b.f1439z.get(((G6.l) entry.getValue()).f3123a), null, null, false, null, null, 124));
                                break;
                            }
                        }
                    }
                    arrayList.add(new b8.d((G6.f) entry.getValue(), null, null, null, false, null, null, 124));
                }
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList = new ArrayList();
        for (J6.d dVar : this.f3098c.f4498c.f4493a) {
            if (this.f3097b.f1407A.get(dVar.f4486a) != null) {
                arrayList.add(new b8.d(dVar.a(), this.f3097b.f1407A.get(dVar.f4486a), null, b8.e.NON_IAB_VENDOR, false, null, null, 116));
            }
        }
        return arrayList;
    }
}
