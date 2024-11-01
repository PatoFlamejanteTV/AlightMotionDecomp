package B0;

import A0.f;
import B0.a;
import Q.AbstractC1396p;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2125e1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import k0.C3223a;

/* loaded from: classes.dex */
public class b implements B0.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile B0.a f368c;

    /* renamed from: a, reason: collision with root package name */
    private final C3223a f369a;

    /* renamed from: b, reason: collision with root package name */
    final Map f370b;

    /* loaded from: classes.dex */
    class a implements a.InterfaceC0007a {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ String f371a;

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ b f372b;

        a(b bVar, String str) {
            this.f371a = str;
            this.f372b = bVar;
        }
    }

    private b(C3223a c3223a) {
        AbstractC1396p.l(c3223a);
        this.f369a = c3223a;
        this.f370b = new ConcurrentHashMap();
    }

    public static B0.a d(f fVar, Context context, Z0.d dVar) {
        AbstractC1396p.l(fVar);
        AbstractC1396p.l(context);
        AbstractC1396p.l(dVar);
        AbstractC1396p.l(context.getApplicationContext());
        if (f368c == null) {
            synchronized (b.class) {
                try {
                    if (f368c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.u()) {
                            dVar.a(A0.b.class, new Executor() { // from class: B0.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new Z0.b() { // from class: B0.d
                                @Override // Z0.b
                                public final void a(Z0.a aVar) {
                                    b.e(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f368c = new b(C2125e1.f(context, null, null, null, bundle).x());
                    }
                } finally {
                }
            }
        }
        return f368c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(Z0.a aVar) {
        throw null;
    }

    private final boolean f(String str) {
        if (!str.isEmpty() && this.f370b.containsKey(str) && this.f370b.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // B0.a
    public a.InterfaceC0007a a(String str, a.b bVar) {
        Object obj;
        AbstractC1396p.l(bVar);
        if (!com.google.firebase.analytics.connector.internal.a.g(str) || f(str)) {
            return null;
        }
        C3223a c3223a = this.f369a;
        if ("fiam".equals(str)) {
            obj = new com.google.firebase.analytics.connector.internal.d(c3223a, bVar);
        } else if ("clx".equals(str)) {
            obj = new com.google.firebase.analytics.connector.internal.f(c3223a, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f370b.put(str, obj);
        return new a(this, str);
    }

    @Override // B0.a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!com.google.firebase.analytics.connector.internal.a.g(str) || !com.google.firebase.analytics.connector.internal.a.c(str2, bundle) || !com.google.firebase.analytics.connector.internal.a.e(str, str2, bundle)) {
            return;
        }
        com.google.firebase.analytics.connector.internal.a.b(str, str2, bundle);
        this.f369a.a(str, str2, bundle);
    }

    @Override // B0.a
    public void c(String str, String str2, Object obj) {
        if (!com.google.firebase.analytics.connector.internal.a.g(str) || !com.google.firebase.analytics.connector.internal.a.d(str, str2)) {
            return;
        }
        this.f369a.c(str, str2, obj);
    }
}
