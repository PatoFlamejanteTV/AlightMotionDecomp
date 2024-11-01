package k1;

import D0.C1038c;
import D0.InterfaceC1040e;
import D0.r;
import java.util.Iterator;
import java.util.Set;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3226c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f34373a;

    /* renamed from: b, reason: collision with root package name */
    private final C3227d f34374b;

    C3226c(Set set, C3227d c3227d) {
        this.f34373a = e(set);
        this.f34374b = c3227d;
    }

    public static C1038c c() {
        return C1038c.e(i.class).b(r.o(AbstractC3229f.class)).f(new D0.h() { // from class: k1.b
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                i d8;
                d8 = C3226c.d(interfaceC1040e);
                return d8;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(InterfaceC1040e interfaceC1040e) {
        return new C3226c(interfaceC1040e.e(AbstractC3229f.class), C3227d.a());
    }

    private static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC3229f abstractC3229f = (AbstractC3229f) it.next();
            sb.append(abstractC3229f.b());
            sb.append('/');
            sb.append(abstractC3229f.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // k1.i
    public String a() {
        if (this.f34374b.b().isEmpty()) {
            return this.f34373a;
        }
        return this.f34373a + ' ' + e(this.f34374b.b());
    }
}
