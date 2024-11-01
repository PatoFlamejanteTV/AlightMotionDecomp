package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3472p;
import n6.C3475q0;
import n6.InterfaceC3488x0;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class CoroutinesRoom {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final <R> InterfaceC3821f createFlow(RoomDatabase db, boolean z8, String[] tableNames, Callable<R> callable) {
            AbstractC3292y.i(db, "db");
            AbstractC3292y.i(tableNames, "tableNames");
            AbstractC3292y.i(callable, "callable");
            return AbstractC3823h.z(new CoroutinesRoom$Companion$createFlow$1(z8, db, tableNames, callable, null));
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z8, Callable<R> callable, U5.d dVar) {
            U5.e transactionDispatcher;
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z8 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return AbstractC3458i.g(transactionDispatcher, new CoroutinesRoom$Companion$execute$2(callable, null), dVar);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z8, CancellationSignal cancellationSignal, Callable<R> callable, U5.d dVar) {
            U5.e transactionDispatcher;
            InterfaceC3488x0 d8;
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z8 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            U5.e eVar = transactionDispatcher;
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            d8 = AbstractC3462k.d(C3475q0.f35747a, eVar, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, c3472p, null), 2, null);
            c3472p.f(new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, d8));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y8;
        }
    }

    private CoroutinesRoom() {
    }

    public static final <R> InterfaceC3821f createFlow(RoomDatabase roomDatabase, boolean z8, String[] strArr, Callable<R> callable) {
        return Companion.createFlow(roomDatabase, z8, strArr, callable);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z8, CancellationSignal cancellationSignal, Callable<R> callable, U5.d dVar) {
        return Companion.execute(roomDatabase, z8, cancellationSignal, callable, dVar);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z8, Callable<R> callable, U5.d dVar) {
        return Companion.execute(roomDatabase, z8, callable, dVar);
    }
}
