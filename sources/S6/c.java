package S6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c extends f {

    /* renamed from: c, reason: collision with root package name */
    final Method f9763c;

    /* renamed from: d, reason: collision with root package name */
    final Method f9764d;

    c(Method method, Method method2) {
        this.f9763c = method;
        this.f9764d = method2;
    }

    public static c r() {
        try {
            return new c(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // S6.f
    public void f(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List b9 = f.b(list);
            this.f9763c.invoke(sSLParameters, b9.toArray(new String[b9.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw L6.c.a("unable to set ssl parameters", e8);
        }
    }

    @Override // S6.f
    public String l(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f9764d.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw L6.c.a("unable to get selected protocols", e8);
        }
    }
}
