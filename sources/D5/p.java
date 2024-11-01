package D5;

import Q5.I;
import c6.InterfaceC2072n;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public final class p extends AbstractC3293z implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f1404a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar) {
        super(2);
        this.f1404a = sVar;
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        G6.l lVar;
        Map map;
        int intValue = ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        G6.e eVar = this.f1404a.f1414a;
        if (eVar == null || (map = eVar.f3119i) == null) {
            lVar = null;
        } else {
            lVar = (G6.l) map.get(String.valueOf(intValue));
        }
        if (lVar != null && s.c(this.f1404a, lVar)) {
            this.f1404a.f1409C.set(intValue);
        }
        return I.f8786a;
    }
}
