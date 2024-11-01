package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2251t extends AbstractC2204n implements InterfaceC2195m {

    /* renamed from: c, reason: collision with root package name */
    private final List f16999c;

    /* renamed from: d, reason: collision with root package name */
    private final List f17000d;

    /* renamed from: e, reason: collision with root package name */
    private Y2 f17001e;

    private C2251t(C2251t c2251t) {
        super(c2251t.f16887a);
        ArrayList arrayList = new ArrayList(c2251t.f16999c.size());
        this.f16999c = arrayList;
        arrayList.addAll(c2251t.f16999c);
        ArrayList arrayList2 = new ArrayList(c2251t.f17000d.size());
        this.f17000d = arrayList2;
        arrayList2.addAll(c2251t.f17000d);
        this.f17001e = c2251t.f17001e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2204n
    public final InterfaceC2243s a(Y2 y22, List list) {
        Y2 d8 = this.f17001e.d();
        for (int i8 = 0; i8 < this.f16999c.size(); i8++) {
            if (i8 < list.size()) {
                d8.e((String) this.f16999c.get(i8), y22.b((InterfaceC2243s) list.get(i8)));
            } else {
                d8.e((String) this.f16999c.get(i8), InterfaceC2243s.f16971b0);
            }
        }
        for (InterfaceC2243s interfaceC2243s : this.f17000d) {
            InterfaceC2243s b9 = d8.b(interfaceC2243s);
            if (b9 instanceof C2267v) {
                b9 = d8.b(interfaceC2243s);
            }
            if (b9 instanceof C2186l) {
                return ((C2186l) b9).a();
            }
        }
        return InterfaceC2243s.f16971b0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2204n, com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s b() {
        return new C2251t(this);
    }

    public C2251t(String str, List list, List list2, Y2 y22) {
        super(str);
        this.f16999c = new ArrayList();
        this.f17001e = y22;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f16999c.add(((InterfaceC2243s) it.next()).A());
            }
        }
        this.f17000d = new ArrayList(list2);
    }
}
