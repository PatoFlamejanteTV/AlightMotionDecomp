package x2;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4208b extends k {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4208b(v2.f r5, java.lang.String r6, int r7, java.lang.String r8, java.lang.Throwable r9, int r10, kotlin.jvm.internal.AbstractC3284p r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L7
            r11 = r0
            goto L8
        L7:
            r11 = r5
        L8:
            r5 = r10 & 2
            if (r5 == 0) goto Le
            r1 = r0
            goto Lf
        Le:
            r1 = r6
        Lf:
            r5 = r10 & 4
            if (r5 == 0) goto L16
            r7 = 0
            r2 = 0
            goto L17
        L16:
            r2 = r7
        L17:
            r5 = r10 & 8
            if (r5 == 0) goto L24
            if (r11 == 0) goto L23
            java.lang.String r5 = r11.i()
            r8 = r5
            goto L24
        L23:
            r8 = r0
        L24:
            r3 = r8
            r5 = r10 & 16
            if (r5 == 0) goto L2b
            r10 = r0
            goto L2c
        L2b:
            r10 = r9
        L2c:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C4208b.<init>(v2.f, java.lang.String, int, java.lang.String, java.lang.Throwable, int, kotlin.jvm.internal.p):void");
    }

    @Override // x2.k
    public String a() {
        return "apiError";
    }

    public C4208b(v2.f fVar, String str, int i8, String str2, Throwable th) {
        super(fVar, str, i8, th, str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4208b(Throwable throwable) {
        this(null, null, 0, throwable.getMessage(), throwable, 7, null);
        AbstractC3292y.i(throwable, "throwable");
    }
}
