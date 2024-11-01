package androidx.compose.ui.platform;

import Q5.C1413h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalClipboardManager$1 extends AbstractC3293z implements Function0 {
    public static final CompositionLocalsKt$LocalClipboardManager$1 INSTANCE = new CompositionLocalsKt$LocalClipboardManager$1();

    CompositionLocalsKt$LocalClipboardManager$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ClipboardManager invoke() {
        CompositionLocalsKt.noLocalProvidedFor("LocalClipboardManager");
        throw new C1413h();
    }
}
