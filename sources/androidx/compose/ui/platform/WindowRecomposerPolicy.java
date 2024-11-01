package androidx.compose.ui.platform;

import Q5.AbstractC1410e;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;
import n6.AbstractC3462k;
import n6.C3475q0;
import n6.InterfaceC3488x0;
import o6.AbstractC3547f;

@StabilityInferred(parameters = 0)
@InternalComposeUiApi
/* loaded from: classes.dex */
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.Companion.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final boolean compareAndSetFactory(WindowRecomposerFactory windowRecomposerFactory, WindowRecomposerFactory windowRecomposerFactory2) {
        return androidx.compose.animation.core.d.a(factory, windowRecomposerFactory, windowRecomposerFactory2);
    }

    public final Recomposer createAndInstallWindowRecomposer$ui_release(View view) {
        final InterfaceC3488x0 d8;
        Recomposer createRecomposer = factory.get().createRecomposer(view);
        WindowRecomposer_androidKt.setCompositionContext(view, createRecomposer);
        d8 = AbstractC3462k.d(C3475q0.f35747a, AbstractC3547f.b(view.getHandler(), "windowRecomposer cleanup").G(), null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(createRecomposer, view, null), 2, null);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view2.removeOnAttachStateChangeListener(this);
                InterfaceC3488x0.a.a(InterfaceC3488x0.this, null, 1, null);
            }
        });
        return createRecomposer;
    }

    public final WindowRecomposerFactory getAndSetFactory(WindowRecomposerFactory windowRecomposerFactory) {
        return factory.getAndSet(windowRecomposerFactory);
    }

    public final void setFactory(WindowRecomposerFactory windowRecomposerFactory) {
        factory.set(windowRecomposerFactory);
    }

    public final <R> R withFactory(WindowRecomposerFactory windowRecomposerFactory, Function0 function0) {
        WindowRecomposerFactory andSetFactory = getAndSetFactory(windowRecomposerFactory);
        try {
            R r8 = (R) function0.invoke();
            AbstractC3290w.b(1);
            if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                AbstractC3290w.a(1);
                return r8;
            }
            throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3290w.b(1);
                if (!compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                    AbstractC1410e.a(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                    throw th;
                }
                AbstractC3290w.a(1);
                throw th2;
            }
        }
    }
}
