package F0;

import B0.a;
import android.os.Bundle;
import c1.InterfaceC2008a;
import c1.InterfaceC2009b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2008a f2093a;

    /* renamed from: b, reason: collision with root package name */
    private volatile H0.a f2094b;

    /* renamed from: c, reason: collision with root package name */
    private volatile I0.b f2095c;

    /* renamed from: d, reason: collision with root package name */
    private final List f2096d;

    public d(InterfaceC2008a interfaceC2008a) {
        this(interfaceC2008a, new I0.c(), new H0.f());
    }

    private void f() {
        this.f2093a.a(new InterfaceC2008a.InterfaceC0369a() { // from class: F0.c
            @Override // c1.InterfaceC2008a.InterfaceC0369a
            public final void a(InterfaceC2009b interfaceC2009b) {
                d.this.i(interfaceC2009b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f2094b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(I0.a aVar) {
        synchronized (this) {
            try {
                if (this.f2095c instanceof I0.c) {
                    this.f2096d.add(aVar);
                }
                this.f2095c.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(InterfaceC2009b interfaceC2009b) {
        G0.g.f().b("AnalyticsConnector now available.");
        B0.a aVar = (B0.a) interfaceC2009b.get();
        H0.e eVar = new H0.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) != null) {
            G0.g.f().b("Registered Firebase Analytics listener.");
            H0.d dVar = new H0.d();
            H0.c cVar = new H0.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                try {
                    Iterator it = this.f2096d.iterator();
                    while (it.hasNext()) {
                        dVar.a((I0.a) it.next());
                    }
                    eVar2.d(dVar);
                    eVar2.e(cVar);
                    this.f2095c = dVar;
                    this.f2094b = cVar;
                } finally {
                }
            }
            return;
        }
        G0.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static a.InterfaceC0007a j(B0.a aVar, e eVar) {
        a.InterfaceC0007a a9 = aVar.a("clx", eVar);
        if (a9 == null) {
            G0.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a9 = aVar.a("crash", eVar);
            if (a9 != null) {
                G0.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a9;
    }

    public H0.a d() {
        return new H0.a() { // from class: F0.b
            @Override // H0.a
            public final void a(String str, Bundle bundle) {
                d.this.g(str, bundle);
            }
        };
    }

    public I0.b e() {
        return new I0.b() { // from class: F0.a
            @Override // I0.b
            public final void a(I0.a aVar) {
                d.this.h(aVar);
            }
        };
    }

    public d(InterfaceC2008a interfaceC2008a, I0.b bVar, H0.a aVar) {
        this.f2093a = interfaceC2008a;
        this.f2095c = bVar;
        this.f2096d = new ArrayList();
        this.f2094b = aVar;
        f();
    }
}
