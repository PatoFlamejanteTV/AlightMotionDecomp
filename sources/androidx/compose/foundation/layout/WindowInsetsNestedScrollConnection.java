package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import e6.AbstractC2829a;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;
import n6.InterfaceC3470o;
import n6.InterfaceC3488x0;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(30)
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private InterfaceC3488x0 animationJob;
    private final CancellationSignal cancellationSignal;
    private InterfaceC3470o continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets windowInsets, View view, SideCalculator sideCalculator, Density density) {
        AbstractC3292y.i(windowInsets, "windowInsets");
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(sideCalculator, "sideCalculator");
        AbstractC3292y.i(density, "density");
        this.windowInsets = windowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
        this.cancellationSignal = new CancellationSignal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float f8) {
        Insets currentInsets;
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            AbstractC3292y.h(currentInsets, "it.currentInsets");
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, AbstractC2829a.d(f8)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        boolean isReady;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null) {
            isReady = windowInsetsAnimationController2.isReady();
            if (isReady && (windowInsetsAnimationController = this.animationController) != null) {
                windowInsetsAnimationController.finish(this.windowInsets.isVisible());
            }
        }
        this.animationController = null;
        InterfaceC3470o interfaceC3470o = this.continuation;
        if (interfaceC3470o != null) {
            interfaceC3470o.o(null, WindowInsetsNestedScrollConnection$animationEnded$1.INSTANCE);
        }
        this.continuation = null;
        InterfaceC3488x0 interfaceC3488x0 = this.animationJob;
        if (interfaceC3488x0 != null) {
            interfaceC3488x0.cancel(new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m652flinghuYlsQE(long r26, float r28, boolean r29, U5.d r30) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m652flinghuYlsQE(long, float, boolean, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(U5.d dVar) {
        Object obj = this.animationController;
        if (obj == null) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.continuation = c3472p;
            requestAnimationController();
            obj = c3472p.y();
            if (obj == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        WindowInsetsController windowInsetsController;
        if (!this.isControllerRequested) {
            this.isControllerRequested = true;
            windowInsetsController = this.view.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout_release(), -1L, null, this.cancellationSignal, k.a(this));
            }
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m653scroll8S9VItk(long j8, float f8) {
        boolean z8;
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        int i8;
        InterfaceC3488x0 interfaceC3488x0 = this.animationJob;
        if (interfaceC3488x0 != null) {
            interfaceC3488x0.cancel(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (f8 != 0.0f) {
            boolean isVisible = this.windowInsets.isVisible();
            if (f8 > 0.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (isVisible != z8 || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo605consumedOffsetsMKHz9U(j8);
                }
                SideCalculator sideCalculator = this.sideCalculator;
                hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                AbstractC3292y.h(hiddenStateInsets, "animationController.hiddenStateInsets");
                int valueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.sideCalculator;
                shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                AbstractC3292y.h(shownStateInsets, "animationController.shownStateInsets");
                int valueOf2 = sideCalculator2.valueOf(shownStateInsets);
                currentInsets = windowInsetsAnimationController.getCurrentInsets();
                AbstractC3292y.h(currentInsets, "animationController.currentInsets");
                int valueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (f8 > 0.0f) {
                    i8 = valueOf2;
                } else {
                    i8 = valueOf;
                }
                if (valueOf3 == i8) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m2728getZeroF1C5BW0();
                }
                float f9 = valueOf3 + f8 + this.partialConsumption;
                int k8 = i6.m.k(AbstractC2829a.d(f9), valueOf, valueOf2);
                this.partialConsumption = f9 - AbstractC2829a.d(f9);
                if (k8 != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, k8), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo605consumedOffsetsMKHz9U(j8);
            }
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }

    public final void dispose() {
        Insets currentInsets;
        Insets hiddenStateInsets;
        InterfaceC3470o interfaceC3470o = this.continuation;
        if (interfaceC3470o != null) {
            interfaceC3470o.o(null, WindowInsetsNestedScrollConnection$dispose$1.INSTANCE);
        }
        InterfaceC3488x0 interfaceC3488x0 = this.animationJob;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
            windowInsetsAnimationController.finish(!AbstractC3292y.d(currentInsets, hiddenStateInsets));
        }
    }

    public final Density getDensity() {
        return this.density;
    }

    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final View getView() {
        return this.view;
    }

    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onFinished(WindowInsetsAnimationController controller) {
        AbstractC3292y.i(controller, "controller");
        animationEnded();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo432onPostFlingRZ2iAVY(long j8, long j9, U5.d dVar) {
        return m652flinghuYlsQE(j9, this.sideCalculator.showMotion(Velocity.m5386getXimpl(j9), Velocity.m5387getYimpl(j9)), true, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo433onPostScrollDzOQY0M(long j8, long j9, int i8) {
        return m653scroll8S9VItk(j9, this.sideCalculator.showMotion(Offset.m2712getXimpl(j9), Offset.m2713getYimpl(j9)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo434onPreFlingQWom1Mo(long j8, U5.d dVar) {
        return m652flinghuYlsQE(j8, this.sideCalculator.hideMotion(Velocity.m5386getXimpl(j8), Velocity.m5387getYimpl(j8)), false, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo435onPreScrollOzD1aCk(long j8, int i8) {
        return m653scroll8S9VItk(j8, this.sideCalculator.hideMotion(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8)));
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onReady(WindowInsetsAnimationController controller, int i8) {
        AbstractC3292y.i(controller, "controller");
        this.animationController = controller;
        this.isControllerRequested = false;
        InterfaceC3470o interfaceC3470o = this.continuation;
        if (interfaceC3470o != null) {
            interfaceC3470o.o(controller, WindowInsetsNestedScrollConnection$onReady$1.INSTANCE);
        }
        this.continuation = null;
    }
}
