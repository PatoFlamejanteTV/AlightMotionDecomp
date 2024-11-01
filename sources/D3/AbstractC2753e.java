package d3;

import Q5.p;
import com.stripe.android.model.j;
import d3.InterfaceC2755g;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: d3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2753e {
    public static final InterfaceC2755g a(j jVar) {
        j.d.a.c cVar;
        j.d.c b9;
        j.d.a b10;
        AbstractC3292y.i(jVar, "<this>");
        j.d b11 = jVar.b();
        if (b11 != null && (b9 = b11.b()) != null && (b10 = b9.b()) != null) {
            cVar = b10.a();
        } else {
            cVar = null;
        }
        if (cVar instanceof j.d.a.c.b) {
            j.d.a.c.b bVar = (j.d.a.c.b) cVar;
            if (bVar.f()) {
                return InterfaceC2755g.b.f31332a;
            }
            return new InterfaceC2755g.a(bVar.a());
        }
        if ((cVar instanceof j.d.a.c.C0507a) || cVar == null) {
            return InterfaceC2755g.c.f31333a;
        }
        throw new p();
    }
}
