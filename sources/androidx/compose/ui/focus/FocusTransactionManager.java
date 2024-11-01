package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusTransactionManager {
    public static final int $stable = 8;
    private boolean ongoingTransaction;
    private final Map<FocusTargetNode, FocusStateImpl> states = new LinkedHashMap();
    private final MutableVector<Function0> cancellationListener = new MutableVector<>(new Function0[16], 0);

    public static final /* synthetic */ void access$beginTransaction(FocusTransactionManager focusTransactionManager) {
        focusTransactionManager.beginTransaction();
    }

    public static final /* synthetic */ void access$commitTransaction(FocusTransactionManager focusTransactionManager) {
        focusTransactionManager.commitTransaction();
    }

    public static final /* synthetic */ MutableVector access$getCancellationListener$p(FocusTransactionManager focusTransactionManager) {
        return focusTransactionManager.cancellationListener;
    }

    public static final /* synthetic */ boolean access$getOngoingTransaction$p(FocusTransactionManager focusTransactionManager) {
        return focusTransactionManager.ongoingTransaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginTransaction() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTransaction() {
        MutableVector<Function0> mutableVector = this.cancellationListener;
        int size = mutableVector.getSize();
        if (size > 0) {
            Function0[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                content[i8].invoke();
                i8++;
            } while (i8 < size);
        }
        this.cancellationListener.clear();
        this.states.clear();
        this.ongoingTransaction = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitTransaction() {
        Iterator<FocusTargetNode> it = this.states.keySet().iterator();
        while (it.hasNext()) {
            it.next().commitFocusState$ui_release();
        }
        this.states.clear();
        this.ongoingTransaction = false;
    }

    public static /* synthetic */ Object withExistingTransaction$default(FocusTransactionManager focusTransactionManager, Function0 function0, Function0 function02, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        if (function0 != null) {
            focusTransactionManager.cancellationListener.add(function0);
        }
        if (!focusTransactionManager.ongoingTransaction) {
            try {
                focusTransactionManager.beginTransaction();
                return function02.invoke();
            } finally {
                AbstractC3290w.b(1);
                focusTransactionManager.commitTransaction();
                AbstractC3290w.a(1);
            }
        }
        return function02.invoke();
    }

    public static /* synthetic */ Object withNewTransaction$default(FocusTransactionManager focusTransactionManager, Function0 function0, Function0 function02, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (function0 != null) {
                focusTransactionManager.cancellationListener.add(function0);
            }
            Object invoke = function02.invoke();
            AbstractC3290w.b(1);
            focusTransactionManager.commitTransaction();
            AbstractC3290w.a(1);
            return invoke;
        } catch (Throwable th) {
            AbstractC3290w.b(1);
            focusTransactionManager.commitTransaction();
            AbstractC3290w.a(1);
            throw th;
        }
    }

    public final FocusStateImpl getUncommittedFocusState(FocusTargetNode focusTargetNode) {
        return this.states.get(focusTargetNode);
    }

    public final void setUncommittedFocusState(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl) {
        Map<FocusTargetNode, FocusStateImpl> map = this.states;
        if (focusStateImpl != null) {
            map.put(focusTargetNode, focusStateImpl);
            return;
        }
        throw new IllegalStateException("requires a non-null focus state".toString());
    }

    public final <T> T withExistingTransaction(Function0 function0, Function0 function02) {
        if (function0 != null) {
            this.cancellationListener.add(function0);
        }
        if (this.ongoingTransaction) {
            return (T) function02.invoke();
        }
        try {
            beginTransaction();
            return (T) function02.invoke();
        } finally {
            AbstractC3290w.b(1);
            commitTransaction();
            AbstractC3290w.a(1);
        }
    }

    public final <T> T withNewTransaction(Function0 function0, Function0 function02) {
        try {
            if (this.ongoingTransaction) {
                cancelTransaction();
            }
            beginTransaction();
            if (function0 != null) {
                this.cancellationListener.add(function0);
            }
            T t8 = (T) function02.invoke();
            AbstractC3290w.b(1);
            commitTransaction();
            AbstractC3290w.a(1);
            return t8;
        } catch (Throwable th) {
            AbstractC3290w.b(1);
            commitTransaction();
            AbstractC3290w.a(1);
            throw th;
        }
    }
}
