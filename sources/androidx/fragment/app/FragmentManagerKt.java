package androidx.fragment.app;

import androidx.annotation.MainThread;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class FragmentManagerKt {
    public static final void commit(FragmentManager fragmentManager, boolean z8, Function1 body) {
        AbstractC3292y.i(fragmentManager, "<this>");
        AbstractC3292y.i(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z8) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z8, Function1 body, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        AbstractC3292y.i(fragmentManager, "<this>");
        AbstractC3292y.i(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z8) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    @MainThread
    public static final void commitNow(FragmentManager fragmentManager, boolean z8, Function1 body) {
        AbstractC3292y.i(fragmentManager, "<this>");
        AbstractC3292y.i(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z8) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z8, Function1 body, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        AbstractC3292y.i(fragmentManager, "<this>");
        AbstractC3292y.i(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z8) {
            beginTransaction.commitNowAllowingStateLoss();
        } else {
            beginTransaction.commitNow();
        }
    }

    public static final void transaction(FragmentManager fragmentManager, boolean z8, boolean z9, Function1 body) {
        AbstractC3292y.i(fragmentManager, "<this>");
        AbstractC3292y.i(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z8) {
            if (z9) {
                beginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                beginTransaction.commitNow();
                return;
            }
        }
        if (z9) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z8, boolean z9, Function1 body, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = false;
        }
        AbstractC3292y.i(fragmentManager, "<this>");
        AbstractC3292y.i(body, "body");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction()");
        body.invoke(beginTransaction);
        if (z8) {
            if (z9) {
                beginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                beginTransaction.commitNow();
                return;
            }
        }
        if (z9) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }
}
