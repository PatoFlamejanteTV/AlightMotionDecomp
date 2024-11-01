package androidx.datastore.core;

import U5.d;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;

/* loaded from: classes3.dex */
public interface StorageConnection<T> extends Closeable {
    InterProcessCoordinator getCoordinator();

    <R> Object readScope(InterfaceC2073o interfaceC2073o, d dVar);

    Object writeScope(InterfaceC2072n interfaceC2072n, d dVar);
}
