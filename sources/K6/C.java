package K6;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public enum C {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* renamed from: a, reason: collision with root package name */
    final String f4828a;

    C(String str) {
        this.f4828a = str;
    }

    public static C a(String str) {
        str.hashCode();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c8 = 0;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c8 = 1;
                    break;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    c8 = 2;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c8 = 3;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c8 = 4;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return TLS_1_1;
            case 1:
                return TLS_1_2;
            case 2:
                return TLS_1_3;
            case 3:
                return SSL_3_0;
            case 4:
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public String c() {
        return this.f4828a;
    }
}
