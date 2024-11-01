package a2;

import X1.g;
import X1.i;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1663a implements e {
    @Override // a2.e
    public void a(Object obj, Appendable appendable, g gVar) {
        gVar.c(appendable);
        boolean z8 = false;
        for (Object obj2 : (Object[]) obj) {
            if (z8) {
                gVar.m(appendable);
            } else {
                z8 = true;
            }
            i.b(obj2, appendable, gVar);
        }
        gVar.d(appendable);
    }
}
