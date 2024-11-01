package j4;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class X extends r4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final r4.G f34062b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34063c;

    /* renamed from: d, reason: collision with root package name */
    private final r4.w0 f34064d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f34065e;

    /* renamed from: f, reason: collision with root package name */
    private final C2.c f34066f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ X(r4.G r7, java.lang.String r8, r4.w0 r9, int r10, kotlin.jvm.internal.AbstractC3284p r11) {
        /*
            r6 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            r4.G$b r7 = r4.G.Companion
            r4.G r7 = r7.n()
        La:
            r11 = r10 & 2
            if (r11 == 0) goto L10
            java.lang.String r8 = ""
        L10:
            r10 = r10 & 4
            if (r10 == 0) goto L26
            r4.s0 r9 = new r4.s0
            r4.A r1 = new r4.A
            r10 = 0
            r11 = 0
            r0 = 1
            r1.<init>(r10, r0, r11)
            r4 = 2
            r5 = 0
            r2 = 0
            r0 = r9
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L26:
            r6.<init>(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.X.<init>(r4.G, java.lang.String, r4.w0, int, kotlin.jvm.internal.p):void");
    }

    @Override // r4.o0, r4.k0
    public r4.G a() {
        return this.f34062b;
    }

    @Override // r4.k0
    public C2.c b() {
        return this.f34066f;
    }

    @Override // r4.k0
    public boolean c() {
        return this.f34065e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x8 = (X) obj;
        if (AbstractC3292y.d(this.f34062b, x8.f34062b) && AbstractC3292y.d(this.f34063c, x8.f34063c) && AbstractC3292y.d(this.f34064d, x8.f34064d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f34062b.hashCode() * 31;
        String str = this.f34063c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.f34064d.hashCode();
    }

    @Override // r4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public r4.w0 i() {
        return this.f34064d;
    }

    public String toString() {
        return "EmailElement(identifier=" + this.f34062b + ", initialValue=" + this.f34063c + ", controller=" + this.f34064d + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(r4.G identifier, String str, r4.w0 controller) {
        super(identifier);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(controller, "controller");
        this.f34062b = identifier;
        this.f34063c = str;
        this.f34064d = controller;
        this.f34065e = true;
    }
}
