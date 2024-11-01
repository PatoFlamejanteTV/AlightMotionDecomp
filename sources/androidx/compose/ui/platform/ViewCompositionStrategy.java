package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface ViewCompositionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1, android.view.View$OnAttachStateChangeListener] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public Function0 installFor(final AbstractComposeView abstractComposeView) {
            ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    AbstractComposeView.this.disposeComposition();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r02);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(abstractComposeView, r02);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public Function0 installFor(final AbstractComposeView abstractComposeView) {
            ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    if (!PoolingContainer.isWithinPoolingContainer(AbstractComposeView.this)) {
                        AbstractComposeView.this.disposeComposition();
                    }
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r02);
            PoolingContainerListener poolingContainerListener = new PoolingContainerListener() { // from class: androidx.compose.ui.platform.U0
                @Override // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void onRelease() {
                    AbstractComposeView.this.disposeComposition();
                }
            };
            PoolingContainer.addPoolingContainerListener(abstractComposeView, poolingContainerListener);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(abstractComposeView, r02, poolingContainerListener);
        }
    }

    @StabilityInferred(parameters = 1)
    /* loaded from: classes.dex */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1, android.view.View$OnAttachStateChangeListener] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public Function0 installFor(final AbstractComposeView abstractComposeView) {
            if (abstractComposeView.isAttachedToWindow()) {
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractComposeView);
                if (lifecycleOwner != null) {
                    return ViewCompositionStrategy_androidKt.access$installForLifecycle(abstractComposeView, lifecycleOwner.getLifecycle());
                }
                throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
            }
            final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
            ?? r12 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    Function0 installForLifecycle;
                    LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(AbstractComposeView.this);
                    AbstractComposeView abstractComposeView2 = AbstractComposeView.this;
                    if (lifecycleOwner2 != null) {
                        kotlin.jvm.internal.T t9 = t8;
                        installForLifecycle = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView2, lifecycleOwner2.getLifecycle());
                        t9.f34573a = installForLifecycle;
                        AbstractComposeView.this.removeOnAttachStateChangeListener(this);
                        return;
                    }
                    throw new IllegalStateException(("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner").toString());
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r12);
            t8.f34573a = new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(abstractComposeView, r12);
            return new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(t8);
        }
    }

    Function0 installFor(AbstractComposeView abstractComposeView);

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;
        private final Lifecycle lifecycle;

        public DisposeOnLifecycleDestroyed(Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public Function0 installFor(AbstractComposeView abstractComposeView) {
            return ViewCompositionStrategy_androidKt.access$installForLifecycle(abstractComposeView, this.lifecycle);
        }

        public DisposeOnLifecycleDestroyed(LifecycleOwner lifecycleOwner) {
            this(lifecycleOwner.getLifecycle());
        }
    }
}
