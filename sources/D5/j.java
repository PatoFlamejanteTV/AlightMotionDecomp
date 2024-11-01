package D5;

import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public List f1384a;

    /* renamed from: b, reason: collision with root package name */
    public List f1385b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f1386c;

    /* renamed from: d, reason: collision with root package name */
    public G6.e f1387d;

    public j(G6.e eVar, List consentRestrictionIds, List liRestrictionIds, Map map) {
        AbstractC3292y.i(consentRestrictionIds, "consentRestrictionIds");
        AbstractC3292y.i(liRestrictionIds, "liRestrictionIds");
        AbstractC3292y.i(map, "map");
        this.f1384a = consentRestrictionIds;
        this.f1385b = liRestrictionIds;
        this.f1386c = map;
        this.f1387d = eVar;
    }

    public final int a() {
        int intValue;
        Iterator it = this.f1386c.entrySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) AbstractC1435t.A0((Iterable) ((Map.Entry) it.next()).getValue());
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            i8 = Math.max(i8, intValue);
        }
        return i8;
    }

    public final List b(Integer num) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f1386c.entrySet()) {
            if (num != null && ((Set) entry.getValue()).contains(num)) {
                arrayList.add(i.f1381c.a((String) entry.getKey()));
            }
        }
        return arrayList;
    }

    public final void c(int i8, i purposeRestriction) {
        AbstractC3292y.i(purposeRestriction, "purposeRestriction");
        k kVar = purposeRestriction.f1383b;
        int i9 = purposeRestriction.f1382a;
        G6.e eVar = this.f1387d;
        if (eVar != null) {
            G6.l lVar = (G6.l) eVar.f3119i.get(String.valueOf(i8));
            if (lVar != null) {
                if (kVar == k.NOT_ALLOWED) {
                    if (!lVar.f3131e.contains(Integer.valueOf(i9)) && !lVar.f3130d.contains(Integer.valueOf(i9))) {
                        return;
                    }
                } else if (!lVar.f3132f.isEmpty()) {
                    int ordinal = kVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2 || !lVar.f3132f.contains(Integer.valueOf(i9)) || !lVar.f3130d.contains(Integer.valueOf(i9))) {
                            return;
                        }
                    } else if (!lVar.f3132f.contains(Integer.valueOf(i9)) || !lVar.f3131e.contains(Integer.valueOf(i9))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        String hash = purposeRestriction.a();
        AbstractC3292y.i(hash, "hash");
        if (!this.f1386c.containsKey(hash)) {
            this.f1386c.put(hash, new LinkedHashSet());
        }
        Iterator it = ((ArrayList) b(Integer.valueOf(i8))).iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar.f1382a == purposeRestriction.f1382a) {
                String a9 = iVar.a();
                Set set = (Set) this.f1386c.get(a9);
                if (set != null) {
                    set.remove(Integer.valueOf(i8));
                    if (set.isEmpty()) {
                        this.f1386c.remove(a9);
                    }
                }
            }
        }
        Set set2 = (Set) this.f1386c.get(hash);
        if (set2 != null) {
            set2.add(Integer.valueOf(i8));
        }
    }

    public /* synthetic */ j(G6.e eVar, List list, List list2, Map map, int i8) {
        this(eVar, (i8 & 2) != 0 ? AbstractC1435t.m() : null, (i8 & 4) != 0 ? AbstractC1435t.m() : null, (i8 & 8) != 0 ? new LinkedHashMap() : null);
    }
}
