package androidx.room;

import U5.g;
import androidx.annotation.RestrictTo;
import c6.InterfaceC2072n;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3488x0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class TransactionElement implements g.b {
    public static final Key Key = new Key(null);
    private final AtomicInteger referenceCount;
    private final U5.e transactionDispatcher;
    private final InterfaceC3488x0 transactionThreadControlJob;

    /* loaded from: classes3.dex */
    public static final class Key implements g.c {
        private Key() {
        }

        public /* synthetic */ Key(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public TransactionElement(InterfaceC3488x0 transactionThreadControlJob, U5.e transactionDispatcher) {
        AbstractC3292y.i(transactionThreadControlJob, "transactionThreadControlJob");
        AbstractC3292y.i(transactionDispatcher, "transactionDispatcher");
        this.transactionThreadControlJob = transactionThreadControlJob;
        this.transactionDispatcher = transactionDispatcher;
        this.referenceCount = new AtomicInteger(0);
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // U5.g.b, U5.g
    public <R> R fold(R r8, InterfaceC2072n interfaceC2072n) {
        return (R) g.b.a.a(this, r8, interfaceC2072n);
    }

    @Override // U5.g.b, U5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // U5.g.b
    public g.c getKey() {
        return Key;
    }

    public final U5.e getTransactionDispatcher$room_ktx_release() {
        return this.transactionDispatcher;
    }

    @Override // U5.g.b, U5.g
    public U5.g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // U5.g
    public U5.g plus(U5.g gVar) {
        return g.b.a.d(this, gVar);
    }

    public final void release() {
        int decrementAndGet = this.referenceCount.decrementAndGet();
        if (decrementAndGet >= 0) {
            if (decrementAndGet == 0) {
                InterfaceC3488x0.a.a(this.transactionThreadControlJob, null, 1, null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Transaction was never started or was already released.");
    }
}
