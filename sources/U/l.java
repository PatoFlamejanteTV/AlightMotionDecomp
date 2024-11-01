package u;

import y.AbstractC4233a;

/* loaded from: classes3.dex */
public abstract class l {
    public static void a(s.i iVar, s.f fVar) {
        if (iVar instanceof s) {
            u.c().e().u(((s) iVar).d().f(fVar), 1);
        } else {
            AbstractC4233a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", iVar);
        }
    }
}
