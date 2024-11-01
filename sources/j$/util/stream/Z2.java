package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class Z2 extends AbstractC3028d implements Iterable {

    /* renamed from: e, reason: collision with root package name */
    Object f33431e;

    /* renamed from: f, reason: collision with root package name */
    Object[] f33432f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z2() {
        this.f33431e = c(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z2(int i8) {
        super(i8);
        this.f33431e = c(1 << this.f33458a);
    }

    public abstract Object c(int i8);

    @Override // j$.util.stream.AbstractC3028d
    public final void clear() {
        Object[] objArr = this.f33432f;
        if (objArr != null) {
            this.f33431e = objArr[0];
            this.f33432f = null;
            this.f33461d = null;
        }
        this.f33459b = 0;
        this.f33460c = 0;
    }

    public Object d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c8 = c((int) count);
        q(0, c8);
        return c8;
    }

    public void e(Object obj) {
        for (int i8 = 0; i8 < this.f33460c; i8++) {
            Object obj2 = this.f33432f[i8];
            r(obj2, 0, s(obj2), obj);
        }
        r(this.f33431e, 0, this.f33459b, obj);
    }

    public void q(int i8, Object obj) {
        long j8 = i8;
        long count = count() + j8;
        if (count > s(obj) || count < j8) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f33460c == 0) {
            System.arraycopy(this.f33431e, 0, obj, i8, this.f33459b);
            return;
        }
        for (int i9 = 0; i9 < this.f33460c; i9++) {
            Object obj2 = this.f33432f[i9];
            System.arraycopy(obj2, 0, obj, i8, s(obj2));
            i8 += s(this.f33432f[i9]);
        }
        int i10 = this.f33459b;
        if (i10 > 0) {
            System.arraycopy(this.f33431e, 0, obj, i8, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void r(Object obj, int i8, int i9, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int s(Object obj);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int t(long j8) {
        if (this.f33460c == 0) {
            if (j8 < this.f33459b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j8));
        }
        if (j8 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j8));
        }
        for (int i8 = 0; i8 <= this.f33460c; i8++) {
            if (j8 < this.f33461d[i8] + s(this.f33432f[i8])) {
                return i8;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(long j8) {
        long s8;
        int i8 = this.f33460c;
        if (i8 == 0) {
            s8 = s(this.f33431e);
        } else {
            s8 = s(this.f33432f[i8]) + this.f33461d[i8];
        }
        if (j8 > s8) {
            if (this.f33432f == null) {
                Object[] v8 = v();
                this.f33432f = v8;
                this.f33461d = new long[8];
                v8[0] = this.f33431e;
            }
            int i9 = this.f33460c + 1;
            while (j8 > s8) {
                Object[] objArr = this.f33432f;
                if (i9 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f33432f = Arrays.copyOf(objArr, length);
                    this.f33461d = Arrays.copyOf(this.f33461d, length);
                }
                int i10 = this.f33458a;
                if (i9 != 0 && i9 != 1) {
                    i10 = Math.min((i10 + i9) - 1, 30);
                }
                int i11 = 1 << i10;
                this.f33432f[i9] = c(i11);
                long[] jArr = this.f33461d;
                jArr[i9] = jArr[i9 - 1] + s(this.f33432f[r6]);
                s8 += i11;
                i9++;
            }
        }
    }

    protected abstract Object[] v();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w() {
        long s8;
        if (this.f33459b == s(this.f33431e)) {
            if (this.f33432f == null) {
                Object[] v8 = v();
                this.f33432f = v8;
                this.f33461d = new long[8];
                v8[0] = this.f33431e;
            }
            int i8 = this.f33460c;
            int i9 = i8 + 1;
            Object[] objArr = this.f33432f;
            if (i9 >= objArr.length || objArr[i9] == null) {
                if (i8 == 0) {
                    s8 = s(this.f33431e);
                } else {
                    s8 = s(objArr[i8]) + this.f33461d[i8];
                }
                u(s8 + 1);
            }
            this.f33459b = 0;
            int i10 = this.f33460c + 1;
            this.f33460c = i10;
            this.f33431e = this.f33432f[i10];
        }
    }
}
