package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SemanticsActions {
    public static final int $stable;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> ClearTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> Collapse;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> CopyText;
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> CutText;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> Dismiss;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> Expand;
    private static final SemanticsPropertyKey<AccessibilityAction<Function1>> GetTextLayoutResult;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<Function1>> InsertTextAtCursor;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> OnClick;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> OnImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> OnLongClick;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> PageDown;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> PageLeft;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> PageRight;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> PageUp;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> PasteText;
    private static final SemanticsPropertyKey<AccessibilityAction<Function0>> RequestFocus;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC2072n>> ScrollBy;
    private static final SemanticsPropertyKey<AccessibilityAction<Function1>> ScrollToIndex;
    private static final SemanticsPropertyKey<AccessibilityAction<Function1>> SetProgress;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC2073o>> SetSelection;
    private static final SemanticsPropertyKey<AccessibilityAction<Function1>> SetText;
    private static final SemanticsPropertyKey<AccessibilityAction<Function1>> SetTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<Function1>> ShowTextSubstitution;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE;
        GetTextLayoutResult = SemanticsPropertiesKt.AccessibilityKey("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        OnClick = SemanticsPropertiesKt.AccessibilityKey("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        OnLongClick = SemanticsPropertiesKt.AccessibilityKey("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollBy = SemanticsPropertiesKt.AccessibilityKey("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollToIndex = SemanticsPropertiesKt.AccessibilityKey("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        SetProgress = SemanticsPropertiesKt.AccessibilityKey("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        SetSelection = SemanticsPropertiesKt.AccessibilityKey("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        SetText = SemanticsPropertiesKt.AccessibilityKey("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        SetTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("SetTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ShowTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ShowTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ClearTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ClearTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        InsertTextAtCursor = SemanticsPropertiesKt.AccessibilityKey("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$1);
        OnImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        CopyText = SemanticsPropertiesKt.AccessibilityKey("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        CutText = SemanticsPropertiesKt.AccessibilityKey("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        PasteText = SemanticsPropertiesKt.AccessibilityKey("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        Expand = SemanticsPropertiesKt.AccessibilityKey("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        Collapse = SemanticsPropertiesKt.AccessibilityKey("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        Dismiss = SemanticsPropertiesKt.AccessibilityKey("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        RequestFocus = SemanticsPropertiesKt.AccessibilityKey("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        CustomActions = SemanticsPropertiesKt.AccessibilityKey("CustomActions");
        PageUp = SemanticsPropertiesKt.AccessibilityKey("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        PageLeft = SemanticsPropertiesKt.AccessibilityKey("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        PageDown = SemanticsPropertiesKt.AccessibilityKey("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        PageRight = SemanticsPropertiesKt.AccessibilityKey("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
        $stable = 8;
    }

    private SemanticsActions() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getOnImeAction() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC2072n>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC2073o>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }
}
