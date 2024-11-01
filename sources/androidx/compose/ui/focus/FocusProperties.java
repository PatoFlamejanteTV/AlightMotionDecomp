package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface FocusProperties {
    boolean getCanFocus();

    FocusRequester getDown();

    FocusRequester getEnd();

    @ExperimentalComposeUiApi
    Function1 getEnter();

    @ExperimentalComposeUiApi
    Function1 getExit();

    FocusRequester getLeft();

    FocusRequester getNext();

    FocusRequester getPrevious();

    FocusRequester getRight();

    FocusRequester getStart();

    FocusRequester getUp();

    void setCanFocus(boolean z8);

    void setDown(FocusRequester focusRequester);

    void setEnd(FocusRequester focusRequester);

    @ExperimentalComposeUiApi
    void setEnter(Function1 function1);

    @ExperimentalComposeUiApi
    void setExit(Function1 function1);

    void setLeft(FocusRequester focusRequester);

    void setNext(FocusRequester focusRequester);

    void setPrevious(FocusRequester focusRequester);

    void setRight(FocusRequester focusRequester);

    void setStart(FocusRequester focusRequester);

    void setUp(FocusRequester focusRequester);

    /* renamed from: androidx.compose.ui.focus.FocusProperties$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static FocusRequester a(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        public static FocusRequester b(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        public static Function1 c(FocusProperties focusProperties) {
            return FocusProperties$enter$1.INSTANCE;
        }

        public static Function1 d(FocusProperties focusProperties) {
            return FocusProperties$exit$1.INSTANCE;
        }

        public static FocusRequester e(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        public static FocusRequester f(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        public static FocusRequester g(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        public static FocusRequester h(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        public static FocusRequester i(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        public static FocusRequester j(FocusProperties focusProperties) {
            return FocusRequester.Companion.getDefault();
        }

        public static /* synthetic */ void u() {
        }

        public static /* synthetic */ void v() {
        }

        public static void k(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void l(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void m(FocusProperties focusProperties, Function1 function1) {
        }

        public static void n(FocusProperties focusProperties, Function1 function1) {
        }

        public static void o(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void p(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void q(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void r(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void s(FocusProperties focusProperties, FocusRequester focusRequester) {
        }

        public static void t(FocusProperties focusProperties, FocusRequester focusRequester) {
        }
    }
}
