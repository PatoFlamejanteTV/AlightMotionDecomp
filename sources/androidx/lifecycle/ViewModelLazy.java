package androidx.lifecycle;

import Q5.InterfaceC1416k;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import j6.InterfaceC3214c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
public final class ViewModelLazy<VM extends ViewModel> implements InterfaceC1416k {
    private VM cached;
    private final Function0 extrasProducer;
    private final Function0 factoryProducer;
    private final Function0 storeProducer;
    private final InterfaceC3214c viewModelClass;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ViewModelLazy$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras.Empty invoke() {
            return CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(InterfaceC3214c viewModelClass, Function0 storeProducer, Function0 factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        AbstractC3292y.i(viewModelClass, "viewModelClass");
        AbstractC3292y.i(storeProducer, "storeProducer");
        AbstractC3292y.i(factoryProducer, "factoryProducer");
    }

    @Override // Q5.InterfaceC1416k
    public boolean isInitialized() {
        if (this.cached != null) {
            return true;
        }
        return false;
    }

    public ViewModelLazy(InterfaceC3214c viewModelClass, Function0 storeProducer, Function0 factoryProducer, Function0 extrasProducer) {
        AbstractC3292y.i(viewModelClass, "viewModelClass");
        AbstractC3292y.i(storeProducer, "storeProducer");
        AbstractC3292y.i(factoryProducer, "factoryProducer");
        AbstractC3292y.i(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // Q5.InterfaceC1416k
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) ViewModelProvider.Companion.create((ViewModelStore) this.storeProducer.invoke(), (ViewModelProvider.Factory) this.factoryProducer.invoke(), (CreationExtras) this.extrasProducer.invoke()).get(this.viewModelClass);
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(InterfaceC3214c interfaceC3214c, Function0 function0, Function0 function02, Function0 function03, int i8, AbstractC3284p abstractC3284p) {
        this(interfaceC3214c, function0, function02, (i8 & 8) != 0 ? AnonymousClass1.INSTANCE : function03);
    }
}
