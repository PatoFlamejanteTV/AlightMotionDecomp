package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusPropertiesImpl implements FocusProperties {
    public static final int $stable = 8;
    private boolean canFocus = true;
    private FocusRequester down;
    private FocusRequester end;
    private Function1 enter;
    private Function1 exit;
    private FocusRequester left;
    private FocusRequester next;
    private FocusRequester previous;
    private FocusRequester right;
    private FocusRequester start;
    private FocusRequester up;

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.Companion;
        this.next = companion.getDefault();
        this.previous = companion.getDefault();
        this.up = companion.getDefault();
        this.down = companion.getDefault();
        this.left = companion.getDefault();
        this.right = companion.getDefault();
        this.start = companion.getDefault();
        this.end = companion.getDefault();
        this.enter = FocusPropertiesImpl$enter$1.INSTANCE;
        this.exit = FocusPropertiesImpl$exit$1.INSTANCE;
    }

    public static /* synthetic */ void getEnter$annotations() {
    }

    public static /* synthetic */ void getExit$annotations() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public Function1 getEnter() {
        return this.enter;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public Function1 getExit() {
        return this.exit;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z8) {
        this.canFocus = z8;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setDown(FocusRequester focusRequester) {
        this.down = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setEnd(FocusRequester focusRequester) {
        this.end = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setEnter(Function1 function1) {
        this.enter = function1;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setExit(Function1 function1) {
        this.exit = function1;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setLeft(FocusRequester focusRequester) {
        this.left = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setNext(FocusRequester focusRequester) {
        this.next = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setPrevious(FocusRequester focusRequester) {
        this.previous = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setRight(FocusRequester focusRequester) {
        this.right = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setStart(FocusRequester focusRequester) {
        this.start = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setUp(FocusRequester focusRequester) {
        this.up = focusRequester;
    }
}
