package J0;

import M0.F;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import q0.AbstractC3628n;
import q0.InterfaceC3617c;

/* loaded from: classes3.dex */
public class Z {

    /* renamed from: a, reason: collision with root package name */
    private final C1268z f3878a;

    /* renamed from: b, reason: collision with root package name */
    private final P0.e f3879b;

    /* renamed from: c, reason: collision with root package name */
    private final Q0.b f3880c;

    /* renamed from: d, reason: collision with root package name */
    private final L0.e f3881d;

    /* renamed from: e, reason: collision with root package name */
    private final L0.m f3882e;

    /* renamed from: f, reason: collision with root package name */
    private final I f3883f;

    /* renamed from: g, reason: collision with root package name */
    private final K0.g f3884g;

    Z(C1268z c1268z, P0.e eVar, Q0.b bVar, L0.e eVar2, L0.m mVar, I i8, K0.g gVar) {
        this.f3878a = c1268z;
        this.f3879b = eVar;
        this.f3880c = bVar;
        this.f3881d = eVar2;
        this.f3882e = mVar;
        this.f3883f = i8;
        this.f3884g = gVar;
    }

    private F.e.d d(F.e.d dVar, L0.e eVar, L0.m mVar) {
        F.e.d.b h8 = dVar.h();
        String c8 = eVar.c();
        if (c8 != null) {
            h8.d(F.e.d.AbstractC0106d.a().b(c8).a());
        } else {
            G0.g.f().i("No log data to include with this event.");
        }
        List n8 = n(mVar.e());
        List n9 = n(mVar.f());
        if (!n8.isEmpty() || !n9.isEmpty()) {
            h8.b(dVar.b().i().e(n8).g(n9).a());
        }
        return h8.a();
    }

    private F.e.d e(F.e.d dVar) {
        return f(d(dVar, this.f3881d, this.f3882e), this.f3882e);
    }

    private F.e.d f(F.e.d dVar, L0.m mVar) {
        List g8 = mVar.g();
        if (g8.isEmpty()) {
            return dVar;
        }
        F.e.d.b h8 = dVar.h();
        h8.e(F.e.d.f.a().b(g8).a());
        return h8.a();
    }

    private static F.a g(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = h(traceInputStream);
            }
        } catch (IOException e8) {
            G0.g f8 = G0.g.f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e8);
            f8.k(sb.toString());
        }
        F.a.b a9 = F.a.a();
        importance = applicationExitInfo.getImportance();
        F.a.b c8 = a9.c(importance);
        processName = applicationExitInfo.getProcessName();
        F.a.b e9 = c8.e(processName);
        reason = applicationExitInfo.getReason();
        F.a.b g8 = e9.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        F.a.b i8 = g8.i(timestamp);
        pid = applicationExitInfo.getPid();
        F.a.b d8 = i8.d(pid);
        pss = applicationExitInfo.getPss();
        F.a.b f9 = d8.f(pss);
        rss = applicationExitInfo.getRss();
        return f9.h(rss).j(str).a();
    }

    public static String h(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    public static Z i(Context context, I i8, P0.g gVar, C1245b c1245b, L0.e eVar, L0.m mVar, S0.d dVar, R0.j jVar, N n8, C1257n c1257n, K0.g gVar2) {
        return new Z(new C1268z(context, i8, c1245b, dVar, jVar), new P0.e(gVar, jVar, c1257n), Q0.b.b(context, jVar, n8), eVar, mVar, i8, gVar2);
    }

    private A j(A a9) {
        if (a9.b().h() != null && a9.b().g() != null) {
            return a9;
        }
        H d8 = this.f3883f.d(true);
        return A.a(a9.b().t(d8.b()).s(d8.a()), a9.d(), a9.c());
    }

    private ApplicationExitInfo m(String str, List list) {
        long timestamp;
        int reason;
        long q8 = this.f3879b.q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a9 = androidx.work.impl.utils.b.a(it.next());
            timestamp = a9.getTimestamp();
            if (timestamp >= q8) {
                reason = a9.getReason();
                if (reason == 6) {
                    return a9;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    private static List n(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(F.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: J0.Y
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int p8;
                p8 = Z.p((F.c) obj, (F.c) obj2);
                return p8;
            }
        });
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int p(F.c cVar, F.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(F.e.d dVar, String str, boolean z8) {
        G0.g.f().b("disk worker: log non-fatal event to persistence");
        this.f3879b.y(dVar, str, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(Task task) {
        if (task.n()) {
            A a9 = (A) task.j();
            G0.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + a9.d());
            File c8 = a9.c();
            if (c8.delete()) {
                G0.g.f().b("Deleted report file: " + c8.getPath());
                return true;
            }
            G0.g.f().k("Crashlytics could not delete report file: " + c8.getPath());
            return true;
        }
        G0.g.f().l("Crashlytics report could not be enqueued to DataTransport", task.i());
        return false;
    }

    private void u(Throwable th, Thread thread, final String str, String str2, long j8, boolean z8) {
        final boolean equals = str2.equals("crash");
        final F.e.d e8 = e(this.f3878a.d(th, thread, str2, j8, 4, 8, z8));
        if (!z8) {
            this.f3884g.f4555b.f(new Runnable() { // from class: J0.X
                @Override // java.lang.Runnable
                public final void run() {
                    Z.this.q(e8, str, equals);
                }
            });
        } else {
            this.f3879b.y(e8, str, equals);
        }
    }

    public void k(String str, List list, F.a aVar) {
        G0.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.d.b b9 = ((L) it.next()).b();
            if (b9 != null) {
                arrayList.add(b9);
            }
        }
        this.f3879b.l(str, F.d.a().b(DesugarCollections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void l(long j8, String str) {
        this.f3879b.k(str, j8);
    }

    public boolean o() {
        return this.f3879b.r();
    }

    public SortedSet r() {
        return this.f3879b.p();
    }

    public void s(String str, long j8) {
        this.f3879b.z(this.f3878a.e(str, j8));
    }

    public void v(Throwable th, Thread thread, String str, long j8) {
        G0.g.f().i("Persisting fatal event for session " + str);
        u(th, thread, str, "crash", j8, true);
    }

    public void w(String str, List list, L0.e eVar, L0.m mVar) {
        ApplicationExitInfo m8 = m(str, list);
        if (m8 == null) {
            G0.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        F.e.d c8 = this.f3878a.c(g(m8));
        G0.g.f().b("Persisting anr for session " + str);
        this.f3879b.y(f(d(c8, eVar, mVar), mVar), str, true);
    }

    public void x() {
        this.f3879b.i();
    }

    public Task y(Executor executor) {
        return z(executor, null);
    }

    public Task z(Executor executor, String str) {
        boolean z8;
        List<A> w8 = this.f3879b.w();
        ArrayList arrayList = new ArrayList();
        for (A a9 : w8) {
            if (str == null || str.equals(a9.d())) {
                Q0.b bVar = this.f3880c;
                A j8 = j(a9);
                if (str != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                arrayList.add(bVar.c(j8, z8).g(executor, new InterfaceC3617c() { // from class: J0.W
                    @Override // q0.InterfaceC3617c
                    public final Object a(Task task) {
                        boolean t8;
                        t8 = Z.this.t(task);
                        return Boolean.valueOf(t8);
                    }
                }));
            }
        }
        return AbstractC3628n.f(arrayList);
    }
}
