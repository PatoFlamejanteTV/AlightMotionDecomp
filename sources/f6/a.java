package F6;

import j6.InterfaceC3214c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Z;
import y6.InterfaceC4248a;
import y6.i;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f2718a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2719b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f2720c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f2721d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f2722e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider) {
        super(null);
        AbstractC3292y.i(class2ContextualFactory, "class2ContextualFactory");
        AbstractC3292y.i(polyBase2Serializers, "polyBase2Serializers");
        AbstractC3292y.i(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC3292y.i(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC3292y.i(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f2718a = class2ContextualFactory;
        this.f2719b = polyBase2Serializers;
        this.f2720c = polyBase2DefaultSerializerProvider;
        this.f2721d = polyBase2NamedSerializers;
        this.f2722e = polyBase2DefaultDeserializerProvider;
    }

    @Override // F6.b
    public void a(d collector) {
        AbstractC3292y.i(collector, "collector");
        for (Map.Entry entry : this.f2718a.entrySet()) {
            android.support.v4.media.a.a(entry.getValue());
        }
        for (Map.Entry entry2 : this.f2719b.entrySet()) {
            InterfaceC3214c interfaceC3214c = (InterfaceC3214c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC3214c interfaceC3214c2 = (InterfaceC3214c) entry3.getKey();
                y6.b bVar = (y6.b) entry3.getValue();
                AbstractC3292y.g(interfaceC3214c, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC3292y.g(interfaceC3214c2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC3292y.g(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.b(interfaceC3214c, interfaceC3214c2, bVar);
            }
        }
        for (Map.Entry entry4 : this.f2720c.entrySet()) {
            InterfaceC3214c interfaceC3214c3 = (InterfaceC3214c) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            AbstractC3292y.g(interfaceC3214c3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC3292y.g(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.a(interfaceC3214c3, (Function1) Z.d(function1, 1));
        }
        for (Map.Entry entry5 : this.f2722e.entrySet()) {
            InterfaceC3214c interfaceC3214c4 = (InterfaceC3214c) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            AbstractC3292y.g(interfaceC3214c4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC3292y.g(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.c(interfaceC3214c4, (Function1) Z.d(function12, 1));
        }
    }

    @Override // F6.b
    public y6.b b(InterfaceC3214c kClass, List typeArgumentsSerializers) {
        AbstractC3292y.i(kClass, "kClass");
        AbstractC3292y.i(typeArgumentsSerializers, "typeArgumentsSerializers");
        android.support.v4.media.a.a(this.f2718a.get(kClass));
        return null;
    }

    @Override // F6.b
    public InterfaceC4248a d(InterfaceC3214c baseClass, String str) {
        y6.b bVar;
        Function1 function1;
        AbstractC3292y.i(baseClass, "baseClass");
        Map map = (Map) this.f2721d.get(baseClass);
        if (map != null) {
            bVar = (y6.b) map.get(str);
        } else {
            bVar = null;
        }
        if (!(bVar instanceof y6.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f2722e.get(baseClass);
        if (Z.i(obj, 1)) {
            function1 = (Function1) obj;
        } else {
            function1 = null;
        }
        if (function1 == null) {
            return null;
        }
        return (InterfaceC4248a) function1.invoke(str);
    }

    @Override // F6.b
    public i e(InterfaceC3214c baseClass, Object value) {
        y6.b bVar;
        Function1 function1;
        AbstractC3292y.i(baseClass, "baseClass");
        AbstractC3292y.i(value, "value");
        if (!baseClass.c(value)) {
            return null;
        }
        Map map = (Map) this.f2719b.get(baseClass);
        if (map != null) {
            bVar = (y6.b) map.get(U.b(value.getClass()));
        } else {
            bVar = null;
        }
        if (!(bVar instanceof i)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f2720c.get(baseClass);
        if (Z.i(obj, 1)) {
            function1 = (Function1) obj;
        } else {
            function1 = null;
        }
        if (function1 == null) {
            return null;
        }
        return (i) function1.invoke(value);
    }
}
