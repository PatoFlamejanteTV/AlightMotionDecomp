package k1;

import D0.C1038c;
import D0.InterfaceC1040e;
import D0.r;
import android.content.Context;

/* loaded from: classes4.dex */
public abstract class h {

    /* loaded from: classes4.dex */
    public interface a {
        String a(Object obj);
    }

    public static C1038c b(String str, String str2) {
        return C1038c.l(AbstractC3229f.a(str, str2), AbstractC3229f.class);
    }

    public static C1038c c(final String str, final a aVar) {
        return C1038c.m(AbstractC3229f.class).b(r.l(Context.class)).f(new D0.h() { // from class: k1.g
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                AbstractC3229f d8;
                d8 = h.d(str, aVar, interfaceC1040e);
                return d8;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC3229f d(String str, a aVar, InterfaceC1040e interfaceC1040e) {
        return AbstractC3229f.a(str, aVar.a((Context) interfaceC1040e.a(Context.class)));
    }
}
