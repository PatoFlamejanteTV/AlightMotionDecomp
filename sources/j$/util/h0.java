package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class h0 implements Iterator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    boolean f33181a = false;

    /* renamed from: b, reason: collision with root package name */
    Object f33182b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Spliterator f33183c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Spliterator spliterator) {
        this.f33183c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33181a = true;
        this.f33182b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f33181a) {
            this.f33183c.tryAdvance(this);
        }
        return this.f33181a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f33181a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33181a = false;
        return this.f33182b;
    }
}
