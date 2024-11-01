package q7;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: q7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3834c extends AbstractC3838g {

    /* renamed from: b, reason: collision with root package name */
    private final int f37599b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37600c;

    /* renamed from: d, reason: collision with root package name */
    private List f37601d;

    /* renamed from: e, reason: collision with root package name */
    private List f37602e;

    /* renamed from: f, reason: collision with root package name */
    private final long f37603f;

    /* renamed from: g, reason: collision with root package name */
    private long f37604g;

    /* renamed from: h, reason: collision with root package name */
    private C3835d f37605h;

    private C3834c(int i8, List list, List list2, long j8, long j9, boolean z8) {
        super(true);
        this.f37604g = 0L;
        this.f37599b = i8;
        this.f37601d = DesugarCollections.unmodifiableList(list);
        this.f37602e = DesugarCollections.unmodifiableList(list2);
        this.f37604g = j8;
        this.f37603f = j9;
        this.f37600c = z8;
    }

    public static C3834c a(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3834c) {
            return (C3834c) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() == 0) {
                int readInt = dataInputStream2.readInt();
                long readLong = dataInputStream2.readLong();
                long readLong2 = dataInputStream2.readLong();
                boolean readBoolean = dataInputStream2.readBoolean();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < readInt; i8++) {
                    arrayList.add(C3839h.e(obj));
                }
                for (int i9 = 0; i9 < readInt - 1; i9++) {
                    arrayList2.add(C3841j.a(obj));
                }
                return new C3834c(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
            }
            throw new IllegalStateException("unknown version for hss private key");
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C3834c a9 = a(dataInputStream);
                dataInputStream.close();
                return a9;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream3 = dataInputStream;
                if (dataInputStream3 != null) {
                    dataInputStream3.close();
                }
                throw th;
            }
        }
        if (obj instanceof InputStream) {
            return a(L7.a.b((InputStream) obj));
        }
        throw new IllegalArgumentException("cannot parse " + obj);
    }

    public static C3834c b(byte[] bArr, byte[] bArr2) {
        C3834c a9 = a(bArr);
        a9.f37605h = C3835d.a(bArr2);
        return a9;
    }

    private static C3834c f(C3834c c3834c) {
        try {
            return a(c3834c.getEncoded());
        } catch (Exception e8) {
            throw new RuntimeException(e8.getMessage(), e8);
        }
    }

    public int c() {
        return this.f37599b;
    }

    protected Object clone() {
        return f(this);
    }

    public synchronized C3835d d() {
        return new C3835d(this.f37599b, e().i());
    }

    C3839h e() {
        return (C3839h) this.f37601d.get(0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3834c c3834c = (C3834c) obj;
        if (this.f37599b != c3834c.f37599b || this.f37600c != c3834c.f37600c || this.f37603f != c3834c.f37603f || this.f37604g != c3834c.f37604g || !this.f37601d.equals(c3834c.f37601d)) {
            return false;
        }
        return this.f37602e.equals(c3834c.f37602e);
    }

    @Override // q7.AbstractC3838g, J7.c
    public synchronized byte[] getEncoded() {
        C3832a a9;
        try {
            a9 = C3832a.f().i(0).i(this.f37599b).j(this.f37604g).j(this.f37603f).a(this.f37600c);
            Iterator it = this.f37601d.iterator();
            while (it.hasNext()) {
                a9.c((C3839h) it.next());
            }
            Iterator it2 = this.f37602e.iterator();
            while (it2.hasNext()) {
                a9.c((C3841j) it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return a9.b();
    }

    public int hashCode() {
        int hashCode = ((((((this.f37599b * 31) + (this.f37600c ? 1 : 0)) * 31) + this.f37601d.hashCode()) * 31) + this.f37602e.hashCode()) * 31;
        long j8 = this.f37603f;
        int i8 = (hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f37604g;
        return i8 + ((int) (j9 ^ (j9 >>> 32)));
    }
}
