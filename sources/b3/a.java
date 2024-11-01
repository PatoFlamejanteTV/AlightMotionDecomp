package B3;

import D3.f;
import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import R5.Q;
import c6.InterfaceC2074p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import w4.C4156a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3821f f556a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3821f f557b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3821f f558c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f559d;

    /* renamed from: B3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0009a extends l implements InterfaceC2074p {

        /* renamed from: a, reason: collision with root package name */
        int f560a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f561b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f562c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f563d;

        C0009a(U5.d dVar) {
            super(4, dVar);
        }

        @Override // c6.InterfaceC2074p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map map, Set set, f.a aVar, U5.d dVar) {
            C0009a c0009a = new C0009a(dVar);
            c0009a.f561b = map;
            c0009a.f562c = set;
            c0009a.f563d = aVar;
            return c0009a.invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f560a == 0) {
                t.b(obj);
                Map map = (Map) this.f561b;
                Set set = (Set) this.f562c;
                f.a aVar = (f.a) this.f563d;
                a aVar2 = a.this;
                return aVar2.c(map, set, aVar, aVar2.f559d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(InterfaceC3821f currentFieldValueMap, InterfaceC3821f hiddenIdentifiers, InterfaceC3821f userRequestedReuse, Map defaultValues) {
        AbstractC3292y.i(currentFieldValueMap, "currentFieldValueMap");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC3292y.i(userRequestedReuse, "userRequestedReuse");
        AbstractC3292y.i(defaultValues, "defaultValues");
        this.f556a = currentFieldValueMap;
        this.f557b = hiddenIdentifiers;
        this.f558c = userRequestedReuse;
        this.f559d = defaultValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c c(Map map, Set set, f.a aVar, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (true ^ set.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map B8 = Q.B(linkedHashMap);
        Iterator it = map2.entrySet().iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            C4156a c4156a = (C4156a) B8.get(entry2.getKey());
            if (c4156a != null) {
                str = c4156a.c();
            }
            if (str == null || n.T(str)) {
                CharSequence charSequence = (CharSequence) entry2.getValue();
                if (charSequence != null && !n.T(charSequence)) {
                    B8.put(entry2.getKey(), new C4156a((String) entry2.getValue(), true));
                }
            }
        }
        c cVar = new c(B8, aVar);
        Collection values = B8.values();
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(values, 10));
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(((C4156a) it2.next()).d()));
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (!((Boolean) it3.next()).booleanValue()) {
                    return null;
                }
            }
        }
        return cVar;
    }

    public final InterfaceC3821f d() {
        return AbstractC3823h.l(this.f556a, this.f557b, this.f558c, new C0009a(null));
    }
}
