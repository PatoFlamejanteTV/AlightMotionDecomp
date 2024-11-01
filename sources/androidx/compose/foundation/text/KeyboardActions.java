package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class KeyboardActions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    private final Function1 onDone;
    private final Function1 onGo;
    private final Function1 onNext;
    private final Function1 onPrevious;
    private final Function1 onSearch;
    private final Function1 onSend;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        if (AbstractC3292y.d(this.onDone, keyboardActions.onDone) && AbstractC3292y.d(this.onGo, keyboardActions.onGo) && AbstractC3292y.d(this.onNext, keyboardActions.onNext) && AbstractC3292y.d(this.onPrevious, keyboardActions.onPrevious) && AbstractC3292y.d(this.onSearch, keyboardActions.onSearch) && AbstractC3292y.d(this.onSend, keyboardActions.onSend)) {
            return true;
        }
        return false;
    }

    public final Function1 getOnDone() {
        return this.onDone;
    }

    public final Function1 getOnGo() {
        return this.onGo;
    }

    public final Function1 getOnNext() {
        return this.onNext;
    }

    public final Function1 getOnPrevious() {
        return this.onPrevious;
    }

    public final Function1 getOnSearch() {
        return this.onSearch;
    }

    public final Function1 getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Function1 function1 = this.onDone;
        int i13 = 0;
        if (function1 != null) {
            i8 = function1.hashCode();
        } else {
            i8 = 0;
        }
        int i14 = i8 * 31;
        Function1 function12 = this.onGo;
        if (function12 != null) {
            i9 = function12.hashCode();
        } else {
            i9 = 0;
        }
        int i15 = (i14 + i9) * 31;
        Function1 function13 = this.onNext;
        if (function13 != null) {
            i10 = function13.hashCode();
        } else {
            i10 = 0;
        }
        int i16 = (i15 + i10) * 31;
        Function1 function14 = this.onPrevious;
        if (function14 != null) {
            i11 = function14.hashCode();
        } else {
            i11 = 0;
        }
        int i17 = (i16 + i11) * 31;
        Function1 function15 = this.onSearch;
        if (function15 != null) {
            i12 = function15.hashCode();
        } else {
            i12 = 0;
        }
        int i18 = (i17 + i12) * 31;
        Function1 function16 = this.onSend;
        if (function16 != null) {
            i13 = function16.hashCode();
        }
        return i18 + i13;
    }

    public KeyboardActions(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16) {
        this.onDone = function1;
        this.onGo = function12;
        this.onNext = function13;
        this.onPrevious = function14;
        this.onSearch = function15;
        this.onSend = function16;
    }

    public /* synthetic */ KeyboardActions(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : function1, (i8 & 2) != 0 ? null : function12, (i8 & 4) != 0 ? null : function13, (i8 & 8) != 0 ? null : function14, (i8 & 16) != 0 ? null : function15, (i8 & 32) != 0 ? null : function16);
    }
}
