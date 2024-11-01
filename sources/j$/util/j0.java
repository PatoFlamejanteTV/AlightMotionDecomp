package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class j0 implements Q, LongConsumer, InterfaceC3143z {

    /* renamed from: a, reason: collision with root package name */
    boolean f33193a = false;

    /* renamed from: b, reason: collision with root package name */
    long f33194b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c0 f33195c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(c0 c0Var) {
        this.f33195c = c0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f33193a = true;
        this.f33194b = j8;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.Q, java.util.Iterator, j$.util.InterfaceC3143z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (x0.f33660a) {
            x0.a(j0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new N(consumer));
    }

    @Override // j$.util.S
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f33193a) {
            this.f33195c.tryAdvance((LongConsumer) this);
        }
        return this.f33193a;
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (!x0.f33660a) {
            return Long.valueOf(nextLong());
        }
        x0.a(j0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.Q
    public final long nextLong() {
        if (!this.f33193a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33193a = false;
        return this.f33194b;
    }
}
