package androidx.datastore.core;

import U5.g;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3487x;

/* loaded from: classes3.dex */
public abstract class Message<T> {

    /* loaded from: classes3.dex */
    public static final class Read<T> extends Message<T> {
        private final State<T> lastState;

        public Read(State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Update<T> extends Message<T> {
        private final InterfaceC3487x ack;
        private final g callerContext;
        private final State<T> lastState;
        private final InterfaceC2072n transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(InterfaceC2072n transform, InterfaceC3487x ack, State<T> state, g callerContext) {
            super(null);
            AbstractC3292y.i(transform, "transform");
            AbstractC3292y.i(ack, "ack");
            AbstractC3292y.i(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = state;
            this.callerContext = callerContext;
        }

        public final InterfaceC3487x getAck() {
            return this.ack;
        }

        public final g getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }

        public final InterfaceC2072n getTransform() {
            return this.transform;
        }
    }

    private Message() {
    }

    public abstract State<T> getLastState();

    public /* synthetic */ Message(AbstractC3284p abstractC3284p) {
        this();
    }
}
