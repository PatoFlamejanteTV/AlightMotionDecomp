package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes.dex */
public interface LongState extends State<Long> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        public static Long getValue(LongState longState) {
            long longValue;
            longValue = g.a(longState).longValue();
            return Long.valueOf(longValue);
        }
    }

    long getLongValue();

    @Override // androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    Long getValue();

    @Override // androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Object getValue();
}
