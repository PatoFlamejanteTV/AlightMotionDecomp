package com.google.firebase.installations;

import D0.x;
import Q.AbstractC1396p;
import android.text.TextUtils;
import c1.InterfaceC2009b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.d;
import e1.AbstractC2786d;
import e1.C2784b;
import e1.C2785c;
import f1.AbstractC2844d;
import f1.AbstractC2846f;
import f1.C2843c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import q0.AbstractC3628n;
import q0.C3626l;

/* loaded from: classes3.dex */
public class c implements d1.e {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f18482m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f18483n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final A0.f f18484a;

    /* renamed from: b, reason: collision with root package name */
    private final C2843c f18485b;

    /* renamed from: c, reason: collision with root package name */
    private final C2785c f18486c;

    /* renamed from: d, reason: collision with root package name */
    private final i f18487d;

    /* renamed from: e, reason: collision with root package name */
    private final x f18488e;

    /* renamed from: f, reason: collision with root package name */
    private final d1.g f18489f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f18490g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f18491h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f18492i;

    /* renamed from: j, reason: collision with root package name */
    private String f18493j;

    /* renamed from: k, reason: collision with root package name */
    private Set f18494k;

    /* renamed from: l, reason: collision with root package name */
    private final List f18495l;

    /* loaded from: classes3.dex */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f18496a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f18496a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18497a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f18498b;

