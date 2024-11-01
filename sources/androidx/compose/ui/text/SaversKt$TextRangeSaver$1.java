package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$TextRangeSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$TextRangeSaver$1 INSTANCE = new SaversKt$TextRangeSaver$1();

    SaversKt$TextRangeSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4614invokeFDrldGo((SaverScope) obj, ((TextRange) obj2).m4673unboximpl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke-FDrldGo, reason: not valid java name */
    public final Object m4614invokeFDrldGo(SaverScope saverScope, long j8) {
        return AbstractC1435t.g(SaversKt.save(Integer.valueOf(TextRange.m4669getStartimpl(j8))), SaversKt.save(Integer.valueOf(TextRange.m4664getEndimpl(j8))));
    }
}
