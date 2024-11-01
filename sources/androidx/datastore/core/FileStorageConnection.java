package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import w6.AbstractC4160c;
import w6.InterfaceC4158a;

/* loaded from: classes3.dex */
public final class FileStorageConnection<T> implements StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final File file;
    private final Function0 onClose;
    private final Serializer<T> serializer;
    private final InterfaceC4158a transactionMutex;

    public FileStorageConnection(File file, Serializer<T> serializer, InterProcessCoordinator coordinator, Function0 onClose) {
        AbstractC3292y.i(file, "file");
        AbstractC3292y.i(serializer, "serializer");
        AbstractC3292y.i(coordinator, "coordinator");
        AbstractC3292y.i(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = AbstractC4160c.b(false, 1, null);
    }

    private final void checkNotClosed() {
        if (!this.closed.get()) {
        } else {
            throw new IllegalStateException("StorageConnection has already been disposed.".toString());
        }
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
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

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|38|39|(1:41)(1:42))|13|14|15|(2:(1:18)|19)(1:21)))|52|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:            r1 = th;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:21:0x007b, B:31:0x0089, B:28:0x008c, B:27:0x0084), top: B:7:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.FileStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [c6.o] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object readScope(c6.InterfaceC2073o r9, U5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.FileStorageConnection$readScope$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = (androidx.datastore.core.FileStorageConnection$readScope$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = new androidx.datastore.core.FileStorageConnection$readScope$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.Z$0
            java.lang.Object r1 = r0.L$1
            androidx.datastore.core.Closeable r1 = (androidx.datastore.core.Closeable) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.FileStorageConnection r0 = (androidx.datastore.core.FileStorageConnection) r0
            Q5.t.b(r10)     // Catch: java.lang.Throwable -> L34
            goto L6b
        L34:
            r10 = move-exception
            goto L84
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            Q5.t.b(r10)
            r8.checkNotClosed()
            w6.a r10 = r8.transactionMutex
            boolean r10 = w6.InterfaceC4158a.C0922a.b(r10, r4, r3, r4)
            androidx.datastore.core.FileReadScope r2 = new androidx.datastore.core.FileReadScope     // Catch: java.lang.Throwable -> L8d
            java.io.File r5 = r8.file     // Catch: java.lang.Throwable -> L8d
            androidx.datastore.core.Serializer<T> r6 = r8.serializer     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r10)     // Catch: java.lang.Throwable -> L7e
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L7e
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L7e
            r0.Z$0 = r10     // Catch: java.lang.Throwable -> L7e
            r0.label = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r9 = r9.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7e
            if (r9 != r1) goto L66
            return r1
        L66:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L70
            r1 = r4
            goto L71
        L70:
            r1 = move-exception
        L71:
            if (r1 != 0) goto L7b
            if (r9 == 0) goto L7a
            w6.a r9 = r0.transactionMutex
            w6.InterfaceC4158a.C0922a.c(r9, r4, r3, r4)
        L7a:
            return r10
        L7b:
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r10 = move-exception
            goto L92
        L7e:
            r9 = move-exception
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L84:
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r1 = move-exception
            Q5.AbstractC1410e.a(r10, r1)     // Catch: java.lang.Throwable -> L7c
        L8c:
            throw r10     // Catch: java.lang.Throwable -> L7c
        L8d:
            r9 = move-exception
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L92:
            if (r9 == 0) goto L99
            w6.a r9 = r0.transactionMutex
            w6.InterfaceC4158a.C0922a.c(r9, r4, r3, r4)
        L99:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.readScope(c6.o, U5.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fd, B:57:0x010c, B:59:0x0112, B:60:0x0115, B:40:0x0107, B:37:0x010a, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fd, B:57:0x010c, B:59:0x0112, B:60:0x0115, B:40:0x0107, B:37:0x010a, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [w6.a, int] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeScope(c6.InterfaceC2072n r10, U5.d r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.writeScope(c6.n, U5.d):java.lang.Object");
    }
}
