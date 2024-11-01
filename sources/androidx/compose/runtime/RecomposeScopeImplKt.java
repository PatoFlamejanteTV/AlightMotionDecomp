package androidx.compose.runtime;

/* loaded from: classes.dex */
public final class RecomposeScopeImplKt {
    private static final int DefaultsInScopeFlag = 2;
    private static final int DefaultsInvalidFlag = 4;
    private static final int ForcedRecomposeFlag = 64;
    private static final int RequiresRecomposeFlag = 8;
    private static final int RereadingFlag = 32;
    private static final int SkippedFlag = 16;
    private static final int UsedFlag = 1;
    private static final Object callbackLock = new Object();
    private static final int changedHighBitMask = 613566756;
    private static final int changedLowBitMask = 306783378;
    private static final int changedMask = -920350135;

    public static final int updateChangedFlags(int i8) {
        int i9 = changedLowBitMask & i8;
        int i10 = changedHighBitMask & i8;
        return (i8 & changedMask) | (i10 >> 1) | i9 | ((i9 << 1) & i10);
    }
}
