package androidx.compose.ui.focus;

import Q5.p;

/* loaded from: classes.dex */
public enum FocusStateImpl implements FocusState {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean getHasFocus() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            return true;
        }
        if (i8 == 4) {
            return false;
        }
        throw new p();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isCaptured() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i8 == 1) {
            return true;
        }
        if (i8 != 2 && i8 != 3 && i8 != 4) {
            throw new p();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isFocused() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        if (i8 != 3 && i8 != 4) {
            throw new p();
        }
        return false;
    }
}
