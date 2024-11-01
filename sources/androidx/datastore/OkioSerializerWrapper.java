package androidx.datastore;

import Q5.I;
import U5.d;
import U6.InterfaceC1450f;
import U6.InterfaceC1451g;
import V5.b;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {
    private final Serializer<T> delegate;

    public OkioSerializerWrapper(Serializer<T> delegate) {
        AbstractC3292y.i(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object readFrom(InterfaceC1451g interfaceC1451g, d dVar) {
        return this.delegate.readFrom(interfaceC1451g.inputStream(), dVar);
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object writeTo(T t8, InterfaceC1450f interfaceC1450f, d dVar) {
        Object writeTo = this.delegate.writeTo(t8, interfaceC1450f.outputStream(), dVar);
        if (writeTo == b.e()) {
            return writeTo;
        }
        return I.f8786a;
    }
}
