package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes.dex */
public interface IntState extends State<Integer> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
        @Deprecated
        public static Integer getValue(IntState intState) {
            int intValue;
            intValue = f.a(intState).intValue();
            return Integer.valueOf(intValue);
        }
    }

    int getIntValue();

    @Override // androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    Integer getValue();

    @Override // androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Object getValue();
}
