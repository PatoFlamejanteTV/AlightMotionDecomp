package androidx.activity.compose;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 extends AbstractC3293z implements Function0 {
    public static final ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 INSTANCE = new ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1();

    ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
