package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.PlatformTextInputSessionHandler;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface Owner extends PlatformTextInputSessionHandler {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z8) {
            enableExtraAssertions = z8;
        }
    }

    /* loaded from: classes.dex */
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    long mo4373calculateLocalPositionMKHz9U(long j8);

    /* renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    long mo4374calculatePositionInWindowMKHz9U(long j8);

    OwnedLayer createLayer(Function1 function1, Function0 function0);

    void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z8);

    AccessibilityManager getAccessibilityManager();

    @ExperimentalComposeUiApi
    Autofill getAutofill();

    @ExperimentalComposeUiApi
    AutofillTree getAutofillTree();

    ClipboardManager getClipboardManager();

    U5.g getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    /* renamed from: getFocusDirection-P8AzH3I, reason: not valid java name */
    FocusDirection mo4375getFocusDirectionP8AzH3I(KeyEvent keyEvent);

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    long getMeasureIteration();

    ModifierLocalManager getModifierLocalManager();

    Placeable.PlacementScope getPlacementScope();

    PointerIconService getPointerIconService();

    LayoutNode getRoot();

    RootForTest getRootForTest();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void measureAndLayout(boolean z8);

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    void mo4376measureAndLayout0kLqBqw(LayoutNode layoutNode, long j8);

    void onAttach(LayoutNode layoutNode);

    void onDetach(LayoutNode layoutNode);

    void onEndApplyChanges();

    void onLayoutChange(LayoutNode layoutNode);

    void onRequestMeasure(LayoutNode layoutNode, boolean z8, boolean z9, boolean z10);

    void onRequestRelayout(LayoutNode layoutNode, boolean z8, boolean z9);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(Function0 function0);

    void registerOnLayoutCompletedListener(OnLayoutCompletedListener onLayoutCompletedListener);

    boolean requestFocus();

    void requestOnPositionedCallback(LayoutNode layoutNode);

    @InternalCoreApi
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void setShowLayoutBounds(boolean z8);
}
