package androidx.activity.compose;

/* loaded from: classes.dex */
public final class ActivityComposeUtilsKt {
    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:            r2 = r2;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ <T> T findOwner(android.content.Context r2) {
        /*
        L0:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            r0 = 3
            java.lang.String r1 = "T"
            kotlin.jvm.internal.AbstractC3292y.n(r0, r1)
            boolean r0 = r2 instanceof java.lang.Object
            if (r0 == 0) goto Lf
            return r2
        Lf:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L0
        L16:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.compose.ActivityComposeUtilsKt.findOwner(android.content.Context):java.lang.Object");
    }
}
