package m1;

import R5.AbstractC1435t;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n1.C3388a;
import n1.InterfaceC3389b;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;
import n6.N;

/* renamed from: m1.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3348D {

    /* renamed from: f, reason: collision with root package name */
    public static final b f34845f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final U5.g f34846a;

    /* renamed from: b, reason: collision with root package name */
    private Messenger f34847b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34848c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingDeque f34849d;

    /* renamed from: e, reason: collision with root package name */
    private final d f34850e;

    /* renamed from: m1.D$a */
    /* loaded from: classes4.dex */
    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final U5.g f34851a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m1.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0798a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f34852a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f34853b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0798a(String str, U5.d dVar) {
                super(2, dVar);
                this.f34853b = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0798a(this.f34853b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f34852a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    C3388a c3388a = C3388a.f35071a;
                    this.f34852a = 1;
                    obj = c3388a.c(this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                Collection<InterfaceC3389b> values = ((Map) obj).values();
                String str = this.f34853b;
                for (InterfaceC3389b interfaceC3389b : values) {
                    interfaceC3389b.c(new InterfaceC3389b.C0806b(str));
                    Log.d("SessionLifecycleClient", "Notified " + interfaceC3389b.b() + " of new session " + str);
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0798a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U5.g backgroundDispatcher) {
            super(Looper.getMainLooper());
            AbstractC3292y.i(backgroundDispatcher, "backgroundDispatcher");
            this.f34851a = backgroundDispatcher;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            AbstractC3462k.d(N.a(this.f34851a), null, null, new C0798a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String str;
            AbstractC3292y.i(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* renamed from: m1.D$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1.D$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f34854a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f34856c;

        /* renamed from: m1.D$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return T5.a.a(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, U5.d dVar) {
            super(2, dVar);
            this.f34856c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f34856c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f34854a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C3388a c3388a = C3388a.f35071a;
                this.f34854a = 1;
                obj = c3388a.c(this);
                if (obj == e8) {
                    return e8;
                }
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC3389b) it.next()).a()) {
                            List P02 = AbstractC1435t.P0(AbstractC1435t.j0(AbstractC1435t.s(C3348D.this.l(this.f34856c, 2), C3348D.this.l(this.f34856c, 1))), new a());
                            C3348D c3348d = C3348D.this;
                            Iterator it2 = P02.iterator();
                            while (it2.hasNext()) {
                                c3348d.p((Message) it2.next());
                            }
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: m1.D$d */
    /* loaded from: classes4.dex */
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + C3348D.this.f34849d.size());
            C3348D.this.f34847b = new Messenger(iBinder);
            C3348D.this.f34848c = true;
            C3348D c3348d = C3348D.this;
            c3348d.o(c3348d.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            C3348D.this.f34847b = null;
            C3348D.this.f34848c = false;
        }
    }

    public C3348D(U5.g backgroundDispatcher) {
        AbstractC3292y.i(backgroundDispatcher, "backgroundDispatcher");
        this.f34846a = backgroundDispatcher;
        this.f34849d = new LinkedBlockingDeque(20);
        this.f34850e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List j() {
        ArrayList arrayList = new ArrayList();
        this.f34849d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message l(List list, int i8) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i8) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        return (Message) obj;
    }

    private final void m(Message message) {
        if (this.f34849d.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.f34849d.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    private final void n(int i8) {
        List j8 = j();
        Message obtain = Message.obtain(null, i8, 0, 0);
        AbstractC3292y.h(obtain, "obtain(null, messageCode, 0, 0)");
        j8.add(obtain);
        o(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3488x0 o(List list) {
        InterfaceC3488x0 d8;
        d8 = AbstractC3462k.d(N.a(this.f34846a), null, null, new c(list, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message message) {
        if (this.f34847b != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.f34847b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e8) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e8);
                m(message);
                return;
            }
        }
        m(message);
    }

    public final void h() {
        n(2);
    }

    public final void i(InterfaceC3350F sessionLifecycleServiceBinder) {
        AbstractC3292y.i(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.a(new Messenger(new a(this.f34846a)), this.f34850e);
    }

    public final void k() {
        n(1);
    }
}
