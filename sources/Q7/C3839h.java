package q7;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: q7.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3839h extends AbstractC3838g {

    /* renamed from: l, reason: collision with root package name */
    private static a f37623l;

    /* renamed from: m, reason: collision with root package name */
    private static a[] f37624m;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f37625b;

    /* renamed from: c, reason: collision with root package name */
    private final C3842k f37626c;

    /* renamed from: d, reason: collision with root package name */
    private final C3836e f37627d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37628e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f37629f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f37630g;

    /* renamed from: h, reason: collision with root package name */
    private final int f37631h;

    /* renamed from: i, reason: collision with root package name */
    private final d7.e f37632i;

    /* renamed from: j, reason: collision with root package name */
    private int f37633j;

    /* renamed from: k, reason: collision with root package name */
    private C3840i f37634k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q7.h$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f37635a;

        a(int i8) {
            this.f37635a = i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || ((a) obj).f37635a != this.f37635a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f37635a;
        }
    }

    static {
        a aVar = new a(1);
        f37623l = aVar;
        a[] aVarArr = new a[TsExtractor.TS_STREAM_TYPE_AC3];
        f37624m = aVarArr;
        aVarArr[1] = aVar;
        int i8 = 2;
        while (true) {
            a[] aVarArr2 = f37624m;
            if (i8 < aVarArr2.length) {
                aVarArr2[i8] = new a(i8);
                i8++;
            } else {
                return;
            }
        }
    }

    public C3839h(C3842k c3842k, C3836e c3836e, int i8, byte[] bArr, int i9, byte[] bArr2) {
        super(true);
        this.f37626c = c3842k;
        this.f37627d = c3836e;
        this.f37633j = i8;
        this.f37625b = J7.a.d(bArr);
        this.f37628e = i9;
        this.f37629f = J7.a.d(bArr2);
        this.f37631h = 1 << (c3842k.c() + 1);
        this.f37630g = new WeakHashMap();
        this.f37632i = AbstractC3833b.a(c3842k.b());
    }

    private byte[] a(int i8) {
        int c8 = 1 << j().c();
        if (i8 >= c8) {
            AbstractC3844m.a(d(), this.f37632i);
            AbstractC3844m.c(i8, this.f37632i);
            AbstractC3844m.b((short) -32126, this.f37632i);
            AbstractC3844m.a(AbstractC3843l.a(h(), d(), i8 - c8, g()), this.f37632i);
            byte[] bArr = new byte[this.f37632i.f()];
            this.f37632i.a(bArr, 0);
            return bArr;
        }
        int i9 = i8 * 2;
        byte[] b9 = b(i9);
        byte[] b10 = b(i9 + 1);
        AbstractC3844m.a(d(), this.f37632i);
        AbstractC3844m.c(i8, this.f37632i);
        AbstractC3844m.b((short) -31869, this.f37632i);
        AbstractC3844m.a(b9, this.f37632i);
        AbstractC3844m.a(b10, this.f37632i);
        byte[] bArr2 = new byte[this.f37632i.f()];
        this.f37632i.a(bArr2, 0);
        return bArr2;
    }

    private byte[] c(a aVar) {
        synchronized (this.f37630g) {
            try {
                byte[] bArr = (byte[]) this.f37630g.get(aVar);
                if (bArr != null) {
                    return bArr;
                }
                byte[] a9 = a(aVar.f37635a);
                this.f37630g.put(aVar, a9);
                return a9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3839h e(Object obj) {
        if (obj instanceof C3839h) {
            return (C3839h) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() == 0) {
                C3842k e8 = C3842k.e(dataInputStream.readInt());
                C3836e e9 = C3836e.e(dataInputStream.readInt());
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                int readInt3 = dataInputStream.readInt();
                if (readInt3 >= 0) {
                    if (readInt3 <= dataInputStream.available()) {
                        byte[] bArr2 = new byte[readInt3];
                        dataInputStream.readFully(bArr2);
                        return new C3839h(e8, e9, readInt, bArr, readInt2, bArr2);
                    }
                    throw new IOException("secret length exceeded " + dataInputStream.available());
                }
                throw new IllegalStateException("secret length less than zero");
            }
            throw new IllegalStateException("expected version 0 lms private key");
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    C3839h e10 = e(dataInputStream3);
                    dataInputStream3.close();
                    return e10;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (obj instanceof InputStream) {
                return e(L7.a.b((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
    }

    public static C3839h f(byte[] bArr, byte[] bArr2) {
        C3839h e8 = e(bArr);
        e8.f37634k = C3840i.a(bArr2);
        return e8;
    }

    byte[] b(int i8) {
        a aVar;
        if (i8 < this.f37631h) {
            a[] aVarArr = f37624m;
            if (i8 < aVarArr.length) {
                aVar = aVarArr[i8];
            } else {
                aVar = new a(i8);
            }
            return c(aVar);
        }
        return a(i8);
    }

    public byte[] d() {
        return J7.a.d(this.f37625b);
    }

    public boolean equals(Object obj) {
        C3840i c3840i;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3839h c3839h = (C3839h) obj;
        if (this.f37633j != c3839h.f37633j || this.f37628e != c3839h.f37628e || !J7.a.a(this.f37625b, c3839h.f37625b)) {
            return false;
        }
        C3842k c3842k = this.f37626c;
        if (c3842k == null ? c3839h.f37626c != null : !c3842k.equals(c3839h.f37626c)) {
            return false;
        }
        C3836e c3836e = this.f37627d;
        if (c3836e == null ? c3839h.f37627d != null : !c3836e.equals(c3839h.f37627d)) {
            return false;
        }
        if (!J7.a.a(this.f37629f, c3839h.f37629f)) {
            return false;
        }
        C3840i c3840i2 = this.f37634k;
        if (c3840i2 == null || (c3840i = c3839h.f37634k) == null) {
            return true;
        }
        return c3840i2.equals(c3840i);
    }

    public byte[] g() {
        return J7.a.d(this.f37629f);
    }

    @Override // q7.AbstractC3838g, J7.c
    public byte[] getEncoded() {
        return C3832a.f().i(0).i(this.f37626c.f()).i(this.f37627d.f()).d(this.f37625b).i(this.f37633j).i(this.f37628e).i(this.f37629f.length).d(this.f37629f).b();
    }

    public C3836e h() {
        return this.f37627d;
    }

    public int hashCode() {
        int i8;
        int i9;
        int k8 = ((this.f37633j * 31) + J7.a.k(this.f37625b)) * 31;
        C3842k c3842k = this.f37626c;
        int i10 = 0;
        if (c3842k != null) {
            i8 = c3842k.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (k8 + i8) * 31;
        C3836e c3836e = this.f37627d;
        if (c3836e != null) {
            i9 = c3836e.hashCode();
        } else {
            i9 = 0;
        }
        int k9 = (((((i11 + i9) * 31) + this.f37628e) * 31) + J7.a.k(this.f37629f)) * 31;
        C3840i c3840i = this.f37634k;
        if (c3840i != null) {
            i10 = c3840i.hashCode();
        }
        return k9 + i10;
    }

    public C3840i i() {
        C3840i c3840i;
        synchronized (this) {
            try {
                if (this.f37634k == null) {
                    this.f37634k = new C3840i(this.f37626c, this.f37627d, c(f37623l), this.f37625b);
                }
                c3840i = this.f37634k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3840i;
    }

    public C3842k j() {
        return this.f37626c;
    }
}
