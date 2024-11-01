package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3272d extends R5.N {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f34583a;

    /* renamed from: b, reason: collision with root package name */
    private int f34584b;

    public C3272d(int[] array) {
        AbstractC3292y.i(array, "array");
        this.f34583a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f34584b < this.f34583a.length) {
            return true;
        }
        return false;
    }

    @Override // R5.N
    public int nextInt() {
        try {
            int[] iArr = this.f34583a;
            int i8 = this.f34584b;
            this.f34584b = i8 + 1;
            return iArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f34584b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
