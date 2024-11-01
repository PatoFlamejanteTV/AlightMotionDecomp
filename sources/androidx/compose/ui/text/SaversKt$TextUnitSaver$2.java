package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$TextUnitSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$TextUnitSaver$2 INSTANCE = new SaversKt$TextUnitSaver$2();

    SaversKt$TextUnitSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-XNhUCwk, reason: not valid java name and merged with bridge method [inline-methods] */
    public final TextUnit invoke(Object obj) {
        Float f8;
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnitType textUnitType = null;
        if (obj2 != null) {
            f8 = (Float) obj2;
        } else {
            f8 = null;
        }
        AbstractC3292y.f(f8);
        float floatValue = f8.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            textUnitType = (TextUnitType) obj3;
        }
        AbstractC3292y.f(textUnitType);
        return TextUnit.m5332boximpl(TextUnitKt.m5354TextUnitanM5pPY(floatValue, textUnitType.m5373unboximpl()));
    }
}
