package j$.time.format;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private j$.time.temporal.o f32929a;

    /* renamed from: b, reason: collision with root package name */
    private DateTimeFormatter f32930b;

    /* renamed from: c, reason: collision with root package name */
    private int f32931c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(j$.time.temporal.o r10, j$.time.format.DateTimeFormatter r11) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.p.<init>(j$.time.temporal.o, j$.time.format.DateTimeFormatter):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f32931c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s b() {
        return this.f32930b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale c() {
        return this.f32930b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.temporal.o d() {
        return this.f32929a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long e(j$.time.temporal.r rVar) {
        int i8 = this.f32931c;
        j$.time.temporal.o oVar = this.f32929a;
        if (i8 <= 0 || oVar.f(rVar)) {
            return Long.valueOf(oVar.r(rVar));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object f(a aVar) {
        j$.time.temporal.o oVar = this.f32929a;
        Object u8 = oVar.u(aVar);
        if (u8 != null || this.f32931c != 0) {
            return u8;
        }
        throw new RuntimeException("Unable to extract " + aVar + " from temporal " + oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.f32931c++;
    }

    public final String toString() {
        return this.f32929a.toString();
    }
}
