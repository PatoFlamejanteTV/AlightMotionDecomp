package androidx.activity;

import Q5.I;
import R5.C1427k;
import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private OnBackPressedCallback inProgressCallback;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    private final C1427k onBackPressedCallbacks;
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    /* renamed from: androidx.activity.OnBackPressedDispatcher$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackEventCompat) obj);
            return I.f8786a;
        }

        public final void invoke(BackEventCompat backEvent) {
            AbstractC3292y.i(backEvent, "backEvent");
            OnBackPressedDispatcher.this.onBackStarted(backEvent);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackEventCompat) obj);
            return I.f8786a;
        }

        public final void invoke(BackEventCompat backEvent) {
            AbstractC3292y.i(backEvent, "backEvent");
            OnBackPressedDispatcher.this.onBackProgressed(backEvent);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends AbstractC3293z implements Function0 {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m70invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m70invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends AbstractC3293z implements Function0 {
        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m71invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m71invoke() {
            OnBackPressedDispatcher.this.onBackCancelled();
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends AbstractC3293z implements Function0 {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m72invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m72invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    @RequiresApi(33)
    /* loaded from: classes.dex */
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(Function0 onBackInvoked) {
            AbstractC3292y.i(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @DoNotInline
        public final OnBackInvokedCallback createOnBackInvokedCallback(final Function0 onBackInvoked) {
            AbstractC3292y.i(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.k
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(Function0.this);
                }
            };
        }

        @DoNotInline
        public final void registerOnBackInvokedCallback(Object dispatcher, int i8, Object callback) {
            AbstractC3292y.i(dispatcher, "dispatcher");
            AbstractC3292y.i(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i8, (OnBackInvokedCallback) callback);
        }

        @DoNotInline
        public final void unregisterOnBackInvokedCallback(Object dispatcher, Object callback) {
            AbstractC3292y.i(dispatcher, "dispatcher");
            AbstractC3292y.i(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    @RequiresApi(34)
    /* loaded from: classes.dex */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @DoNotInline
        public final OnBackInvokedCallback createOnBackAnimationCallback(final Function1 onBackStarted, final Function1 onBackProgressed, final Function0 onBackInvoked, final Function0 onBackCancelled) {
            AbstractC3292y.i(onBackStarted, "onBackStarted");
            AbstractC3292y.i(onBackProgressed, "onBackProgressed");
            AbstractC3292y.i(onBackInvoked, "onBackInvoked");
            AbstractC3292y.i(onBackCancelled, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                @Override // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    onBackCancelled.invoke();
                }

                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    onBackInvoked.invoke();
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackProgressed(BackEvent backEvent) {
                    AbstractC3292y.i(backEvent, "backEvent");
                    onBackProgressed.invoke(new BackEventCompat(backEvent));
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackStarted(BackEvent backEvent) {
                    AbstractC3292y.i(backEvent, "backEvent");
                    Function1.this.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    /* loaded from: classes.dex */
    private final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            AbstractC3292y.i(lifecycle, "lifecycle");
            AbstractC3292y.i(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            AbstractC3292y.i(source, "source");
            AbstractC3292y.i(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                    return;
                }
                return;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class OnBackPressedCancellable implements Cancellable {
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            AbstractC3292y.i(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (AbstractC3292y.d(this.this$0.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.this$0.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            Function0 enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @MainThread
    public final void onBackCancelled() {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            C1427k c1427k = this.onBackPressedCallbacks;
            ListIterator listIterator = c1427k.listIterator(c1427k.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    onBackPressedCallback = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallback).isEnabled()) {
                        break;
                    }
                } else {
                    onBackPressedCallback = 0;
                    break;
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    @MainThread
    public final void onBackProgressed(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            C1427k c1427k = this.onBackPressedCallbacks;
            ListIterator listIterator = c1427k.listIterator(c1427k.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    onBackPressedCallback = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallback).isEnabled()) {
                        break;
                    }
                } else {
                    onBackPressedCallback = 0;
                    break;
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackProgressed(backEventCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackStarted(BackEventCompat backEventCompat) {
        Object obj;
        C1427k c1427k = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = c1427k.listIterator(c1427k.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((OnBackPressedCallback) obj).isEnabled()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) obj;
        this.inProgressCallback = onBackPressedCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackStarted(backEventCompat);
        }
    }

    @RequiresApi(33)
    private final void updateBackInvokedCallbackState(boolean z8) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z8 && !this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.backInvokedCallbackRegistered = true;
            } else if (!z8 && this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
                this.backInvokedCallbackRegistered = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEnabledCallbacks() {
        boolean z8 = this.hasEnabledCallbacks;
        C1427k c1427k = this.onBackPressedCallbacks;
        boolean z9 = false;
        if (!(c1427k instanceof Collection) || !c1427k.isEmpty()) {
            Iterator<E> it = c1427k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((OnBackPressedCallback) it.next()).isEnabled()) {
                    z9 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z9;
        if (z9 != z8) {
            Consumer<Boolean> consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z9));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z9);
            }
        }
    }

    @MainThread
    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        AbstractC3292y.i(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    @MainThread
    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        AbstractC3292y.i(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackCancelled() {
        onBackCancelled();
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackProgressed(BackEventCompat backEvent) {
        AbstractC3292y.i(backEvent, "backEvent");
        onBackProgressed(backEvent);
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackStarted(BackEventCompat backEvent) {
        AbstractC3292y.i(backEvent, "backEvent");
        onBackStarted(backEvent);
    }

    @MainThread
    public final boolean hasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @MainThread
    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            C1427k c1427k = this.onBackPressedCallbacks;
            ListIterator listIterator = c1427k.listIterator(c1427k.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    onBackPressedCallback = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallback).isEnabled()) {
                        break;
                    }
                } else {
                    onBackPressedCallback = 0;
                    break;
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    @RequiresApi(33)
    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher invoker) {
        AbstractC3292y.i(invoker, "invoker");
        this.invokedDispatcher = invoker;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    public OnBackPressedDispatcher(Runnable runnable, Consumer<Boolean> consumer) {
        OnBackInvokedCallback createOnBackInvokedCallback;
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new C1427k();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            if (i8 >= 34) {
                createOnBackInvokedCallback = Api34Impl.INSTANCE.createOnBackAnimationCallback(new AnonymousClass1(), new AnonymousClass2(), new AnonymousClass3(), new AnonymousClass4());
            } else {
                createOnBackInvokedCallback = Api33Impl.INSTANCE.createOnBackInvokedCallback(new AnonymousClass5());
            }
            this.onBackInvokedCallback = createOnBackInvokedCallback;
        }
    }

    @MainThread
    public final void addCallback(LifecycleOwner owner, OnBackPressedCallback onBackPressedCallback) {
        AbstractC3292y.i(owner, "owner");
        AbstractC3292y.i(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCallback$1(this));
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : runnable);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
