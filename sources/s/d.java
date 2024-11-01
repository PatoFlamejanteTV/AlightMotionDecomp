package S;

import O.a;
import O.e;
import P.i;
import Q.C1399t;
import Q.C1402w;
import Q.InterfaceC1401v;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC2086d;
import com.google.android.gms.tasks.Task;
import d0.AbstractC2737d;
import q0.C3626l;

/* loaded from: classes3.dex */
public final class d extends O.e implements InterfaceC1401v {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f9358k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0132a f9359l;

    /* renamed from: m, reason: collision with root package name */
    private static final O.a f9360m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9361n = 0;

    static {
        a.g gVar = new a.g();
        f9358k = gVar;
        c cVar = new c();
        f9359l = cVar;
        f9360m = new O.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C1402w c1402w) {
        super(context, f9360m, c1402w, e.a.f6918c);
    }

    @Override // Q.InterfaceC1401v
    public final Task a(final C1399t c1399t) {
        AbstractC2086d.a a9 = AbstractC2086d.a();
        a9.d(AbstractC2737d.f31282a);
        a9.c(false);
        a9.b(new i() { // from class: S.b
            @Override // P.i
            public final void a(Object obj, Object obj2) {
                int i8 = d.f9361n;
                ((a) ((e) obj).D()).s0(C1399t.this);
                ((C3626l) obj2).c(null);
            }
        });
        return d(a9.a());
    }
}
