package G3;

import G3.f;
import Q5.p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class g {
    public static final f a(f fVar, C2.c cVar) {
        AbstractC3292y.i(fVar, "<this>");
        if (!(fVar instanceof f.a)) {
            if (fVar instanceof f.b) {
                return f.b.l((f.b) fVar, null, null, null, null, null, cVar, 31, null);
            }
            if (fVar instanceof f.d) {
                return f.d.l((f.d) fVar, null, null, null, null, null, cVar, 31, null);
            }
            if (fVar instanceof f.e) {
                return f.e.l((f.e) fVar, null, null, null, null, cVar, 15, null);
            }
            throw new p();
        }
        return fVar;
    }
}
