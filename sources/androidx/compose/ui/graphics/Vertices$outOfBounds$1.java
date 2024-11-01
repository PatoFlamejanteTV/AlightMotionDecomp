package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class Vertices$outOfBounds$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ List<Offset> $positions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vertices$outOfBounds$1(List<Offset> list) {
        super(1);
        this.$positions = list;
    }

    public final Boolean invoke(int i8) {
        return Boolean.valueOf(i8 < 0 || i8 >= this.$positions.size());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
