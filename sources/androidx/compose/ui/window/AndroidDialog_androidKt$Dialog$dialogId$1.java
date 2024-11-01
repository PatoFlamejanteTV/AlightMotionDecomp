package androidx.compose.ui.window;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidDialog_androidKt$Dialog$dialogId$1 extends AbstractC3293z implements Function0 {
    public static final AndroidDialog_androidKt$Dialog$dialogId$1 INSTANCE = new AndroidDialog_androidKt$Dialog$dialogId$1();

    AndroidDialog_androidKt$Dialog$dialogId$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final UUID invoke() {
        return UUID.randomUUID();
    }
}
