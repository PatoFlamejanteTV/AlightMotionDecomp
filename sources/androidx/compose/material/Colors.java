package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

@Stable
/* loaded from: classes.dex */
public final class Colors {
    public static final int $stable = 0;
    private final MutableState background$delegate;
    private final MutableState error$delegate;
    private final MutableState isLight$delegate;
    private final MutableState onBackground$delegate;
    private final MutableState onError$delegate;
    private final MutableState onPrimary$delegate;
    private final MutableState onSecondary$delegate;
    private final MutableState onSurface$delegate;
    private final MutableState primary$delegate;
    private final MutableState primaryVariant$delegate;
    private final MutableState secondary$delegate;
    private final MutableState secondaryVariant$delegate;
    private final MutableState surface$delegate;

    public /* synthetic */ Colors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z8, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, z8);
    }

    /* renamed from: copy-pvPzIIM$default, reason: not valid java name */
    public static /* synthetic */ Colors m1146copypvPzIIM$default(Colors colors, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z8, int i8, Object obj) {
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        boolean z9;
        if ((i8 & 1) != 0) {
            j20 = colors.m1155getPrimary0d7_KjU();
        } else {
            j20 = j8;
        }
        if ((i8 & 2) != 0) {
            j21 = colors.m1156getPrimaryVariant0d7_KjU();
        } else {
            j21 = j9;
        }
        if ((i8 & 4) != 0) {
            j22 = colors.m1157getSecondary0d7_KjU();
        } else {
            j22 = j10;
        }
        if ((i8 & 8) != 0) {
            j23 = colors.m1158getSecondaryVariant0d7_KjU();
        } else {
            j23 = j11;
        }
        if ((i8 & 16) != 0) {
            j24 = colors.m1148getBackground0d7_KjU();
        } else {
            j24 = j12;
        }
        if ((i8 & 32) != 0) {
            j25 = colors.m1159getSurface0d7_KjU();
        } else {
            j25 = j13;
        }
        if ((i8 & 64) != 0) {
            j26 = colors.m1149getError0d7_KjU();
        } else {
            j26 = j14;
        }
        if ((i8 & 128) != 0) {
            j27 = colors.m1152getOnPrimary0d7_KjU();
        } else {
            j27 = j15;
        }
        long j32 = j27;
        if ((i8 & 256) != 0) {
            j28 = colors.m1153getOnSecondary0d7_KjU();
        } else {
            j28 = j16;
        }
        long j33 = j28;
        if ((i8 & 512) != 0) {
            j29 = colors.m1150getOnBackground0d7_KjU();
        } else {
            j29 = j17;
        }
        long j34 = j29;
        if ((i8 & 1024) != 0) {
            j30 = colors.m1154getOnSurface0d7_KjU();
        } else {
            j30 = j18;
        }
        long j35 = j30;
        if ((i8 & 2048) != 0) {
            j31 = colors.m1151getOnError0d7_KjU();
        } else {
            j31 = j19;
        }
        if ((i8 & 4096) != 0) {
            z9 = colors.isLight();
        } else {
            z9 = z8;
        }
        return colors.m1147copypvPzIIM(j20, j21, j22, j23, j24, j25, j26, j32, j33, j34, j35, j31, z9);
    }

    /* renamed from: copy-pvPzIIM, reason: not valid java name */
    public final Colors m1147copypvPzIIM(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z8) {
        return new Colors(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, z8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m1148getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m1149getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m1150getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m1151getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m1152getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m1153getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1154getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m1155getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPrimaryVariant-0d7_KjU, reason: not valid java name */
    public final long m1156getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m1157getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSecondaryVariant-0d7_KjU, reason: not valid java name */
    public final long m1158getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m1159getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m2958unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }

    /* renamed from: setBackground-8_81llA$material_release, reason: not valid java name */
    public final void m1160setBackground8_81llA$material_release(long j8) {
        this.background$delegate.setValue(Color.m2938boximpl(j8));
    }

    /* renamed from: setError-8_81llA$material_release, reason: not valid java name */
    public final void m1161setError8_81llA$material_release(long j8) {
        this.error$delegate.setValue(Color.m2938boximpl(j8));
    }

    public final void setLight$material_release(boolean z8) {
        this.isLight$delegate.setValue(Boolean.valueOf(z8));
    }

    /* renamed from: setOnBackground-8_81llA$material_release, reason: not valid java name */
    public final void m1162setOnBackground8_81llA$material_release(long j8) {
        this.onBackground$delegate.setValue(Color.m2938boximpl(j8));
    }

    /* renamed from: setOnError-8_81llA$material_release, reason: not valid java name */
    public final void m1163setOnError8_81llA$material_release(long j8) {
        this.onError$delegate.setValue(Color.m2938boximpl(j8));
    }

    /* renamed from: setOnPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m1164setOnPrimary8_81llA$material_release(long j8) {
        this.onPrimary$delegate.setValue(Color.m2938boximpl(j8));
    }

    /* renamed from: setOnSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m1165setOnSecondary8_81llA$material_release(long j8) {
        this.onSecondary$delegate.setValue(Color.m2938boximpl(j8));
    }

    /* renamed from: setOnSurface-8_81llA$material_release, reason: not valid java name */
    public final void m1166setOnSurface8_81llA$material_release(long j8) {
        this.onSurface$delegate.setValue(Color.m2938boximpl(j8));
    }

    /* renamed from: setPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m1167setPrimary8_81llA$material_release(long j8) {
        this.primary$delegate.setValue(Color.m2938boximpl(j8));
    }

    /* renamed from: setPrimaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m1168setPrimaryVariant8_81llA$material_release(long j8) {
        this.primaryVariant$delegate.setValue(Color.m2938boximpl(j8));
    }

    /* renamed from: setSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m1169setSecondary8_81llA$material_release(long j8) {
        this.secondary$delegate.setValue(Color.m2938boximpl(j8));
    }

    /* renamed from: setSecondaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m1170setSecondaryVariant8_81llA$material_release(long j8) {
        this.secondaryVariant$delegate.setValue(Color.m2938boximpl(j8));
    }

    /* renamed from: setSurface-8_81llA$material_release, reason: not valid java name */
    public final void m1171setSurface8_81llA$material_release(long j8) {
        this.surface$delegate.setValue(Color.m2938boximpl(j8));
    }

    public String toString() {
        return "Colors(primary=" + ((Object) Color.m2956toStringimpl(m1155getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m2956toStringimpl(m1156getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m2956toStringimpl(m1157getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m2956toStringimpl(m1158getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m2956toStringimpl(m1148getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m2956toStringimpl(m1159getSurface0d7_KjU())) + ", error=" + ((Object) Color.m2956toStringimpl(m1149getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m2956toStringimpl(m1152getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m2956toStringimpl(m1153getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m2956toStringimpl(m1150getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m2956toStringimpl(m1154getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m2956toStringimpl(m1151getOnError0d7_KjU())) + ", isLight=" + isLight() + ')';
    }

    private Colors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z8) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j17), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j18), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m2938boximpl(j19), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight$delegate = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z8), SnapshotStateKt.structuralEqualityPolicy());
    }
}
