package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    private static boolean testInsets;
    private int accessCount;
    private final AndroidWindowInsets captionBar;
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;
    private final AndroidWindowInsets displayCutout;
    private final AndroidWindowInsets ime;
    private final ValueInsets imeAnimationSource;
    private final ValueInsets imeAnimationTarget;
    private final InsetsListener insetsListener;
    private final AndroidWindowInsets mandatorySystemGestures;
    private final AndroidWindowInsets navigationBars;
    private final ValueInsets navigationBarsIgnoringVisibility;
    private final WindowInsets safeContent;
    private final WindowInsets safeDrawing;
    private final WindowInsets safeGestures;
    private final AndroidWindowInsets statusBars;
    private final ValueInsets statusBarsIgnoringVisibility;
    private final AndroidWindowInsets systemBars;
    private final ValueInsets systemBarsIgnoringVisibility;
    private final AndroidWindowInsets systemGestures;
    private final AndroidWindowInsets tappableElement;
    private final ValueInsets tappableElementIgnoringVisibility;
    private final ValueInsets waterfall;
    public static final Companion Companion = new Companion(null);
    private static final WeakHashMap<View, WindowInsetsHolder> viewMap = new WeakHashMap<>();

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        private final WindowInsetsHolder getOrCreateFor(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.viewMap) {
                try {
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        WindowInsetsHolder windowInsetsHolder2 = new WindowInsetsHolder(null, view, false ? 1 : 0);
                        weakHashMap.put(view, windowInsetsHolder2);
                        obj2 = windowInsetsHolder2;
                    }
                    windowInsetsHolder = (WindowInsetsHolder) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return windowInsetsHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidWindowInsets systemInsets(WindowInsetsCompat windowInsetsCompat, int i8, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i8, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsetsCompat, i8);
            }
            return androidWindowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ValueInsets valueInsetsIgnoringVisibility(WindowInsetsCompat windowInsetsCompat, int i8, String str) {
            Insets insets;
            if (windowInsetsCompat == null || (insets = windowInsetsCompat.getInsetsIgnoringVisibility(i8)) == null) {
                insets = Insets.NONE;
            }
            AbstractC3292y.h(insets, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return WindowInsets_androidKt.ValueInsets(insets, str);
        }

        @Composable
        public final WindowInsetsHolder current(Composer composer, int i8) {
            composer.startReplaceableGroup(-1366542614);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i8, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:608)");
            }
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            EffectsKt.DisposableEffect(orCreateFor, new WindowInsetsHolder$Companion$current$1(orCreateFor, view), composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return orCreateFor;
        }

        public final void setUseTestInsets(boolean z8) {
            WindowInsetsHolder.testInsets = z8;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, AbstractC3284p abstractC3284p) {
        this(windowInsetsCompat, view);
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i8);
    }

    public final void decrementAccessors(View view) {
        AbstractC3292y.i(view, "view");
        int i8 = this.accessCount - 1;
        this.accessCount = i8;
        if (i8 == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
            ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    public final ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    public final ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final void incrementAccessors(View view) {
        AbstractC3292y.i(view, "view");
        if (this.accessCount == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.setWindowInsetsAnimationCallback(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void update(WindowInsetsCompat windowInsets, int i8) {
        AbstractC3292y.i(windowInsets, "windowInsets");
        if (testInsets) {
            android.view.WindowInsets windowInsets2 = windowInsets.toWindowInsets();
            AbstractC3292y.f(windowInsets2);
            windowInsets = WindowInsetsCompat.toWindowInsetsCompat(windowInsets2);
        }
        AbstractC3292y.h(windowInsets, "if (testInsets) {\n      …   windowInsets\n        }");
        this.captionBar.update$foundation_layout_release(windowInsets, i8);
        this.ime.update$foundation_layout_release(windowInsets, i8);
        this.displayCutout.update$foundation_layout_release(windowInsets, i8);
        this.navigationBars.update$foundation_layout_release(windowInsets, i8);
        this.statusBars.update$foundation_layout_release(windowInsets, i8);
        this.systemBars.update$foundation_layout_release(windowInsets, i8);
        this.systemGestures.update$foundation_layout_release(windowInsets, i8);
        this.tappableElement.update$foundation_layout_release(windowInsets, i8);
        this.mandatorySystemGestures.update$foundation_layout_release(windowInsets, i8);
        if (i8 == 0) {
            ValueInsets valueInsets = this.captionBarIgnoringVisibility;
            Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar());
            AbstractC3292y.h(insetsIgnoringVisibility, "insets.getInsetsIgnoring…aptionBar()\n            )");
            valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility));
            ValueInsets valueInsets2 = this.navigationBarsIgnoringVisibility;
            Insets insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars());
            AbstractC3292y.h(insetsIgnoringVisibility2, "insets.getInsetsIgnoring…ationBars()\n            )");
            valueInsets2.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility2));
            ValueInsets valueInsets3 = this.statusBarsIgnoringVisibility;
            Insets insetsIgnoringVisibility3 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars());
            AbstractC3292y.h(insetsIgnoringVisibility3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            valueInsets3.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility3));
            ValueInsets valueInsets4 = this.systemBarsIgnoringVisibility;
            Insets insetsIgnoringVisibility4 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            AbstractC3292y.h(insetsIgnoringVisibility4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            valueInsets4.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility4));
            ValueInsets valueInsets5 = this.tappableElementIgnoringVisibility;
            Insets insetsIgnoringVisibility5 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement());
            AbstractC3292y.h(insetsIgnoringVisibility5, "insets.getInsetsIgnoring…leElement()\n            )");
            valueInsets5.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility5));
            DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                AbstractC3292y.h(waterfallInsets, "cutout.waterfallInsets");
                this.waterfall.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(waterfallInsets));
            }
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(WindowInsetsCompat windowInsets) {
        AbstractC3292y.i(windowInsets, "windowInsets");
        ValueInsets valueInsets = this.imeAnimationSource;
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.ime());
        AbstractC3292y.h(insets, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets));
    }

    public final void updateImeAnimationTarget(WindowInsetsCompat windowInsets) {
        AbstractC3292y.i(windowInsets, "windowInsets");
        ValueInsets valueInsets = this.imeAnimationTarget;
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.ime());
        AbstractC3292y.h(insets, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        valueInsets.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets));
    }

    private WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view) {
        DisplayCutoutCompat displayCutout;
        Companion companion = Companion;
        this.captionBar = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBar");
        AndroidWindowInsets systemInsets = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.displayCutout = systemInsets;
        AndroidWindowInsets systemInsets2 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "ime");
        this.ime = systemInsets2;
        AndroidWindowInsets systemInsets3 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.mandatorySystemGestures = systemInsets3;
        this.navigationBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.statusBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBars");
        AndroidWindowInsets systemInsets4 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.systemBars = systemInsets4;
        AndroidWindowInsets systemInsets5 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.systemGestures = systemInsets5;
        AndroidWindowInsets systemInsets6 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.tappableElement = systemInsets6;
        Insets insets = (windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (insets = displayCutout.getWaterfallInsets()) == null) ? Insets.NONE : insets;
        AbstractC3292y.h(insets, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets(insets, "waterfall");
        this.waterfall = ValueInsets;
        WindowInsets union = WindowInsetsKt.union(WindowInsetsKt.union(systemInsets4, systemInsets2), systemInsets);
        this.safeDrawing = union;
        WindowInsets union2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(systemInsets6, systemInsets3), systemInsets5), ValueInsets);
        this.safeGestures = union2;
        this.safeContent = WindowInsetsKt.union(union, union2);
        this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationTarget");
        this.imeAnimationSource = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(androidx.compose.ui.R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new InsetsListener(this);
    }
}
