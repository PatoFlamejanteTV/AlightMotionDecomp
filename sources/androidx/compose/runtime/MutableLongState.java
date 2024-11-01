package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes.dex */
public interface MutableLongState extends LongState, MutableState<Long> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        public static Long getValue(MutableLongState mutableLongState) {
            long longValue;
            longValue = l.a(mutableLongState).longValue();
            return Long.valueOf(longValue);
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        public static void setValue(MutableLongState mutableLongState, long j8) {
            l.c(mutableLongState, j8);
        }
    }

    @Override // androidx.compose.runtime.LongState
    long getLongValue();

    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    Long getValue();

    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Object getValue();

    void setLongValue(long j8);

    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    void setValue(long j8);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ void setValue(Long l8);
}
