package p2;

import R5.AbstractC1435t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class m implements InterfaceC3563e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f36171a = new LinkedHashMap();

    @Override // p2.InterfaceC3563e
    public Object a(C3559a c3559a, U5.d dVar) {
        Object obj = this.f36171a.get(c3559a);
        if (obj == null) {
            return AbstractC1435t.m();
        }
        return obj;
    }

    @Override // p2.InterfaceC3563e
    public void b(C3559a bin, List accountRanges) {
        AbstractC3292y.i(bin, "bin");
        AbstractC3292y.i(accountRanges, "accountRanges");
        this.f36171a.put(bin, accountRanges);
    }

    @Override // p2.InterfaceC3563e
    public Object c(C3559a c3559a, U5.d dVar) {
        return kotlin.coroutines.jvm.internal.b.a(this.f36171a.containsKey(c3559a));
    }
}
