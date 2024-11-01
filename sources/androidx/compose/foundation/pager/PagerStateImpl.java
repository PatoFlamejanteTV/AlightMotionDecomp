package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class PagerStateImpl extends PagerState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<PagerStateImpl, ?> Saver = ListSaverKt.listSaver(PagerStateImpl$Companion$Saver$1.INSTANCE, PagerStateImpl$Companion$Saver$2.INSTANCE);
    private MutableState<Function0> pageCountState;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<PagerStateImpl, ?> getSaver() {
            return PagerStateImpl.Saver;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerStateImpl(int i8, float f8, Function0 updatedPageCount) {
        super(i8, f8);
        MutableState<Function0> mutableStateOf$default;
        AbstractC3292y.i(updatedPageCount, "updatedPageCount");
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(updatedPageCount, null, 2, null);
        this.pageCountState = mutableStateOf$default;
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return ((Number) this.pageCountState.getValue().invoke()).intValue();
    }

    public final MutableState<Function0> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(MutableState<Function0> mutableState) {
        AbstractC3292y.i(mutableState, "<set-?>");
        this.pageCountState = mutableState;
    }
}
