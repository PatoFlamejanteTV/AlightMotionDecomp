package C6;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1016f0 {
    public static final int a(A6.f fVar, A6.f[] typeParams) {
        int i8;
        AbstractC3292y.i(fVar, "<this>");
        AbstractC3292y.i(typeParams, "typeParams");
        int hashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable a9 = A6.h.a(fVar);
        Iterator it = a9.iterator();
        int i9 = 1;
        int i10 = 1;
        while (true) {
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i12 = i10 * 31;
            String a10 = ((A6.f) it.next()).a();
            if (a10 != null) {
                i11 = a10.hashCode();
            }
            i10 = i12 + i11;
        }
        Iterator it2 = a9.iterator();
        while (it2.hasNext()) {
            int i13 = i9 * 31;
            A6.j kind = ((A6.f) it2.next()).getKind();
            if (kind != null) {
                i8 = kind.hashCode();
            } else {
                i8 = 0;
            }
            i9 = i13 + i8;
        }
        return (((hashCode * 31) + i10) * 31) + i9;
    }
}
