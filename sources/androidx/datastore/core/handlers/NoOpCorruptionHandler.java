package androidx.datastore.core.handlers;

import U5.d;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;

/* loaded from: classes3.dex */
public final class NoOpCorruptionHandler<T> implements CorruptionHandler<T> {
    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, d dVar) throws CorruptionException {
        throw corruptionException;
    }
}
