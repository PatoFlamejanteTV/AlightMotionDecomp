package androidx.compose.runtime;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class Pending$keyMap$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Pending this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pending$keyMap$2(Pending pending) {
        super(0);
        this.this$0 = pending;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HashMap<Object, LinkedHashSet<KeyInfo>> invoke() {
        HashMap<Object, LinkedHashSet<KeyInfo>> multiMap;
        Object joinedKey;
        multiMap = ComposerKt.multiMap();
        Pending pending = this.this$0;
        int size = pending.getKeyInfos().size();
        for (int i8 = 0; i8 < size; i8++) {
            KeyInfo keyInfo = pending.getKeyInfos().get(i8);
            joinedKey = ComposerKt.getJoinedKey(keyInfo);
            ComposerKt.put(multiMap, joinedKey, keyInfo);
        }
        return multiMap;
    }
}
