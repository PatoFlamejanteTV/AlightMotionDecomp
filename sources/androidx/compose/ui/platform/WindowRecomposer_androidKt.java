package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.R;
import androidx.core.os.HandlerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import n6.AbstractC3462k;
import q6.AbstractC3823h;
import q6.InterfaceC3808G;
import q6.InterfaceC3813L;

/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {
    private static final Map<Context, InterfaceC3813L> animationScale = new LinkedHashMap();

    @ExperimentalComposeUiApi
    public static final Recomposer createLifecycleAwareWindowRecomposer(final View view, U5.g gVar, Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        U5.g gVar2;
        if (gVar.get(U5.e.f10146a0) == null || gVar.get(MonotonicFrameClock.Key) == null) {
            gVar = AndroidUiDispatcher.Companion.getCurrentThread().plus(gVar);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) gVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.pause();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        U5.g gVar3 = (MotionDurationScale) gVar.get(MotionDurationScale.Key);
        if (gVar3 == null) {
            gVar3 = new MotionDurationScaleImpl();
            t8.f34573a = gVar3;
        }
        if (pausableMonotonicFrameClock != null) {
            gVar2 = pausableMonotonicFrameClock;
        } else {
            gVar2 = U5.h.f10149a;
        }
        U5.g plus = gVar.plus(gVar2).plus(gVar3);
        final Recomposer recomposer = new Recomposer(plus);
        recomposer.pauseCompositionFrameClock();
        final n6.M a9 = n6.N.a(plus);
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            if (lifecycleOwner != null) {
                lifecycle = lifecycleOwner.getLifecycle();
            } else {
                lifecycle = null;
            }
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.cancel();
                }
            });
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* loaded from: classes.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    int i8 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                    if (i8 == 1) {
                        AbstractC3462k.d(n6.M.this, null, n6.O.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(t8, recomposer, lifecycleOwner2, this, view, null), 1, null);
                        return;
                    }
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                recomposer.cancel();
                                return;
                            }
                            return;
                        }
                        recomposer.pauseCompositionFrameClock();
                        return;
                    }
                    PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                    if (pausableMonotonicFrameClock3 != null) {
                        pausableMonotonicFrameClock3.resume();
                    }
                    recomposer.resumeCompositionFrameClock();
                }
            });
            return recomposer;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View view, U5.g gVar, Lifecycle lifecycle, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = U5.h.f10149a;
        }
        if ((i8 & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, gVar, lifecycle);
    }

    public static final CompositionContext findViewTreeCompositionContext(View view) {
        CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        for (ViewParent parent = view.getParent(); compositionContext == null && (parent instanceof View); parent = parent.getParent()) {
            compositionContext = getCompositionContext((View) parent);
        }
        return compositionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final InterfaceC3813L getAnimationScaleFlowFor(Context context) {
        InterfaceC3813L interfaceC3813L;
        Map<Context, InterfaceC3813L> map = animationScale;
        synchronized (map) {
            try {
                InterfaceC3813L interfaceC3813L2 = map.get(context);
                if (interfaceC3813L2 == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    final p6.d b9 = p6.g.b(-1, null, null, 6, null);
                    final Handler createAsync = HandlerCompat.createAsync(Looper.getMainLooper());
                    interfaceC3813L2 = AbstractC3823h.J(AbstractC3823h.z(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(createAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                        @Override // android.database.ContentObserver
                        public void onChange(boolean z8, Uri uri) {
                            p6.d.this.x(Q5.I.f8786a);
                        }
                    }, b9, context, null)), n6.N.b(), InterfaceC3808G.a.b(InterfaceC3808G.f37362a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, interfaceC3813L2);
                }
                interfaceC3813L = interfaceC3813L2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC3813L;
    }

    public static final CompositionContext getCompositionContext(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    private static final View getContentChild(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final Recomposer getWindowRecomposer(View view) {
        if (view.isAttachedToWindow()) {
            View contentChild = getContentChild(view);
            CompositionContext compositionContext = getCompositionContext(contentChild);
            if (compositionContext == null) {
                return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(contentChild);
            }
            if (compositionContext instanceof Recomposer) {
                return (Recomposer) compositionContext;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }

    public static final void setCompositionContext(View view, CompositionContext compositionContext) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, compositionContext);
    }
}
