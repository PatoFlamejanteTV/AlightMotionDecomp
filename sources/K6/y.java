package K6;

import U6.InterfaceC1450f;

/* loaded from: classes5.dex */
public abstract class y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a extends y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f5172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5173c;

        a(t tVar, int i8, byte[] bArr, int i9) {
            this.f5171a = i8;
            this.f5172b = bArr;
            this.f5173c = i9;
        }

        @Override // K6.y
        public long a() {
            return this.f5171a;
        }

        @Override // K6.y
        public t b() {
            return null;
        }

        @Override // K6.y
        public void e(InterfaceC1450f interfaceC1450f) {
            interfaceC1450f.write(this.f5172b, this.f5173c, this.f5171a);
        }
    }

    public static y c(t tVar, byte[] bArr) {
        return d(tVar, bArr, 0, bArr.length);
    }

    public static y d(t tVar, byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            L6.c.c(bArr.length, i8, i9);
            return new a(tVar, i9, bArr, i8);
        }
        throw new NullPointerException("content == null");
    }

    public abstract long a();

    public abstract t b();

    public abstract void e(InterfaceC1450f interfaceC1450f);
}
