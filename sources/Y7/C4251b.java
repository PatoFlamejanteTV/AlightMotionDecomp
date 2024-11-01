package y7;

import W6.C1488n;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import y7.j;

/* renamed from: y7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4251b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Map f41194a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    private transient long f41195b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4251b(long j8) {
        this.f41195b = j8;
    }

    C4250a a(int i8) {
        return (C4250a) this.f41194a.get(J7.d.a(i8));
    }

    public long b() {
        return this.f41195b;
    }

    void c(int i8, C4250a c4250a) {
        this.f41194a.put(J7.d.a(i8), c4250a);
    }

    C4250a d(int i8, byte[] bArr, byte[] bArr2, j jVar) {
        return (C4250a) this.f41194a.put(J7.d.a(i8), ((C4250a) this.f41194a.get(J7.d.a(i8))).d(bArr, bArr2, jVar));
    }

    void e(r rVar, long j8, byte[] bArr, byte[] bArr2) {
        x h8 = rVar.h();
        int b9 = h8.b();
        long j9 = AbstractC4249A.j(j8, b9);
        int i8 = AbstractC4249A.i(j8, b9);
        j jVar = (j) ((j.b) new j.b().h(j9)).p(i8).l();
        int i9 = (1 << b9) - 1;
        if (i8 < i9) {
            if (a(0) == null || i8 == 0) {
                c(0, new C4250a(h8, bArr, bArr2, jVar));
            }
            d(0, bArr, bArr2, jVar);
        }
        for (int i10 = 1; i10 < rVar.b(); i10++) {
            int i11 = AbstractC4249A.i(j9, b9);
            j9 = AbstractC4249A.j(j9, b9);
            j jVar2 = (j) ((j.b) ((j.b) new j.b().g(i10)).h(j9)).p(i11).l();
            if (this.f41194a.get(Integer.valueOf(i10)) == null || AbstractC4249A.n(j8, b9, i10)) {
                this.f41194a.put(Integer.valueOf(i10), new C4250a(h8, bArr, bArr2, jVar2));
            }
            if (i11 < i9 && AbstractC4249A.m(j8, b9, i10)) {
                d(i10, bArr, bArr2, jVar2);
            }
        }
    }

    public C4251b f(C1488n c1488n) {
        C4251b c4251b = new C4251b(this.f41195b);
        for (Integer num : this.f41194a.keySet()) {
            c4251b.f41194a.put(num, ((C4250a) this.f41194a.get(num)).h(c1488n));
        }
        return c4251b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4251b(C4251b c4251b, long j8) {
        for (Integer num : c4251b.f41194a.keySet()) {
            this.f41194a.put(num, new C4250a((C4250a) c4251b.f41194a.get(num)));
        }
        this.f41195b = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4251b(r rVar, long j8, byte[] bArr, byte[] bArr2) {
        this.f41195b = (1 << rVar.a()) - 1;
        for (long j9 = 0; j9 < j8; j9++) {
            e(rVar, j9, bArr, bArr2);
        }
    }
}
