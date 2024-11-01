package androidx.compose.ui.input.pointer;

import R5.AbstractC1435t;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class PointerInputChange {
    public static final int $stable = 0;
    private List<HistoricalChange> _historical;
    private ConsumedData consumed;
    private final long id;
    private long originalEventPosition;
    private final long position;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    public /* synthetic */ PointerInputChange(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, boolean z10, int i8, long j13, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, z8, f8, j11, j12, z9, z10, i8, j13);
    }

    /* renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3979copy0GkPj7c$default(PointerInputChange pointerInputChange, long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, ConsumedData consumedData, int i8, long j13, int i9, Object obj) {
        long j14;
        long j15;
        long j16;
        boolean z10;
        long j17;
        long j18;
        boolean z11;
        int i10;
        long j19;
        if ((i9 & 1) != 0) {
            j14 = pointerInputChange.id;
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = pointerInputChange.uptimeMillis;
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = pointerInputChange.position;
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            z10 = pointerInputChange.pressed;
        } else {
            z10 = z8;
        }
        if ((i9 & 16) != 0) {
            j17 = pointerInputChange.previousUptimeMillis;
        } else {
            j17 = j11;
        }
        if ((i9 & 32) != 0) {
            j18 = pointerInputChange.previousPosition;
        } else {
            j18 = j12;
        }
        if ((i9 & 64) != 0) {
            z11 = pointerInputChange.previousPressed;
        } else {
            z11 = z9;
        }
        if ((i9 & 256) != 0) {
            i10 = pointerInputChange.type;
        } else {
            i10 = i8;
        }
        int i11 = i10;
        if ((i9 & 512) != 0) {
            j19 = pointerInputChange.scrollDelta;
        } else {
            j19 = j13;
        }
        return pointerInputChange.m3985copy0GkPj7c(j14, j15, j16, z10, j17, j18, z11, consumedData, i11, j19);
    }

    /* renamed from: copy-8H9lfAM$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3980copy8H9lfAM$default(PointerInputChange pointerInputChange, long j8, long j9, long j10, long j11, boolean z8, float f8, long j12, long j13, boolean z9, int i8, List list, long j14, int i9, Object obj) {
        long j15;
        long j16;
        long j17;
        long j18;
        boolean z10;
        float f9;
        long j19;
        long j20;
        boolean z11;
        int i10;
        List list2;
        long j21;
        if ((i9 & 1) != 0) {
            j15 = pointerInputChange.id;
        } else {
            j15 = j8;
        }
        if ((i9 & 2) != 0) {
            j16 = pointerInputChange.uptimeMillis;
        } else {
            j16 = j9;
        }
        if ((i9 & 4) != 0) {
            j17 = pointerInputChange.position;
        } else {
            j17 = j10;
        }
        if ((i9 & 8) != 0) {
            j18 = pointerInputChange.originalEventPosition;
        } else {
            j18 = j11;
        }
        if ((i9 & 16) != 0) {
            z10 = pointerInputChange.pressed;
        } else {
            z10 = z8;
        }
        if ((i9 & 32) != 0) {
            f9 = pointerInputChange.pressure;
        } else {
            f9 = f8;
        }
        if ((i9 & 64) != 0) {
            j19 = pointerInputChange.previousUptimeMillis;
        } else {
            j19 = j12;
        }
        if ((i9 & 128) != 0) {
            j20 = pointerInputChange.previousPosition;
        } else {
            j20 = j13;
        }
        long j22 = j20;
        if ((i9 & 256) != 0) {
            z11 = pointerInputChange.previousPressed;
        } else {
            z11 = z9;
        }
        if ((i9 & 512) != 0) {
            i10 = pointerInputChange.type;
        } else {
            i10 = i8;
        }
        int i11 = i10;
        if ((i9 & 1024) != 0) {
            list2 = pointerInputChange.getHistorical();
        } else {
            list2 = list;
        }
        boolean z12 = z11;
        List list3 = list2;
        if ((i9 & 2048) != 0) {
            j21 = pointerInputChange.scrollDelta;
        } else {
            j21 = j14;
        }
        return pointerInputChange.m3986copy8H9lfAM(j15, j16, j17, j18, z10, f9, j19, j22, z12, i11, list3, j21);
    }

    /* renamed from: copy-Ezr-O64$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3981copyEzrO64$default(PointerInputChange pointerInputChange, long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, ConsumedData consumedData, int i8, int i9, Object obj) {
        long j13;
        long j14;
        long j15;
        boolean z10;
        long j16;
        long j17;
        boolean z11;
        ConsumedData consumedData2;
        int i10;
        if ((i9 & 1) != 0) {
            j13 = pointerInputChange.id;
        } else {
            j13 = j8;
        }
        if ((i9 & 2) != 0) {
            j14 = pointerInputChange.uptimeMillis;
        } else {
            j14 = j9;
        }
        if ((i9 & 4) != 0) {
            j15 = pointerInputChange.position;
        } else {
            j15 = j10;
        }
        if ((i9 & 8) != 0) {
            z10 = pointerInputChange.pressed;
        } else {
            z10 = z8;
        }
        if ((i9 & 16) != 0) {
            j16 = pointerInputChange.previousUptimeMillis;
        } else {
            j16 = j11;
        }
        if ((i9 & 32) != 0) {
            j17 = pointerInputChange.previousPosition;
        } else {
            j17 = j12;
        }
        if ((i9 & 64) != 0) {
            z11 = pointerInputChange.previousPressed;
        } else {
            z11 = z9;
        }
        if ((i9 & 128) != 0) {
            consumedData2 = pointerInputChange.consumed;
        } else {
            consumedData2 = consumedData;
        }
        if ((i9 & 256) != 0) {
            i10 = pointerInputChange.type;
        } else {
            i10 = i8;
        }
        return pointerInputChange.m3987copyEzrO64(j13, j14, j15, z10, j16, j17, z11, consumedData2, i10);
    }

    /* renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3982copyJKmWfYY$default(PointerInputChange pointerInputChange, long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, int i8, long j13, int i9, Object obj) {
        long j14;
        long j15;
        long j16;
        boolean z10;
        long j17;
        long j18;
        boolean z11;
        int i10;
        long j19;
        if ((i9 & 1) != 0) {
            j14 = pointerInputChange.id;
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = pointerInputChange.uptimeMillis;
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = pointerInputChange.position;
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            z10 = pointerInputChange.pressed;
        } else {
            z10 = z8;
        }
        if ((i9 & 16) != 0) {
            j17 = pointerInputChange.previousUptimeMillis;
        } else {
            j17 = j11;
        }
        if ((i9 & 32) != 0) {
            j18 = pointerInputChange.previousPosition;
        } else {
            j18 = j12;
        }
        if ((i9 & 64) != 0) {
            z11 = pointerInputChange.previousPressed;
        } else {
            z11 = z9;
        }
        if ((i9 & 128) != 0) {
            i10 = pointerInputChange.type;
        } else {
            i10 = i8;
        }
        int i11 = i10;
        if ((i9 & 256) != 0) {
            j19 = pointerInputChange.scrollDelta;
        } else {
            j19 = j13;
        }
        return pointerInputChange.m3988copyJKmWfYY(j14, j15, j16, z10, j17, j18, z11, i11, j19);
    }

    /* renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3983copyOHpmEuE$default(PointerInputChange pointerInputChange, long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, int i8, List list, long j13, int i9, Object obj) {
        long j14;
        long j15;
        long j16;
        boolean z10;
        long j17;
        long j18;
        boolean z11;
        int i10;
        long j19;
        if ((i9 & 1) != 0) {
            j14 = pointerInputChange.id;
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = pointerInputChange.uptimeMillis;
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = pointerInputChange.position;
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            z10 = pointerInputChange.pressed;
        } else {
            z10 = z8;
        }
        if ((i9 & 16) != 0) {
            j17 = pointerInputChange.previousUptimeMillis;
        } else {
            j17 = j11;
        }
        if ((i9 & 32) != 0) {
            j18 = pointerInputChange.previousPosition;
        } else {
            j18 = j12;
        }
        if ((i9 & 64) != 0) {
            z11 = pointerInputChange.previousPressed;
        } else {
            z11 = z9;
        }
        if ((i9 & 128) != 0) {
            i10 = pointerInputChange.type;
        } else {
            i10 = i8;
        }
        int i11 = i10;
        if ((i9 & 512) != 0) {
            j19 = pointerInputChange.scrollDelta;
        } else {
            j19 = j13;
        }
        return pointerInputChange.m3989copyOHpmEuE(j14, j15, j16, z10, j17, j18, z11, i11, list, j19);
    }

    /* renamed from: copy-Tn9QgHE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3984copyTn9QgHE$default(PointerInputChange pointerInputChange, long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, int i8, long j13, int i9, Object obj) {
        long j14;
        long j15;
        long j16;
        boolean z10;
        float f9;
        long j17;
        long j18;
        boolean z11;
        int i10;
        long j19;
        if ((i9 & 1) != 0) {
            j14 = pointerInputChange.id;
        } else {
            j14 = j8;
        }
        if ((i9 & 2) != 0) {
            j15 = pointerInputChange.uptimeMillis;
        } else {
            j15 = j9;
        }
        if ((i9 & 4) != 0) {
            j16 = pointerInputChange.position;
        } else {
            j16 = j10;
        }
        if ((i9 & 8) != 0) {
            z10 = pointerInputChange.pressed;
        } else {
            z10 = z8;
        }
        if ((i9 & 16) != 0) {
            f9 = pointerInputChange.pressure;
        } else {
            f9 = f8;
        }
        if ((i9 & 32) != 0) {
            j17 = pointerInputChange.previousUptimeMillis;
        } else {
            j17 = j11;
        }
        if ((i9 & 64) != 0) {
            j18 = pointerInputChange.previousPosition;
        } else {
            j18 = j12;
        }
        if ((i9 & 128) != 0) {
            z11 = pointerInputChange.previousPressed;
        } else {
            z11 = z9;
        }
        if ((i9 & 256) != 0) {
            i10 = pointerInputChange.type;
        } else {
            i10 = i8;
        }
        boolean z12 = z11;
        int i11 = i10;
        if ((i9 & 512) != 0) {
            j19 = pointerInputChange.scrollDelta;
        } else {
            j19 = j13;
        }
        return pointerInputChange.m3990copyTn9QgHE(j14, j15, j16, z10, f9, j17, j18, z12, i11, j19);
    }

    public static /* synthetic */ void getConsumed$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getHistorical$annotations() {
    }

    private static /* synthetic */ void get_historical$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    /* renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m3985copy0GkPj7c(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, ConsumedData consumedData, int i8, long j13) {
        boolean z10;
        float f8 = this.pressure;
        if (!consumedData.getDownChange() && !consumedData.getPositionChange()) {
            z10 = false;
        } else {
            z10 = true;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j8, j9, j10, z8, f8, j11, j12, z9, z10, i8, getHistorical(), j13, this.originalEventPosition, null);
        this.consumed = consumedData;
        return pointerInputChange;
    }

    @ExperimentalComposeUiApi
    /* renamed from: copy-8H9lfAM, reason: not valid java name */
    public final PointerInputChange m3986copy8H9lfAM(long j8, long j9, long j10, long j11, boolean z8, float f8, long j12, long j13, boolean z9, int i8, List<HistoricalChange> list, long j14) {
        PointerInputChange pointerInputChange = new PointerInputChange(j8, j9, j10, z8, f8, j12, j13, z9, false, i8, list, j14, j11, null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    /* renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m3987copyEzrO64(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, ConsumedData consumedData, int i8) {
        boolean z10;
        float f8 = this.pressure;
        if (!consumedData.getDownChange() && !consumedData.getPositionChange()) {
            z10 = false;
        } else {
            z10 = true;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j8, j9, j10, z8, f8, j11, j12, z9, z10, i8, getHistorical(), this.scrollDelta, this.originalEventPosition, null);
        this.consumed = consumedData;
        return pointerInputChange;
    }

    /* renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m3988copyJKmWfYY(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, int i8, long j13) {
        return m3980copy8H9lfAM$default(this, j8, j9, j10, 0L, z8, this.pressure, j11, j12, z9, i8, getHistorical(), j13, 8, null);
    }

    @ExperimentalComposeUiApi
    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m3989copyOHpmEuE(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, int i8, List<HistoricalChange> list, long j13) {
        return m3980copy8H9lfAM$default(this, j8, j9, j10, 0L, z8, this.pressure, j11, j12, z9, i8, list, j13, 8, null);
    }

    /* renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m3990copyTn9QgHE(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, int i8, long j13) {
        PointerInputChange pointerInputChange = new PointerInputChange(j8, j9, j10, z8, f8, j11, j12, z9, false, i8, getHistorical(), j13, this.originalEventPosition, null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    public final ConsumedData getConsumed() {
        return this.consumed;
    }

    @ExperimentalComposeUiApi
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        if (list == null) {
            return AbstractC1435t.m();
        }
        return list;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m3991getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m3992getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m3993getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m3994getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m3995getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m3996getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        if (!this.consumed.getDownChange() && !this.consumed.getPositionChange()) {
            return false;
        }
        return true;
    }

    /* renamed from: setOriginalEventPosition-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m3997setOriginalEventPositionk4lQ0M$ui_release(long j8) {
        this.originalEventPosition = j8;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m3977toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m2720toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m2720toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m4056toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m2720toStringimpl(this.scrollDelta)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, boolean z10, int i8, List list, long j13, long j14, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, z8, f8, j11, j12, z9, z10, i8, (List<HistoricalChange>) list, j13, j14);
    }

    public /* synthetic */ PointerInputChange(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, ConsumedData consumedData, int i8, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, z8, j11, j12, z9, consumedData, i8);
    }

    public /* synthetic */ PointerInputChange(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, boolean z10, int i8, long j13, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, z8, j11, j12, z9, z10, i8, j13);
    }

    private PointerInputChange(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, boolean z10, int i8, long j13) {
        this.id = j8;
        this.uptimeMillis = j9;
        this.position = j10;
        this.pressed = z8;
        this.pressure = f8;
        this.previousUptimeMillis = j11;
        this.previousPosition = j12;
        this.previousPressed = z9;
        this.type = i8;
        this.scrollDelta = j13;
        this.originalEventPosition = Offset.Companion.m2728getZeroF1C5BW0();
        this.consumed = new ConsumedData(z10, z10);
    }

    public /* synthetic */ PointerInputChange(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, boolean z10, int i8, long j13, int i9, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, z8, f8, j11, j12, z9, z10, (i9 & 512) != 0 ? PointerType.Companion.m4061getTouchT8wyACA() : i8, (i9 & 1024) != 0 ? Offset.Companion.m2728getZeroF1C5BW0() : j13, (AbstractC3284p) null);
    }

    public /* synthetic */ PointerInputChange(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, boolean z10, int i8, long j13, int i9, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, z8, j11, j12, z9, z10, (i9 & 256) != 0 ? PointerType.Companion.m4061getTouchT8wyACA() : i8, (i9 & 512) != 0 ? Offset.Companion.m2728getZeroF1C5BW0() : j13, (AbstractC3284p) null);
    }

    private PointerInputChange(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, boolean z10, int i8, long j13) {
        this(j8, j9, j10, z8, 1.0f, j11, j12, z9, z10, i8, j13, (AbstractC3284p) null);
    }

    public /* synthetic */ PointerInputChange(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, ConsumedData consumedData, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, z8, j11, j12, z9, consumedData, (i9 & 256) != 0 ? PointerType.Companion.m4061getTouchT8wyACA() : i8, (AbstractC3284p) null);
    }

    private PointerInputChange(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, ConsumedData consumedData, int i8) {
        this(j8, j9, j10, z8, 1.0f, j11, j12, z9, consumedData.getDownChange() || consumedData.getPositionChange(), i8, Offset.Companion.m2728getZeroF1C5BW0(), (AbstractC3284p) null);
    }

    private PointerInputChange(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, boolean z10, int i8, List<HistoricalChange> list, long j13, long j14) {
        this(j8, j9, j10, z8, f8, j11, j12, z9, z10, i8, j13, (AbstractC3284p) null);
        this._historical = list;
        this.originalEventPosition = j14;
    }
}
