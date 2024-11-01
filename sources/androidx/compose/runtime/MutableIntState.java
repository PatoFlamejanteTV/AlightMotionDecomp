package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes.dex */
public interface MutableIntState extends IntState, MutableState<Integer> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
        @Deprecated
        public static Integer getValue(MutableIntState mutableIntState) {
            int intValue;
            intValue = k.a(mutableIntState).intValue();
            return Integer.valueOf(intValue);
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
        @Deprecated
        public static void setValue(MutableIntState mutableIntState, int i8) {
            k.c(mutableIntState, i8);
        }
    }

    @Override // androidx.compose.runtime.IntState
    int getIntValue();

    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    Integer getValue();

    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Object getValue();

    void setIntValue(int i8);

    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    void setValue(int i8);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ void setValue(Integer num);
}
