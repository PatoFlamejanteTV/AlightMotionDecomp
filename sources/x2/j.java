package x2;

/* loaded from: classes4.dex */
public final class j extends k {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ j(v2.f r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5, int r6, kotlin.jvm.internal.AbstractC3284p r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            r0 = 0
            if (r7 == 0) goto L6
            r2 = r0
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lb
            r3 = r0
        Lb:
            r7 = r6 & 4
            if (r7 == 0) goto L17
            if (r2 == 0) goto L16
            java.lang.String r4 = r2.i()
            goto L17
        L16:
            r4 = r0
        L17:
            r6 = r6 & 8
            if (r6 == 0) goto L1c
            r5 = r0
        L1c:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.j.<init>(v2.f, java.lang.String, java.lang.String, java.lang.Throwable, int, kotlin.jvm.internal.p):void");
    }

    @Override // x2.k
    public String a() {
        return "rateLimitError";
    }

    public j(v2.f fVar, String str, String str2, Throwable th) {
        super(fVar, str, 429, th, str2);
    }
}
