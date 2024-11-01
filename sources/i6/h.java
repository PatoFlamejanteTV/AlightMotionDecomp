package i6;

import R5.N;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class h extends N {

    /* renamed from: a, reason: collision with root package name */
    private final int f32773a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32774b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32775c;

    /* renamed from: d, reason: collision with root package name */
    private int f32776d;

    public h(int i8, int i9, int i10) {
        this.f32773a = i10;
        this.f32774b = i9;
        boolean z8 = false;
        if (i10 <= 0 ? i8 >= i9 : i8 <= i9) {
            z8 = true;
        }
        this.f32775c = z8;
        this.f32776d = z8 ? i8 : i9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f32775c;
    }

    @Override // R5.N
    public int nextInt() {
        int i8 = this.f32776d;
        if (i8 == this.f32774b) {
            if (this.f32775c) {
                this.f32775c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f32776d = this.f32773a + i8;
        }
        return i8;
    }
}
