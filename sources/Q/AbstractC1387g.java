package Q;

import N.C1344g;
import O.a;
import O.f;
import P.InterfaceC1379c;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: Q.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1387g extends AbstractC1383c implements a.f {

    /* renamed from: F, reason: collision with root package name */
    private final C1384d f8256F;

    /* renamed from: G, reason: collision with root package name */
    private final Set f8257G;

    /* renamed from: H, reason: collision with root package name */
    private final Account f8258H;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1387g(Context context, Looper looper, int i8, C1384d c1384d, f.a aVar, f.b bVar) {
        this(context, looper, i8, c1384d, (InterfaceC1379c) aVar, (P.h) bVar);
    }

    private final Set l0(Set set) {
        Set k02 = k0(set);
        Iterator it = k02.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return k02;
    }

    @Override // Q.AbstractC1383c
    protected final Set C() {
        return this.f8257G;
    }

    @Override // O.a.f
    public Set c() {
        if (o()) {
            return this.f8257G;
        }
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C1384d j0() {
        return this.f8256F;
    }

    @Override // Q.AbstractC1383c
    public final Account u() {
        return this.f8258H;
    }

    @Override // Q.AbstractC1383c
    protected Executor w() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1387g(Context context, Looper looper, int i8, C1384d c1384d, InterfaceC1379c interfaceC1379c, P.h hVar) {
        this(context, looper, AbstractC1388h.a(context), C1344g.n(), i8, c1384d, (InterfaceC1379c) AbstractC1396p.l(interfaceC1379c), (P.h) AbstractC1396p.l(hVar));
    }

    protected AbstractC1387g(Context context, Looper looper, AbstractC1388h abstractC1388h, C1344g c1344g, int i8, C1384d c1384d, InterfaceC1379c interfaceC1379c, P.h hVar) {
        super(context, looper, abstractC1388h, c1344g, i8, interfaceC1379c == null ? null : new E(interfaceC1379c), hVar == null ? null : new F(hVar), c1384d.j());
        this.f8256F = c1384d;
        this.f8258H = c1384d.a();
        this.f8257G = l0(c1384d.d());
    }

    protected Set k0(Set set) {
        return set;
    }
}
