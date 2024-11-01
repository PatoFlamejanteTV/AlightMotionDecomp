package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3815N;
import q6.InterfaceC3821f;
import q6.w;

/* loaded from: classes3.dex */
public final class DataStoreInMemoryCache<T> {
    private final w cachedValue;

    public DataStoreInMemoryCache() {
        UnInitialized unInitialized = UnInitialized.INSTANCE;
        AbstractC3292y.g(unInitialized, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = AbstractC3815N.a(unInitialized);
    }

    private static /* synthetic */ void getCachedValue$annotations() {
    }

    public final State<T> getCurrentState() {
        return (State) this.cachedValue.getValue();
    }

    public final InterfaceC3821f getFlow() {
        return this.cachedValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:            if (r6.getVersion() > r2.getVersion()) goto L13;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.datastore.core.State<T> tryUpdate(androidx.datastore.core.State<T> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.AbstractC3292y.i(r6, r0)
            q6.w r0 = r5.cachedValue
        L7:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            androidx.datastore.core.State r2 = (androidx.datastore.core.State) r2
            boolean r3 = r2 instanceof androidx.datastore.core.ReadException
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            androidx.datastore.core.UnInitialized r3 = androidx.datastore.core.UnInitialized.INSTANCE
            boolean r3 = kotlin.jvm.internal.AbstractC3292y.d(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L2b
        L1d:
            boolean r3 = r2 instanceof androidx.datastore.core.Data
            if (r3 == 0) goto L2d
            int r3 = r6.getVersion()
            int r4 = r2.getVersion()
            if (r3 <= r4) goto L31
        L2b:
            r2 = r6
            goto L31
        L2d:
            boolean r3 = r2 instanceof androidx.datastore.core.Final
            if (r3 == 0) goto L38
        L31:
            boolean r1 = r0.a(r1, r2)
            if (r1 == 0) goto L7
            return r2
        L38:
            Q5.p r6 = new Q5.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreInMemoryCache.tryUpdate(androidx.datastore.core.State):androidx.datastore.core.State");
    }
}
