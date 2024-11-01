package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationCallback;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTransactionManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import e6.AbstractC2829a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {
    private static final String FocusTag = "Compose Focus";
    private static final int MaximumLayerCacheSize = 10;
    private static Method getBooleanMethod;
    private static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final InputModeManagerImpl _inputModeManager;
    private final MutableState _viewTreeOwners$delegate;
    private final WindowInfoImpl _windowInfo;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboardManager clipboardManager;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private Function1 configurationChangeObserver;
    private final U5.g coroutineContext;
    private int currentFontWeightAdjustment;
    private Density density;
    private final List<OwnedLayer> dirtyLayers;
    private final DragAndDropManager dragAndDropManager;
    private final DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener;
    private final MutableVector<Function0> endApplyChangesListeners;
    private final FocusOwner focusOwner;
    private final MutableState fontFamilyResolver$delegate;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<OwnedLayer> layerCache;
    private final MutableState layoutDirection$delegate;
    private final TextInputServiceAndroid legacyTextInputServiceAndroid;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private Function1 onViewTreeOwnersAvailable;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private List<OwnedLayer> postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private long relayoutTime;
    private final Function0 resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final LayoutNode root;
    private final RootForTest rootForTest;
    private final Modifier rotaryInputModifier;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final EmptySemanticsElement semanticsModifier;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private final SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;
    private final TextInputService textInputService;
    private final AtomicReference textInputSessionMutex;
    private final TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final State viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @RequiresApi(31)
    /* loaded from: classes.dex */
    private static final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {
        @Override // android.view.translation.ViewTranslationCallback
        public boolean onClearTranslation(View view) {
            AbstractC3292y.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).composeAccessibilityDelegate.onClearTranslation$ui_release();
            return true;
        }

        @Override // android.view.translation.ViewTranslationCallback
        public boolean onHideTranslation(View view) {
            AbstractC3292y.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).composeAccessibilityDelegate.onHideTranslation$ui_release();
            return true;
        }

        @Override // android.view.translation.ViewTranslationCallback
        public boolean onShowTranslation(View view) {
            AbstractC3292y.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).composeAccessibilityDelegate.onShowTranslation$ui_release();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    if (cls != null) {
                        method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                    } else {
                        method = null;
                    }
                    AndroidComposeView.getBooleanMethod = method;
                }
                Method method2 = AndroidComposeView.getBooleanMethod;
                if (method2 != null) {
                    obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final LifecycleOwner lifecycleOwner;
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(Context context, U5.g gVar) {
        super(context);
        AndroidAutofill androidAutofill;
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        int m3558getKeyboardaOaMEAU;
        CalculateMatrixToWindow calculateMatrixToWindowApi21;
        this.coroutineContext = gVar;
        Offset.Companion companion = Offset.Companion;
        this.lastDownPointerPosition = companion.m2727getUnspecifiedF1C5BW0();
        this.superclassInitComplete = true;
        byte b9 = 0;
        byte b10 = 0;
        this.sharedDrawScope = new LayoutNodeDrawScope(null, 1, 0 == true ? 1 : 0);
        this.density = AndroidDensity_androidKt.Density(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.INSTANCE;
        this.semanticsModifier = emptySemanticsElement;
        this.focusOwner = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this));
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new AndroidComposeView$dragAndDropModifierOnDragListener$1(this));
        this.dragAndDropModifierOnDragListener = dragAndDropModifierOnDragListener;
        this.dragAndDropManager = dragAndDropModifierOnDragListener;
        this._windowInfo = new WindowInfoImpl();
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, new AndroidComposeView$keyInputModifier$1(this));
        this.keyInputModifier = onKeyEvent;
        Modifier onRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, AndroidComposeView$rotaryInputModifier$1.INSTANCE);
        this.rotaryInputModifier = onRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setModifier(companion2.then(emptySemanticsElement).then(onRotaryScrollEvent).then(getFocusOwner().getModifier()).then(onKeyEvent).then(dragAndDropModifierOnDragListener.getModifier()));
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        if (autofillSupported()) {
            androidAutofill = new AndroidAutofill(this, getAutofillTree());
        } else {
            androidAutofill = null;
        }
        this._autofill = androidAutofill;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        this.viewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        this.globalPosition = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        float[] m3159constructorimpl$default = Matrix.m3159constructorimpl$default(null, 1, null);
        this.tmpMatrix = m3159constructorimpl$default;
        this.viewToWindowMatrix = Matrix.m3159constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m3159constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.m2726getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._viewTreeOwners$delegate = mutableStateOf$default;
        this.viewTreeOwners$delegate = SnapshotStateKt.derivedStateOf(new AndroidComposeView$viewTreeOwners$2(this));
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.e
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.f
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.g
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z8) {
                AndroidComposeView.touchModeChangeListener$lambda$3(AndroidComposeView.this, z8);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.legacyTextInputServiceAndroid = textInputServiceAndroid;
        this.textInputService = new TextInputService((PlatformTextInputService) AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid));
        this.textInputSessionMutex = SessionMutex.m2588constructorimpl();
        this.softwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        this.fontLoader = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver$delegate = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(context.getResources().getConfiguration());
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AndroidComposeView_androidKt.getLocaleLayoutDirection(context.getResources().getConfiguration()), null, 2, null);
        this.layoutDirection$delegate = mutableStateOf$default2;
        this.hapticFeedBack = new PlatformHapticFeedback(this);
        if (isInTouchMode()) {
            m3558getKeyboardaOaMEAU = InputMode.Companion.m3559getTouchaOaMEAU();
        } else {
            m3558getKeyboardaOaMEAU = InputMode.Companion.m3558getKeyboardaOaMEAU();
        }
        this._inputModeManager = new InputModeManagerImpl(m3558getKeyboardaOaMEAU, new AndroidComposeView$_inputModeManager$1(this), b10 == true ? 1 : 0);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new WeakCache<>();
        this.endApplyChangesListeners = new MutableVector<>(new Function0[16], 0);
        this.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                MotionEvent motionEvent;
                int i8;
                long j8;
                AndroidComposeView.this.removeCallbacks(this);
                motionEvent = AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z8 = false;
                    if (motionEvent.getToolType(0) == 3) {
                        z8 = true;
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (z8) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    if (actionMasked != 7 && actionMasked != 9) {
                        i8 = 2;
                    } else {
                        i8 = 7;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    j8 = androidComposeView.relayoutTime;
                    androidComposeView.sendSimulatedEvent(motionEvent, i8, j8, false);
                }
            }
        };
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.h
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.sendHoverExitEvent$lambda$5(AndroidComposeView.this);
            }
        };
        this.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            calculateMatrixToWindowApi21 = new CalculateMatrixToWindowApi29();
        } else {
            calculateMatrixToWindowApi21 = new CalculateMatrixToWindowApi21(m3159constructorimpl$default, b9 == true ? 1 : 0);
        }
        this.matrixToWindow = calculateMatrixToWindowApi21;
        setWillNotDraw(false);
        setFocusable(true);
        if (i8 >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        Function1 onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().attach$ui_release(this);
        if (i8 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        this.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private PointerIcon currentIcon = PointerIcon.Companion.getDefault();

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public PointerIcon getIcon() {
                return this.currentIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    pointerIcon = PointerIcon.Companion.getDefault();
                }
                this.currentIcon = pointerIcon;
                if (Build.VERSION.SDK_INT >= 24) {
                    AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(AndroidComposeView.this, pointerIcon);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        if (AbstractC3292y.d(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui_release())) {
            Integer num2 = this.composeAccessibilityDelegate.getIdToBeforeMap$ui_release().get(Integer.valueOf(i8));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        if (AbstractC3292y.d(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal$ui_release()) && (num = this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().get(Integer.valueOf(i8))) != null) {
            accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
        }
    }

    private final boolean autofillSupported() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        LayoutNode parent$ui_release;
        if (!this.wasMeasuredWithMultipleConstraints && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || parent$ui_release.getHasFixedInnerContentConstraints$ui_release())) {
            return false;
        }
        return true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m4395component1VKZWuLQ(long j8) {
        return (int) Q5.C.b(j8 >>> 32);
    }

    /* renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m4396component2VKZWuLQ(long j8) {
        return (int) Q5.C.b(j8 & 4294967295L);
    }

    /* renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m4397convertMeasureSpecI7RO_PI(int i8) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return m4399packZIaKswc(size, size);
                }
                throw new IllegalStateException();
            }
            return m4399packZIaKswc(0, Integer.MAX_VALUE);
        }
        return m4399packZIaKswc(0, size);
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i8, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC3292y.d(declaredMethod.invoke(view, null), Integer.valueOf(i8))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i8, viewGroup.getChildAt(i9));
                    if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                        return findViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        int i8;
        if (Build.VERSION.SDK_INT >= 31) {
            i8 = configuration.fontWeightAdjustment;
            return i8;
        }
        return 0;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners$delegate.getValue();
    }

    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m4398handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        boolean z8;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z9 = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                if (motionEvent2 != null && motionEvent2.getToolType(0) == 3) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                    if (isDevicePressEvent(motionEvent2)) {
                        this.pointerInputEventProcessor.processCancel();
                    } else if (motionEvent2.getActionMasked() != 10 && z8) {
                        sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z9 = false;
                }
                if (!z8 && z9 && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                    sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int m4400sendMotionEvent8iAsVTc = m4400sendMotionEvent8iAsVTc(motionEvent);
                Trace.endSection();
                return m4400sendMotionEvent8iAsVTc;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f8 = -motionEvent.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(f8 * ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()), f8 * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                invalidateLayers(content[i8]);
                i8++;
            } while (i8 < size);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        int i8 = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, layoutNode, false, 2, null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                invalidateLayoutNodeMeasurement(content[i8]);
                i8++;
            } while (i8 < size);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isBadMotionEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = 0
            goto L45
        L44:
            r0 = 1
        L45:
            if (r0 != 0) goto L85
            int r1 = r7.getPointerCount()
            r4 = 1
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            androidx.compose.ui.platform.MotionEventVerifierApi29 r0 = androidx.compose.ui.platform.MotionEventVerifierApi29.INSTANCE
            boolean r0 = r0.isValidMotionEvent(r7, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = 0
            goto L80
        L7f:
            r0 = 1
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.isBadMotionEvent(android.view.MotionEvent):boolean");
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (0.0f <= x8 && x8 <= getWidth() && 0.0f <= y8 && y8 <= getHeight()) {
            return true;
        }
        return false;
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.previousMotionEvent) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    /* renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m4399packZIaKswc(int i8, int i9) {
        return Q5.C.b(Q5.C.b(i9) | Q5.C.b(Q5.C.b(i8) << 32));
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f8 = iArr[0];
            float f9 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = OffsetKt.Offset(f8 - iArr2[0], f9 - iArr2[1]);
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo4420calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m4446invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (layoutNode != null) {
                while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                    layoutNode = layoutNode.getParent$ui_release();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$5(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        AbstractC3292y.f(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.m4400sendMotionEvent8iAsVTc(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m4400sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m4482setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m4045constructorimpl(motionEvent.getMetaState()));
        }
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (convertToPointerInputEvent$ui_release != null) {
            List<PointerInputEventData> pointers = convertToPointerInputEvent$ui_release.getPointers();
            int size = pointers.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i8 = size - 1;
                    pointerInputEventData = pointers.get(size);
                    if (pointerInputEventData.getDown()) {
                        break;
                    }
                    if (i8 < 0) {
                        break;
                    }
                    size = i8;
                }
            }
            pointerInputEventData = null;
            PointerInputEventData pointerInputEventData2 = pointerInputEventData;
            if (pointerInputEventData2 != null) {
                this.lastDownPointerPosition = pointerInputEventData2.m4010getPositionF1C5BW0();
            }
            int m4015processBIzXfog = this.pointerInputEventProcessor.m4015processBIzXfog(convertToPointerInputEvent$ui_release, this, isInBounds(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !ProcessResult.m4071getDispatchedToAPointerInputModifierimpl(m4015processBIzXfog)) {
                this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return m4015processBIzXfog;
            }
            return m4015processBIzXfog;
        }
        this.pointerInputEventProcessor.processCancel();
        return PointerInputEventProcessorKt.ProcessResult(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i8, long j8, boolean z8) {
        int i9;
        int buttonState;
        long downTime;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int i11 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i11 = motionEvent.getActionIndex();
            }
        } else if (i8 != 9 && i8 != 10) {
            i11 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i11 >= 0) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        int i12 = pointerCount - i9;
        if (i12 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            pointerPropertiesArr[i13] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            pointerCoordsArr[i14] = new MotionEvent.PointerCoords();
        }
        for (int i15 = 0; i15 < i12; i15++) {
            if (i11 >= 0 && i15 >= i11) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i16 = i10 + i15;
            motionEvent.getPointerProperties(i16, pointerPropertiesArr[i15]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i15];
            motionEvent.getPointerCoords(i16, pointerCoords);
            long mo4064localToScreenMKHz9U = mo4064localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Offset.m2712getXimpl(mo4064localToScreenMKHz9U);
            pointerCoords.y = Offset.m2713getYimpl(mo4064localToScreenMKHz9U);
        }
        if (z8) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j8;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j8, i8, i12, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(obtain, this);
        AbstractC3292y.f(convertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m4015processBIzXfog(convertToPointerInputEvent$ui_release, this, true);
        obtain.recycle();
    }

    static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i8, long j8, boolean z8, int i9, Object obj) {
        boolean z9;
        if ((i9 & 8) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i8, j8, z9);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver$delegate.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m4401startDrag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j8, Function1 function1) {
        Resources resources = getContext().getResources();
        ComposeDragShadowBuilder composeDragShadowBuilder = new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j8, function1, null);
        if (Build.VERSION.SDK_INT >= 24) {
            return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, dragAndDropTransferData, composeDragShadowBuilder);
        }
        return startDrag(dragAndDropTransferData.getClipData(), composeDragShadowBuilder, dragAndDropTransferData.getLocalState(), dragAndDropTransferData.getFlags());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$3(AndroidComposeView androidComposeView, boolean z8) {
        int m3558getKeyboardaOaMEAU;
        InputModeManagerImpl inputModeManagerImpl = androidComposeView._inputModeManager;
        if (z8) {
            m3558getKeyboardaOaMEAU = InputMode.Companion.m3559getTouchaOaMEAU();
        } else {
            m3558getKeyboardaOaMEAU = InputMode.Companion.m3558getKeyboardaOaMEAU();
        }
        inputModeManagerImpl.m3562setInputModeiuPiT84(m3558getKeyboardaOaMEAU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j8 = this.globalPosition;
        int m5271component1impl = IntOffset.m5271component1impl(j8);
        int m5272component2impl = IntOffset.m5272component2impl(j8);
        int[] iArr = this.tmpPositionArray;
        boolean z8 = false;
        int i8 = iArr[0];
        if (m5271component1impl != i8 || m5272component2impl != iArr[1]) {
            this.globalPosition = IntOffsetKt.IntOffset(i8, iArr[1]);
            if (m5271component1impl != Integer.MAX_VALUE && m5272component2impl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                z8 = true;
            }
        }
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z8);
    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder, final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        ViewCompat.setImportantForAccessibility(androidViewHolder, 1);
        ViewCompat.setAccessibilityDelegate(androidViewHolder, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:            if (r6.intValue() == r5.this$0.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) goto L12;     */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onInitializeAccessibilityNodeInfo(android.view.View r6, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7) {
                /*
                    r5 = this;
                    super.onInitializeAccessibilityNodeInfo(r6, r7)
                    androidx.compose.ui.platform.AndroidComposeView r6 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r6)
                    boolean r6 = r6.isEnabledForAccessibility$ui_release()
                    if (r6 == 0) goto L13
                    r6 = 0
                    r7.setVisibleToUser(r6)
                L13:
                    androidx.compose.ui.node.LayoutNode r6 = r2
                    androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 r0 = androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.INSTANCE
                    androidx.compose.ui.node.LayoutNode r6 = androidx.compose.ui.semantics.SemanticsNodeKt.findClosestParentNode(r6, r0)
                    if (r6 == 0) goto L26
                    int r6 = r6.getSemanticsId()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    goto L27
                L26:
                    r6 = 0
                L27:
                    if (r6 == 0) goto L3d
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.semantics.SemanticsOwner r0 = r0.getSemanticsOwner()
                    androidx.compose.ui.semantics.SemanticsNode r0 = r0.getUnmergedRootSemanticsNode()
                    int r0 = r0.getId()
                    int r1 = r6.intValue()
                    if (r1 != r0) goto L42
                L3d:
                    r6 = -1
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                L42:
                    androidx.compose.ui.platform.AndroidComposeView r0 = r3
                    int r6 = r6.intValue()
                    r7.setParent(r0, r6)
                    androidx.compose.ui.node.LayoutNode r6 = r2
                    int r6 = r6.getSemanticsId()
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r0)
                    java.util.HashMap r0 = r0.getIdToBeforeMap$ui_release()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto L93
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    int r3 = r0.intValue()
                    androidx.compose.ui.platform.AndroidViewsHandler r4 = r1.getAndroidViewsHandler$ui_release()
                    int r0 = r0.intValue()
                    android.view.View r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(r4, r0)
                    if (r0 == 0) goto L81
                    r7.setTraversalBefore(r0)
                    goto L84
                L81:
                    r7.setTraversalBefore(r2, r3)
                L84:
                    android.view.accessibility.AccessibilityNodeInfo r0 = r7.unwrap()
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    java.lang.String r2 = r2.getExtraDataTestTraversalBeforeVal$ui_release()
                    androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r1, r6, r0, r2)
                L93:
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r0)
                    java.util.HashMap r0 = r0.getIdToAfterMap$ui_release()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto Ld5
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    int r3 = r0.intValue()
                    androidx.compose.ui.platform.AndroidViewsHandler r4 = r1.getAndroidViewsHandler$ui_release()
                    int r0 = r0.intValue()
                    android.view.View r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(r4, r0)
                    if (r0 == 0) goto Lc3
                    r7.setTraversalAfter(r0)
                    goto Lc6
                Lc3:
                    r7.setTraversalAfter(r2, r3)
                Lc6:
                    android.view.accessibility.AccessibilityNodeInfo r7 = r7.unwrap()
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    java.lang.String r0 = r0.getExtraDataTestTraversalAfterVal$ui_release()
                    androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r1, r6, r7, r0)
                Ld5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        AndroidAutofill androidAutofill;
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
        }
    }

    public final Object boundsUpdatesEventLoop(U5.d dVar) {
        Object boundsUpdatesEventLoop$ui_release = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui_release(dVar);
        if (boundsUpdatesEventLoop$ui_release == V5.b.e()) {
            return boundsUpdatesEventLoop$ui_release;
        }
        return Q5.I.f8786a;
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo4373calculateLocalPositionMKHz9U(long j8) {
        recalculateWindowPosition();
        return Matrix.m3165mapMKHz9U(this.windowToViewMatrix, j8);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo4374calculatePositionInWindowMKHz9U(long j8) {
        recalculateWindowPosition();
        return Matrix.m3165mapMKHz9U(this.viewToWindowMatrix, j8);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i8) {
        return this.composeAccessibilityDelegate.m4409canScroll0AR0LA0$ui_release(false, i8, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i8) {
        return this.composeAccessibilityDelegate.m4409canScroll0AR0LA0$ui_release(true, i8, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnedLayer createLayer(Function1 function1, Function0 function0) {
        DrawChildContainer viewLayerContainer;
        OwnedLayer pop = this.layerCache.pop();
        if (pop != null) {
            pop.reuseLayer(function1, function0);
            return pop;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, function1, function0);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.Companion;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            if (companion.getShouldUseDispatchDraw()) {
                viewLayerContainer = new DrawChildContainer(getContext());
            } else {
                viewLayerContainer = new ViewLayerContainer(getContext());
            }
            this.viewLayersContainer = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.viewLayersContainer;
        AbstractC3292y.f(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, function1, function0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        androidx.compose.ui.node.e.f(this, false, 1, null);
        Snapshot.Companion.sendApplyNotifications();
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas());
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.dirtyLayers.get(i8).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            AbstractC3292y.f(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return handleRotaryEvent(motionEvent);
            }
            if (!isBadMotionEvent(motionEvent) && isAttachedToWindow()) {
                return ProcessResult.m4071getDispatchedToAPointerInputModifierimpl(m4398handleMotionEvent8iAsVTc(motionEvent));
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.composeAccessibilityDelegate.dispatchHoverEvent$ui_release(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && isInBounds(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.previousMotionEvent;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                this.hoverExitReceived = true;
                post(this.sendHoverExitEvent);
                return false;
            }
        } else if (!isPositionChanged(motionEvent)) {
            return false;
        }
        return ProcessResult.m4071getDispatchedToAPointerInputModifierimpl(m4398handleMotionEvent8iAsVTc(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isFocused()) {
            this._windowInfo.m4482setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m4045constructorimpl(keyEvent.getMetaState()));
            if (!getFocusOwner().mo2646dispatchKeyEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m3860constructorimpl(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if ((isFocused() && getFocusOwner().mo2645dispatchInterceptedSoftKeyboardEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m3860constructorimpl(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            AbstractC3292y.f(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && !hasChangedDevices(motionEvent, motionEvent2)) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent)) {
            return false;
        }
        int m4398handleMotionEvent8iAsVTc = m4398handleMotionEvent8iAsVTc(motionEvent);
        if (ProcessResult.m4070getAnyMovementConsumedimpl(m4398handleMotionEvent8iAsVTc)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.m4071getDispatchedToAPointerInputModifierimpl(m4398handleMotionEvent8iAsVTc);
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        getAndroidViewsHandler$ui_release().drawView(androidViewHolder, canvas);
    }

    public final View findViewByAccessibilityIdTraversal(int i8) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i8));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = findViewByAccessibilityIdRootedAtCurrentView(i8, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z8) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, z8);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        AbstractC3292y.f(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final Function1 getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public U5.g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.Owner
    public DragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo4375getFocusDirectionP8AzH3I(KeyEvent keyEvent) {
        boolean m3568equalsimpl0;
        boolean m3568equalsimpl02;
        boolean m3568equalsimpl03;
        boolean m3568equalsimpl04;
        int m2639getNextdhqQ8s;
        long m3876getKeyZmokQxo = KeyEvent_androidKt.m3876getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3804getTabEK5gGoQ())) {
            if (KeyEvent_androidKt.m3882isShiftPressedZmokQxo(keyEvent)) {
                m2639getNextdhqQ8s = FocusDirection.Companion.m2640getPreviousdhqQ8s();
            } else {
                m2639getNextdhqQ8s = FocusDirection.Companion.m2639getNextdhqQ8s();
            }
            return FocusDirection.m2626boximpl(m2639getNextdhqQ8s);
        }
        if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3645getDirectionRightEK5gGoQ())) {
            return FocusDirection.m2626boximpl(FocusDirection.Companion.m2641getRightdhqQ8s());
        }
        if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3644getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m2626boximpl(FocusDirection.Companion.m2638getLeftdhqQ8s());
        }
        boolean z8 = true;
        if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3646getDirectionUpEK5gGoQ())) {
            m3568equalsimpl0 = true;
        } else {
            m3568equalsimpl0 = Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3757getPageUpEK5gGoQ());
        }
        if (m3568equalsimpl0) {
            return FocusDirection.m2626boximpl(FocusDirection.Companion.m2642getUpdhqQ8s());
        }
        if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3641getDirectionDownEK5gGoQ())) {
            m3568equalsimpl02 = true;
        } else {
            m3568equalsimpl02 = Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3756getPageDownEK5gGoQ());
        }
        if (m3568equalsimpl02) {
            return FocusDirection.m2626boximpl(FocusDirection.Companion.m2635getDowndhqQ8s());
        }
        if (Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3640getDirectionCenterEK5gGoQ())) {
            m3568equalsimpl03 = true;
        } else {
            m3568equalsimpl03 = Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3654getEnterEK5gGoQ());
        }
        if (m3568equalsimpl03) {
            m3568equalsimpl04 = true;
        } else {
            m3568equalsimpl04 = Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3746getNumPadEnterEK5gGoQ());
        }
        if (m3568equalsimpl04) {
            return FocusDirection.m2626boximpl(FocusDirection.Companion.m2636getEnterdhqQ8s());
        }
        if (!Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3583getBackEK5gGoQ())) {
            z8 = Key.m3568equalsimpl0(m3876getKeyZmokQxo, companion.m3657getEscapeEK5gGoQ());
        }
        if (z8) {
            return FocusDirection.m2626boximpl(FocusDirection.Companion.m2637getExitdhqQ8s());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        Q5.I i8;
        androidx.compose.ui.geometry.Rect focusRect = getFocusOwner().getFocusRect();
        if (focusRect != null) {
            rect.left = AbstractC2829a.d(focusRect.getLeft());
            rect.top = AbstractC2829a.d(focusRect.getTop());
            rect.right = AbstractC2829a.d(focusRect.getRight());
            rect.bottom = AbstractC2829a.d(focusRect.getBottom());
            i8 = Q5.I.f8786a;
        } else {
            i8 = null;
        }
        if (i8 == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.ui.node.Owner
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    @Override // androidx.compose.ui.node.Owner
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.ui.node.Owner
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    @Override // androidx.compose.ui.node.RootForTest
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        Lifecycle.State state;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state == Lifecycle.State.RESUMED) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-58bKbWc */
    public void mo4063localToScreen58bKbWc(float[] fArr) {
        recalculateWindowPosition();
        Matrix.m3176timesAssign58bKbWc(fArr, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m4414access$preTranslatecG2Xzmc(fArr, Offset.m2712getXimpl(this.windowPosition), Offset.m2713getYimpl(this.windowPosition), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo4064localToScreenMKHz9U(long j8) {
        recalculateWindowPosition();
        long m3165mapMKHz9U = Matrix.m3165mapMKHz9U(this.viewToWindowMatrix, j8);
        return OffsetKt.Offset(Offset.m2712getXimpl(m3165mapMKHz9U) + Offset.m2712getXimpl(this.windowPosition), Offset.m2713getYimpl(m3165mapMKHz9U) + Offset.m2713getYimpl(this.windowPosition));
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean z8) {
        Function0 function0;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z8) {
                try {
                    function0 = this.resendMotionEventOnLayout;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                function0 = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(function0)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            Q5.I i8 = Q5.I.f8786a;
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo4376measureAndLayout0kLqBqw(LayoutNode layoutNode, long j8) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m4270measureAndLayout0kLqBqw(layoutNode, j8);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            }
            Q5.I i8 = Q5.I.f8786a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        androidx.compose.ui.node.e.f(this, false, 1, null);
    }

    public final void notifyLayerIsDirty$ui_release(OwnedLayer ownedLayer, boolean z8) {
        if (!z8) {
            if (!this.isDrawingContent) {
                this.dirtyLayers.remove(ownedLayer);
                List<OwnedLayer> list = this.postponedDirtyLayers;
                if (list != null) {
                    list.remove(ownedLayer);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(ownedLayer);
            return;
        }
        List list2 = this.postponedDirtyLayers;
        if (list2 == null) {
            list2 = new ArrayList();
            this.postponedDirtyLayers = list2;
        }
        list2.add(ownedLayer);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onAttach(LayoutNode layoutNode) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        int m3558getKeyboardaOaMEAU;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwner2 != null && savedStateRegistryOwner != null && (lifecycleOwner2 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner2 != null) {
                if (savedStateRegistryOwner != null) {
                    if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                        lifecycle.removeObserver(this);
                    }
                    lifecycleOwner2.getLifecycle().addObserver(this);
                    ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
                    set_viewTreeOwners(viewTreeOwners2);
                    Function1 function1 = this.onViewTreeOwnersAvailable;
                    if (function1 != null) {
                        function1.invoke(viewTreeOwners2);
                    }
                    this.onViewTreeOwnersAvailable = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        InputModeManagerImpl inputModeManagerImpl = this._inputModeManager;
        if (isInTouchMode()) {
            m3558getKeyboardaOaMEAU = InputMode.Companion.m3559getTouchaOaMEAU();
        } else {
            m3558getKeyboardaOaMEAU = InputMode.Companion.m3558getKeyboardaOaMEAU();
        }
        inputModeManagerImpl.m3562setInputModeiuPiT84(m3558getKeyboardaOaMEAU);
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        AbstractC3292y.f(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        ViewTreeOwners viewTreeOwners4 = getViewTreeOwners();
        AbstractC3292y.f(viewTreeOwners4);
        viewTreeOwners4.getLifecycleOwner().getLifecycle().addObserver(this.composeAccessibilityDelegate);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this, AbstractC1767d.a(new AndroidComposeViewTranslationCallback()));
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m2592getCurrentSessionimpl(this.textInputSessionMutex);
        if (androidPlatformTextInputSession == null) {
            return this.legacyTextInputServiceAndroid.isEditorFocused();
        }
        return androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.density = AndroidDensity_androidKt.Density(getContext());
        if (getFontWeightAdjustmentCompat(configuration) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m2592getCurrentSessionimpl(this.textInputSessionMutex);
        if (androidPlatformTextInputSession == null) {
            return this.legacyTextInputServiceAndroid.createInputConnection(editorInfo);
        }
        return androidPlatformTextInputSession.createInputConnection(editorInfo);
    }

    @Override // android.view.View
    @RequiresApi(31)
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        this.composeAccessibilityDelegate.onCreateVirtualViewTranslationRequests$ui_release(jArr, iArr, consumer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.b(this, lifecycleOwner);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        Lifecycle lifecycle2;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner2 = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle2.removeObserver(this);
        }
        ViewTreeOwners viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (lifecycleOwner = viewTreeOwners2.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.composeAccessibilityDelegate);
        }
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.isNotEmpty()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i8 = 0; i8 < size; i8++) {
                Function0 function0 = this.endApplyChangesListeners.getContent()[i8];
                this.endApplyChangesListeners.set(i8, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z8, int i8, Rect rect) {
        super.onFocusChanged(z8, i8, rect);
        Log.d(FocusTag, "Owner FocusChanged(" + z8 + ')');
        FocusTransactionManager focusTransactionManager = getFocusOwner().getFocusTransactionManager();
        FocusTransactionManager.access$getCancellationListener$p(focusTransactionManager).add(new AndroidComposeView$onFocusChanged$1(z8, this));
        if (FocusTransactionManager.access$getOngoingTransaction$p(focusTransactionManager)) {
            if (z8) {
                getFocusOwner().takeFocus();
                return;
            } else {
                getFocusOwner().releaseFocus();
                return;
            }
        }
        try {
            FocusTransactionManager.access$beginTransaction(focusTransactionManager);
            if (z8) {
                getFocusOwner().takeFocus();
            } else {
                getFocusOwner().releaseFocus();
            }
            Q5.I i9 = Q5.I.f8786a;
            FocusTransactionManager.access$commitTransaction(focusTransactionManager);
        } catch (Throwable th) {
            FocusTransactionManager.access$commitTransaction(focusTransactionManager);
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i10 - i8, i11 - i9);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui_release(layoutNode);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long m4397convertMeasureSpecI7RO_PI = m4397convertMeasureSpecI7RO_PI(i8);
            int b9 = (int) Q5.C.b(m4397convertMeasureSpecI7RO_PI >>> 32);
            int b10 = (int) Q5.C.b(m4397convertMeasureSpecI7RO_PI & 4294967295L);
            long m4397convertMeasureSpecI7RO_PI2 = m4397convertMeasureSpecI7RO_PI(i9);
            long Constraints = ConstraintsKt.Constraints(b9, b10, (int) Q5.C.b(m4397convertMeasureSpecI7RO_PI2 >>> 32), (int) Q5.C.b(4294967295L & m4397convertMeasureSpecI7RO_PI2));
            Constraints constraints = this.onMeasureConstraints;
            boolean z8 = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m5111boximpl(Constraints);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    z8 = Constraints.m5116equalsimpl0(constraints.m5129unboximpl(), Constraints);
                }
                if (!z8) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m4271updateRootConstraintsBRTryo0(Constraints);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Q5.I i10 = Q5.I.f8786a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.c(this, lifecycleOwner);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i8) {
        AndroidAutofill androidAutofill;
        if (autofillSupported() && viewStructure != null && (androidAutofill = this._autofill) != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode, boolean z8, boolean z9, boolean z10) {
        if (z8) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z9) && z10) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, z9) && z10) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode, boolean z8, boolean z9) {
        if (z8) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z9)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, z9)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        if (this.superclassInitComplete) {
            LayoutDirection access$layoutDirectionFromInt = AndroidComposeView_androidKt.access$layoutDirectionFromInt(i8);
            setLayoutDirection(access$layoutDirectionFromInt);
            getFocusOwner().setLayoutDirection(access$layoutDirectionFromInt);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui_release();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.f(this, lifecycleOwner);
    }

    @Override // android.view.View
    @RequiresApi(31)
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        this.composeAccessibilityDelegate.onVirtualViewTranslationResponses$ui_release(longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(z8);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z8);
        if (z8 && getShowLayoutBounds() != (isShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            setShowLayoutBounds(isShowingLayoutBounds);
            invalidateDescendants();
        }
    }

    public final boolean recycle$ui_release(OwnedLayer ownedLayer) {
        boolean z8;
        if (this.viewLayersContainer != null && !ViewLayer.Companion.getShouldUseDispatchDraw() && Build.VERSION.SDK_INT < 23 && this.layerCache.getSize() >= 10) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            this.layerCache.push(ownedLayer);
        }
        return z8;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(Function0 function0) {
        if (!this.endApplyChangesListeners.contains(function0)) {
            this.endApplyChangesListeners.add(function0);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    public final void removeAndroidView(AndroidViewHolder androidViewHolder) {
        registerOnEndApplyChangesListener(new AndroidComposeView$removeAndroidView$1(this, androidViewHolder));
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo4065screenToLocalMKHz9U(long j8) {
        recalculateWindowPosition();
        return Matrix.m3165mapMKHz9U(this.windowToViewMatrix, OffsetKt.Offset(Offset.m2712getXimpl(j8) - Offset.m2712getXimpl(this.windowPosition), Offset.m2713getYimpl(j8) - Offset.m2713getYimpl(this.windowPosition)));
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo4377sendKeyEventZmokQxo(KeyEvent keyEvent) {
        if (!getFocusOwner().mo2645dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) && !getFocusOwner().mo2646dispatchKeyEventZmokQxo(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void setConfigurationChangeObserver(Function1 function1) {
        this.configurationChangeObserver = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j8) {
        this.lastMatrixRecalculationAnimationTime = j8;
    }

    public final void setOnViewTreeOwnersAvailable(Function1 function1) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.onViewTreeOwnersAvailable = function1;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z8) {
        this.showLayoutBounds = z8;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSessionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object textInputSession(c6.InterfaceC2072n r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            Q5.t.b(r6)
            goto L44
        L31:
            Q5.t.b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.textInputSessionMutex
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r2 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r5 = androidx.compose.ui.SessionMutex.m2595withSessionCancellingPreviousimpl(r6, r2, r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            Q5.h r5 = new Q5.h
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.textInputSession(c6.n, U5.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long m3165mapMKHz9U = Matrix.m3165mapMKHz9U(this.viewToWindowMatrix, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = OffsetKt.Offset(motionEvent.getRawX() - Offset.m2712getXimpl(m3165mapMKHz9U), motionEvent.getRawY() - Offset.m2713getYimpl(m3165mapMKHz9U));
    }
}
