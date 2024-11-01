package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3270b extends R5.E {

    /* renamed from: a, reason: collision with root package name */
    private final double[] f34579a;

    /* renamed from: b, reason: collision with root package name */
    private int f34580b;

    public C3270b(double[] array) {
        AbstractC3292y.i(array, "array");
        this.f34579a = array;
    }

    @Override // R5.E
    public double a() {
        try {
            double[] dArr = this.f34579a;
            int i8 = this.f34580b;
            this.f34580b = i8 + 1;
            return dArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f34580b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f34580b < this.f34579a.length) {
            return true;
        }
        return false;
    }
}
