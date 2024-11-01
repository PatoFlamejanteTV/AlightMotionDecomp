package W3;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class b extends RuntimeException {
    public /* synthetic */ b(String str, Throwable th, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String message, Throwable th) {
        super(message, th);
        AbstractC3292y.i(message, "message");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(java.lang.Throwable r2) {
        /*
            r1 = this;
            java.lang.String r0 = "t"
            kotlin.jvm.internal.AbstractC3292y.i(r2, r0)
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
        Ld:
            java.lang.Throwable r2 = r2.getCause()
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.b.<init>(java.lang.Throwable):void");
    }
}
