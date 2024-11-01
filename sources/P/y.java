package P;

import N.C1339b;
import O.a;
import O.f;
import Q.AbstractC1396p;
import Q.C1384d;
import Q.O;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Set;
import n0.AbstractC3385d;
import n0.InterfaceC3386e;

/* loaded from: classes3.dex */
public final class y extends o0.d implements f.a, f.b {

    /* renamed from: p, reason: collision with root package name */
    private static final a.AbstractC0132a f7971p = AbstractC3385d.f35065c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f7972a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f7973b;

    /* renamed from: k, reason: collision with root package name */
    private final a.AbstractC0132a f7974k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f7975l;

    /* renamed from: m, reason: collision with root package name */
    private final C1384d f7976m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC3386e f7977n;

    /* renamed from: o, reason: collision with root package name */
    private x f7978o;

    public y(Context context, Handler handler, C1384d c1384d) {
        a.AbstractC0132a abstractC0132a = f7971p;
        this.f7972a = context;
        this.f7973b = handler;
        this.f7976m = (C1384d) AbstractC1396p.m(c1384d, "ClientSettings must not be null");
        this.f7975l = c1384d.g();
        this.f7974k = abstractC0132a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void u0(y yVar, o0.l lVar) {
        C1339b s8 = lVar.s();
        if (s8.z()) {
            O o8 = (O) AbstractC1396p.l(lVar.u());
            C1339b s9 = o8.s();
            if (!s9.z()) {
                String valueOf = String.valueOf(s9);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                yVar.f7978o.c(s9);
                yVar.f7977n.b();
                return;
            }
            yVar.f7978o.a(o8.u(), yVar.f7975l);
        } else {
            yVar.f7978o.c(s8);
        }
        yVar.f7977n.b();
    }

    @Override // o0.f
    public final void g0(o0.l lVar) {
        this.f7973b.post(new w(this, lVar));
    }

    @Override // P.InterfaceC1379c
    public final void h(int i8) {
        this.f7978o.d(i8);
    }

    @Override // P.h
    public final void i(C1339b c1339b) {
        this.f7978o.c(c1339b);
    }

    @Override // P.InterfaceC1379c
    public final void k(Bundle bundle) {
        this.f7977n.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [O.a$f, n0.e] */
    public final void v0(x xVar) {
        InterfaceC3386e interfaceC3386e = this.f7977n;
        if (interfaceC3386e != null) {
            interfaceC3386e.b();
        }
        this.f7976m.k(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0132a abstractC0132a = this.f7974k;
        Context context = this.f7972a;
        Handler handler = this.f7973b;
        C1384d c1384d = this.f7976m;
        this.f7977n = abstractC0132a.a(context, handler.getLooper(), c1384d, c1384d.h(), this, this);
        this.f7978o = xVar;
        Set set = this.f7975l;
        if (set != null && !set.isEmpty()) {
            this.f7977n.p();
        } else {
            this.f7973b.post(new v(this));
        }
    }

    public final void w0() {
        InterfaceC3386e interfaceC3386e = this.f7977n;
        if (interfaceC3386e != null) {
            interfaceC3386e.b();
        }
    }
}
