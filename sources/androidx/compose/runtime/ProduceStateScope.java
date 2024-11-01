package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import n6.M;

/* loaded from: classes.dex */
public interface ProduceStateScope<T> extends MutableState<T>, M {
    Object awaitDispose(Function0 function0, U5.d dVar);

    /* synthetic */ U5.g getCoroutineContext();
}
