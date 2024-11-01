package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusOrder {
    public static final int $stable = 8;
    private final FocusProperties focusProperties;

    public FocusOrder(FocusProperties focusProperties) {
        this.focusProperties = focusProperties;
    }

    public final FocusRequester getDown() {
        return this.focusProperties.getDown();
    }

    public final FocusRequester getEnd() {
        return this.focusProperties.getEnd();
    }

    public final FocusRequester getLeft() {
        return this.focusProperties.getLeft();
    }

    public final FocusRequester getNext() {
        return this.focusProperties.getNext();
    }

    public final FocusRequester getPrevious() {
        return this.focusProperties.getPrevious();
    }

    public final FocusRequester getRight() {
        return this.focusProperties.getRight();
    }

    public final FocusRequester getStart() {
        return this.focusProperties.getStart();
    }

    public final FocusRequester getUp() {
        return this.focusProperties.getUp();
    }

    public final void setDown(FocusRequester focusRequester) {
        this.focusProperties.setDown(focusRequester);
    }

    public final void setEnd(FocusRequester focusRequester) {
        this.focusProperties.setEnd(focusRequester);
    }

    public final void setLeft(FocusRequester focusRequester) {
        this.focusProperties.setLeft(focusRequester);
    }

    public final void setNext(FocusRequester focusRequester) {
        this.focusProperties.setNext(focusRequester);
    }

    public final void setPrevious(FocusRequester focusRequester) {
        this.focusProperties.setPrevious(focusRequester);
    }

    public final void setRight(FocusRequester focusRequester) {
        this.focusProperties.setRight(focusRequester);
    }

    public final void setStart(FocusRequester focusRequester) {
        this.focusProperties.setStart(focusRequester);
    }

    public final void setUp(FocusRequester focusRequester) {
        this.focusProperties.setUp(focusRequester);
    }

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }
}
