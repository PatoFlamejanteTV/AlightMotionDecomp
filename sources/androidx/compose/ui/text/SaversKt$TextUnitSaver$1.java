package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$TextUnitSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$TextUnitSaver$1 INSTANCE = new SaversKt$TextUnitSaver$1();

    SaversKt$TextUnitSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4616invokempE4wyQ((SaverScope) obj, ((TextUnit) obj2).m5351unboximpl());
    }

    /* renamed from: invoke-mpE4wyQ, reason: not valid java name */
    public final Object m4616invokempE4wyQ(SaverScope saverScope, long j8) {
        return AbstractC1435t.g(SaversKt.save(Float.valueOf(TextUnit.m5342getValueimpl(j8))), SaversKt.save(TextUnitType.m5367boximpl(TextUnit.m5341getTypeUIouoOA(j8))));
    }
}
