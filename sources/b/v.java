package B;

import C.InterfaceC0960d;
import D.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f360a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0960d f361b;

    /* renamed from: c, reason: collision with root package name */
    private final x f362c;

    /* renamed from: d, reason: collision with root package name */
    private final D.b f363d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor, InterfaceC0960d interfaceC0960d, x xVar, D.b bVar) {
        this.f360a = executor;
        this.f361b = interfaceC0960d;
        this.f362c = xVar;
        this.f363d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator it = this.f361b.o().iterator();
        while (it.hasNext()) {
            this.f362c.b((u.p) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f363d.g(new b.a() { // from class: B.u
            @Override // D.b.a
            public final Object execute() {
                Object d8;
                d8 = v.this.d();
                return d8;
            }
        });
    }

    public void c() {
        this.f360a.execute(new Runnable() { // from class: B.t
            @Override // java.lang.Runnable
            public final void run() {
                v.this.e();
            }
        });
    }
}
