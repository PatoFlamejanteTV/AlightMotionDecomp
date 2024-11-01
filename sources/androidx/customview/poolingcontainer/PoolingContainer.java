package androidx.customview.poolingcontainer;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class PoolingContainer {
    private static final int PoolingContainerListenerHolderTag = R.id.pooling_container_listener_holder_tag;
    private static final int IsPoolingContainerTag = R.id.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    public static final void addPoolingContainerListener(View view, PoolingContainerListener listener) {
        AbstractC3292y.i(view, "<this>");
        AbstractC3292y.i(listener, "listener");
        getPoolingContainerListenerHolder(view).addListener(listener);
    }

    public static final void callPoolingContainerOnRelease(View view) {
        AbstractC3292y.i(view, "<this>");
        Iterator it = ViewKt.getAllViews(view).iterator();
        while (it.hasNext()) {
            getPoolingContainerListenerHolder((View) it.next()).onRelease();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(ViewGroup viewGroup) {
        AbstractC3292y.i(viewGroup, "<this>");
        Iterator it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            getPoolingContainerListenerHolder((View) it.next()).onRelease();
        }
    }

    private static final PoolingContainerListenerHolder getPoolingContainerListenerHolder(View view) {
        int i8 = PoolingContainerListenerHolderTag;
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(i8);
        if (poolingContainerListenerHolder == null) {
            PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
            view.setTag(i8, poolingContainerListenerHolder2);
            return poolingContainerListenerHolder2;
        }
        return poolingContainerListenerHolder;
    }

    public static final boolean isPoolingContainer(View view) {
        Boolean bool;
        AbstractC3292y.i(view, "<this>");
        Object tag = view.getTag(IsPoolingContainerTag);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean isWithinPoolingContainer(View view) {
        AbstractC3292y.i(view, "<this>");
        for (Object obj : ViewKt.getAncestors(view)) {
            if ((obj instanceof View) && isPoolingContainer((View) obj)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void removePoolingContainerListener(View view, PoolingContainerListener listener) {
        AbstractC3292y.i(view, "<this>");
        AbstractC3292y.i(listener, "listener");
        getPoolingContainerListenerHolder(view).removeListener(listener);
    }

    public static final void setPoolingContainer(View view, boolean z8) {
        AbstractC3292y.i(view, "<this>");
        view.setTag(IsPoolingContainerTag, Boolean.valueOf(z8));
    }
}
