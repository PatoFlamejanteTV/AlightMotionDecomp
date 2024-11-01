package p1;

import D0.C1038c;
import D0.InterfaceC1040e;
import D0.h;
import D0.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3557b implements j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, C1038c c1038c, InterfaceC1040e interfaceC1040e) {
        try {
            AbstractC3558c.b(str);
            return c1038c.h().a(interfaceC1040e);
        } finally {
            AbstractC3558c.a();
        }
    }

    @Override // D0.j
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C1038c c1038c : componentRegistrar.getComponents()) {
            final String i8 = c1038c.i();
            if (i8 != null) {
                c1038c = c1038c.t(new h() { // from class: p1.a
                    @Override // D0.h
                    public final Object a(InterfaceC1040e interfaceC1040e) {
                        Object c8;
                        c8 = C3557b.c(i8, c1038c, interfaceC1040e);
                        return c8;
                    }
                });
            }
            arrayList.add(c1038c);
        }
        return arrayList;
    }
}
