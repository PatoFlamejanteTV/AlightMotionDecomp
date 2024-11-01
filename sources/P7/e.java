package P7;

/* loaded from: classes5.dex */
public class e {
    public String a() {
        return c("http.agent");
    }

    public String b() {
        return c("java.vm.version");
    }

    public String c(String str) {
        return System.getProperty(str);
    }
}