        static {
            int[] iArr = new int[AbstractC2846f.b.values().length];
            f18498b = iArr;
            try {
                iArr[AbstractC2846f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18498b[AbstractC2846f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18498b[AbstractC2846f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC2844d.b.values().length];
            f18497a = iArr2;
            try {
                iArr2[AbstractC2844d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18497a[AbstractC2844d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(final A0.f fVar, InterfaceC2009b interfaceC2009b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new C2843c(fVar.k(), interfaceC2009b), new C2785c(fVar), i.c(), new x(new InterfaceC2009b() { // from class: d1.a
            @Override // c1.InterfaceC2009b
            public final Object get() {
                C2784b y8;
                y8 = com.google.firebase.installations.c.y(A0.f.this);
                return y8;
            }
        }), new d1.g());
    }

    private String A(AbstractC2786d abstractC2786d) {
        if ((!this.f18484a.m().equals("CHIME_ANDROID_SDK") && !this.f18484a.u()) || !abstractC2786d.m()) {
            return this.f18489f.a();
        }
        String f8 = o().f();
        if (TextUtils.isEmpty(f8)) {
            return this.f18489f.a();
        }
        return f8;
    }

    private AbstractC2786d B(AbstractC2786d abstractC2786d) {
        String str;
        if (abstractC2786d.d() != null && abstractC2786d.d().length() == 11) {
            str = o().i();
        } else {
            str = null;
        }
        AbstractC2844d d8 = this.f18485b.d(l(), abstractC2786d.d(), t(), m(), str);
        int i8 = b.f18497a[d8.e().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return abstractC2786d.q("BAD CONFIG");
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        return abstractC2786d.s(d8.c(), d8.d(), this.f18487d.b(), d8.b().c(), d8.b().d());
    }

    private void C(Exception exc) {
        synchronized (this.f18490g) {
            try {
                Iterator it = this.f18495l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void D(AbstractC2786d abstractC2786d) {
        synchronized (this.f18490g) {
            try {
                Iterator it = this.f18495l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(abstractC2786d)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void E(String str) {
        this.f18493j = str;
    }

    private synchronized void F(AbstractC2786d abstractC2786d, AbstractC2786d abstractC2786d2) {
        if (this.f18494k.size() != 0 && !TextUtils.equals(abstractC2786d.d(), abstractC2786d2.d())) {
            Iterator it = this.f18494k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                abstractC2786d2.d();
                throw null;
            }
        }
    }

    private Task f() {
        C3626l c3626l = new C3626l();
        h(new e(this.f18487d, c3626l));
        return c3626l.a();
    }

    private Task g() {
        C3626l c3626l = new C3626l();
        h(new f(c3626l));
        return c3626l.a();
    }

    private void h(h hVar) {
        synchronized (this.f18490g) {
            this.f18495l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(boolean r3) {
        /*
            r2 = this;
            e1.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.d -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.d -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            com.google.firebase.installations.i r3 = r2.f18487d     // Catch: com.google.firebase.installations.d -> L1d
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.d -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            e1.d r3 = r2.k(r0)     // Catch: com.google.firebase.installations.d -> L1d
            goto L28
        L24:
            e1.d r3 = r2.B(r0)     // Catch: com.google.firebase.installations.d -> L1d
        L28:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
            r2.C(r3)
            goto L60
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.C(r3)
            goto L60
        L5d:
            r2.D(r3)
        L60:
            return
        L61:
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void x(final boolean z8) {
        AbstractC2786d s8 = s();
        if (z8) {
            s8 = s8.p();
        }
        D(s8);
        this.f18492i.execute(new Runnable() { // from class: d1.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.v(z8);
            }
        });
    }

    private AbstractC2786d k(AbstractC2786d abstractC2786d) {
        AbstractC2846f e8 = this.f18485b.e(l(), abstractC2786d.d(), t(), abstractC2786d.f());
        int i8 = b.f18498b[e8.b().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    E(null);
                    return abstractC2786d.r();
                }
                throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
            }
            return abstractC2786d.q("BAD CONFIG");
        }
        return abstractC2786d.o(e8.c(), e8.d(), this.f18487d.b());
    }

    private synchronized String n() {
        return this.f18493j;
    }

    private C2784b o() {
        return (C2784b) this.f18488e.get();
    }

    public static c p() {
        return q(A0.f.l());
    }

    public static c q(A0.f fVar) {
        boolean z8;
        if (fVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1396p.b(z8, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.j(d1.e.class);
    }

    /* JADX WARN: Finally extract failed */
    private AbstractC2786d r() {
        AbstractC2786d d8;
        synchronized (f18482m) {
            try {
                com.google.firebase.installations.b a9 = com.google.firebase.installations.b.a(this.f18484a.k(), "generatefid.lock");
                try {
                    d8 = this.f18486c.d();
                    if (a9 != null) {
                        a9.b();
                    }
                } catch (Throwable th) {
                    if (a9 != null) {
                        a9.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d8;
    }

    /* JADX WARN: Finally extract failed */
    private AbstractC2786d s() {
        AbstractC2786d d8;
        synchronized (f18482m) {
            try {
                com.google.firebase.installations.b a9 = com.google.firebase.installations.b.a(this.f18484a.k(), "generatefid.lock");
                try {
                    d8 = this.f18486c.d();
                    if (d8.j()) {
                        d8 = this.f18486c.b(d8.t(A(d8)));
                    }
                    if (a9 != null) {
                        a9.b();
                    }
                } catch (Throwable th) {
                    if (a9 != null) {
                        a9.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d8;
    }

    /* JADX WARN: Finally extract failed */
    private void u(AbstractC2786d abstractC2786d) {
        synchronized (f18482m) {
            try {
                com.google.firebase.installations.b a9 = com.google.firebase.installations.b.a(this.f18484a.k(), "generatefid.lock");
                try {
                    this.f18486c.b(abstractC2786d);
                    if (a9 != null) {
                        a9.b();
                    }
                } catch (Throwable th) {
                    if (a9 != null) {
                        a9.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C2784b y(A0.f fVar) {
        return new C2784b(fVar);
    }

    private void z() {
        AbstractC1396p.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1396p.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1396p.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1396p.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1396p.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // d1.e
    public Task a(final boolean z8) {
        z();
        Task f8 = f();
        this.f18491h.execute(new Runnable() { // from class: d1.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.x(z8);
            }
        });
        return f8;
    }

    @Override // d1.e
    public Task getId() {
        z();
        String n8 = n();
        if (n8 != null) {
            return AbstractC3628n.e(n8);
        }
        Task g8 = g();
        this.f18491h.execute(new Runnable() { // from class: d1.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.w();
            }
        });
        return g8;
    }

    String l() {
        return this.f18484a.n().b();
    }

    String m() {
        return this.f18484a.n().c();
    }

    String t() {
        return this.f18484a.n().e();
    }

    c(ExecutorService executorService, Executor executor, A0.f fVar, C2843c c2843c, C2785c c2785c, i iVar, x xVar, d1.g gVar) {
        this.f18490g = new Object();
        this.f18494k = new HashSet();
        this.f18495l = new ArrayList();
        this.f18484a = fVar;
        this.f18485b = c2843c;
        this.f18486c = c2785c;
        this.f18487d = iVar;
        this.f18488e = xVar;
        this.f18489f = gVar;
        this.f18491h = executorService;
        this.f18492i = executor;
    }
}
