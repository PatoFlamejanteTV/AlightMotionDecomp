package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import i6.m;
import kotlin.jvm.internal.AbstractC3284p;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class TopAppBarState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<TopAppBarState, ?> Saver = ListSaverKt.listSaver(TopAppBarState$Companion$Saver$1.INSTANCE, TopAppBarState$Companion$Saver$2.INSTANCE);
    private MutableState<Float> _heightOffset;
    private final MutableState contentOffset$delegate;
    private final MutableState heightOffsetLimit$delegate;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<TopAppBarState, ?> getSaver() {
            return TopAppBarState.Saver;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public TopAppBarState(float f8, float f9, float f10) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<Float> mutableStateOf$default3;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f8), null, 2, null);
        this.heightOffsetLimit$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f10), null, 2, null);
        this.contentOffset$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f9), null, 2, null);
        this._heightOffset = mutableStateOf$default3;
    }

    public final float getCollapsedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / getHeightOffsetLimit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getContentOffset() {
        return ((Number) this.contentOffset$delegate.getValue()).floatValue();
    }

    public final float getHeightOffset() {
        return this._heightOffset.getValue().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getHeightOffsetLimit() {
        return ((Number) this.heightOffsetLimit$delegate.getValue()).floatValue();
    }

    public final float getOverlappedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return 1 - (m.j(getHeightOffsetLimit() - getContentOffset(), getHeightOffsetLimit(), 0.0f) / getHeightOffsetLimit());
    }

    public final void setContentOffset(float f8) {
        this.contentOffset$delegate.setValue(Float.valueOf(f8));
    }

    public final void setHeightOffset(float f8) {
        this._heightOffset.setValue(Float.valueOf(m.j(f8, getHeightOffsetLimit(), 0.0f)));
    }

    public final void setHeightOffsetLimit(float f8) {
        this.heightOffsetLimit$delegate.setValue(Float.valueOf(f8));
    }
}
