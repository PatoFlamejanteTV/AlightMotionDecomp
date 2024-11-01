package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3271c extends R5.J {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f34581a;

    /* renamed from: b, reason: collision with root package name */
    private int f34582b;

    public C3271c(float[] array) {
        AbstractC3292y.i(array, "array");
        this.f34581a = array;
    }

    @Override // R5.J
    public float a() {
        try {
            float[] fArr = this.f34581a;
            int i8 = this.f34582b;
            this.f34582b = i8 + 1;
            return fArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f34582b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f34582b < this.f34581a.length) {
            return true;
        }
        return false;
    }
}
