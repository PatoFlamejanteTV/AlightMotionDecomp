package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$OffsetSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$OffsetSaver$1 INSTANCE = new SaversKt$OffsetSaver$1();

    SaversKt$OffsetSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4612invokeUv8p0NA((SaverScope) obj, ((Offset) obj2).m2722unboximpl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final Object m4612invokeUv8p0NA(SaverScope saverScope, long j8) {
        if (Offset.m2709equalsimpl0(j8, Offset.Companion.m2727getUnspecifiedF1C5BW0())) {
            return Boolean.FALSE;
        }
        return AbstractC1435t.g(SaversKt.save(Float.valueOf(Offset.m2712getXimpl(j8))), SaversKt.save(Float.valueOf(Offset.m2713getYimpl(j8))));
    }
}
