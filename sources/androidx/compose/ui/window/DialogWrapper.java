package androidx.compose.ui.window;

import Q5.I;
import Q5.p;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.platform.a1;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {
    private final View composeView;
    private final int defaultSoftInputMode;
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private Function0 onDismissRequest;
    private DialogProperties properties;

    /* renamed from: androidx.compose.ui.window.DialogWrapper$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return I.f8786a;
        }

        public final void invoke(OnBackPressedCallback onBackPressedCallback) {
            if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                DialogWrapper.this.onDismissRequest.invoke();
            }
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogWrapper(kotlin.jvm.functions.Function0 r7, androidx.compose.ui.window.DialogProperties r8, android.view.View r9, androidx.compose.ui.unit.LayoutDirection r10, androidx.compose.ui.unit.Density r11, java.util.UUID r12) {
        /*
            r6 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto L16
            boolean r2 = r8.getDecorFitsSystemWindows()
            if (r2 == 0) goto L13
            goto L16
        L13:
            int r2 = androidx.compose.ui.R.style.FloatingDialogWindowTheme
            goto L18
        L16:
            int r2 = androidx.compose.ui.R.style.DialogWindowTheme
        L18:
            r0.<init>(r1, r2)
            r1 = 2
            r2 = 0
            r3 = 0
            r6.<init>(r0, r2, r1, r3)
            r6.onDismissRequest = r7
            r6.properties = r8
            r6.composeView = r9
            r7 = 8
            float r7 = (float) r7
            float r7 = androidx.compose.ui.unit.Dp.m5155constructorimpl(r7)
            r6.maxSupportedElevation = r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto Lc6
            android.view.WindowManager$LayoutParams r0 = r8.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r6.defaultSoftInputMode = r0
            r0 = 1
            r8.requestFeature(r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r0)
            androidx.compose.ui.window.DialogProperties r0 = r6.properties
            boolean r0 = r0.getDecorFitsSystemWindows()
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r8, r0)
            androidx.compose.ui.window.DialogLayout r0 = new androidx.compose.ui.window.DialogLayout
            android.content.Context r1 = r6.getContext()
            r0.<init>(r1, r8)
            int r1 = androidx.compose.ui.R.id.compose_view_saveable_id_tag
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Dialog:"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r0.setTag(r1, r12)
            r0.setClipChildren(r2)
            float r7 = r11.mo425toPx0680j_4(r7)
            r0.setElevation(r7)
            androidx.compose.ui.window.DialogWrapper$1$2 r7 = new androidx.compose.ui.window.DialogWrapper$1$2
            r7.<init>()
            r0.setOutlineProvider(r7)
            r6.dialogLayout = r0
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L91
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L91:
            if (r3 == 0) goto L96
            _init_$disableClipping(r3)
        L96:
            r6.setContentView(r0)
            androidx.lifecycle.LifecycleOwner r7 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r9)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r7)
            androidx.lifecycle.ViewModelStoreOwner r7 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r9)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r7)
            androidx.savedstate.SavedStateRegistryOwner r7 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r9)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r7)
            kotlin.jvm.functions.Function0 r7 = r6.onDismissRequest
            androidx.compose.ui.window.DialogProperties r8 = r6.properties
            r6.updateParameters(r7, r8, r10)
            androidx.activity.OnBackPressedDispatcher r0 = r6.getOnBackPressedDispatcher()
            androidx.compose.ui.window.DialogWrapper$2 r3 = new androidx.compose.ui.window.DialogWrapper$2
            r3.<init>()
            r4 = 2
            r5 = 0
            r2 = 0
            r1 = r6
            androidx.activity.OnBackPressedDispatcherKt.addCallback$default(r0, r1, r2, r3, r4, r5)
            return
        Lc6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.DialogWrapper.<init>(kotlin.jvm.functions.Function0, androidx.compose.ui.window.DialogProperties, android.view.View, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, java.util.UUID):void");
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if (childAt instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) childAt;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i8 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i9 = 1;
        if (i8 != 1) {
            if (i8 != 2) {
                throw new p();
            }
        } else {
            i9 = 0;
        }
        dialogLayout.setLayoutDirection(i9);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        int i8;
        boolean shouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        AbstractC3292y.f(window);
        if (shouldApplySecureFlag) {
            i8 = 8192;
        } else {
            i8 = -8193;
        }
        window.setFlags(i8, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public /* synthetic */ View getViewRoot() {
        return a1.b(this);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.invoke();
        }
        return onTouchEvent;
    }

    public final void setContent(CompositionContext compositionContext, InterfaceC2072n interfaceC2072n) {
        this.dialogLayout.setContent(compositionContext, interfaceC2072n);
    }

    public final void updateParameters(Function0 function0, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        Window window;
        this.onDismissRequest = function0;
        this.properties = dialogProperties;
        setSecurePolicy(dialogProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        if (dialogProperties.getUsePlatformDefaultWidth() && !this.dialogLayout.getUsePlatformDefaultWidth() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.dialogLayout.setUsePlatformDefaultWidth(dialogProperties.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT < 31) {
            if (dialogProperties.getDecorFitsSystemWindows()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.defaultSoftInputMode);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }
}
