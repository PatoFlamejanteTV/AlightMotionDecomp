package androidx.datastore.core.okio;

import Q5.InterfaceC1416k;
import Q5.l;
import U6.AbstractC1455k;
import U6.Q;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import c6.InterfaceC2072n;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
public final class OkioStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Synchronizer activeFilesLock = new Synchronizer();
    private final InterfaceC1416k canonicalPath$delegate;
    private final InterfaceC2072n coordinatorProducer;
    private final AbstractC1455k fileSystem;
    private final Function0 producePath;
    private final OkioSerializer<T> serializer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.core.okio.OkioStorage$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public final InterProcessCoordinator invoke(Q path, AbstractC1455k abstractC1455k) {
            AbstractC3292y.i(path, "path");
            AbstractC3292y.i(abstractC1455k, "<anonymous parameter 1>");
            return OkioStorageKt.createSingleProcessCoordinator(path);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public OkioStorage(AbstractC1455k fileSystem, OkioSerializer<T> serializer, InterfaceC2072n coordinatorProducer, Function0 producePath) {
        AbstractC3292y.i(fileSystem, "fileSystem");
        AbstractC3292y.i(serializer, "serializer");
        AbstractC3292y.i(coordinatorProducer, "coordinatorProducer");
        AbstractC3292y.i(producePath, "producePath");
        this.fileSystem = fileSystem;
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.producePath = producePath;
        this.canonicalPath$delegate = l.b(new OkioStorage$canonicalPath$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Q getCanonicalPath() {
        return (Q) this.canonicalPath$delegate.getValue();
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() {
        String q8 = getCanonicalPath().toString();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (!set.contains(q8)) {
                set.add(q8);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + q8 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new OkioStorage$createConnection$2(this));
    }

    public /* synthetic */ OkioStorage(AbstractC1455k abstractC1455k, OkioSerializer okioSerializer, InterfaceC2072n interfaceC2072n, Function0 function0, int i8, AbstractC3284p abstractC3284p) {
        this(abstractC1455k, okioSerializer, (i8 & 4) != 0 ? AnonymousClass1.INSTANCE : interfaceC2072n, function0);
    }
}
