package androidx.fragment.app;

import R5.AbstractC1435t;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class DefaultSpecialEffectsController$retainMatchingViews$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Collection<String> $names;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$retainMatchingViews$1(Collection<String> collection) {
        super(1);
        this.$names = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map.Entry<String, View> entry) {
        AbstractC3292y.i(entry, "entry");
        return Boolean.valueOf(AbstractC1435t.d0(this.$names, ViewCompat.getTransitionName(entry.getValue())));
    }
}
