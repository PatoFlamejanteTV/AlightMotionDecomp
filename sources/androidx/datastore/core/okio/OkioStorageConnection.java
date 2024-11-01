package androidx.datastore.core.okio;

import U6.AbstractC1455k;
import U6.Q;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import w6.AbstractC4160c;
import w6.InterfaceC4158a;

/* loaded from: classes3.dex */
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    private final AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final AbstractC1455k fileSystem;
    private final Function0 onClose;
    private final Q path;
    private final OkioSerializer<T> serializer;
    private final InterfaceC4158a transactionMutex;

    public OkioStorageConnection(AbstractC1455k fileSystem, Q path, OkioSerializer<T> serializer, InterProcessCoordinator coordinator, Function0 onClose) {
        AbstractC3292y.i(fileSystem, "fileSystem");
        AbstractC3292y.i(path, "path");
        AbstractC3292y.i(serializer, "serializer");
        AbstractC3292y.i(coordinator, "coordinator");
        AbstractC3292y.i(onClose, "onClose");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = AbstractC4160c.b(false, 1, null);
    }

    private final void checkNotClosed() {
        if (!this.closed.get()) {
        } else {
            throw new IllegalStateException("StorageConnection has already been disposed.".toString());
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|37|38|(1:40)(1:41))|13|14|15|(2:(1:18)|19)(1:21)))|52|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:            r1 = th;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:21:0x007d, B:31:0x008b, B:28:0x008e, B:27:0x0086), top: B:7:0x0022, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v0, types: [c6.o] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object readScope(c6.InterfaceC2073o r10, U5.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = (androidx.datastore.core.okio.OkioStorageConnection$readScope$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = new androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r10 = r0.Z$0
            java.lang.Object r1 = r0.L$1
            androidx.datastore.core.Closeable r1 = (androidx.datastore.core.Closeable) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.okio.OkioStorageConnection r0 = (androidx.datastore.core.okio.OkioStorageConnection) r0
            Q5.t.b(r11)     // Catch: java.lang.Throwable -> L34
            goto L6d
        L34:
            r11 = move-exception
            goto L86
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            Q5.t.b(r11)
            r9.checkNotClosed()
            w6.a r11 = r9.transactionMutex
            boolean r11 = w6.InterfaceC4158a.C0922a.b(r11, r4, r3, r4)
            androidx.datastore.core.okio.OkioReadScope r2 = new androidx.datastore.core.okio.OkioReadScope     // Catch: java.lang.Throwable -> L8f
            U6.k r5 = r9.fileSystem     // Catch: java.lang.Throwable -> L8f
            U6.Q r6 = r9.path     // Catch: java.lang.Throwable -> L8f
            androidx.datastore.core.okio.OkioSerializer<T> r7 = r9.serializer     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r11)     // Catch: java.lang.Throwable -> L80
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L80
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L80
            r0.Z$0 = r11     // Catch: java.lang.Throwable -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r10 = r10.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r10 != r1) goto L68
            return r1
        L68:
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L6d:
            r1.close()     // Catch: java.lang.Throwable -> L72
            r1 = r4
            goto L73
        L72:
            r1 = move-exception
        L73:
            if (r1 != 0) goto L7d
            if (r10 == 0) goto L7c
            w6.a r10 = r0.transactionMutex
            w6.InterfaceC4158a.C0922a.c(r10, r4, r3, r4)
        L7c:
            return r11
        L7d:
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r11 = move-exception
            goto L94
        L80:
            r10 = move-exception
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L86:
            r1.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r1 = move-exception
            Q5.AbstractC1410e.a(r11, r1)     // Catch: java.lang.Throwable -> L7e
        L8e:
            throw r11     // Catch: java.lang.Throwable -> L7e
        L8f:
            r10 = move-exception
            r0 = r9
            r8 = r11
            r11 = r10
            r10 = r8
        L94:
            if (r10 == 0) goto L9b
            w6.a r10 = r0.transactionMutex
            w6.InterfaceC4158a.C0922a.c(r10, r4, r3, r4)
        L9b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.readScope(c6.o, U5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(3:(3:(4:(2:3|(11:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(1:21)|22|23|24)(1:26))(2:37|38))(1:39))(2:65|(2:67|(1:69)(1:70))(2:71|72))|40|41|42|43|44|45|(1:47)(6:48|14|15|16|17|(0)(0))))|44|45|(0)(0))|42|43)|40|41)|77|6|7|(0)(0)|(2:(0)|(1:57))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(3:(4:(2:3|(11:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(1:21)|22|23|24)(1:26))(2:37|38))(1:39))(2:65|(2:67|(1:69)(1:70))(2:71|72))|40|41|42|43|44|45|(1:47)(6:48|14|15|16|17|(0)(0))))|44|45|(0)(0))|42|43)|77|6|7|(0)(0)|40|41|(2:(0)|(1:57))) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e2, code lost:            r10 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e3, code lost:            r7 = r0;        r11 = r2;        r2 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00df, code lost:            r10 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e0, code lost:            r11 = r2;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TryCatch #2 {IOException -> 0x00e2, blocks: (B:19:0x00cf, B:21:0x00d7, B:26:0x00ef, B:36:0x00fb, B:33:0x00fe), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00e2, blocks: (B:19:0x00cf, B:21:0x00d7, B:26:0x00ef, B:36:0x00fb, B:33:0x00fe), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeScope(c6.InterfaceC2072n r10, U5.d r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.writeScope(c6.n, U5.d):java.lang.Object");
    }
}
