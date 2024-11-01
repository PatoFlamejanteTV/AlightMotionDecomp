package androidx.compose.ui.platform;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import e6.AbstractC2829a;
import i6.InterfaceC2977e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat implements DefaultLifecycleObserver {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final p6.d boundsUpdateChannel;
    private final ArrayMap<Integer, ViewStructureCompat> bufferedContentCaptureAppearedNodes;
    private final ArraySet<Integer> bufferedContentCaptureDisappearedNodes;
    private boolean checkingForSemanticsChanges;
    private boolean contentCaptureForceEnabledForTesting;
    private ContentCaptureSessionCompat contentCaptureSession;
    private Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private AccessibilityNodeInfo currentlyFocusedANI;
    private List<AccessibilityServiceInfo> enabledServices;
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final Handler handler;
    private HashMap<Integer, Integer> idToAfterMap;
    private HashMap<Integer, Integer> idToBeforeMap;
    private SparseArrayCompat<Map<CharSequence, Integer>> labelToActionId;
    private AccessibilityNodeProviderCompat nodeProvider;
    private ArraySet<Integer> paneDisplayed;
    private final HashMap<Integer, ScrollAxisRange> pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final HashMap<Integer, ScrollAxisRange> pendingVerticalScrollEvents;
    private Map<Integer, SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final Function1 scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private TranslateStatus translateStatus;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] AccessibilityActionsResourceIds = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private Function1 onSendAccessibilityEvent = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public static final void addSetProgressAction(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            boolean enabled;
            AccessibilityAction accessibilityAction;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @DoNotInline
        public static final void addPageActions(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            boolean enabled;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProvider {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i8, accessibilityNodeInfo, str, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i8) {
            AccessibilityNodeInfo createNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i8);
            if (AndroidComposeViewAccessibilityDelegateCompat.this.sendingFocusAffectingEvent && i8 == AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId) {
                AndroidComposeViewAccessibilityDelegateCompat.this.currentlyFocusedANI = createNodeInfo;
            }
            return createNodeInfo;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i8) {
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i8, int i9, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i8, i9, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class LtrBoundsComparator implements Comparator<SemanticsNode> {
        public static final LtrBoundsComparator INSTANCE = new LtrBoundsComparator();

        private LtrBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
            Rect boundsInWindow = semanticsNode.getBoundsInWindow();
            Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
            int compare = Float.compare(boundsInWindow.getLeft(), boundsInWindow2.getLeft());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return compare3 != 0 ? compare3 : Float.compare(boundsInWindow.getRight(), boundsInWindow2.getRight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i8, int i9, int i10, int i11, long j8) {
            this.node = semanticsNode;
            this.action = i8;
            this.granularity = i9;
            this.fromIndex = i10;
            this.toIndex = i11;
            this.traverseTime = j8;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class RtlBoundsComparator implements Comparator<SemanticsNode> {
        public static final RtlBoundsComparator INSTANCE = new RtlBoundsComparator();

        private RtlBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
            Rect boundsInWindow = semanticsNode.getBoundsInWindow();
            Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
            int compare = Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return compare3 != 0 ? compare3 : Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class SemanticsNodeCopy {
        private final Set<Integer> children = new LinkedHashSet();
        private final SemanticsNode semanticsNode;
        private final SemanticsConfiguration unmergedConfig;

        public SemanticsNodeCopy(SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
            this.semanticsNode = semanticsNode;
            this.unmergedConfig = semanticsNode.getUnmergedConfig$ui_release();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i8 = 0; i8 < size; i8++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i8);
                if (map.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    this.children.add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        public final Set<Integer> getChildren() {
            return this.children;
        }

        public final SemanticsNode getSemanticsNode() {
            return this.semanticsNode;
        }

        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class TopBottomBoundsComparator implements Comparator<Q5.r> {
        public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

        private TopBottomBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Q5.r rVar, Q5.r rVar2) {
            int compare = Float.compare(((Rect) rVar.c()).getTop(), ((Rect) rVar2.c()).getTop());
            return compare != 0 ? compare : Float.compare(((Rect) rVar.c()).getBottom(), ((Rect) rVar2.c()).getBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(31)
    /* loaded from: classes.dex */
    public static final class ViewTranslationHelperMethodsS {
        public static final ViewTranslationHelperMethodsS INSTANCE = new ViewTranslationHelperMethodsS();

        private ViewTranslationHelperMethodsS() {
        }

        @DoNotInline
        @RequiresApi(31)
        public final void onCreateVirtualViewTranslationRequests(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            SemanticsNode semanticsNode;
            AutofillId autofillId;
            String textForTranslation;
            TranslationRequestValue forText;
            ViewTranslationRequest build;
            for (long j8 : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().get(Integer.valueOf((int) j8));
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    AbstractC1802v.a();
                    autofillId = androidComposeViewAccessibilityDelegateCompat.getView().getAutofillId();
                    ViewTranslationRequest.Builder a9 = AbstractC1800u.a(autofillId, semanticsNode.getId());
                    textForTranslation = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getTextForTranslation(semanticsNode);
                    if (textForTranslation != null) {
                        forText = TranslationRequestValue.forText(new AnnotatedString(textForTranslation, null, null, 6, null));
                        a9.setValue("android:text", forText);
                        build = a9.build();
                        consumer.o(build);
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:            r3 = r3.getValue("android:text");     */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:            r3 = r3.getText();     */
        @androidx.annotation.DoNotInline
        @androidx.annotation.RequiresApi(31)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onVirtualViewTranslationResponses(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r11, android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> r12) {
            /*
                r10 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 31
                if (r0 >= r1) goto L7
                return
            L7:
                R5.O r0 = androidx.core.util.LongSparseArrayKt.keyIterator(r12)
            Lb:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L73
                long r1 = r0.nextLong()
                java.lang.Object r3 = r12.get(r1)
                android.view.translation.ViewTranslationResponse r3 = androidx.compose.ui.platform.AbstractC1787n.a(r3)
                if (r3 == 0) goto Lb
                java.lang.String r4 = "android:text"
                android.view.translation.TranslationResponseValue r3 = androidx.compose.ui.platform.AbstractC1789o.a(r3, r4)
                if (r3 == 0) goto Lb
                java.lang.CharSequence r3 = androidx.compose.ui.platform.AbstractC1791p.a(r3)
                if (r3 == 0) goto Lb
                java.util.Map r4 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$getCurrentSemanticsNodes(r11)
                int r2 = (int) r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                java.lang.Object r1 = r4.get(r1)
                androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r1 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r1
                if (r1 == 0) goto Lb
                androidx.compose.ui.semantics.SemanticsNode r1 = r1.getSemanticsNode()
                if (r1 == 0) goto Lb
                androidx.compose.ui.semantics.SemanticsConfiguration r1 = r1.getUnmergedConfig$ui_release()
                androidx.compose.ui.semantics.SemanticsActions r2 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
                androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.getSetTextSubstitution()
                java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r1, r2)
                androidx.compose.ui.semantics.AccessibilityAction r1 = (androidx.compose.ui.semantics.AccessibilityAction) r1
                if (r1 == 0) goto Lb
                Q5.g r1 = r1.getAction()
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                if (r1 == 0) goto Lb
                androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
                java.lang.String r5 = r3.toString()
                r8 = 6
                r9 = 0
                r6 = 0
                r7 = 0
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                java.lang.Object r1 = r1.invoke(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                goto Lb
            L73:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ViewTranslationHelperMethodsS.onVirtualViewTranslationResponses(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, android.util.LongSparseArray):void");
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.j
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z8) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat.this, z8);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.k
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z8) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat.this, z8);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new AccessibilityNodeProviderCompat(new ComposeAccessibilityNodeProvider());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new HashMap<>();
        this.pendingVerticalScrollEvents = new HashMap<>();
        this.actionIdToLabel = new SparseArrayCompat<>(0, 1, null);
        this.labelToActionId = new SparseArrayCompat<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>(0, 1, null);
        this.boundsUpdateChannel = p6.g.b(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.bufferedContentCaptureAppearedNodes = new ArrayMap<>();
        this.bufferedContentCaptureDisappearedNodes = new ArraySet<>(0, 1, null);
        this.currentSemanticsNodes = R5.Q.h();
        this.paneDisplayed = new ArraySet<>(0, 1, null);
        this.idToBeforeMap = new HashMap<>();
        this.idToAfterMap = new HashMap<>();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = new LinkedHashMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), R5.Q.h());
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
                if (!AndroidComposeViewAccessibilityDelegateCompat.this.getContentCaptureForceEnabledForTesting$ui_release()) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = AndroidComposeViewAccessibilityDelegateCompat.this;
                    androidComposeViewAccessibilityDelegateCompat2.setContentCaptureSession$ui_release(androidComposeViewAccessibilityDelegateCompat2.getContentCaptureSessionCompat(view));
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
                AndroidComposeViewAccessibilityDelegateCompat.this.setContentCaptureSession$ui_release(null);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.l
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$46(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        int i9;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i8));
        if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
            String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
            if (AbstractC3292y.d(str, this.ExtraDataTestTraversalBeforeVal)) {
                Integer num = this.idToBeforeMap.get(Integer.valueOf(i8));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                    return;
                }
                return;
            }
            if (AbstractC3292y.d(str, this.ExtraDataTestTraversalAfterVal)) {
                Integer num2 = this.idToAfterMap.get(Integer.valueOf(i8));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                    return;
                }
                return;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle != null && AbstractC3292y.d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i10 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i11 > 0 && i10 >= 0) {
                    if (iterableTextForAccessibility != null) {
                        i9 = iterableTextForAccessibility.length();
                    } else {
                        i9 = Integer.MAX_VALUE;
                    }
                    if (i10 < i9) {
                        TextLayoutResult textLayoutResult = getTextLayoutResult(semanticsNode.getUnmergedConfig$ui_release());
                        if (textLayoutResult == null) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i12 = 0; i12 < i11; i12++) {
                            int i13 = i10 + i12;
                            if (i13 >= textLayoutResult.getLayoutInput().getText().length()) {
                                arrayList.add(null);
                            } else {
                                arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i13)));
                            }
                        }
                        accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                        return;
                    }
                }
                Log.e(LogTag, "Invalid arguments for accessibility character locations");
                return;
            }
            SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (unmergedConfig$ui_release.contains(semanticsProperties.getTestTag()) && bundle != null && AbstractC3292y.d(str, ExtraDataTestTagKey)) {
                String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getTestTag());
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (AbstractC3292y.d(str, ExtraDataIdKey)) {
                accessibilityNodeInfo.getExtras().putInt(str, semanticsNode.getId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Rect boundsInScreen(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        android.graphics.Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long mo4064localToScreenMKHz9U = this.view.mo4064localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long mo4064localToScreenMKHz9U2 = this.view.mo4064localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        return new android.graphics.Rect((int) Math.floor(Offset.m2712getXimpl(mo4064localToScreenMKHz9U)), (int) Math.floor(Offset.m2713getYimpl(mo4064localToScreenMKHz9U)), (int) Math.ceil(Offset.m2712getXimpl(mo4064localToScreenMKHz9U2)), (int) Math.ceil(Offset.m2713getYimpl(mo4064localToScreenMKHz9U2)));
    }

    private final void bufferContentCaptureViewAppeared(int i8, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        if (this.bufferedContentCaptureDisappearedNodes.contains(Integer.valueOf(i8))) {
            this.bufferedContentCaptureDisappearedNodes.remove(Integer.valueOf(i8));
        } else {
            this.bufferedContentCaptureAppearedNodes.put(Integer.valueOf(i8), viewStructureCompat);
        }
    }

    private final void bufferContentCaptureViewDisappeared(int i8) {
        if (this.bufferedContentCaptureAppearedNodes.containsKey(Integer.valueOf(i8))) {
            this.bufferedContentCaptureAppearedNodes.remove(Integer.valueOf(i8));
        } else {
            this.bufferedContentCaptureDisappearedNodes.add(Integer.valueOf(i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:15:0x003c->B:24:?, LOOP_END, SYNTHETIC] */
    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m4408canScrollmoWRBKg(java.util.Collection<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r0.m2727getUnspecifiedF1C5BW0()
            boolean r0 = androidx.compose.ui.geometry.Offset.m2709equalsimpl0(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lbd
            boolean r0 = androidx.compose.ui.geometry.Offset.m2715isValidimpl(r9)
            if (r0 != 0) goto L15
            goto Lbd
        L15:
            r0 = 1
            if (r7 != r0) goto L1f
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getVerticalScrollAxisRange()
            goto L27
        L1f:
            if (r7 != 0) goto Lb7
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getHorizontalScrollAxisRange()
        L27:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L38
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
            goto Lb6
        L38:
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb6
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r2
            android.graphics.Rect r3 = r2.getAdjustedBounds()
            androidx.compose.ui.geometry.Rect r3 = androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(r3)
            boolean r3 = r3.m2738containsk4lQ0M(r9)
            if (r3 != 0) goto L58
        L56:
            r2 = 0
            goto Lb3
        L58:
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.getSemanticsNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getConfig()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r7)
            androidx.compose.ui.semantics.ScrollAxisRange r2 = (androidx.compose.ui.semantics.ScrollAxisRange) r2
            if (r2 != 0) goto L69
            goto L56
        L69:
            boolean r3 = r2.getReverseScrolling()
            if (r3 == 0) goto L71
            int r3 = -r8
            goto L72
        L71:
            r3 = r8
        L72:
            if (r8 != 0) goto L7b
            boolean r4 = r2.getReverseScrolling()
            if (r4 == 0) goto L7b
            r3 = -1
        L7b:
            if (r3 >= 0) goto L92
            kotlin.jvm.functions.Function0 r2 = r2.getValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L56
        L90:
            r2 = 1
            goto Lb3
        L92:
            kotlin.jvm.functions.Function0 r3 = r2.getValue()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            kotlin.jvm.functions.Function0 r2 = r2.getMaxValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L56
            goto L90
        Lb3:
            if (r2 == 0) goto L3c
            r1 = 1
        Lb6:
            return r1
        Lb7:
            Q5.p r6 = new Q5.p
            r6.<init>()
            throw r6
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m4408canScrollmoWRBKg(java.util.Collection, boolean, int, long):boolean");
    }

    private final void checkForSemanticsChanges() {
        if (isEnabledForAccessibility$ui_release()) {
            sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        }
        if (isEnabledForContentCapture()) {
            sendContentCaptureSemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        }
        sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
        updateSemanticsNodesCopyAndPanes();
    }

    private final boolean clearAccessibilityFocus(int i8) {
        if (isAccessibilityFocused(i8)) {
            this.focusedVirtualViewId = Integer.MIN_VALUE;
            this.currentlyFocusedANI = null;
            this.view.invalidate();
            sendEventForVirtualView$default(this, i8, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function0 function0;
        Iterator<SemanticsNodeWithAdjustedBounds> it = getCurrentSemanticsNodes().values().iterator();
        while (it.hasNext()) {
            SemanticsConfiguration unmergedConfig$ui_release = it.next().getSemanticsNode().getUnmergedConfig$ui_release();
            if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (function0 = (Function0) accessibilityAction.getAction()) != null) {
            }
        }
    }

    @VisibleForTesting
    private final AccessibilityEvent createEvent(int i8, int i9) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i9);
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, i8);
        if (isEnabledForAccessibility$ui_release() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i8))) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        }
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfo createNodeInfo(int i8) {
        Lifecycle.State state;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        Integer num = null;
        View view = null;
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i8));
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        int i9 = -1;
        if (i8 == -1) {
            ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(this.view);
            if (parentForAccessibility instanceof View) {
                view = (View) parentForAccessibility;
            }
            obtain.setParent(view);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            if (parent != null) {
                num = Integer.valueOf(parent.getId());
            }
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                    i9 = intValue;
                }
                obtain.setParent(this.view, i9);
            } else {
                throw new IllegalStateException(("semanticsNode " + i8 + " has null parent").toString());
            }
        }
        obtain.setSource(this.view, i8);
        obtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(i8, obtain, semanticsNode);
        return obtain.unwrap();
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i8, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent = createEvent(i8, 8192);
        if (num != null) {
            createEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent.getText().add(charSequence);
        }
        return createEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z8) {
        List<AccessibilityServiceInfo> m8;
        if (z8) {
            m8 = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } else {
            m8 = AbstractC1435t.m();
        }
        androidComposeViewAccessibilityDelegateCompat.enabledServices = m8;
    }

    private final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, Map<Integer, List<SemanticsNode>> map) {
        boolean z8;
        if (semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean booleanValue = ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1.INSTANCE)).booleanValue();
        if ((booleanValue || isScreenReaderFocusable(semanticsNode)) && getCurrentSemanticsNodes().keySet().contains(Integer.valueOf(semanticsNode.getId()))) {
            arrayList.add(semanticsNode);
        }
        if (booleanValue) {
            map.put(Integer.valueOf(semanticsNode.getId()), subtreeSortedByGeometryGrouping(z8, AbstractC1435t.Z0(semanticsNode.getChildren())));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i8 = 0; i8 < size; i8++) {
            geometryDepthFirstSearch(children.get(i8), arrayList, map);
        }
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) {
            return TextRange.m4664getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m4673unboximpl());
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) {
            return TextRange.m4669getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m4673unboximpl());
        }
        return this.accessibilityCursorPosition;
    }

    @VisibleForTesting
    public static /* synthetic */ void getContentCaptureForceEnabledForTesting$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getContentCaptureSession$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        Map<Integer, SemanticsNodeWithAdjustedBounds> allUncoveredSemanticsNodesToMap;
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            allUncoveredSemanticsNodesToMap = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodes = allUncoveredSemanticsNodesToMap;
            if (isEnabledForAccessibility$ui_release()) {
                setTraversalValues();
            }
        }
        return this.currentSemanticsNodes;
    }

    @VisibleForTesting
    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    private final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        boolean z8;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        boolean z9 = true;
        boolean z10 = false;
        if (toggleableState != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (((Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected())) != null) {
            int m4506getTabo7Vup1c = Role.Companion.m4506getTabo7Vup1c();
            if (role != null) {
                z10 = Role.m4496equalsimpl0(role.m4499unboximpl(), m4506getTabo7Vup1c);
            }
            if (z10) {
                z9 = z8;
            }
            return z9;
        }
        return z8;
    }

    private final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode) {
        boolean z8;
        float current;
        boolean z9;
        boolean z10;
        int i8;
        boolean m4496equalsimpl0;
        boolean m4496equalsimpl02;
        boolean m4496equalsimpl03;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        if (toggleableState != null) {
            int i9 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3 && orNull == null) {
                        orNull = this.view.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else {
                    int m4505getSwitcho7Vup1c = Role.Companion.m4505getSwitcho7Vup1c();
                    if (role == null) {
                        m4496equalsimpl03 = false;
                    } else {
                        m4496equalsimpl03 = Role.m4496equalsimpl0(role.m4499unboximpl(), m4505getSwitcho7Vup1c);
                    }
                    if (m4496equalsimpl03 && orNull == null) {
                        orNull = this.view.getContext().getResources().getString(R.string.off);
                    }
                }
            } else {
                int m4505getSwitcho7Vup1c2 = Role.Companion.m4505getSwitcho7Vup1c();
                if (role == null) {
                    m4496equalsimpl02 = false;
                } else {
                    m4496equalsimpl02 = Role.m4496equalsimpl0(role.m4499unboximpl(), m4505getSwitcho7Vup1c2);
                }
                if (m4496equalsimpl02 && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.on);
                }
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int m4506getTabo7Vup1c = Role.Companion.m4506getTabo7Vup1c();
            if (role == null) {
                m4496equalsimpl0 = false;
            } else {
                m4496equalsimpl0 = Role.m4496equalsimpl0(role.m4499unboximpl(), m4506getTabo7Vup1c);
            }
            if (!m4496equalsimpl0 && orNull == null) {
                if (booleanValue) {
                    orNull = this.view.getContext().getResources().getString(R.string.selected);
                } else {
                    orNull = this.view.getContext().getResources().getString(R.string.not_selected);
                }
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if (orNull == null) {
                    InterfaceC2977e range = progressBarRangeInfo.getRange();
                    if (((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue() == 0.0f) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        current = 0.0f;
                    } else {
                        current = (progressBarRangeInfo.getCurrent() - ((Number) range.getStart()).floatValue()) / (((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue());
                    }
                    float j8 = i6.m.j(current, 0.0f, 1.0f);
                    if (j8 == 0.0f) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    } else {
                        if (j8 == 1.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i8 = 100;
                        if (!z10) {
                            i8 = i6.m.k(AbstractC2829a.d(j8 * 100), 1, 99);
                        }
                    }
                    orNull = this.view.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(i8));
                }
            } else if (orNull == null) {
                orNull = this.view.getContext().getResources().getString(R.string.in_progress);
            }
        }
        return (String) orNull;
    }

    private final SpannableString getInfoText(SemanticsNode semanticsNode) {
        SpannableString spannableString;
        AnnotatedString annotatedString;
        FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
        SpannableString spannableString2 = null;
        if (textForTextField != null) {
            spannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) trimToSize(spannableString, 100000);
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list != null && (annotatedString = (AnnotatedString) AbstractC1435t.o0(list)) != null) {
            spannableString2 = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache);
        }
        SpannableString spannableString4 = (SpannableString) trimToSize(spannableString2, 100000);
        if (spannableString3 == null) {
            return spannableString4;
        }
        return spannableString3;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText())) {
            AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
            if (textForTextField == null) {
                return null;
            }
            return textForTextField.getText();
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) AbstractC1435t.o0(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i8) {
        String iterableTextForAccessibility;
        TextLayoutResult textLayoutResult;
        if (semanticsNode == null || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 4) {
                    if (i8 != 8) {
                        if (i8 != 16) {
                            return null;
                        }
                    } else {
                        AccessibilityIterators.ParagraphTextSegmentIterator companion = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                        companion.initialize(iterableTextForAccessibility);
                        return companion;
                    }
                }
                if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = getTextLayoutResult(semanticsNode.getUnmergedConfig$ui_release())) == null) {
                    return null;
                }
                if (i8 == 4) {
                    AccessibilityIterators.LineTextSegmentIterator companion2 = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
                    companion2.initialize(iterableTextForAccessibility, textLayoutResult);
                    return companion2;
                }
                AccessibilityIterators.PageTextSegmentIterator companion3 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
                companion3.initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
                return companion3;
            }
            AccessibilityIterators.WordTextSegmentIterator companion4 = AccessibilityIterators.WordTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion4.initialize(iterableTextForAccessibility);
            return companion4;
        }
        AccessibilityIterators.CharacterTextSegmentIterator companion5 = AccessibilityIterators.CharacterTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
        companion5.initialize(iterableTextForAccessibility);
        return companion5;
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final TextLayoutResult getTextLayoutResult(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.getAction()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Iterator<SemanticsNodeWithAdjustedBounds> it = getCurrentSemanticsNodes().values().iterator();
        while (it.hasNext()) {
            SemanticsConfiguration unmergedConfig$ui_release = it.next().getSemanticsNode().getUnmergedConfig$ui_release();
            if (AbstractC3292y.d(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
            }
        }
    }

    private final void initContentCapture(boolean z8) {
        if (z8) {
            updateContentCaptureBuffersOnAppeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        } else {
            updateContentCaptureBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        }
        notifyContentCaptureChanges();
    }

    private final boolean isAccessibilityFocused(int i8) {
        if (this.focusedVirtualViewId == i8) {
            return true;
        }
        return false;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getEditableText())) {
            return true;
        }
        return false;
    }

    private final boolean isEnabled() {
        if (!isEnabledForAccessibility$ui_release() && !isEnabledForContentCapture()) {
            return false;
        }
        return true;
    }

    private final boolean isEnabledForContentCapture() {
        if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.getDisableContentCapture() && (this.contentCaptureSession != null || this.contentCaptureForceEnabledForTesting)) {
            return true;
        }
        return false;
    }

    private static /* synthetic */ void isEnabledForContentCapture$annotations() {
    }

    private final boolean isScreenReaderFocusable(SemanticsNode semanticsNode) {
        String infoContentDescriptionOrNull;
        boolean z8;
        infoContentDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(semanticsNode);
        if (infoContentDescriptionOrNull == null && getInfoText(semanticsNode) == null && getInfoStateDescriptionOrNull(semanticsNode) == null && !getInfoIsCheckable(semanticsNode)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
            return true;
        }
        if (semanticsNode.isUnmergedLeafNode$ui_release() && z8) {
            return true;
        }
        return false;
    }

    private final boolean isTouchExplorationEnabled() {
        if (!this.accessibilityForceEnabledForTesting && (!this.accessibilityManager.isEnabled() || !this.accessibilityManager.isTouchExplorationEnabled())) {
            return false;
        }
        return true;
    }

    private final void notifyContentCaptureChanges() {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (!this.bufferedContentCaptureAppearedNodes.isEmpty()) {
            List W02 = AbstractC1435t.W0(this.bufferedContentCaptureAppearedNodes.values());
            ArrayList arrayList = new ArrayList(W02.size());
            int size = W02.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(((ViewStructureCompat) W02.get(i8)).toViewStructure());
            }
            contentCaptureSessionCompat.notifyViewsAppeared(arrayList);
            this.bufferedContentCaptureAppearedNodes.clear();
        }
        if (!this.bufferedContentCaptureDisappearedNodes.isEmpty()) {
            List W03 = AbstractC1435t.W0(this.bufferedContentCaptureDisappearedNodes);
            ArrayList arrayList2 = new ArrayList(W03.size());
            int size2 = W03.size();
            for (int i9 = 0; i9 < size2; i9++) {
                arrayList2.add(Long.valueOf(((Number) W03.get(i9)).intValue()));
            }
            contentCaptureSessionCompat.notifyViewsDisappeared(AbstractC1435t.X0(arrayList2));
            this.bufferedContentCaptureDisappearedNodes.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.x(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01ab -> B:86:0x01ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performActionHelper(int r17, int r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f8) {
        if ((f8 < 0.0f && ((Number) scrollAxisRange.getValue().invoke()).floatValue() > 0.0f) || (f8 > 0.0f && ((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue())) {
            return true;
        }
        return false;
    }

    private static final float performActionHelper$scrollDelta(float f8, float f9) {
        if (Math.signum(f8) == Math.signum(f9)) {
            if (Math.abs(f8) >= Math.abs(f9)) {
                return f9;
            }
            return f8;
        }
        return 0.0f;
    }

    private final void populateAccessibilityNodeInfoProperties(int i8, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
        boolean isImportantForAccessibility;
        String infoContentDescriptionOrNull;
        boolean enabled;
        boolean isVisible;
        boolean enabled2;
        boolean enabled3;
        boolean enabled4;
        boolean enabled5;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        boolean enabled6;
        boolean excludeLineAndPageGranularities;
        boolean enabled7;
        boolean enabled8;
        boolean z8;
        String m4412toLegacyClassNameV4PA4sw;
        accessibilityNodeInfoCompat.setClassName(ClassName);
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        if (role != null) {
            role.m4499unboximpl();
            if (semanticsNode.isFake$ui_release() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                Role.Companion companion = Role.Companion;
                if (Role.m4496equalsimpl0(role.m4499unboximpl(), companion.m4506getTabo7Vup1c())) {
                    accessibilityNodeInfoCompat.setRoleDescription(this.view.getContext().getResources().getString(R.string.tab));
                } else if (!Role.m4496equalsimpl0(role.m4499unboximpl(), companion.m4505getSwitcho7Vup1c())) {
                    m4412toLegacyClassNameV4PA4sw = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m4412toLegacyClassNameV4PA4sw(role.m4499unboximpl());
                    if (!Role.m4496equalsimpl0(role.m4499unboximpl(), companion.m4503getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui_release() || semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                        accessibilityNodeInfoCompat.setClassName(m4412toLegacyClassNameV4PA4sw);
                    }
                } else {
                    accessibilityNodeInfoCompat.setRoleDescription(this.view.getContext().getResources().getString(R.string.switch_role));
                }
            }
            Q5.I i9 = Q5.I.f8786a;
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText())) {
            accessibilityNodeInfoCompat.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getConfig().contains(semanticsProperties.getText())) {
            accessibilityNodeInfoCompat.setClassName(TextClassName);
        }
        accessibilityNodeInfoCompat.setPackageName(this.view.getContext().getPackageName());
        isImportantForAccessibility = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isImportantForAccessibility(semanticsNode);
        accessibilityNodeInfoCompat.setImportantForAccessibility(isImportantForAccessibility);
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i10);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode$ui_release());
                if (androidViewHolder != null) {
                    accessibilityNodeInfoCompat.addChild(androidViewHolder);
                } else {
                    accessibilityNodeInfoCompat.addChild(this.view, semanticsNode2.getId());
                }
            }
        }
        if (i8 == this.focusedVirtualViewId) {
            accessibilityNodeInfoCompat.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            accessibilityNodeInfoCompat.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode, accessibilityNodeInfoCompat);
        setContentInvalid(semanticsNode, accessibilityNodeInfoCompat);
        setStateDescription(semanticsNode, accessibilityNodeInfoCompat);
        setIsCheckable(semanticsNode, accessibilityNodeInfoCompat);
        SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release2, semanticsProperties2.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                accessibilityNodeInfoCompat.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                accessibilityNodeInfoCompat.setChecked(false);
            }
            Q5.I i11 = Q5.I.f8786a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m4496equalsimpl0(role.m4499unboximpl(), Role.Companion.m4506getTabo7Vup1c())) {
                accessibilityNodeInfoCompat.setSelected(booleanValue);
            } else {
                accessibilityNodeInfoCompat.setChecked(booleanValue);
            }
            Q5.I i12 = Q5.I.f8786a;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            infoContentDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(semanticsNode);
            accessibilityNodeInfoCompat.setContentDescription(infoContentDescriptionOrNull);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getTestTag());
        if (str != null) {
            SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    z8 = false;
                    break;
                }
                SemanticsConfiguration unmergedConfig$ui_release3 = semanticsNode3.getUnmergedConfig$ui_release();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig$ui_release3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    z8 = ((Boolean) semanticsNode3.getUnmergedConfig$ui_release().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue();
                    break;
                }
                semanticsNode3 = semanticsNode3.getParent();
            }
            if (z8) {
                accessibilityNodeInfoCompat.setViewIdResourceName(str);
            }
        }
        SemanticsConfiguration unmergedConfig$ui_release4 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((Q5.I) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release4, semanticsProperties3.getHeading())) != null) {
            accessibilityNodeInfoCompat.setHeading(true);
            Q5.I i13 = Q5.I.f8786a;
        }
        accessibilityNodeInfoCompat.setPassword(semanticsNode.getConfig().contains(semanticsProperties3.getPassword()));
        SemanticsConfiguration unmergedConfig$ui_release5 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        accessibilityNodeInfoCompat.setEditable(unmergedConfig$ui_release5.contains(semanticsActions.getSetText()));
        enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        accessibilityNodeInfoCompat.setEnabled(enabled);
        accessibilityNodeInfoCompat.setFocusable(semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getFocused()));
        if (accessibilityNodeInfoCompat.isFocusable()) {
            accessibilityNodeInfoCompat.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties3.getFocused())).booleanValue());
            if (accessibilityNodeInfoCompat.isFocused()) {
                accessibilityNodeInfoCompat.addAction(2);
            } else {
                accessibilityNodeInfoCompat.addAction(1);
            }
        }
        isVisible = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(semanticsNode);
        accessibilityNodeInfoCompat.setVisibleToUser(isVisible);
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int m4490unboximpl = liveRegionMode.m4490unboximpl();
            LiveRegionMode.Companion companion2 = LiveRegionMode.Companion;
            accessibilityNodeInfoCompat.setLiveRegion((LiveRegionMode.m4487equalsimpl0(m4490unboximpl, companion2.m4492getPolite0phEisY()) || !LiveRegionMode.m4487equalsimpl0(m4490unboximpl, companion2.m4491getAssertive0phEisY())) ? 1 : 2);
            Q5.I i14 = Q5.I.f8786a;
        }
        accessibilityNodeInfoCompat.setClickable(false);
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean d8 = AbstractC3292y.d(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getSelected()), Boolean.TRUE);
            accessibilityNodeInfoCompat.setClickable(!d8);
            enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled8 && !d8) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            Q5.I i15 = Q5.I.f8786a;
        }
        accessibilityNodeInfoCompat.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            accessibilityNodeInfoCompat.setLongClickable(true);
            enabled7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled7) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            Q5.I i16 = Q5.I.f8786a;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            Q5.I i17 = Q5.I.f8786a;
        }
        enabled2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled2) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                Q5.I i18 = Q5.I.f8786a;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnImeAction());
            if (accessibilityAction5 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                Q5.I i19 = Q5.I.f8786a;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCutText());
            if (accessibilityAction6 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                Q5.I i20 = Q5.I.f8786a;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPasteText());
            if (accessibilityAction7 != null) {
                if (accessibilityNodeInfoCompat.isFocused() && this.view.getClipboardManager().hasText()) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                Q5.I i21 = Q5.I.f8786a;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (!(iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0)) {
            accessibilityNodeInfoCompat.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetSelection());
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            accessibilityNodeInfoCompat.addAction(256);
            accessibilityNodeInfoCompat.addAction(512);
            accessibilityNodeInfoCompat.setMovementGranularities(11);
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getContentDescription());
            if ((list == null || list.isEmpty()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                excludeLineAndPageGranularities = AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode);
                if (!excludeLineAndPageGranularities) {
                    accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat.getMovementGranularities() | 20);
                }
            }
        }
        int i22 = Build.VERSION.SDK_INT;
        if (i22 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ExtraDataIdKey);
            CharSequence text = accessibilityNodeInfoCompat.getText();
            if (!(text == null || text.length() == 0) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            AccessibilityNodeInfoVerificationHelperMethods.INSTANCE.setAvailableExtraData(accessibilityNodeInfoCompat.unwrap(), arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                accessibilityNodeInfoCompat.setClassName("android.widget.SeekBar");
            } else {
                accessibilityNodeInfoCompat.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, ((Number) progressBarRangeInfo.getRange().getStart()).floatValue(), ((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                enabled6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (enabled6) {
                    if (progressBarRangeInfo.getCurrent() < i6.m.c(((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue(), ((Number) progressBarRangeInfo.getRange().getStart()).floatValue())) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    if (progressBarRangeInfo.getCurrent() > i6.m.f(((Number) progressBarRangeInfo.getRange().getStart()).floatValue(), ((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue())) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        if (i22 >= 24) {
            Api24Impl.addSetProgressAction(accessibilityNodeInfoCompat, semanticsNode);
        }
        CollectionInfo_androidKt.setCollectionInfo(semanticsNode, accessibilityNodeInfoCompat);
        CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode, accessibilityNodeInfoCompat);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat.setClassName("android.widget.HorizontalScrollView");
            }
            if (((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            enabled5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled5) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    if (!(semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl)) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    accessibilityNodeInfoCompat.addAction(accessibilityActionCompat2);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    if (!(semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl)) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    accessibilityNodeInfoCompat.addAction(accessibilityActionCompat);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat.setClassName("android.widget.ScrollView");
            }
            if (((Number) scrollAxisRange2.getMaxValue().invoke()).floatValue() > 0.0f) {
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            enabled4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled4) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (i22 >= 29) {
            Api29Impl.addPageActions(accessibilityNodeInfoCompat, semanticsNode);
        }
        accessibilityNodeInfoCompat.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getPaneTitle()));
        enabled3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled3) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getExpand());
            if (accessibilityAction10 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                Q5.I i23 = Q5.I.f8786a;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCollapse());
            if (accessibilityAction11 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                Q5.I i24 = Q5.I.f8786a;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getDismiss());
            if (accessibilityAction12 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                Q5.I i25 = Q5.I.f8786a;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getCustomActions())) {
                List list2 = (List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getCustomActions());
                int size2 = list2.size();
                int[] iArr = AccessibilityActionsResourceIds;
                if (size2 < iArr.length) {
                    SparseArrayCompat<CharSequence> sparseArrayCompat = new SparseArrayCompat<>(0, 1, null);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.labelToActionId.containsKey(i8)) {
                        Map<CharSequence, Integer> map = this.labelToActionId.get(i8);
                        List X02 = AbstractC1428l.X0(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list2.size();
                        for (int i26 = 0; i26 < size3; i26++) {
                            CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list2.get(i26);
                            AbstractC3292y.f(map);
                            if (map.containsKey(customAccessibilityAction.getLabel())) {
                                Integer num = map.get(customAccessibilityAction.getLabel());
                                AbstractC3292y.f(num);
                                sparseArrayCompat.put(num.intValue(), customAccessibilityAction.getLabel());
                                linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                                X02.remove(num);
                                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), customAccessibilityAction.getLabel()));
                            } else {
                                arrayList2.add(customAccessibilityAction);
                            }
                        }
                        int size4 = arrayList2.size();
                        for (int i27 = 0; i27 < size4; i27++) {
                            CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i27);
                            int intValue = ((Number) X02.get(i27)).intValue();
                            sparseArrayCompat.put(intValue, customAccessibilityAction2.getLabel());
                            linkedHashMap.put(customAccessibilityAction2.getLabel(), Integer.valueOf(intValue));
                            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(intValue, customAccessibilityAction2.getLabel()));
                        }
                    } else {
                        int size5 = list2.size();
                        for (int i28 = 0; i28 < size5; i28++) {
                            CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list2.get(i28);
                            int i29 = AccessibilityActionsResourceIds[i28];
                            sparseArrayCompat.put(i29, customAccessibilityAction3.getLabel());
                            linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(i29));
                            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i29, customAccessibilityAction3.getLabel()));
                        }
                    }
                    this.actionIdToLabel.put(i8, sparseArrayCompat);
                    this.labelToActionId.put(i8, linkedHashMap);
                } else {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
            }
        }
        accessibilityNodeInfoCompat.setScreenReaderFocusable(isScreenReaderFocusable(semanticsNode));
        Integer num2 = this.idToBeforeMap.get(Integer.valueOf(i8));
        if (num2 != null) {
            View semanticsIdToView = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (semanticsIdToView != null) {
                accessibilityNodeInfoCompat.setTraversalBefore(semanticsIdToView);
            } else {
                accessibilityNodeInfoCompat.setTraversalBefore(this.view, num2.intValue());
            }
            addExtraDataToAccessibilityNodeInfoHelper(i8, accessibilityNodeInfoCompat.unwrap(), this.ExtraDataTestTraversalBeforeVal, null);
            Q5.I i30 = Q5.I.f8786a;
        }
        Integer num3 = this.idToAfterMap.get(Integer.valueOf(i8));
        if (num3 != null) {
            View semanticsIdToView2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (semanticsIdToView2 != null) {
                accessibilityNodeInfoCompat.setTraversalAfter(semanticsIdToView2);
                addExtraDataToAccessibilityNodeInfoHelper(i8, accessibilityNodeInfoCompat.unwrap(), this.ExtraDataTestTraversalAfterVal, null);
            }
            Q5.I i31 = Q5.I.f8786a;
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if ((((Number) scrollAxisRange.getValue().invoke()).floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() && scrollAxisRange.getReverseScrolling())) {
            return true;
        }
        return false;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if ((((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() && !scrollAxisRange.getReverseScrolling()) || (((Number) scrollAxisRange.getValue().invoke()).floatValue() > 0.0f && scrollAxisRange.getReverseScrolling())) {
            return true;
        }
        return false;
    }

    private final boolean registerScrollingId(int i8, List<ScrollObservationScope> list) {
        ScrollObservationScope findById;
        boolean z8;
        findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(list, i8);
        if (findById != null) {
            z8 = false;
        } else {
            findById = new ScrollObservationScope(i8, this.scrollObservationScopes, null, null, null, null);
            z8 = true;
        }
        this.scrollObservationScopes.add(findById);
        return z8;
    }

    private final boolean requestAccessibilityFocus(int i8) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i8)) {
            return false;
        }
        int i9 = this.focusedVirtualViewId;
        if (i9 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i9, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = i8;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i8, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(ScrollObservationScope scrollObservationScope) {
        if (!scrollObservationScope.isValidOwnerScope()) {
            return;
        }
        this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(scrollObservationScope, this));
    }

    private final Comparator<SemanticsNode> semanticComparator(boolean z8) {
        Comparator comparator;
        if (z8) {
            comparator = RtlBoundsComparator.INSTANCE;
        } else {
            comparator = LtrBoundsComparator.INSTANCE;
        }
        return new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(comparator, LayoutNode.Companion.getZComparator$ui_release()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$46(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        androidx.compose.ui.node.e.f(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
        androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
        androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i8) {
        if (i8 == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i8;
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i8 = 0; i8 < size; i8++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i8);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                if (!semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.getId()));
            }
        }
        Iterator<Integer> it = semanticsNodeCopy.getChildren().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                return;
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i9);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                AbstractC3292y.f(semanticsNodeCopy2);
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    private final void sendContentCaptureSemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i8 = 0; i8 < size; i8++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i8);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId())) && !semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                updateContentCaptureBuffersOnAppeared(semanticsNode2);
            }
        }
        for (Map.Entry<Integer, SemanticsNodeCopy> entry : this.previousSemanticsNodes.entrySet()) {
            if (!getCurrentSemanticsNodes().containsKey(entry.getKey())) {
                bufferContentCaptureViewDisappeared(entry.getKey().intValue());
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i9);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId())) && this.previousSemanticsNodes.containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                AbstractC3292y.f(semanticsNodeCopy2);
                sendContentCaptureSemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int i8, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        AutofillId newAutofillId = contentCaptureSessionCompat.newAutofillId(i8);
        if (newAutofillId != null) {
            contentCaptureSessionCompat.notifyViewTextChanged(newAutofillId, str);
            return;
        }
        throw new IllegalStateException("Invalid content capture ID".toString());
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabledForAccessibility$ui_release()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return ((Boolean) this.onSendAccessibilityEvent.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean sendEventForVirtualView(int i8, int i9, Integer num, List<String> list) {
        if (i8 != Integer.MIN_VALUE && isEnabled()) {
            AccessibilityEvent createEvent = createEvent(i8, i9);
            if (num != null) {
                createEvent.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                createEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
            }
            return sendEvent(createEvent);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i8, int i9, Integer num, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i8, i9, num, list);
    }

    private final void sendPaneChangeEvents(int i8, int i9, String str) {
        AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i8), 32);
        createEvent.setContentChangeTypes(i9);
        if (str != null) {
            createEvent.getText().add(str);
        }
        sendEvent(createEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i8) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i8 != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                createEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent.setAction(pendingTextTraversedEvent.getAction());
                createEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x05b6, code lost:            if (r0.containsAll(r2) != false) goto L178;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x05b9, code lost:            r17 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x05fc, code lost:            if (r0 == false) goto L179;     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x040e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendSemanticsPropertyChangeEvents(java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r28) {
        /*
            Method dump skipped, instructions count: 1589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents(java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:            r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendSubtreeChangeAccessibilityEvents(androidx.compose.ui.node.LayoutNode r8, androidx.collection.ArraySet<java.lang.Integer> r9) {
        /*
            r7 = this;
            boolean r0 = r8.isAttached()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.view
            androidx.compose.ui.platform.AndroidViewsHandler r0 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L18
            return
        L18:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r0 = r7.subtreeChangedLayoutNodes
            int r0 = r0.size()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L33
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r2 = r7.subtreeChangedLayoutNodes
            java.lang.Object r2 = r2.valueAt(r1)
            androidx.compose.ui.node.LayoutNode r2 = (androidx.compose.ui.node.LayoutNode) r2
            boolean r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isAncestorOf(r2, r8)
            if (r2 == 0) goto L30
            return
        L30:
            int r1 = r1 + 1
            goto L1f
        L33:
            androidx.compose.ui.node.NodeChain r0 = r8.getNodes$ui_release()
            r1 = 8
            int r1 = androidx.compose.ui.node.NodeKind.m4320constructorimpl(r1)
            boolean r0 = r0.m4277hasH91voCI$ui_release(r1)
            if (r0 == 0) goto L44
            goto L4a
        L44:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.INSTANCE
            androidx.compose.ui.node.LayoutNode r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r8, r0)
        L4a:
            if (r8 == 0) goto L84
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r8.getCollapsedSemantics$ui_release()
            if (r0 != 0) goto L53
            goto L84
        L53:
            boolean r0 = r0.isMergingSemanticsOfDescendants()
            if (r0 != 0) goto L62
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r8, r0)
            if (r0 == 0) goto L62
            r8 = r0
        L62:
            int r8 = r8.getSemanticsId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.add(r0)
            if (r9 != 0) goto L71
            return
        L71:
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r8)
            r8 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r7
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents(androidx.compose.ui.node.LayoutNode, androidx.collection.ArraySet):void");
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (!layoutNode.isAttached() || this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            return;
        }
        int semanticsId = layoutNode.getSemanticsId();
        ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(Integer.valueOf(semanticsId));
        ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(Integer.valueOf(semanticsId));
        if (scrollAxisRange == null && scrollAxisRange2 == null) {
            return;
        }
        AccessibilityEvent createEvent = createEvent(semanticsId, 4096);
        if (scrollAxisRange != null) {
            createEvent.setScrollX((int) ((Number) scrollAxisRange.getValue().invoke()).floatValue());
            createEvent.setMaxScrollX((int) ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue());
        }
        if (scrollAxisRange2 != null) {
            createEvent.setScrollY((int) ((Number) scrollAxisRange2.getValue().invoke()).floatValue());
            createEvent.setMaxScrollY((int) ((Number) scrollAxisRange2.getMaxValue().invoke()).floatValue());
        }
        sendEvent(createEvent);
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i8, int i9, boolean z8) {
        String iterableTextForAccessibility;
        Integer num;
        Integer num2;
        boolean enabled;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        boolean z9 = false;
        if (unmergedConfig$ui_release.contains(semanticsActions.getSetSelection())) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                InterfaceC2073o interfaceC2073o = (InterfaceC2073o) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getSetSelection())).getAction();
                if (interfaceC2073o == null) {
                    return false;
                }
                return ((Boolean) interfaceC2073o.invoke(Integer.valueOf(i8), Integer.valueOf(i9), Boolean.valueOf(z8))).booleanValue();
            }
        }
        if ((i8 == i9 && i9 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        }
        if (i8 < 0 || i8 != i9 || i9 > iterableTextForAccessibility.length()) {
            i8 = -1;
        }
        this.accessibilityCursorPosition = i8;
        if (iterableTextForAccessibility.length() > 0) {
            z9 = true;
        }
        int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId());
        Integer num3 = null;
        if (z9) {
            num = Integer.valueOf(this.accessibilityCursorPosition);
        } else {
            num = null;
        }
        if (z9) {
            num2 = Integer.valueOf(this.accessibilityCursorPosition);
        } else {
            num2 = null;
        }
        if (z9) {
            num3 = Integer.valueOf(iterableTextForAccessibility.length());
        }
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId, num, num2, num3, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getError()));
        }
    }

    private final void setIsCheckable(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setCheckable(getInfoIsCheckable(semanticsNode));
    }

    private final void setStateDescription(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setStateDescription(getInfoStateDescriptionOrNull(semanticsNode));
    }

    private final void setText(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setText(getInfoText(semanticsNode));
    }

    private final void setTraversalValues() {
        SemanticsNode semanticsNode;
        boolean z8;
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(-1);
        if (semanticsNodeWithAdjustedBounds != null) {
            semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        } else {
            semanticsNode = null;
        }
        AbstractC3292y.f(semanticsNode);
        if (semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl) {
            z8 = true;
        } else {
            z8 = false;
        }
        List<SemanticsNode> subtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(z8, AbstractC1435t.s(semanticsNode));
        int o8 = AbstractC1435t.o(subtreeSortedByGeometryGrouping);
        if (1 <= o8) {
            int i8 = 1;
            while (true) {
                int id = subtreeSortedByGeometryGrouping.get(i8 - 1).getId();
                int id2 = subtreeSortedByGeometryGrouping.get(i8).getId();
                this.idToBeforeMap.put(Integer.valueOf(id), Integer.valueOf(id2));
                this.idToAfterMap.put(Integer.valueOf(id2), Integer.valueOf(id));
                if (i8 != o8) {
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Iterator<SemanticsNodeWithAdjustedBounds> it = getCurrentSemanticsNodes().values().iterator();
        while (it.hasNext()) {
            SemanticsConfiguration unmergedConfig$ui_release = it.next().getSemanticsNode().getUnmergedConfig$ui_release();
            if (AbstractC3292y.d(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
            }
        }
    }

    private final List<SemanticsNode> sortByGeometryGroupings(boolean z8, ArrayList<SemanticsNode> arrayList, Map<Integer, List<SemanticsNode>> map) {
        Comparator comparator;
        ArrayList arrayList2 = new ArrayList();
        int o8 = AbstractC1435t.o(arrayList);
        int i8 = 0;
        if (o8 >= 0) {
            int i9 = 0;
            while (true) {
                SemanticsNode semanticsNode = arrayList.get(i9);
                if (i9 == 0 || !sortByGeometryGroupings$placedEntryRowOverlaps(arrayList2, semanticsNode)) {
                    arrayList2.add(new Q5.r(semanticsNode.getBoundsInWindow(), AbstractC1435t.s(semanticsNode)));
                }
                if (i9 == o8) {
                    break;
                }
                i9++;
            }
        }
        AbstractC1435t.B(arrayList2, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Q5.r rVar = (Q5.r) arrayList2.get(i10);
            List list = (List) rVar.d();
            if (z8) {
                comparator = RtlBoundsComparator.INSTANCE;
            } else {
                comparator = LtrBoundsComparator.INSTANCE;
            }
            AbstractC1435t.B(list, new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(comparator, LayoutNode.Companion.getZComparator$ui_release())));
            arrayList3.addAll((Collection) rVar.d());
        }
        final AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 androidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 = AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.INSTANCE;
        AbstractC1435t.B(arrayList3, new Comparator() { // from class: androidx.compose.ui.platform.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int sortByGeometryGroupings$lambda$7;
                sortByGeometryGroupings$lambda$7 = AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings$lambda$7(InterfaceC2072n.this, obj, obj2);
                return sortByGeometryGroupings$lambda$7;
            }
        });
        while (i8 <= AbstractC1435t.o(arrayList3)) {
            List<SemanticsNode> list2 = map.get(Integer.valueOf(((SemanticsNode) arrayList3.get(i8)).getId()));
            if (list2 != null) {
                if (!isScreenReaderFocusable((SemanticsNode) arrayList3.get(i8))) {
                    arrayList3.remove(i8);
                } else {
                    i8++;
                }
                arrayList3.addAll(i8, list2);
                i8 += list2.size();
            } else {
                i8++;
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List sortByGeometryGroupings$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z8, ArrayList arrayList, Map map, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            map = new LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z8, arrayList, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$7(InterfaceC2072n interfaceC2072n, Object obj, Object obj2) {
        return ((Number) interfaceC2072n.invoke(obj, obj2)).intValue();
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(ArrayList<Q5.r> arrayList, SemanticsNode semanticsNode) {
        boolean z8;
        boolean z9;
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        if (top >= bottom) {
            z8 = true;
        } else {
            z8 = false;
        }
        int o8 = AbstractC1435t.o(arrayList);
        if (o8 >= 0) {
            int i8 = 0;
            while (true) {
                Rect rect = (Rect) arrayList.get(i8).c();
                if (rect.getTop() >= rect.getBottom()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z8 && !z9 && Math.max(top, rect.getTop()) < Math.min(bottom, rect.getBottom())) {
                    arrayList.set(i8, new Q5.r(rect.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i8).d()));
                    ((List) arrayList.get(i8).d()).add(semanticsNode);
                    return true;
                }
                if (i8 == o8) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean z8, List<SemanticsNode> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<SemanticsNode> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            geometryDepthFirstSearch(list.get(i8), arrayList, linkedHashMap);
        }
        return sortByGeometryGroupings(z8, arrayList, linkedHashMap);
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, Rect rect) {
        Rect rect2;
        if (semanticsNode == null) {
            return null;
        }
        Rect m2749translatek4lQ0M = rect.m2749translatek4lQ0M(semanticsNode.m4508getPositionInRootF1C5BW0());
        Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        if (m2749translatek4lQ0M.overlaps(boundsInRoot)) {
            rect2 = m2749translatek4lQ0M.intersect(boundsInRoot);
        } else {
            rect2 = null;
        }
        if (rect2 == null) {
            return null;
        }
        long mo4064localToScreenMKHz9U = this.view.mo4064localToScreenMKHz9U(OffsetKt.Offset(rect2.getLeft(), rect2.getTop()));
        long mo4064localToScreenMKHz9U2 = this.view.mo4064localToScreenMKHz9U(OffsetKt.Offset(rect2.getRight(), rect2.getBottom()));
        return new RectF(Offset.m2712getXimpl(mo4064localToScreenMKHz9U), Offset.m2713getYimpl(mo4064localToScreenMKHz9U), Offset.m2712getXimpl(mo4064localToScreenMKHz9U2), Offset.m2713getYimpl(mo4064localToScreenMKHz9U2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:            r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m4412toLegacyClassNameV4PA4sw(r1.m4499unboximpl());     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.compose.ui.platform.coreshims.ViewStructureCompat toViewStructure(androidx.compose.ui.semantics.SemanticsNode r14) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.toViewStructure(androidx.compose.ui.semantics.SemanticsNode):androidx.compose.ui.platform.coreshims.ViewStructureCompat");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z8) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i8, boolean z8, boolean z9) {
        int[] preceding;
        int i9;
        int i10;
        int i11;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        boolean z10 = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            AccessibilityIterators.TextSegmentIterator iteratorForGranularity = getIteratorForGranularity(semanticsNode, i8);
            if (iteratorForGranularity == null) {
                return false;
            }
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
            if (accessibilitySelectionEnd == -1) {
                if (z8) {
                    accessibilitySelectionEnd = 0;
                } else {
                    accessibilitySelectionEnd = iterableTextForAccessibility.length();
                }
            }
            if (z8) {
                preceding = iteratorForGranularity.following(accessibilitySelectionEnd);
            } else {
                preceding = iteratorForGranularity.preceding(accessibilitySelectionEnd);
            }
            if (preceding == null) {
                return false;
            }
            int i12 = preceding[0];
            z10 = true;
            int i13 = preceding[1];
            if (z9 && isAccessibilitySelectionExtendable(semanticsNode)) {
                i9 = getAccessibilitySelectionStart(semanticsNode);
                if (i9 == -1) {
                    if (z8) {
                        i9 = i12;
                    } else {
                        i9 = i13;
                    }
                }
                if (z8) {
                    i10 = i13;
                } else {
                    i10 = i12;
                }
            } else {
                if (z8) {
                    i9 = i13;
                } else {
                    i9 = i12;
                }
                i10 = i9;
            }
            if (z8) {
                i11 = 256;
            } else {
                i11 = 512;
            }
            this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, i11, i8, i12, i13, SystemClock.uptimeMillis());
            setAccessibilitySelection(semanticsNode, i9, i10, true);
        }
        return z10;
    }

    private final <T extends CharSequence> T trimToSize(T t8, @IntRange(from = 1) int i8) {
        if (i8 > 0) {
            if (t8 != null && t8.length() != 0 && t8.length() > i8) {
                int i9 = i8 - 1;
                if (Character.isHighSurrogate(t8.charAt(i9)) && Character.isLowSurrogate(t8.charAt(i8))) {
                    i8 = i9;
                }
                T t9 = (T) t8.subSequence(0, i8);
                AbstractC3292y.g(t9, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return t9;
            }
            return t8;
        }
        throw new IllegalArgumentException("size should be greater than 0".toString());
    }

    private final void updateContentCaptureBuffersOnAppeared(SemanticsNode semanticsNode) {
        if (!isEnabledForContentCapture()) {
            return;
        }
        updateTranslationOnAppeared(semanticsNode);
        bufferContentCaptureViewAppeared(semanticsNode.getId(), toViewStructure(semanticsNode));
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i8 = 0; i8 < size; i8++) {
            updateContentCaptureBuffersOnAppeared(replacedChildren$ui_release.get(i8));
        }
    }

    private final void updateContentCaptureBuffersOnDisappeared(SemanticsNode semanticsNode) {
        if (!isEnabledForContentCapture()) {
            return;
        }
        bufferContentCaptureViewDisappeared(semanticsNode.getId());
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i8 = 0; i8 < size; i8++) {
            updateContentCaptureBuffersOnDisappeared(replacedChildren$ui_release.get(i8));
        }
    }

    private final void updateHoveredVirtualView(int i8) {
        int i9 = this.hoveredVirtualViewId;
        if (i9 == i8) {
            return;
        }
        this.hoveredVirtualViewId = i8;
        sendEventForVirtualView$default(this, i8, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i9, 256, null, null, 12, null);
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        boolean hasPaneTitle;
        SemanticsNode semanticsNode;
        String str;
        SemanticsConfiguration unmergedConfig;
        boolean hasPaneTitle2;
        ArraySet<? extends Integer> arraySet = new ArraySet<>(0, 1, null);
        Iterator<Integer> it = this.paneDisplayed.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(intValue));
            if (semanticsNodeWithAdjustedBounds != null) {
                semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
            } else {
                semanticsNode = null;
            }
            if (semanticsNode != null) {
                hasPaneTitle2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(semanticsNode);
                if (!hasPaneTitle2) {
                }
            }
            arraySet.add(Integer.valueOf(intValue));
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(intValue));
            if (semanticsNodeCopy != null && (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) != null) {
                str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle());
            } else {
                str = null;
            }
            sendPaneChangeEvents(intValue, 32, str);
        }
        this.paneDisplayed.removeAll(arraySet);
        this.previousSemanticsNodes.clear();
        for (Map.Entry<Integer, SemanticsNodeWithAdjustedBounds> entry : getCurrentSemanticsNodes().entrySet()) {
            hasPaneTitle = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(entry.getValue().getSemanticsNode());
            if (hasPaneTitle && this.paneDisplayed.add(entry.getKey())) {
                sendPaneChangeEvents(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getPaneTitle()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new SemanticsNodeCopy(entry.getValue().getSemanticsNode(), getCurrentSemanticsNodes()));
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    private final void updateTranslationOnAppeared(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Function1 function12;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && AbstractC3292y.d(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 != null && (function12 = (Function1) accessibilityAction2.getAction()) != null) {
                return;
            }
            return;
        }
        if (this.translateStatus == TranslateStatus.SHOW_TRANSLATED && AbstractC3292y.d(bool, Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:12:0x0035, B:14:0x0065, B:19:0x0077, B:21:0x007f, B:23:0x0088, B:24:0x008b, B:26:0x0091, B:28:0x009a, B:30:0x00ab, B:32:0x00b2, B:33:0x00bb, B:42:0x0051), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d8 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(U5.d r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui_release(U5.d):java.lang.Object");
    }

    /* renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m4409canScroll0AR0LA0$ui_release(boolean z8, int i8, long j8) {
        if (!AbstractC3292y.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        return m4408canScrollmoWRBKg(getCurrentSemanticsNodes().values(), z8, i8, j8);
    }

    public final boolean dispatchHoverEvent$ui_release(MotionEvent motionEvent) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10) {
                return false;
            }
            if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
                updateHoveredVirtualView(Integer.MIN_VALUE);
                return true;
            }
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(motionEvent.getX(), motionEvent.getY());
        boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        updateHoveredVirtualView(hitTestSemanticsAt$ui_release);
        if (hitTestSemanticsAt$ui_release != Integer.MIN_VALUE) {
            return true;
        }
        return dispatchGenericMotionEvent;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        return this.nodeProvider;
    }

    public final boolean getContentCaptureForceEnabledForTesting$ui_release() {
        return this.contentCaptureForceEnabledForTesting;
    }

    public final ContentCaptureSessionCompat getContentCaptureSession$ui_release() {
        return this.contentCaptureSession;
    }

    public final String getExtraDataTestTraversalAfterVal$ui_release() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    public final String getExtraDataTestTraversalBeforeVal$ui_release() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    public final HashMap<Integer, Integer> getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    public final HashMap<Integer, Integer> getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    public final Function1 getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float f8, float f9) {
        NodeChain nodes$ui_release;
        boolean isVisible;
        LayoutNode layoutNode = null;
        androidx.compose.ui.node.e.f(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m4226hitTestSemanticsM_7yMNQ$ui_release$default(this.view.getRoot(), OffsetKt.Offset(f8, f9), hitTestResult, false, false, 12, null);
        Modifier.Node node = (Modifier.Node) AbstractC1435t.z0(hitTestResult);
        if (node != null) {
            layoutNode = DelegatableNodeKt.requireLayoutNode(node);
        }
        if (layoutNode != null && (nodes$ui_release = layoutNode.getNodes$ui_release()) != null && nodes$ui_release.m4277hasH91voCI$ui_release(NodeKind.m4320constructorimpl(8))) {
            isVisible = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(SemanticsNodeKt.SemanticsNode(layoutNode, false));
            if (isVisible && this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNode) == null) {
                return semanticsNodeIdToAccessibilityVirtualNodeId(layoutNode.getSemanticsId());
            }
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isEnabledForAccessibility$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        if (this.accessibilityManager.isEnabled() && (!this.enabledServices.isEmpty())) {
            return true;
        }
        return false;
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @RequiresApi(31)
    public final void onCreateVirtualViewTranslationRequests$ui_release(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        ViewTranslationHelperMethodsS.INSTANCE.onCreateVirtualViewTranslationRequests(this, jArr, iArr, consumer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.b(this, lifecycleOwner);
    }

    public final void onHideTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled()) {
            return;
        }
        notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.d(this, lifecycleOwner);
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled() && !this.checkingForSemanticsChanges) {
            this.checkingForSemanticsChanges = true;
            this.handler.post(this.semanticsChangeChecker);
        }
    }

    public final void onShowTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        initContentCapture(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        initContentCapture(false);
    }

    @RequiresApi(31)
    public final void onVirtualViewTranslationResponses$ui_release(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        ViewTranslationHelperMethodsS.INSTANCE.onVirtualViewTranslationResponses(this, longSparseArray);
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z8) {
        this.accessibilityForceEnabledForTesting = z8;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void setContentCaptureForceEnabledForTesting$ui_release(boolean z8) {
        this.contentCaptureForceEnabledForTesting = z8;
    }

    public final void setContentCaptureSession$ui_release(ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public final void setHoveredVirtualViewId$ui_release(int i8) {
        this.hoveredVirtualViewId = i8;
    }

    public final void setIdToAfterMap$ui_release(HashMap<Integer, Integer> hashMap) {
        this.idToAfterMap = hashMap;
    }

    public final void setIdToBeforeMap$ui_release(HashMap<Integer, Integer> hashMap) {
        this.idToBeforeMap = hashMap;
    }

    public final void setOnSendAccessibilityEvent$ui_release(Function1 function1) {
        this.onSendAccessibilityEvent = function1;
    }
}
