package androidx.window.layout;

import Q5.I;
import R5.AbstractC1435t;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.layout.SidecarWindowBackend;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SidecarWindowBackend implements WindowBackend {
    public static final boolean DEBUG = false;
    private static final String TAG = "WindowServer";
    private static volatile SidecarWindowBackend globalInstance;

    @GuardedBy("globalLock")
    @VisibleForTesting
    private ExtensionInterfaceCompat windowExtension;
    private final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final SidecarWindowBackend getInstance(Context context) {
            AbstractC3292y.i(context, "context");
            if (SidecarWindowBackend.globalInstance == null) {
                ReentrantLock reentrantLock = SidecarWindowBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (SidecarWindowBackend.globalInstance == null) {
                        SidecarWindowBackend.globalInstance = new SidecarWindowBackend(SidecarWindowBackend.Companion.initAndVerifyExtension(context));
                    }
                    I i8 = I.f8786a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            SidecarWindowBackend sidecarWindowBackend = SidecarWindowBackend.globalInstance;
            AbstractC3292y.f(sidecarWindowBackend);
            return sidecarWindowBackend;
        }

        public final ExtensionInterfaceCompat initAndVerifyExtension(Context context) {
            AbstractC3292y.i(context, "context");
            try {
                if (!isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (!sidecarCompat.validateExtensionInterface()) {
                    return null;
                }
                return sidecarCompat;
            } catch (Throwable unused) {
                return null;
            }
        }

        @VisibleForTesting
        public final boolean isSidecarVersionSupported(Version version) {
            if (version == null || version.compareTo(Version.Companion.getVERSION_0_1()) < 0) {
                return false;
            }
            return true;
        }

        @VisibleForTesting
        public final void resetInstance() {
            SidecarWindowBackend.globalInstance = null;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @VisibleForTesting
    /* loaded from: classes3.dex */
    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        final /* synthetic */ SidecarWindowBackend this$0;

        public ExtensionListenerImpl(SidecarWindowBackend this$0) {
            AbstractC3292y.i(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo newLayout) {
            AbstractC3292y.i(activity, "activity");
            AbstractC3292y.i(newLayout, "newLayout");
            Iterator<WindowLayoutChangeCallbackWrapper> it = this.this$0.getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper next = it.next();
                if (AbstractC3292y.d(next.getActivity(), activity)) {
                    next.accept(newLayout);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class WindowLayoutChangeCallbackWrapper {
        private final Activity activity;
        private final Consumer<WindowLayoutInfo> callback;
        private final Executor executor;
        private WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(Activity activity, Executor executor, Consumer<WindowLayoutInfo> callback) {
            AbstractC3292y.i(activity, "activity");
            AbstractC3292y.i(executor, "executor");
            AbstractC3292y.i(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: accept$lambda-0, reason: not valid java name */
        public static final void m5456accept$lambda0(WindowLayoutChangeCallbackWrapper this$0, WindowLayoutInfo newLayoutInfo) {
            AbstractC3292y.i(this$0, "this$0");
            AbstractC3292y.i(newLayoutInfo, "$newLayoutInfo");
            this$0.callback.accept(newLayoutInfo);
        }

        public final void accept(final WindowLayoutInfo newLayoutInfo) {
            AbstractC3292y.i(newLayoutInfo, "newLayoutInfo");
            this.lastInfo = newLayoutInfo;
            this.executor.execute(new Runnable() { // from class: androidx.window.layout.i
                @Override // java.lang.Runnable
                public final void run() {
                    SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m5456accept$lambda0(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.this, newLayoutInfo);
                }
            });
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final Consumer<WindowLayoutInfo> getCallback() {
            return this.callback;
        }

        public final WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }
    }

    @VisibleForTesting
    public SidecarWindowBackend(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        ExtensionInterfaceCompat extensionInterfaceCompat2 = this.windowExtension;
        if (extensionInterfaceCompat2 != null) {
            extensionInterfaceCompat2.setExtensionCallback(new ExtensionListenerImpl(this));
        }
    }

    @GuardedBy("sLock")
    private final void callbackRemovedForActivity(Activity activity) {
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (AbstractC3292y.d(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                    return;
                }
            }
        }
        ExtensionInterfaceCompat extensionInterfaceCompat = this.windowExtension;
        if (extensionInterfaceCompat != null) {
            extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }

    private final boolean isActivityRegistered(Activity activity) {
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC3292y.d(((WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(Activity activity, Executor executor, Consumer<WindowLayoutInfo> callback) {
        WindowLayoutInfo windowLayoutInfo;
        Object obj;
        AbstractC3292y.i(activity, "activity");
        AbstractC3292y.i(executor, "executor");
        AbstractC3292y.i(callback, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            ExtensionInterfaceCompat windowExtension = getWindowExtension();
            if (windowExtension == null) {
                callback.accept(new WindowLayoutInfo(AbstractC1435t.m()));
                return;
            }
            boolean isActivityRegistered = isActivityRegistered(activity);
            WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, executor, callback);
            getWindowLayoutChangeCallbacks().add(windowLayoutChangeCallbackWrapper);
            if (!isActivityRegistered) {
                windowExtension.onWindowLayoutChangeListenerAdded(activity);
            } else {
                Iterator<T> it = getWindowLayoutChangeCallbacks().iterator();
                while (true) {
                    windowLayoutInfo = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(activity, ((WindowLayoutChangeCallbackWrapper) obj).getActivity())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) obj;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    windowLayoutInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (windowLayoutInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
                }
            }
            I i8 = I.f8786a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setWindowExtension(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> callback) {
        AbstractC3292y.i(callback, "callback");
        synchronized (globalLock) {
            try {
                if (getWindowExtension() == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<WindowLayoutChangeCallbackWrapper> it = getWindowLayoutChangeCallbacks().iterator();
                while (it.hasNext()) {
                    WindowLayoutChangeCallbackWrapper callbackWrapper = it.next();
                    if (callbackWrapper.getCallback() == callback) {
                        AbstractC3292y.h(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                getWindowLayoutChangeCallbacks().removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    callbackRemovedForActivity(((WindowLayoutChangeCallbackWrapper) it2.next()).getActivity());
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
