package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ScrollObservationScope $scrollObservationScope;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(ScrollObservationScope scrollObservationScope, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.$scrollObservationScope = scrollObservationScope;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4410invoke();
        return Q5.I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4410invoke() {
        int semanticsNodeIdToAccessibilityVirtualNodeId;
        SemanticsNode semanticsNode;
        LayoutNode layoutNode$ui_release;
        HashMap hashMap;
        HashMap hashMap2;
        AccessibilityNodeInfo accessibilityNodeInfo;
        Rect boundsInScreen;
        ScrollAxisRange horizontalScrollAxisRange = this.$scrollObservationScope.getHorizontalScrollAxisRange();
        ScrollAxisRange verticalScrollAxisRange = this.$scrollObservationScope.getVerticalScrollAxisRange();
        Float oldXValue = this.$scrollObservationScope.getOldXValue();
        Float oldYValue = this.$scrollObservationScope.getOldYValue();
        float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : ((Number) horizontalScrollAxisRange.getValue().invoke()).floatValue() - oldXValue.floatValue();
        float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : ((Number) verticalScrollAxisRange.getValue().invoke()).floatValue() - oldYValue.floatValue();
        if (floatValue != 0.0f || floatValue2 != 0.0f) {
            semanticsNodeIdToAccessibilityVirtualNodeId = this.this$0.semanticsNodeIdToAccessibilityVirtualNodeId(this.$scrollObservationScope.getSemanticsNodeId());
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) this.this$0.getCurrentSemanticsNodes().get(Integer.valueOf(this.this$0.focusedVirtualViewId));
            if (semanticsNodeWithAdjustedBounds != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
                try {
                    accessibilityNodeInfo = androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI;
                    if (accessibilityNodeInfo != null) {
                        boundsInScreen = androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds);
                        accessibilityNodeInfo.setBoundsInScreen(boundsInScreen);
                        Q5.I i8 = Q5.I.f8786a;
                    }
                } catch (IllegalStateException unused) {
                    Q5.I i9 = Q5.I.f8786a;
                }
            }
            this.this$0.getView().invalidate();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) this.this$0.getCurrentSemanticsNodes().get(Integer.valueOf(semanticsNodeIdToAccessibilityVirtualNodeId));
            if (semanticsNodeWithAdjustedBounds2 != null && (semanticsNode = semanticsNodeWithAdjustedBounds2.getSemanticsNode()) != null && (layoutNode$ui_release = semanticsNode.getLayoutNode$ui_release()) != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.this$0;
                if (horizontalScrollAxisRange != null) {
                    Integer valueOf = Integer.valueOf(semanticsNodeIdToAccessibilityVirtualNodeId);
                    hashMap2 = androidComposeViewAccessibilityDelegateCompat2.pendingHorizontalScrollEvents;
                    hashMap2.put(valueOf, horizontalScrollAxisRange);
                }
                if (verticalScrollAxisRange != null) {
                    Integer valueOf2 = Integer.valueOf(semanticsNodeIdToAccessibilityVirtualNodeId);
                    hashMap = androidComposeViewAccessibilityDelegateCompat2.pendingVerticalScrollEvents;
                    hashMap.put(valueOf2, verticalScrollAxisRange);
                }
                androidComposeViewAccessibilityDelegateCompat2.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode$ui_release);
            }
        }
        if (horizontalScrollAxisRange != null) {
            this.$scrollObservationScope.setOldXValue((Float) horizontalScrollAxisRange.getValue().invoke());
        }
        if (verticalScrollAxisRange != null) {
            this.$scrollObservationScope.setOldYValue((Float) verticalScrollAxisRange.getValue().invoke());
        }
    }
}
