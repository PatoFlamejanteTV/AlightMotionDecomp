package F5;

import D5.s;
import G6.l;
import Q5.I;
import c6.InterfaceC2072n;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public final class h extends AbstractC3293z implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f2715a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s sVar) {
        super(2);
        this.f2715a = sVar;
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        l lVar;
        Map map;
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        G6.e eVar = this.f2715a.f1414a;
        if (eVar == null || (map = eVar.f3119i) == null) {
            lVar = null;
        } else {
            lVar = (l) map.get(String.valueOf(intValue));
        }
        if (lVar == null || (booleanValue && lVar.f3131e.isEmpty())) {
            this.f2715a.f1409C.unset(intValue);
        }
        return I.f8786a;
    }
}
