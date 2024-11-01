package R5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Z extends AbstractC1419c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f9312a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9313b;

    /* renamed from: c, reason: collision with root package name */
    private int f9314c;

    /* renamed from: d, reason: collision with root package name */
    private int f9315d;

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1418b {

        /* renamed from: c, reason: collision with root package name */
        private int f9316c;

        /* renamed from: d, reason: collision with root package name */
        private int f9317d;

        a() {
            this.f9316c = Z.this.size();
            this.f9317d = Z.this.f9314c;
        }

        @Override // R5.AbstractC1418b
        protected void a() {
            if (this.f9316c == 0) {
                b();
                return;
            }
            c(Z.this.f9312a[this.f9317d]);
            this.f9317d = (this.f9317d + 1) % Z.this.f9313b;
            this.f9316c--;
        }
    }

    public Z(Object[] buffer, int i8) {
        AbstractC3292y.i(buffer, "buffer");
        this.f9312a = buffer;
        if (i8 >= 0) {
            if (i8 <= buffer.length) {
                this.f9313b = buffer.length;
                this.f9315d = i8;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i8 + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i8).toString());
    }

    @Override // R5.AbstractC1419c, java.util.List
    public Object get(int i8) {
        AbstractC1419c.Companion.b(i8, size());
        return this.f9312a[(this.f9314c + i8) % this.f9313b];
    }

    @Override // R5.AbstractC1419c, R5.AbstractC1417a
    public int getSize() {
        return this.f9315d;
    }

    @Override // R5.AbstractC1419c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    public final void j(Object obj) {
        if (!m()) {
            this.f9312a[(this.f9314c + size()) % this.f9313b] = obj;
            this.f9315d = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public final Z k(int i8) {
        Object[] array;
        int i9 = this.f9313b;
        int g8 = i6.m.g(i9 + (i9 >> 1) + 1, i8);
        if (this.f9314c == 0) {
            array = Arrays.copyOf(this.f9312a, g8);
            AbstractC3292y.h(array, "copyOf(...)");
        } else {
            array = toArray(new Object[g8]);
        }
        return new Z(array, size());
    }

    public final boolean m() {
        if (size() == this.f9313b) {
            return true;
        }
        return false;
    }

    public final void n(int i8) {
        if (i8 >= 0) {
            if (i8 <= size()) {
                if (i8 > 0) {
                    int i9 = this.f9314c;
                    int i10 = (i9 + i8) % this.f9313b;
                    if (i9 > i10) {
                        AbstractC1428l.t(this.f9312a, null, i9, this.f9313b);
                        AbstractC1428l.t(this.f9312a, null, 0, i10);
                    } else {
                        AbstractC1428l.t(this.f9312a, null, i9, i10);
                    }
                    this.f9314c = i10;
                    this.f9315d = size() - i8;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i8 + ", size = " + size()).toString());
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i8).toString());
    }

    @Override // R5.AbstractC1417a, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC3292y.i(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            AbstractC3292y.h(array, "copyOf(...)");
        }
        int size = size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = this.f9314c; i9 < size && i10 < this.f9313b; i10++) {
            array[i9] = this.f9312a[i10];
            i9++;
        }
        while (i9 < size) {
            array[i9] = this.f9312a[i8];
            i9++;
            i8++;
        }
        return AbstractC1435t.f(size, array);
    }

    public Z(int i8) {
        this(new Object[i8], 0);
    }

    @Override // R5.AbstractC1417a, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
