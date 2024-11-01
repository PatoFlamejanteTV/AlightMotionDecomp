package U6;

import R5.AbstractC1428l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: h, reason: collision with root package name */
    public static final a f10167h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10168a;

    /* renamed from: b, reason: collision with root package name */
    public int f10169b;

    /* renamed from: c, reason: collision with root package name */
    public int f10170c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10171d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10172e;

    /* renamed from: f, reason: collision with root package name */
    public U f10173f;

    /* renamed from: g, reason: collision with root package name */
    public U f10174g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public U() {
        this.f10168a = new byte[8192];
        this.f10172e = true;
        this.f10171d = false;
    }

    public final void a() {
        int i8;
        U u8 = this.f10174g;
        if (u8 != this) {
            AbstractC3292y.f(u8);
            if (!u8.f10172e) {
                return;
            }
            int i9 = this.f10170c - this.f10169b;
            U u9 = this.f10174g;
            AbstractC3292y.f(u9);
            int i10 = 8192 - u9.f10170c;
            U u10 = this.f10174g;
            AbstractC3292y.f(u10);
            if (u10.f10171d) {
                i8 = 0;
            } else {
                U u11 = this.f10174g;
                AbstractC3292y.f(u11);
                i8 = u11.f10169b;
            }
            if (i9 > i10 + i8) {
                return;
            }
            U u12 = this.f10174g;
            AbstractC3292y.f(u12);
            f(u12, i9);
            b();
            V.b(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final U b() {
        U u8 = this.f10173f;
        if (u8 == this) {
            u8 = null;
        }
        U u9 = this.f10174g;
        AbstractC3292y.f(u9);
        u9.f10173f = this.f10173f;
        U u10 = this.f10173f;
        AbstractC3292y.f(u10);
        u10.f10174g = this.f10174g;
        this.f10173f = null;
        this.f10174g = null;
        return u8;
    }

    public final U c(U segment) {
        AbstractC3292y.i(segment, "segment");
        segment.f10174g = this;
        segment.f10173f = this.f10173f;
        U u8 = this.f10173f;
        AbstractC3292y.f(u8);
        u8.f10174g = segment;
        this.f10173f = segment;
        return segment;
    }

    public final U d() {
        this.f10171d = true;
        return new U(this.f10168a, this.f10169b, this.f10170c, true, false);
    }

    public final U e(int i8) {
        U c8;
        if (i8 > 0 && i8 <= this.f10170c - this.f10169b) {
            if (i8 >= 1024) {
                c8 = d();
            } else {
                c8 = V.c();
                byte[] bArr = this.f10168a;
                byte[] bArr2 = c8.f10168a;
                int i9 = this.f10169b;
                AbstractC1428l.j(bArr, bArr2, 0, i9, i9 + i8, 2, null);
            }
            c8.f10170c = c8.f10169b + i8;
            this.f10169b += i8;
            U u8 = this.f10174g;
            AbstractC3292y.f(u8);
            u8.c(c8);
            return c8;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final void f(U sink, int i8) {
        AbstractC3292y.i(sink, "sink");
        if (sink.f10172e) {
            int i9 = sink.f10170c;
            if (i9 + i8 > 8192) {
                if (!sink.f10171d) {
                    int i10 = sink.f10169b;
                    if ((i9 + i8) - i10 <= 8192) {
                        byte[] bArr = sink.f10168a;
                        AbstractC1428l.j(bArr, bArr, 0, i10, i9, 2, null);
                        sink.f10170c -= sink.f10169b;
                        sink.f10169b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f10168a;
            byte[] bArr3 = sink.f10168a;
            int i11 = sink.f10170c;
            int i12 = this.f10169b;
            AbstractC1428l.d(bArr2, bArr3, i11, i12, i12 + i8);
            sink.f10170c += i8;
            this.f10169b += i8;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public U(byte[] data, int i8, int i9, boolean z8, boolean z9) {
        AbstractC3292y.i(data, "data");
        this.f10168a = data;
        this.f10169b = i8;
        this.f10170c = i9;
        this.f10171d = z8;
        this.f10172e = z9;
    }
}
