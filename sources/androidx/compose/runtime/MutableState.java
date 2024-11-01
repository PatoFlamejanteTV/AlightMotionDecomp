package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;

@Stable
/* loaded from: classes.dex */
public interface MutableState<T> extends State<T> {
    T component1();

    Function1 component2();

    T getValue();

    void setValue(T t8);
}
