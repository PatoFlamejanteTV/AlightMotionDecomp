package K6;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
final class w implements e {

    /* renamed from: a, reason: collision with root package name */
    final u f5154a;

    /* renamed from: b, reason: collision with root package name */
    final O6.j f5155b;

    /* renamed from: c, reason: collision with root package name */
    private o f5156c;

    /* renamed from: d, reason: collision with root package name */
    final x f5157d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f5158e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5159f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a extends L6.b {
    }

    private w(u uVar, x xVar, boolean z8) {
        this.f5154a = uVar;
        this.f5157d = xVar;
        this.f5158e = z8;
        this.f5155b = new O6.j(uVar, z8);
    }

    private void a() {
        this.f5155b.h(S6.f.i().m("response.body().close()"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w d(u uVar, x xVar, boolean z8) {
        w wVar = new w(uVar, xVar, z8);
        wVar.f5156c = uVar.k().a(wVar);
        return wVar;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w clone() {
        return d(this.f5154a, this.f5157d, this.f5158e);
    }

    z c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5154a.o());
        arrayList.add(this.f5155b);
        arrayList.add(new O6.a(this.f5154a.h()));
        arrayList.add(new M6.a(this.f5154a.p()));
        arrayList.add(new N6.a(this.f5154a));
        if (!this.f5158e) {
            arrayList.addAll(this.f5154a.q());
        }
        arrayList.add(new O6.b(this.f5158e));
        return new O6.g(arrayList, null, null, null, 0, this.f5157d, this, this.f5156c, this.f5154a.e(), this.f5154a.y(), this.f5154a.F()).a(this.f5157d);
    }

    @Override // K6.e
    public z execute() {
        synchronized (this) {
            if (!this.f5159f) {
                this.f5159f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.f5156c.c(this);
        try {
            try {
                this.f5154a.i().a(this);
                z c8 = c();
                if (c8 != null) {
                    return c8;
                }
                throw new IOException("Canceled");
            } catch (IOException e8) {
                this.f5156c.b(this, e8);
                throw e8;
            }
        } finally {
            this.f5154a.i().c(this);
        }
    }
}
