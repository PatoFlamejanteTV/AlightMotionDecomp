package androidx.datastore.core;

import U5.d;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public interface InterProcessCoordinator {
    InterfaceC3821f getUpdateNotifications();

    Object getVersion(d dVar);

    Object incrementAndGetVersion(d dVar);

    <T> Object lock(Function1 function1, d dVar);

    <T> Object tryLock(InterfaceC2072n interfaceC2072n, d dVar);
}
