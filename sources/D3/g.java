package D3;

import D3.f;
import Q5.p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class g {
    public static final boolean a(f fVar) {
        AbstractC3292y.i(fVar, "<this>");
        if (fVar instanceof f.c) {
            return false;
        }
        if (!(fVar instanceof f.d) && !(fVar instanceof f.e.c)) {
            if (fVar instanceof f.e) {
                return false;
            }
            if (fVar instanceof f.C0023f) {
                if (((f.C0023f) fVar).p() != f.C0023f.b.f1304c) {
                    return false;
                }
            } else {
                if (fVar instanceof f.b) {
                    return false;
                }
                throw new p();
            }
        }
        return true;
    }

    public static final boolean b(f fVar) {
        AbstractC3292y.i(fVar, "<this>");
        return fVar instanceof f.C0023f;
    }
}
