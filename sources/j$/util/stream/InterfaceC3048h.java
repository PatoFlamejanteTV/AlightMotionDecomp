package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3048h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC3048h onClose(Runnable runnable);

    InterfaceC3048h parallel();

    InterfaceC3048h sequential();

    Spliterator spliterator();

    InterfaceC3048h unordered();
}
