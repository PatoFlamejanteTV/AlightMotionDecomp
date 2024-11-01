package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.AbstractC3473p0;
import n6.InterfaceC3488x0;
import n6.N;

/* loaded from: classes3.dex */
public final class FoldingFeatureObserver {
    private final Executor executor;
    private InterfaceC3488x0 job;
    private OnFoldingFeatureChangeListener onFoldingFeatureChangeListener;
    private final WindowInfoTracker windowInfoTracker;

    /* loaded from: classes3.dex */
    public interface OnFoldingFeatureChangeListener {
        void onFoldingFeatureChange(FoldingFeature foldingFeature);
    }

    public FoldingFeatureObserver(WindowInfoTracker windowInfoTracker, Executor executor) {
        AbstractC3292y.i(windowInfoTracker, "windowInfoTracker");
        AbstractC3292y.i(executor, "executor");
        this.windowInfoTracker = windowInfoTracker;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FoldingFeature getFoldingFeature(WindowLayoutInfo windowLayoutInfo) {
        Object obj;
        Iterator<T> it = windowLayoutInfo.getDisplayFeatures().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((DisplayFeature) obj) instanceof FoldingFeature) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (!(obj instanceof FoldingFeature)) {
            return null;
        }
        return (FoldingFeature) obj;
    }

    public final void registerLayoutStateChangeCallback(Activity activity) {
        InterfaceC3488x0 d8;
        AbstractC3292y.i(activity, "activity");
        InterfaceC3488x0 interfaceC3488x0 = this.job;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        d8 = AbstractC3462k.d(N.a(AbstractC3473p0.a(this.executor)), null, null, new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this, activity, null), 3, null);
        this.job = d8;
    }

    public final void setOnFoldingFeatureChangeListener(OnFoldingFeatureChangeListener onFoldingFeatureChangeListener) {
        AbstractC3292y.i(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.onFoldingFeatureChangeListener = onFoldingFeatureChangeListener;
    }

    public final void unregisterLayoutStateChangeCallback() {
        InterfaceC3488x0 interfaceC3488x0 = this.job;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
    }
}
