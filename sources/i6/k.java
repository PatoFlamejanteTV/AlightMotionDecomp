package i6;

import R5.O;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class k extends O {

    /* renamed from: a, reason: collision with root package name */
    private final long f32783a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32784b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32785c;

    /* renamed from: d, reason: collision with root package name */
    private long f32786d;

    public k(long j8, long j9, long j10) {
        this.f32783a = j10;
        this.f32784b = j9;
        boolean z8 = false;
        if (j10 <= 0 ? j8 >= j9 : j8 <= j9) {
            z8 = true;
        }
        this.f32785c = z8;
        this.f32786d = z8 ? j8 : j9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f32785c;
    }

    @Override // R5.O
    public long nextLong() {
        long j8 = this.f32786d;
        if (j8 == this.f32784b) {
            if (this.f32785c) {
                this.f32785c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f32786d = this.f32783a + j8;
        }
        return j8;
    }
}
