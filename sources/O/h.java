package O;

import Q.AbstractC1396p;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class h {
    public static g a(j jVar, f fVar) {
        AbstractC1396p.m(jVar, "Result must not be null");
        AbstractC1396p.b(!jVar.getStatus().I(), "Status code must not be SUCCESS");
        m mVar = new m(fVar, jVar);
        mVar.f(jVar);
        return mVar;
    }

    public static g b(Status status, f fVar) {
        AbstractC1396p.m(status, "Result must not be null");
        P.l lVar = new P.l(fVar);
        lVar.f(status);
        return lVar;
    }
}
