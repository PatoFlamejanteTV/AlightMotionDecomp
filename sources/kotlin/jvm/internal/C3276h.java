package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3276h extends R5.O {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f34587a;

    /* renamed from: b, reason: collision with root package name */
    private int f34588b;

    public C3276h(long[] array) {
        AbstractC3292y.i(array, "array");
        this.f34587a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f34588b < this.f34587a.length) {
            return true;
        }
        return false;
    }

    @Override // R5.O
    public long nextLong() {
        try {
            long[] jArr = this.f34587a;
            int i8 = this.f34588b;
            this.f34588b = i8 + 1;
            return jArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f34588b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
