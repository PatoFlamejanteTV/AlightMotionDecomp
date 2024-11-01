package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class R2 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    int f33360a;

    /* renamed from: b, reason: collision with root package name */
    final int f33361b;

    /* renamed from: c, reason: collision with root package name */
    int f33362c;

    /* renamed from: d, reason: collision with root package name */
    final int f33363d;

    /* renamed from: e, reason: collision with root package name */
    Object[] f33364e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3017a3 f33365f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R2(C3017a3 c3017a3, int i8, int i9, int i10, int i11) {
        this.f33365f = c3017a3;
        this.f33360a = i8;
        this.f33361b = i9;
        this.f33362c = i10;
        this.f33363d = i11;
        Object[][] objArr = c3017a3.f33439f;
        this.f33364e = objArr == null ? c3017a3.f33438e : objArr[i8];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i8 = this.f33360a;
        int i9 = this.f33363d;
        int i10 = this.f33361b;
        if (i8 == i10) {
            return i9 - this.f33362c;
        }
        long[] jArr = this.f33365f.f33461d;
        return ((jArr[i10] + i9) - jArr[i8]) - this.f33362c;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C3017a3 c3017a3;
        Objects.requireNonNull(consumer);
        int i8 = this.f33360a;
        int i9 = this.f33363d;
        int i10 = this.f33361b;
        if (i8 < i10 || (i8 == i10 && this.f33362c < i9)) {
            int i11 = this.f33362c;
            while (true) {
                c3017a3 = this.f33365f;
                if (i8 >= i10) {
                    break;
                }
                Object[] objArr = c3017a3.f33439f[i8];
                while (i11 < objArr.length) {
                    consumer.accept(objArr[i11]);
                    i11++;
                }
                i8++;
                i11 = 0;
            }
            Object[] objArr2 = this.f33360a == i10 ? this.f33364e : c3017a3.f33439f[i10];
            while (i11 < i9) {
                consumer.accept(objArr2[i11]);
                i11++;
            }
            this.f33360a = i10;
            this.f33362c = i9;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2998d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2998d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i8 = this.f33360a;
        int i9 = this.f33361b;
        if (i8 >= i9 && (i8 != i9 || this.f33362c >= this.f33363d)) {
            return false;
        }
        Object[] objArr = this.f33364e;
        int i10 = this.f33362c;
        this.f33362c = i10 + 1;
        consumer.accept(objArr[i10]);
        if (this.f33362c == this.f33364e.length) {
            this.f33362c = 0;
            int i11 = this.f33360a + 1;
            this.f33360a = i11;
            Object[][] objArr2 = this.f33365f.f33439f;
            if (objArr2 != null && i11 <= i9) {
                this.f33364e = objArr2[i11];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f33360a;
        int i9 = this.f33361b;
        if (i8 < i9) {
            int i10 = i9 - 1;
            int i11 = this.f33362c;
            C3017a3 c3017a3 = this.f33365f;
            R2 r22 = new R2(c3017a3, i8, i10, i11, c3017a3.f33439f[i10].length);
            this.f33360a = i9;
            this.f33362c = 0;
            this.f33364e = c3017a3.f33439f[i9];
            return r22;
        }
        if (i8 != i9) {
            return null;
        }
        int i12 = this.f33362c;
        int i13 = (this.f33363d - i12) / 2;
        if (i13 == 0) {
            return null;
        }
        Spliterator m8 = j$.util.u0.m(this.f33364e, i12, i12 + i13);
        this.f33362c += i13;
        return m8;
    }
}
