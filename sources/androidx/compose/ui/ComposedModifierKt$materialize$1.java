package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ComposedModifierKt$materialize$1 extends AbstractC3293z implements Function1 {
    public static final ComposedModifierKt$materialize$1 INSTANCE = new ComposedModifierKt$materialize$1();

    ComposedModifierKt$materialize$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Modifier.Element element) {
        return Boolean.valueOf(!(element instanceof ComposedModifier));
    }
}
