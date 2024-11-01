package androidx.datastore.core;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;
import p6.d;
import p6.g;
import p6.h;
import p6.o;

/* loaded from: classes3.dex */
public final class SimpleActor<T> {
    private final InterfaceC2072n consumeMessage;
    private final d messageQueue;
    private final AtomicInt remainingMessages;
    private final M scope;

    /* renamed from: androidx.datastore.core.SimpleActor$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ Function1 $onComplete;
        final /* synthetic */ InterfaceC2072n $onUndeliveredElement;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1, SimpleActor<T> simpleActor, InterfaceC2072n interfaceC2072n) {
            super(1);
            this.$onComplete = function1;
            this.this$0 = simpleActor;
            this.$onUndeliveredElement = interfaceC2072n;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8786a;
        }

        public final void invoke(Throwable th) {
            I i8;
            this.$onComplete.invoke(th);
            ((SimpleActor) this.this$0).messageQueue.d(th);
            do {
                Object f8 = h.f(((SimpleActor) this.this$0).messageQueue.c());
                if (f8 != null) {
                    this.$onUndeliveredElement.invoke(f8, th);
                    i8 = I.f8786a;
                } else {
                    i8 = null;
                }
            } while (i8 != null);
        }
    }

    public SimpleActor(M scope, Function1 onComplete, InterfaceC2072n onUndeliveredElement, InterfaceC2072n consumeMessage) {
        AbstractC3292y.i(scope, "scope");
        AbstractC3292y.i(onComplete, "onComplete");
        AbstractC3292y.i(onUndeliveredElement, "onUndeliveredElement");
        AbstractC3292y.i(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = g.b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInt(0);
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) scope.getCoroutineContext().get(InterfaceC3488x0.f35757n0);
        if (interfaceC3488x0 != null) {
            interfaceC3488x0.u(new AnonymousClass1(onComplete, this, onUndeliveredElement));
        }
    }

    public final void offer(T t8) {
        Object x8 = this.messageQueue.x(t8);
        if (x8 instanceof h.a) {
            Throwable e8 = h.e(x8);
            if (e8 == null) {
                throw new o("Channel was closed normally");
            }
            throw e8;
        }
        if (h.i(x8)) {
            if (this.remainingMessages.getAndIncrement() == 0) {
                AbstractC3462k.d(this.scope, null, null, new SimpleActor$offer$2(this, null), 3, null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
