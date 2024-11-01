package D5;

import Q5.I;
import b.AbstractC1948c;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public final class n extends AbstractC3293z implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f1402a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar) {
        super(2);
        this.f1402a = sVar;
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        J6.f j8 = Y7.d.f13152a.j();
        List list = j8.f4498c.f4493a;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (intValue == ((J6.d) obj3).f4486a) {
                arrayList.add(obj3);
            }
        }
        s sVar = this.f1402a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            J6.d dVar = (J6.d) it.next();
            List list2 = j8.f4497b.f4462h;
            List list3 = dVar.f4491f;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (AbstractC1948c.a((Number) it2.next(), list2)) {
                        sVar.f1407A.set(intValue);
                        break;
                    }
                }
            }
        }
        return I.f8786a;
    }
}
