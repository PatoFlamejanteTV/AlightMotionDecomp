package kotlin.jvm.internal;

import b6.C1990b;
import j6.InterfaceC3213b;
import j6.InterfaceC3215d;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: kotlin.jvm.internal.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3279k implements InterfaceC3213b, Serializable {
    public static final Object NO_RECEIVER = a.f34591a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC3213b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.k$a */
    /* loaded from: classes5.dex */
    private static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private static final a f34591a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3279k(Object obj, Class cls, String str, String str2, boolean z8) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z8;
    }

    @Override // j6.InterfaceC3213b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // j6.InterfaceC3213b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC3213b compute() {
        InterfaceC3213b interfaceC3213b = this.reflected;
        if (interfaceC3213b == null) {
            InterfaceC3213b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return interfaceC3213b;
    }

    protected abstract InterfaceC3213b computeReflected();

    @Override // j6.InterfaceC3212a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // j6.InterfaceC3213b
    public String getName() {
        return this.name;
    }

    public InterfaceC3215d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return U.c(cls);
        }
        return U.b(cls);
    }

    @Override // j6.InterfaceC3213b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC3213b getReflected() {
        InterfaceC3213b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C1990b();
    }

    @Override // j6.InterfaceC3213b
    public j6.m getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // j6.InterfaceC3213b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // j6.InterfaceC3213b
    public j6.n getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // j6.InterfaceC3213b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // j6.InterfaceC3213b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // j6.InterfaceC3213b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // j6.InterfaceC3213b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
