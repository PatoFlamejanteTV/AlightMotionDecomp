package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2394m2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f17938a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17939b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f17940c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Object f17941d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Object f17942e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2401n2 f17943f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2394m2(C2401n2 c2401n2, int i8, String str, Object obj, Object obj2, Object obj3) {
        this.f17938a = i8;
        this.f17939b = str;
        this.f17940c = obj;
        this.f17941d = obj2;
        this.f17942e = obj3;
        this.f17943f = c2401n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c8;
        long j8;
        char c9;
        long j9;
        C2484z2 F8 = this.f17943f.f18099a.F();
        if (F8.p()) {
            c8 = this.f17943f.f17960c;
            if (c8 == 0) {
                if (this.f17943f.b().Y()) {
                    this.f17943f.f17960c = 'C';
                } else {
                    this.f17943f.f17960c = 'c';
                }
            }
            j8 = this.f17943f.f17961d;
            if (j8 < 0) {
                this.f17943f.f17961d = 106000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f17938a);
            c9 = this.f17943f.f17960c;
            j9 = this.f17943f.f17961d;
            String str = "2" + charAt + c9 + j9 + ":" + C2401n2.u(true, this.f17939b, this.f17940c, this.f17941d, this.f17942e);
            if (str.length() > 1024) {
                str = this.f17939b.substring(0, 1024);
            }
            D2 d22 = F8.f18147f;
            if (d22 != null) {
                d22.b(str, 1L);
                return;
            }
            return;
        }
        this.f17943f.v(6, "Persisted config not initialized. Not logging error/warn");
    }
}
