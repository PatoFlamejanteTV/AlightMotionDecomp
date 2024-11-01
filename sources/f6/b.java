package F6;

import R5.AbstractC1435t;
import j6.InterfaceC3214c;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import y6.InterfaceC4248a;
import y6.i;

/* loaded from: classes5.dex */
public abstract class b {
    private b() {
    }

    public static /* synthetic */ y6.b c(b bVar, InterfaceC3214c interfaceC3214c, List list, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                list = AbstractC1435t.m();
            }
            return bVar.b(interfaceC3214c, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    public abstract void a(d dVar);

    public abstract y6.b b(InterfaceC3214c interfaceC3214c, List list);

    public abstract InterfaceC4248a d(InterfaceC3214c interfaceC3214c, String str);

    public abstract i e(InterfaceC3214c interfaceC3214c, Object obj);

    public /* synthetic */ b(AbstractC3284p abstractC3284p) {
        this();
    }
}
