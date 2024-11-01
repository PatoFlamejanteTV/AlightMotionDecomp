package J0;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
class B implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f3830a;

    /* renamed from: b, reason: collision with root package name */
    private final R0.j f3831b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f3832c;

    /* renamed from: d, reason: collision with root package name */
    private final G0.a f3833d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f3834e = new AtomicBoolean(false);

    /* loaded from: classes3.dex */
    interface a {
        void a(R0.j jVar, Thread thread, Throwable th);
    }

    public B(a aVar, R0.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, G0.a aVar2) {
        this.f3830a = aVar;
        this.f3831b = jVar;
        this.f3832c = uncaughtExceptionHandler;
        this.f3833d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            G0.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            G0.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (this.f3833d.c()) {
            G0.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f3834e.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:            r7.f3834e.set(false);     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:            G0.g.f().b("Completed exception processing, but no default exception handler.");        java.lang.System.exit(1);     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:            if (r7.f3832c == null) goto L14;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:            if (r7.f3832c != null) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:            G0.g.f().b("Completed exception processing. Invoking default exception handler.");        r7.f3832c.uncaughtException(r8, r9);     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Completed exception processing, but no default exception handler."
            java.lang.String r1 = "Completed exception processing. Invoking default exception handler."
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f3834e
            r3 = 1
            r2.set(r3)
            r2 = 0
            boolean r4 = r7.b(r8, r9)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r4 == 0) goto L1d
            J0.B$a r4 = r7.f3830a     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            R0.j r5 = r7.f3831b     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r4.a(r5, r8, r9)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            goto L26
        L19:
            r4 = move-exception
            goto L56
        L1b:
            r4 = move-exception
            goto L47
        L1d:
            G0.g r4 = G0.g.f()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            java.lang.String r5 = "Uncaught exception will not be recorded by Crashlytics."
            r4.b(r5)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
        L26:
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f3832c
            if (r4 == 0) goto L37
        L2a:
            G0.g r0 = G0.g.f()
            r0.b(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f3832c
            r0.uncaughtException(r8, r9)
            goto L41
        L37:
            G0.g r8 = G0.g.f()
            r8.b(r0)
            java.lang.System.exit(r3)
        L41:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f3834e
            r8.set(r2)
            goto L55
        L47:
            G0.g r5 = G0.g.f()     // Catch: java.lang.Throwable -> L19
            java.lang.String r6 = "An error occurred in the uncaught exception handler"
            r5.e(r6, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.Thread$UncaughtExceptionHandler r4 = r7.f3832c
            if (r4 == 0) goto L37
            goto L2a
        L55:
            return
        L56:
            java.lang.Thread$UncaughtExceptionHandler r5 = r7.f3832c
            if (r5 == 0) goto L67
            G0.g r0 = G0.g.f()
            r0.b(r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.f3832c
            r0.uncaughtException(r8, r9)
            goto L71
        L67:
            G0.g r8 = G0.g.f()
            r8.b(r0)
            java.lang.System.exit(r3)
        L71:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f3834e
            r8.set(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.B.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
