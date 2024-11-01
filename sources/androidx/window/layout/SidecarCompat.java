package androidx.window.layout;

import Q5.I;
import R5.AbstractC1435t;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SidecarCompat implements ExtensionInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SidecarCompat";
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;
    private ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
    private final SidecarInterface sidecar;
    private final SidecarAdapter sidecarAdapter;
    private final Map<IBinder, Activity> windowListenerRegisteredContexts;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final IBinder getActivityWindowToken$window_release(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface getSidecarCompat$window_release(Context context) {
            AbstractC3292y.i(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final Version getSidecarVersion() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.Companion.parse(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private static final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {

        @GuardedBy("mLock")
        private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo;
        private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
        private final ReentrantLock lock;

        public DistinctElementCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface) {
            AbstractC3292y.i(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo newLayout) {
            AbstractC3292y.i(activity, "activity");
            AbstractC3292y.i(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (AbstractC3292y.d(newLayout, this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                this.activityWindowLayoutInfo.put(activity, newLayout);
                reentrantLock.unlock();
                this.callbackInterface.onWindowLayoutChanged(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* loaded from: classes3.dex */
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        private final SidecarInterface.SidecarCallback callbackInterface;

        @GuardedBy("lock")
        private SidecarDeviceState lastDeviceState;
        private final ReentrantLock lock;

        @GuardedBy("mLock")
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;
        private final SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(SidecarAdapter sidecarAdapter, SidecarInterface.SidecarCallback callbackInterface) {
            AbstractC3292y.i(sidecarAdapter, "sidecarAdapter");
            AbstractC3292y.i(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            AbstractC3292y.i(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
                I i8 = I.f8786a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder token, SidecarWindowLayoutInfo newLayout) {
            AbstractC3292y.i(token, "token");
            AbstractC3292y.i(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.mActivityWindowLayoutInfo.put(token, newLayout);
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    /* loaded from: classes3.dex */
    private static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {
        private final WeakReference<Activity> activityWeakReference;
        private final SidecarCompat sidecarCompat;

        public FirstAttachAdapter(SidecarCompat sidecarCompat, Activity activity) {
            AbstractC3292y.i(sidecarCompat, "sidecarCompat");
            AbstractC3292y.i(activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC3292y.i(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.activityWeakReference.get();
            IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.sidecarCompat.register(activityWindowToken$window_release, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC3292y.i(view, "view");
        }
    }

    /* loaded from: classes3.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        final /* synthetic */ SidecarCompat this$0;

        public TranslatingCallback(SidecarCompat this$0) {
            AbstractC3292y.i(this$0, "this$0");
            this.this$0 = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            AbstractC3292y.i(newDeviceState, "newDeviceState");
            Collection<Activity> values = this.this$0.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = this.this$0;
            for (Activity activity : values) {
                IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (activityWindowToken$window_release != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    sidecarWindowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState deviceState;
            AbstractC3292y.i(windowToken, "windowToken");
            AbstractC3292y.i(newLayout, "newLayout");
            Activity activity = (Activity) this.this$0.windowListenerRegisteredContexts.get(windowToken);
            if (activity != null) {
                SidecarAdapter sidecarAdapter = this.this$0.sidecarAdapter;
                SidecarInterface sidecar = this.this$0.getSidecar();
                if (sidecar == null) {
                    deviceState = null;
                } else {
                    deviceState = sidecar.getDeviceState();
                }
                if (deviceState == null) {
                    deviceState = new SidecarDeviceState();
                }
                WindowLayoutInfo translate = sidecarAdapter.translate(newLayout, deviceState);
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.this$0.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, translate);
                    return;
                }
                return;
            }
            Log.w(SidecarCompat.TAG, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
        }
    }

    @VisibleForTesting
    public SidecarCompat(@VisibleForTesting SidecarInterface sidecarInterface, SidecarAdapter sidecarAdapter) {
        AbstractC3292y.i(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    private final void registerConfigurationChangeListener(final Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration newConfig) {
                    AbstractC3292y.i(newConfig, "newConfig");
                    ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = SidecarCompat.this.extensionCallback;
                    if (extensionCallbackInterface != null) {
                        Activity activity2 = activity;
                        extensionCallbackInterface.onWindowLayoutChanged(activity2, SidecarCompat.this.getWindowLayoutInfo(activity2));
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            this.componentCallbackMap.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    @VisibleForTesting
    public final WindowLayoutInfo getWindowLayoutInfo(Activity activity) {
        SidecarWindowLayoutInfo windowLayoutInfo;
        AbstractC3292y.i(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new WindowLayoutInfo(AbstractC1435t.m());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarDeviceState sidecarDeviceState = null;
        if (sidecarInterface == null) {
            windowLayoutInfo = null;
        } else {
            windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release);
        }
        SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarDeviceState = sidecarInterface2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, sidecarDeviceState);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(Activity activity) {
        boolean z8;
        SidecarInterface sidecarInterface;
        AbstractC3292y.i(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        unregisterComponentCallback(activity);
        if (this.windowListenerRegisteredContexts.size() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (z8 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(true);
        }
    }

    public final void register(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        AbstractC3292y.i(windowToken, "windowToken");
        AbstractC3292y.i(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback) {
        AbstractC3292y.i(extensionCallback, "extensionCallback");
        this.extensionCallback = new DistinctElementCallback(extensionCallback);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a5 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0167 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0080 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0059 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017f A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0020 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0002, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a9, B:38:0x00af, B:41:0x00b5, B:42:0x00e7, B:44:0x0103, B:49:0x0106, B:51:0x0131, B:53:0x013b, B:54:0x0142, B:55:0x0143, B:56:0x014a, B:58:0x00b8, B:60:0x00df, B:62:0x014b, B:63:0x0152, B:64:0x0153, B:65:0x015a, B:66:0x015b, B:67:0x0166, B:68:0x00a5, B:69:0x0090, B:72:0x0097, B:73:0x0167, B:74:0x0172, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x0173, B:81:0x017e, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0002, inners: #0, #1 }] */
    @Override // androidx.window.layout.ExtensionInterfaceCompat
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean validateExtensionInterface() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.validateExtensionInterface():boolean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(Companion.getSidecarCompat$window_release(context), new SidecarAdapter(null, 1, 0 == true ? 1 : 0));
        AbstractC3292y.i(context, "context");
    }
}
