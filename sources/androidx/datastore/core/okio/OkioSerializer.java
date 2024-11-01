package androidx.datastore.core.okio;

import U5.d;
import U6.InterfaceC1450f;
import U6.InterfaceC1451g;

/* loaded from: classes3.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(InterfaceC1451g interfaceC1451g, d dVar);

    Object writeTo(T t8, InterfaceC1450f interfaceC1450f, d dVar);
}
