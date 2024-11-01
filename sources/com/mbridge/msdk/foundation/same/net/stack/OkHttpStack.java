package com.mbridge.msdk.foundation.same.net.stack;

import android.text.TextUtils;
import com.mbridge.msdk.c.e;
import com.mbridge.msdk.foundation.same.net.dns.MBDns;
import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.same.net.stack.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.thrid.okhttp.Call;
import com.mbridge.msdk.thrid.okhttp.Connection;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.MediaType;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.RequestBody;
import com.mbridge.msdk.thrid.okhttp.Response;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class OkHttpStack implements b {
    private final OkHttpClient mClient = c.a.a().b();

    /* loaded from: classes4.dex */
    private static class DefaultEventListener extends EventListener {
        private long callDuring;
        private long callStart;
        private long connectDuring;
        private String connectErrorMessage;
        private long connectStart;
        private long connectionDuring;
        private long connectionStart;
        private long dnsDuring;
        private String dnsResult;
        private long dnsStart;
        private String hostName;
        private c.b httpStatus;
        private boolean isReportHttpStatus;
        private String method;

        public DefaultEventListener(String str) {
            try {
                boolean a9 = c.a().a(str);
                this.isReportHttpStatus = a9;
                if (a9) {
                    this.httpStatus = c.a().c();
                }
            } catch (Exception unused) {
                this.isReportHttpStatus = false;
                this.httpStatus = null;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void callEnd(Call call) {
            super.callEnd(call);
            try {
                com.mbridge.msdk.foundation.same.net.a.a().b();
            } catch (Exception unused) {
            }
            if (this.isReportHttpStatus && this.httpStatus != null) {
                try {
                    long currentTimeMillis = System.currentTimeMillis() - this.callStart;
                    this.callDuring = currentTimeMillis;
                    c.b bVar = this.httpStatus;
                    bVar.f21040k = 0;
                    bVar.f21039j = this.method;
                    bVar.f21030a = currentTimeMillis;
                    bVar.f21038i = this.hostName;
                    bVar.f21035f = this.dnsDuring;
                    bVar.f21036g = this.dnsResult;
                    bVar.f21032c = this.connectDuring;
                    bVar.f21034e = this.connectionDuring;
                    c.a().a(this.httpStatus);
                } catch (Exception e8) {
                    ad.b("OkHttpStack", e8.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void callFailed(Call call, IOException iOException) {
            String str;
            super.callFailed(call, iOException);
            try {
                com.mbridge.msdk.foundation.same.net.a.a().c();
            } catch (Exception unused) {
            }
            if (this.isReportHttpStatus && this.httpStatus != null) {
                try {
                    this.callDuring = System.currentTimeMillis() - this.callStart;
                    if (!TextUtils.isEmpty(this.connectErrorMessage)) {
                        c.b bVar = this.httpStatus;
                        bVar.f21040k = 1;
                        bVar.f21033d = this.connectErrorMessage;
                    } else {
                        this.httpStatus.f21040k = 2;
                    }
                    c.b bVar2 = this.httpStatus;
                    if (iOException != null) {
                        str = iOException.getMessage();
                    } else {
                        str = "IO Exception";
                    }
                    bVar2.f21031b = str;
                    c.b bVar3 = this.httpStatus;
                    bVar3.f21030a = this.callDuring;
                    bVar3.f21038i = this.hostName;
                    bVar3.f21039j = this.method;
                    bVar3.f21035f = this.dnsDuring;
                    bVar3.f21036g = this.dnsResult;
                    bVar3.f21032c = this.connectDuring;
                    bVar3.f21034e = this.connectionDuring;
                    c.a().a(this.httpStatus);
                } catch (Exception e8) {
                    ad.b("OkHttpStack", e8.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void callStart(Call call) {
            super.callStart(call);
            try {
                com.mbridge.msdk.foundation.same.net.a.a().e();
            } catch (Exception unused) {
            }
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.callStart = System.currentTimeMillis();
                if (call != null) {
                    try {
                        this.method = call.request().method();
                    } catch (Exception unused2) {
                        this.method = "";
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
            super.connectEnd(call, inetSocketAddress, proxy, protocol);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectDuring = System.currentTimeMillis() - this.connectStart;
                this.connectErrorMessage = "";
            }
            try {
                e.a().e(call.request().url().host());
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
            String str;
            super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectDuring = System.currentTimeMillis() - this.connectStart;
                if (iOException != null) {
                    str = iOException.getMessage();
                } else {
                    str = "IO Exception";
                }
                this.connectErrorMessage = str;
            }
            try {
                e.a().d(call.request().url().host());
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            super.connectStart(call, inetSocketAddress, proxy);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectStart = System.currentTimeMillis();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void connectionAcquired(Call call, Connection connection) {
            super.connectionAcquired(call, connection);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectionStart = System.currentTimeMillis();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void connectionReleased(Call call, Connection connection) {
            super.connectionReleased(call, connection);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectionDuring = System.currentTimeMillis() - this.connectionStart;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void dnsEnd(Call call, String str, List<InetAddress> list) {
            super.dnsEnd(call, str, list);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                try {
                    this.dnsDuring = System.currentTimeMillis() - this.dnsStart;
                    if (TextUtils.isEmpty(str)) {
                        this.hostName = "unKnown";
                    } else {
                        this.hostName = str;
                    }
                    if (list != null && list.size() != 0) {
                        InetAddress inetAddress = list.get(0);
                        if (inetAddress != null && !TextUtils.isEmpty(inetAddress.getHostAddress())) {
                            this.dnsResult = inetAddress.getHostAddress();
                            return;
                        }
                        this.dnsResult = "unKnown";
                        return;
                    }
                    this.dnsResult = "unKnown";
                } catch (Exception e8) {
                    ad.b("OkHttpStack", e8.getMessage());
                    this.hostName = "";
                    this.dnsResult = "";
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void dnsStart(Call call, String str) {
            super.dnsStart(call, str);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.dnsStart = System.currentTimeMillis();
            }
        }
    }

    private static RequestBody createRequestBody(i iVar) {
        byte[] h8 = iVar.h();
        if (h8 == null) {
            return null;
        }
        return RequestBody.create((MediaType) null, h8);
    }

    private static void setConnectionParametersForRequest(Request.Builder builder, i<?> iVar) throws IOException {
        switch (iVar.l()) {
            case 0:
                builder.get();
                return;
            case 1:
                builder.post(createRequestBody(iVar));
                return;
            case 2:
                builder.put(createRequestBody(iVar));
                return;
            case 3:
                builder.delete();
                return;
            case 4:
                builder.head();
                return;
            case 5:
                builder.method("OPTIONS", null);
                return;
            case 6:
                builder.method("TRACE", null);
                return;
            case 7:
                builder.patch(createRequestBody(iVar));
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.stack.b
    public com.mbridge.msdk.foundation.same.net.f.b performRequest(i<?> iVar) throws IOException {
        Object valueOf;
        int o8 = iVar.o();
        int j8 = iVar.j();
        int m8 = iVar.m();
        int p8 = iVar.p();
        int i8 = iVar.i();
        if (j8 == 0) {
            j8 = o8;
        }
        if (m8 == 0) {
            m8 = o8;
        }
        if (p8 != 0) {
            o8 = p8;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Protocol.HTTP_1_1);
        arrayList.add(Protocol.HTTP_2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder eventListener = this.mClient.newBuilder().protocols(arrayList).readTimeout(m8, timeUnit).connectTimeout(j8, timeUnit).writeTimeout(o8, timeUnit).eventListener(new DefaultEventListener(iVar.s()));
        if (i8 > 0) {
            eventListener.callTimeout(i8, timeUnit);
        }
        eventListener.dns(new MBDns());
        StringBuilder sb = new StringBuilder();
        sb.append("connectTimeout: ");
        sb.append(j8);
        sb.append(" readTimeout: ");
        sb.append(m8);
        sb.append(" writeTimeout: ");
        sb.append(o8);
        sb.append(" callTimeout: ");
        if (i8 == 0) {
            valueOf = "not set";
        } else {
            valueOf = Integer.valueOf(i8);
        }
        sb.append(valueOf);
        ad.a("OkHttpStack", sb.toString());
        Request.Builder builder = new Request.Builder();
        for (Map.Entry<String, String> entry : iVar.k().entrySet()) {
            builder.addHeader(entry.getKey(), entry.getValue());
        }
        setConnectionParametersForRequest(builder, iVar);
        Response execute = eventListener.build().newCall(builder.url(iVar.s()).build()).execute();
        Headers headers = execute.headers();
        ArrayList arrayList2 = new ArrayList();
        int size = headers.size();
        for (int i9 = 0; i9 < size; i9++) {
            String name = headers.name(i9);
            String value = headers.value(i9);
            if (name != null) {
                arrayList2.add(new com.mbridge.msdk.foundation.same.net.d.b(name, value));
            }
        }
        return new com.mbridge.msdk.foundation.same.net.f.b(execute.code(), arrayList2, execute.body().byteStream());
    }
}
