package d3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: d3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2751c {
    public static final boolean a(InterfaceC2750b interfaceC2750b, C2752d metadata) {
        AbstractC3292y.i(interfaceC2750b, "<this>");
        AbstractC3292y.i(metadata, "metadata");
        if (!metadata.W().e().contains(interfaceC2750b.getType().f25773a)) {
            return false;
        }
        Set a9 = interfaceC2750b.a(metadata.Y());
        if (!(a9 instanceof Collection) || !a9.isEmpty()) {
            Iterator it = a9.iterator();
            while (it.hasNext()) {
                if (!((EnumC2749a) it.next()).b(metadata)) {
                    return false;
                }
            }
        }
        return true;
    }
}
