package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class FragmentTransactionKt {
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, @IdRes int i8, String str, Bundle bundle) {
        AbstractC3292y.i(fragmentTransaction, "<this>");
        AbstractC3292y.n(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i8, Fragment.class, bundle, str);
        AbstractC3292y.h(add, "add(containerViewId, F::class.java, args, tag)");
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, int i8, String str, Bundle bundle, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str = null;
        }
        if ((i9 & 4) != 0) {
            bundle = null;
        }
        AbstractC3292y.i(fragmentTransaction, "<this>");
        AbstractC3292y.n(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i8, Fragment.class, bundle, str);
        AbstractC3292y.h(add, "add(containerViewId, F::class.java, args, tag)");
        return add;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, @IdRes int i8, String str, Bundle bundle) {
        AbstractC3292y.i(fragmentTransaction, "<this>");
        AbstractC3292y.n(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i8, Fragment.class, bundle, str);
        AbstractC3292y.h(replace, "replace(containerViewId, F::class.java, args, tag)");
        return replace;
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i8, String str, Bundle bundle, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str = null;
        }
        if ((i9 & 4) != 0) {
            bundle = null;
        }
        AbstractC3292y.i(fragmentTransaction, "<this>");
        AbstractC3292y.n(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i8, Fragment.class, bundle, str);
        AbstractC3292y.h(replace, "replace(containerViewId, F::class.java, args, tag)");
        return replace;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, String tag, Bundle bundle) {
        AbstractC3292y.i(fragmentTransaction, "<this>");
        AbstractC3292y.i(tag, "tag");
        AbstractC3292y.n(4, "F");
        FragmentTransaction add = fragmentTransaction.add(Fragment.class, bundle, tag);
        AbstractC3292y.h(add, "add(F::class.java, args, tag)");
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, String tag, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bundle = null;
        }
        AbstractC3292y.i(fragmentTransaction, "<this>");
        AbstractC3292y.i(tag, "tag");
        AbstractC3292y.n(4, "F");
        FragmentTransaction add = fragmentTransaction.add(Fragment.class, bundle, tag);
        AbstractC3292y.h(add, "add(F::class.java, args, tag)");
        return add;
    }
}
