package androidx.compose.material;

import U5.d;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import c6.InterfaceC2072n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3488x0;
import n6.N;
import w6.AbstractC4160c;
import w6.InterfaceC4158a;

@Stable
/* loaded from: classes.dex */
public final class InternalMutatorMutex {
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final InterfaceC4158a mutex = AbstractC4160c.b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Mutator {
        private final InterfaceC3488x0 job;
        private final MutatePriority priority;

        public Mutator(MutatePriority priority, InterfaceC3488x0 job) {
            AbstractC3292y.i(priority, "priority");
            AbstractC3292y.i(job, "job");
            this.priority = priority;
            this.job = job;
        }

        public final boolean canInterrupt(Mutator other) {
            AbstractC3292y.i(other, "other");
            if (this.priority.compareTo(other.priority) >= 0) {
                return true;
            }
            return false;
        }

        public final void cancel() {
            InterfaceC3488x0.a.a(this.job, null, 1, null);
        }

        public final InterfaceC3488x0 getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object mutate$default(InternalMutatorMutex internalMutatorMutex, MutatePriority mutatePriority, Function1 function1, d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutate(mutatePriority, function1, dVar);
    }

    public static /* synthetic */ Object mutateWith$default(InternalMutatorMutex internalMutatorMutex, Object obj, MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, d dVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutateWith(obj, mutatePriority, interfaceC2072n, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!androidx.compose.animation.core.d.a(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, Function1 function1, d dVar) {
        return N.e(new InternalMutatorMutex$mutate$2(mutatePriority, this, function1, null), dVar);
    }

    public final <T, R> Object mutateWith(T t8, MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, d dVar) {
        return N.e(new InternalMutatorMutex$mutateWith$2(mutatePriority, this, interfaceC2072n, t8, null), dVar);
    }

    public final boolean tryMutate(Function0 block) {
        AbstractC3292y.i(block, "block");
        boolean b9 = InterfaceC4158a.C0922a.b(this.mutex, null, 1, null);
        if (b9) {
            try {
                block.invoke();
            } finally {
                InterfaceC4158a.C0922a.c(this.mutex, null, 1, null);
            }
        }
        return b9;
    }
}
