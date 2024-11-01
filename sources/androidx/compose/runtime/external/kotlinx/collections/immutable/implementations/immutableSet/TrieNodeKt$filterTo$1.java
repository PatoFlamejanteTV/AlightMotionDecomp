package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class TrieNodeKt$filterTo$1 extends AbstractC3293z implements Function1 {
    public static final TrieNodeKt$filterTo$1 INSTANCE = new TrieNodeKt$filterTo$1();

    public TrieNodeKt$filterTo$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj != TrieNode.Companion.getEMPTY$runtime_release());
    }
}
