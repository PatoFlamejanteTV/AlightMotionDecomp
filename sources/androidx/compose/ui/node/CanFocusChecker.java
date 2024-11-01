package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class CanFocusChecker implements FocusProperties {
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();
    private static Boolean canFocusValue;

    private CanFocusChecker() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("canFocus is read before it is written".toString());
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getDown() {
        return FocusProperties.CC.a(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getEnd() {
        return FocusProperties.CC.b(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ Function1 getEnter() {
        return FocusProperties.CC.c(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ Function1 getExit() {
        return FocusProperties.CC.d(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getLeft() {
        return FocusProperties.CC.e(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getNext() {
        return FocusProperties.CC.f(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getPrevious() {
        return FocusProperties.CC.g(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getRight() {
        return FocusProperties.CC.h(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getStart() {
        return FocusProperties.CC.i(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getUp() {
        return FocusProperties.CC.j(this);
    }

    public final boolean isCanFocusSet() {
        if (canFocusValue != null) {
            return true;
        }
        return false;
    }

    public final void reset() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z8) {
        canFocusValue = Boolean.valueOf(z8);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setDown(FocusRequester focusRequester) {
        FocusProperties.CC.k(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setEnd(FocusRequester focusRequester) {
        FocusProperties.CC.l(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setEnter(Function1 function1) {
        FocusProperties.CC.m(this, function1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setExit(Function1 function1) {
        FocusProperties.CC.n(this, function1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setLeft(FocusRequester focusRequester) {
        FocusProperties.CC.o(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setNext(FocusRequester focusRequester) {
        FocusProperties.CC.p(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setPrevious(FocusRequester focusRequester) {
        FocusProperties.CC.q(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setRight(FocusRequester focusRequester) {
        FocusProperties.CC.r(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setStart(FocusRequester focusRequester) {
        FocusProperties.CC.s(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setUp(FocusRequester focusRequester) {
        FocusProperties.CC.t(this, focusRequester);
    }
}
